package service;

import entity.GoodsCatFeature;
import entity.GoodsCategory;
import entity.GoodsItem;
import entity.GoodsItemParam;

import java.util.List;

/**
 * @descripthion:
 * @author: Young Cao
 * @date: 下午11:59 18/7/7
 */
public interface IGoodsService {
    public List<GoodsCategory> findGoodsCategory() throws Exception;
    public List<GoodsCatFeature> findGoodsCatFeature() throws Exception;
    public List<GoodsItem> findGoodsItem(GoodsItemParam param) throws Exception;
    public List<GoodsItem> findPopularGoodsItem(GoodsItemParam param) throws Exception;
}
