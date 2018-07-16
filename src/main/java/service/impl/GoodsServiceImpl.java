package service.impl;

import entity.GoodsCatFeature;
import entity.GoodsCategory;
import entity.GoodsItem;
import entity.GoodsItemParam;
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
    public List<GoodsItem> findGoodsItem(GoodsItemParam param) throws Exception {
        return goodsMapper.findGoodsItem(param);
    }

    @Override
    public List<GoodsItem> findPopularGoodsItem(GoodsItemParam param) throws Exception {
        return goodsMapper.findPopularGoodsItem(param);
    }
}
