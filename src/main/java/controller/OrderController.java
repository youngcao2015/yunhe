package controller;

import base.AppResult;
import base.AppResultBuilder;
import base.IdWorker;
import base.ResultStringUtil;
import bean.OrderParam;
import entity.Order;
import entity.OrderDetail;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import service.IOrderService;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @descripthion:
 * @author: Young Cao
 * @date: 下午3:58 18/7/21
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    private static final Logger logger = LogManager.getLogger(GoodsController.class.getName());

    @Autowired
    @Qualifier("orderService")
    private IOrderService orderService;

    /**
     * 插入一条订单
     *
     * @param orderParam 订单参数
     * @param httpSession session，需用户传过来
     * @return .
     * @throws Exception .
     */
    @PostMapping("/submit/order")
    public AppResult<OrderDetail> submitOrder(@RequestBody OrderParam orderParam,
                                            HttpSession httpSession) throws Exception {
        Long userId = (Long) httpSession.getAttribute("id");
        if (userId == null) return AppResultBuilder.buildFailedMessageResult(ResultStringUtil.LOGIN_FIRST);

        IdWorker idWorker = new IdWorker(0, 0);
        long id = idWorker.nextId();
        orderParam.setUserId(userId);
        orderParam.setNumber(Long.toString(id));
        int result = orderService.insertOrder(orderParam);
        if (result <= 0) return AppResultBuilder.buildFailedMessageResult(ResultStringUtil.INSERT_FAIL);
        return AppResultBuilder.buildSuccessMessageResult(ResultStringUtil.INSERT_SUCCESS);
    }

    /**
     * 插入多条订单
     *
     * @param orderParam 多条订单
     * @param httpSession session
     * @return 插入成功后的多个订单的id集合
     * @throws Exception .
     */
    @PostMapping("/submit/orders")
    public AppResult<List<OrderDetail>> submitOrderList(@RequestBody OrderParam orderParam,
                                                        HttpSession httpSession) throws Exception {
        Long userId = (Long) httpSession.getAttribute("id");
        if (userId == null) return AppResultBuilder.buildFailedMessageResult(ResultStringUtil.LOGIN_FIRST);

        IdWorker idWorker = new IdWorker(0, 0);
        long id = idWorker.nextId();
        String idString = Long.toString(id);
        List<OrderDetail> orderDetails = orderParam.getOrders();
        for (OrderDetail orderDetail : orderDetails) {
            orderDetail.setUserId(userId);
            orderDetail.setNumber(idString);
        }
        int count = orderDetails.size();
        // 1、批量插入订单到order表中（返回订单id）
        int resultOrder = orderService.insertOrderList(orderDetails);
        if (resultOrder < count) return AppResultBuilder.buildFailedMessageResult(ResultStringUtil.INSERT_FAIL);
        // 2、将上一步插入的订单关联（根据上一步返回的订单id）插入到order_detail表中，
        //    并根据商品变体id更新order_detail（订单详情表）信息
        int resultOrderDetail = orderService.insertOrderDetailList(orderDetails);
        if (resultOrderDetail < count) return AppResultBuilder.buildFailedMessageResult(ResultStringUtil.INSERT_FAIL);
        return AppResultBuilder.buildSuccessMessageResult(ResultStringUtil.INSERT_SUCCESS);
    }

    /**
     * 根据订单号查询订单
     *
     * @param number 订单号
     * @return 订单号所属的所有订单
     * @throws Exception .
     */
    @GetMapping("/order")
    public AppResult<List<OrderDetail>> findOrder(@RequestParam("number") String number,
                                                  HttpSession httpSession) throws Exception {
        Long userId = (Long) httpSession.getAttribute("id");
        if (userId == null) return AppResultBuilder.buildFailedMessageResult(ResultStringUtil.LOGIN_FIRST);

        OrderParam orderParam = new OrderParam();
        orderParam.setNumber(number);
        orderParam.setUserId(userId);
        List<OrderDetail> orderDetails = orderService.findOrder(orderParam);
        return AppResultBuilder.buildSuccessMessageResult(orderDetails, ResultStringUtil.QUERY_SUCCESS, orderDetails.size());
    }

}
