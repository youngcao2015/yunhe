package controller;

import base.AppResult;
import base.AppResultBuilder;
import base.ResultStringUtil;
import entity.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.IGoodsService;

import java.util.List;


/**
 * @descripthion:
 * @author: Young Cao
 * @date: 上午12:18 18/7/8
 */
@RestController
@RequestMapping("/mall")
public class GoodsController {
    private static final Logger logger = LogManager.getLogger(GoodsController.class.getName());

    @Autowired
    @Qualifier("goodsService")
    private IGoodsService goodsService;

    /**
     * 获取商品分类
     *
     * @return 商品分类
     * @throws Exception .
     */
    @GetMapping("/goods_cat")
    public AppResult<List<GoodsCategory>> findGoodsCategory() throws Exception {
        List<GoodsCategory> goodsCategories = goodsService.findGoodsCategory();
        if (goodsCategories == null) AppResultBuilder.buildFailedMessageResult(ResultStringUtil.GET_GOODS_CATEGORY_FAIL);
        return AppResultBuilder.buildSuccessMessageResult(goodsCategories, ResultStringUtil.GET_GOODS_CATEGORY_SUCCESS);
    }

    /**
     * 搜索商品变体，获取商品变体列表
     *
     * @param wd 搜索文本
     * @param type 搜索的类型：最新（latest），人气（popular），价格（price: 降序priceDESC, priceASC）
     * @return 商品变体列表
     * @throws Exception .
     */
    @GetMapping("/goods_item")
    public AppResult<List<GoodsItem>> findGoodsItem(@RequestParam("wd") String wd, @RequestParam(required = false, name = "type") String type) throws Exception {
        List<GoodsItem> goodsItems = null;
        GoodsItemParam param = new GoodsItemParam();
        param.setWd(wd);
        param.setType(type);
        if (type.equals("popular")) {
            goodsItems = goodsService.findPopularGoodsItem(param);
        } else {
            goodsItems = goodsService.findGoodsItem(param);
        }

        if (goodsItems == null) AppResultBuilder.buildSuccessMessageResult(ResultStringUtil.NULL_DATA);
        return AppResultBuilder.buildSuccessMessageResult(goodsItems, ResultStringUtil.QUERY_SUCCESS);
    }

    /**
     * 获取商品分类与特征列表，设置筛选条件专用
     *
     * @return 商品分类与特征列表
     * @throws Exception .
     */
    @GetMapping("/cat_feature")
    public AppResult<List<GoodsCatFeature>> findGoodsCatFeature() throws Exception {
        List<GoodsCatFeature> goodsCatFeatures = goodsService.findGoodsCatFeature();
        if (goodsCatFeatures == null) AppResultBuilder.buildFailedMessageResult(ResultStringUtil.GET_GOODS_CATEGORY_FAIL);
        return AppResultBuilder.buildSuccessMessageResult(goodsCatFeatures, ResultStringUtil.GET_GOODS_CATEGORY_SUCCESS);
    }
}
