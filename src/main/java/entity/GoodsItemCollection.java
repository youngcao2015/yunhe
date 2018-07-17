package entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @descripthion:
 * @author: Young Cao
 * @date: 下午4:48 18/7/17
 */
public class GoodsItemCollection {
    private Long id;
    private Long goodsItemId;
    private String goodsItemName;
    private Long userId;
    private String pic;
    private BigDecimal price;
    private String desc;
    private String state;
    private Boolean collected;
    private Date createTime;
    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getGoodsItemId() {
        return goodsItemId;
    }

    public void setGoodsItemId(Long goodsItemId) {
        this.goodsItemId = goodsItemId;
    }

    public String getGoodsItemName() {
        return goodsItemName;
    }

    public void setGoodsItemName(String goodsItemName) {
        this.goodsItemName = goodsItemName;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

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

    public Boolean getCollected() {
        return collected;
    }

    public void setCollected(Boolean collected) {
        this.collected = collected;
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
}
