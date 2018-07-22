package service.impl;

import bean.OrderParam;
import entity.Order;
import entity.OrderDetail;
import mapper.OrderMapper;
import org.springframework.stereotype.Service;
import service.IGoodsService;
import service.IOrderService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @descripthion:
 * @author: Young Cao
 * @date: 上午10:21 18/7/21
 */
@Service("orderService")
public class OrderServiceImpl implements IOrderService {
    @Resource
    private OrderMapper orderMapper;


    @Override
    public List<OrderDetail> findOrder(OrderParam orderParam) throws Exception {
        return orderMapper.findOrder(orderParam);
    }

    @Override
    public int insertOrder(OrderParam orderParam) throws Exception {
        return orderMapper.insertOrder(orderParam);
    }

    @Override
    public int updateOrder(OrderParam orderParam) throws Exception {
        return orderMapper.updateOrder(orderParam);
    }

    @Override
    public int deleteOrder(OrderParam orderParam) throws Exception {
        return orderMapper.deleteOrder(orderParam);
    }

    @Override
    public List<OrderDetail> findOrderList(List<OrderDetail> orderDetails) throws Exception {
        return orderMapper.findOrderList(orderDetails);
    }

    @Override
    public int insertOrderList(List<OrderDetail> orderDetails) throws Exception {
        return orderMapper.insertOrderList(orderDetails);
    }

    @Override
    public int insertOrderDetailList(List<OrderDetail> orderDetails) throws Exception {
        return orderMapper.insertOrderDetailList(orderDetails);
    }

    @Override
    public int updateOrderList(List<OrderDetail> orderDetails) throws Exception {
        return orderMapper.updateOrderList(orderDetails);
    }

    @Override
    public int deleteOrderList(List<OrderDetail> orderDetails) throws Exception {
        return orderMapper.deleteOrderList(orderDetails);
    }


}
