package controller;


import base.AppResult;
import base.AppResultBuilder;
import base.FileUploadUtil;
import base.ResultStringUtil;
import entity.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import service.IUserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;

/**
 * @descripthion:
 * @author: Young Cao
 * @date: 下午4:52 18/7/5
 */
@RestController
@RequestMapping("/user")
public class FileUploadController {
    private static final Logger logger = LogManager.getLogger(FileUploadController.class.getName());

    @Autowired
    @Qualifier("userService")
    private IUserService userService;


    @PostMapping("/upload")
    public AppResult<User> upload(@RequestParam("file") MultipartFile file,
                                  HttpServletRequest request, HttpSession httpSession) throws Exception {
        // 通过session来确认用户身份
        Long userId = (Long) httpSession.getAttribute("id");
        if (userId == null) return AppResultBuilder.buildFailedMessageResult(ResultStringUtil.MODIFY_USER_FAIL);

        String img_url = FileUploadUtil.imageUpload(file, request);
        User user = new User();
        user.setId(userId);
        user.setUpdateTime(new Date());
        user.setAvatar(img_url);
        int result = userService.updateUser(user);
        if (result <= 0) return AppResultBuilder.buildFailedMessageResult(ResultStringUtil.MODIFY_USER_FAIL);
        return AppResultBuilder.buildSuccessMessageResult(ResultStringUtil.MODIFY_USER_SUCCESS);
    }
}

