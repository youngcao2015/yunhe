package service.impl;

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
    public List<OrderDetail> findOrder(OrderDetail order) throws Exception {
        return orderMapper.findOrder(order);
    }

    @Override
    public int insertOrder(OrderDetail order) throws Exception {
        return orderMapper.insertOrder(order);
    }

    @Override
    public int updateOrder(OrderDetail order) throws Exception {
        return orderMapper.updateOrder(order);
    }

    @Override
    public int deleteOrder(OrderDetail order) throws Exception {
        return orderMapper.deleteOrder(order);
    }

    @Override
    public List<OrderDetail> findOrderList(List<OrderDetail> orders) throws Exception {
        return orderMapper.findOrderList(orders);
    }

    @Override
    public int insertOrderList(List<OrderDetail> orders) throws Exception {
        return orderMapper.insertOrderList(orders);
    }

    @Override
    public int updateOrderList(List<OrderDetail> orders) throws Exception {
        return orderMapper.updateOrderList(orders);
    }

    @Override
    public int deleteOrderList(List<OrderDetail> orders) throws Exception {
        return orderMapper.deleteOrderList(orders);
    }
}
