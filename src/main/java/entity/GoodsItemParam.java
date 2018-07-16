package entity;

/**
 * @descripthion:
 * @author: Young Cao
 * @date: 下午10:56 18/7/16
 */
public class GoodsItemParam extends GoodsItem {
    /**
     * 搜索文本
     */
    private String wd;
    /**
     * 搜索类型：最新（latest）、人气（popular），价格（price: 降序priceDESC, priceASC）
     */
    private String type;

    public String getWd() {
        return wd;
    }

    public void setWd(String wd) {
        this.wd = wd;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
