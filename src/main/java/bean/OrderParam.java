package bean;

import entity.OrderDetail;

import java.util.List;

/**
 * @descripthion:
 * @author: Young Cao
 * @date: 上午11:16 18/7/22
 */
public class OrderParam extends OrderDetail {
    private List<OrderDetail> orders;

    public List<OrderDetail> getOrders() {
        return orders;
    }

    public void setOrders(List<OrderDetail> orders) {
        this.orders = orders;
    }
}
