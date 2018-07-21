package controller;

import base.AppResult;
import base.AppResultBuilder;
import base.IdWorker;
import base.ResultStringUtil;
import entity.OrderDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import service.IOrderService;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @descripthion:
 * @author: Young Cao
 * @date: 下午3:58 18/7/21
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    @Qualifier("orderService")
    private IOrderService orderService;

    /**
     * 插入一条订单
     *
     * @param detail 订单参数
     * @param httpSession session，需用户传过来
     * @return 插入成功后的
     * @throws Exception .
     */
    @PostMapping("/submit")
    public AppResult<OrderDetail> submitOrder(@RequestBody OrderDetail detail,
                                            HttpSession httpSession) throws Exception {
        Long userId = (Long) httpSession.getAttribute("id");
        if (userId == null) return AppResultBuilder.buildFailedMessageResult(ResultStringUtil.LOGIN_FIRST);

        IdWorker idWorker = new IdWorker(0, 0);
        long id = idWorker.nextId();
        detail.setUserId(userId);
        detail.setNumber(Long.toString(id));
        int result = orderService.insertOrder(detail);
        if (result <= 0) return AppResultBuilder.buildFailedMessageResult(ResultStringUtil.INSERT_FAIL);
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

        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setNumber(number);
        orderDetail.setUserId(userId);
        List<OrderDetail> orderDetails = orderService.findOrder(orderDetail);
        return AppResultBuilder.buildSuccessMessageResult(orderDetails, ResultStringUtil.QUERY_SUCCESS);
    }

}
