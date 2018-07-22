package mapper;

import bean.GoodsItemParam;
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
    public GoodsItem findGoodsItem(GoodsItem item) throws Exception;
    public int insertGoodsItemCollection(GoodsItemCollection item) throws Exception;
    public List<GoodsItem> findGoodsItemList(GoodsItemParam param) throws Exception;
    public List<GoodsItem> findPopularGoodsItemList(GoodsItemParam param) throws Exception;
}
