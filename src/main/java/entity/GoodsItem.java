package entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @descripthion:
 * @author: Young Cao
 * @date: 下午6:29 18/7/16
 */
public class GoodsItem implements Serializable {
    private Long id;
    private String name;
    private Long goodsId;
    private String goodsName;
    private String code;
    private String pic;
    private String color;
    private String weight;
    private String bar;
    private String watchFrame;
    private String shape;
    private BigDecimal originalPrice;
    private BigDecimal price;
    private BigDecimal discountPrice;
    private Boolean available;
    private Boolean allowReturned;
    private Long availableCount;
    private Date discountRemainTime;
    private String desc;
    private String state;
    private Date createTime;
    private Date updateTime;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getBar() {
        return bar;
    }

    public void setBar(String bar) {
        this.bar = bar;
    }

    public String getWatchFrame() {
        return watchFrame;
    }

    public void setWatchFrame(String watchFrame) {
        this.watchFrame = watchFrame;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public BigDecimal getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(BigDecimal originalPrice) {
        this.originalPrice = originalPrice;
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

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public Boolean getAllowReturned() {
        return allowReturned;
    }

    public void setAllowReturned(Boolean allowReturned) {
        this.allowReturned = allowReturned;
    }

    public Long getAvailableCount() {
        return availableCount;
    }

    public void setAvailableCount(Long availableCount) {
        this.availableCount = availableCount;
    }

    public Date getDiscountRemainTime() {
        return discountRemainTime;
    }

    public void setDiscountRemainTime(Date discountRemainTime) {
        this.discountRemainTime = discountRemainTime;
    }
}
