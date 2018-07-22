package entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @descripthion: 商品分类与特征
 * @author: Young Cao
 * @date: 下午6:32 18/7/9
 */
public class GoodsCatFeature implements Serializable {
    private Long id;
    private String name;
    private Boolean homeVisible;
    private Boolean item;
    private String status;
    private Date createTime;
    private Date updateTime;
    private List<GoodsCatFeature> goodsCatFeatures;

    public List<GoodsCatFeature> getGoodsCatFeatures() {
        return goodsCatFeatures;
    }

    public void setGoodsCatFeatures(List<GoodsCatFeature> goodsCatFeatures) {
        this.goodsCatFeatures = goodsCatFeatures;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getHomeVisible() {
        return homeVisible;
    }

    public void setHomeVisible(Boolean homeVisible) {
        this.homeVisible = homeVisible;
    }

    public Boolean getItem() {
        return item;
    }

    public void setItem(Boolean item) {
        this.item = item;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
