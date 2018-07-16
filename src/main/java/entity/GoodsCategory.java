package entity;

import java.util.Date;
import java.util.List;

/**
 * @descripthion:
 * @author: Young Cao
 * @date: 下午11:51 18/7/7
 */
public class GoodsCategory {
    private Long id;
    private String name;
    private Long parentId;
    private String number;
    private String pic;
    private String state;
    private Date createTime;
    private Date updateTime;
    private int level;
    private Boolean leaf;
    private List<GoodsCategory> subcategories;

    public List<GoodsCategory> getSubcategories() {
        return subcategories;
    }

    public void setSubcategories(List<GoodsCategory> subcategories) {
        this.subcategories = subcategories;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Boolean getLeaf() {
        return leaf;
    }

    public void setLeaf(Boolean leaf) {
        this.leaf = leaf;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
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
}
