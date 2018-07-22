package service.impl;

import bean.GoodsItemParam;
import entity.*;
import mapper.GoodsMapper;
import org.springframework.stereotype.Service;
import service.IGoodsService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @descripthion:
 * @author: Young Cao
 * @date: 上午12:00 18/7/8
 */
@Service("goodsService")
public class GoodsServiceImpl implements IGoodsService {
    @Resource
    private GoodsMapper goodsMapper;

    @Override
    public List<GoodsCategory> findGoodsCategory() throws Exception {
        return goodsMapper.findGoodsCategory();
    }

    @Override
    public List<GoodsCatFeature> findGoodsCatFeature() throws Exception {
        return goodsMapper.findGoodsCatFeature();
    }

    @Override
    public GoodsItem findGoodsItem(GoodsItem item) throws Exception {
        return goodsMapper.findGoodsItem(item);
    }

    @Override
    public int insertGoodsItemCollection(GoodsItemCollection item) throws Exception {
        return goodsMapper.insertGoodsItemCollection(item);
    }

    @Override
    public List<GoodsItem> findGoodsItemList(GoodsItemParam param) throws Exception {
        return goodsMapper.findGoodsItemList(param);
    }

    @Override
    public List<GoodsItem> findPopularGoodsItemList(GoodsItemParam param) throws Exception {
        return goodsMapper.findPopularGoodsItemList(param);
    }
}
