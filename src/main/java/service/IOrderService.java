package service;

import bean.OrderParam;
import entity.Order;
import entity.OrderDetail;

import java.util.List;

/**
 * @descripthion:
 * @author: Young Cao
 * @date: 上午10:21 18/7/21
 */
public interface IOrderService {
    public List<OrderDetail> findOrder(OrderParam orderParam) throws Exception;
    public int insertOrder(OrderParam orderParam) throws Exception;
    public int updateOrder(OrderParam orderParam) throws Exception;
    public int deleteOrder(OrderParam orderParam) throws Exception;

    public List<OrderDetail> findOrderList(List<OrderDetail> orderDetails) throws Exception;
    public int insertOrderList(List<OrderDetail> orderDetails) throws Exception;
    public int insertOrderDetailList(List<OrderDetail> orderDetails) throws Exception;
    public int updateOrderList(List<OrderDetail> orderDetails) throws Exception;
    public int deleteOrderList(List<OrderDetail> orderDetails) throws Exception;
}
