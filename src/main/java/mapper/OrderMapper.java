package mapper;

import bean.OrderParam;
import entity.Order;
import entity.OrderDetail;

import java.util.List;

/**
 * @descripthion:
 * @author: Young Cao
 * @date: 上午10:00 18/7/21
 */
public interface OrderMapper {
    // 对order，和orderDetail的处理放在一起了（对应于表order和order_detail）
    public List<OrderDetail> findOrder(OrderParam orderParam) throws Exception;
    public int insertOrder(OrderParam orderParam) throws Exception;
    public int updateOrder(OrderParam orderParam) throws Exception;
    public int deleteOrder(OrderParam orderParam) throws Exception;

    // 对order，和orderDetail 分开处理
    public List<OrderDetail> findOrderList(List<OrderDetail> orderDetails) throws Exception;
    public int insertOrderList(List<OrderDetail> orderDetails) throws Exception;
    public int insertOrderDetailList(List<OrderDetail> orderDetails) throws Exception;
    public int updateOrderList(List<OrderDetail> orderDetails) throws Exception;
    public int deleteOrderList(List<OrderDetail> orderDetails) throws Exception;
}
