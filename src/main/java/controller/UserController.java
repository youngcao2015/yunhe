package controller;

import base.AppResult;
import base.AppResultBuilder;
import base.ResultStringUtil;
import entity.User;
import entity.UserAuth;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import service.IUserService;

import java.util.Date;


@RestController
@RequestMapping("/user")
public class UserController {
    private static final Logger logger = LogManager.getLogger(UserController.class.getName());

    @Autowired
    @Qualifier("userService")
    private IUserService userService;

    /**
     * 用户登录
     *
     * @param phone_num 手机号码
     * @param password 密码
     * @return 用户信息
     * @throws Exception 系统异常
     */
    @GetMapping("/sign_in")
    public AppResult<User> signIn(@RequestParam("phone_num") Long phone_num,
                                  @RequestParam("password") String password) throws Exception {
        User paramUser = new User();
        paramUser.setPhoneNum(phone_num);
        paramUser.setPassword(password);
        User resultUser = userService.findUser(paramUser);
        if (resultUser != null) {
            // 更新登录信息，只是服务端保存
            UserAuth userAuth = new UserAuth();
            userAuth.setUserId(resultUser.getId());
            userAuth.setUsername(resultUser.getUsername());
            userAuth.setPhoneNum(resultUser.getPhoneNum());
            userAuth.setSex(resultUser.getSex());
            userAuth.setNickname(resultUser.getNickname());
            userAuth.setCreateTime(new Date());
            int result = userService.insertUserAuth(userAuth);
            if (result <= 0) return AppResultBuilder.buildFailedMessageResult(ResultStringUtil.LOGIN_FAIL);

            // 返回用户信息
            return AppResultBuilder.buildSuccessMessageResult(resultUser, ResultStringUtil.LOGIN_SUCCESS);
        }
        return AppResultBuilder.buildFailedMessageResult(ResultStringUtil.LOGIN_FAIL);
    }

    /**
     * 用户注册
     *
     * @param user body体，注册信息
     * @return 用户信息
     * @throws Exception 系统异常
     */
    @PostMapping("/sign_up")
    public AppResult<User> signUp(@RequestBody User user) throws Exception {
        user.setCreateTime(new Date());
        int result = userService.insertUser(user);
        if (result <= 0) return AppResultBuilder.buildFailedMessageResult(ResultStringUtil.SIGN_UP_FAIL);
        return AppResultBuilder.buildSuccessMessageResult(user, ResultStringUtil.SIGN_UP_SUCCESS);
    }

    /**
     * 修改资料
     *
     * @param user body体，需要修改的用户信息
     * @return 用户信息
     * @throws Exception 系统异常
     */
    @PostMapping("/update_user")
    public AppResult<User> updateUser(@RequestBody User user) throws Exception {
        user.setUpdateTime(new Date());
        int result = userService.updateUser(user);
        if (result <= 0) return AppResultBuilder.buildFailedMessageResult(ResultStringUtil.MODIFY_USER_FAIL);
        return AppResultBuilder.buildSuccessMessageResult(user, ResultStringUtil.MODIFY_USER_SUCCESS);
    }
}
