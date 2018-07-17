package controller;

import base.AppResult;
import base.AppResultBuilder;
import base.ResultStringUtil;
import entity.GoodsItemCollection;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.IGoodsService;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @descripthion:
 * @author: Young Cao
 * @date: 下午6:25 18/7/17
 */
@RestController
@RequestMapping("/user")
public class CollectionContainer {
    private static final Logger logger = LogManager.getLogger(GoodsController.class.getName());

    @Autowired
    @Qualifier("goodsService")
    private IGoodsService goodsService;

    @PostMapping("/goods/collection")
    public AppResult<GoodsItemCollection> insertGoodsItemCollection(
            @RequestBody GoodsItemCollection collection, HttpSession httpSession) throws Exception {
        // 通过session来确认用户身份
        Long userId = (Long) httpSession.getAttribute("id");
        if (userId == null) return AppResultBuilder.buildFailedMessageResult(ResultStringUtil.LOGIN_FIRST);

        collection.setUserId(userId);
        Date date = new Date();
        collection.setCreateTime(date);
        collection.setUpdateTime(date);
        int result = goodsService.insertGoodsItemCollection(collection);
        if (result <= 0) return AppResultBuilder.buildFailedMessageResult(ResultStringUtil.INSERT_FAIL);
        return AppResultBuilder.buildSuccessMessageResult(ResultStringUtil.INSERT_SUCCESS);
    }
}
