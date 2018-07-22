package entity;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @descripthion:
 * @author: Young Cao
 * @date: 上午9:56 18/7/21
 */
public class OrderDetail extends Order implements Serializable {
    private Long id;
    private Long orderId;
    private Long goodsItemId;
    private String orderNumber;
    private BigDecimal price;
    private BigDecimal discountPrice;
    private BigDecimal realPrice;
    private int count;
    private String pic;
    private String support;
    private String shippingMethod;
    private String desc;
    private String buyerMsg;
    private Order order;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getGoodsItemId() {
        return goodsItemId;
    }

    public void setGoodsItemId(Long goodsItemId) {
        this.goodsItemId = goodsItemId;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(BigDecimal discountPrice) {
        this.discountPrice = discountPrice;
    }

    public BigDecimal getRealPrice() {
        return realPrice;
    }

    public void setRealPrice(BigDecimal realPrice) {
        this.realPrice = realPrice;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getSupport() {
        return support;
    }

    public void setSupport(String support) {
        this.support = support;
    }

    public String getShippingMethod() {
        return shippingMethod;
    }

    public void setShippingMethod(String shippingMethod) {
        this.shippingMethod = shippingMethod;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getBuyerMsg() {
        return buyerMsg;
    }

    public void setBuyerMsg(String buyerMsg) {
        this.buyerMsg = buyerMsg;
    }
}
