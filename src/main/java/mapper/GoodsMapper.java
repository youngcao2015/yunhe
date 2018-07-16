package mapper;

import entity.*;

import java.util.List;

/**
 * @descripthion:
 * @author: Young Cao
 * @date: 下午11:56 18/7/7
 */
public interface GoodsMapper {
    public List<GoodsCategory> findGoodsCategory() throws Exception;
    public List<GoodsCatFeature> findGoodsCatFeature() throws Exception;
    public List<GoodsItem> findGoodsItem(GoodsItemParam param) throws Exception;
    public List<GoodsItem> findPopularGoodsItem(GoodsItemParam param) throws Exception;
}
