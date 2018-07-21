package service;

import entity.OrderDetail;

import java.util.List;

/**
 * @descripthion:
 * @author: Young Cao
 * @date: 上午10:21 18/7/21
 */
public interface IOrderService {
    public List<OrderDetail> findOrder(OrderDetail order) throws Exception;
    public int insertOrder(OrderDetail order) throws Exception;
    public int updateOrder(OrderDetail order) throws Exception;
    public int deleteOrder(OrderDetail order) throws Exception;
    public List<OrderDetail> findOrderList(List<OrderDetail> orders) throws Exception;
    public int insertOrderList(List<OrderDetail> orders) throws Exception;
    public int updateOrderList(List<OrderDetail> orders) throws Exception;
    public int deleteOrderList(List<OrderDetail> orders) throws Exception;
}
