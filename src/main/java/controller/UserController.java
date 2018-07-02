package controller;

import base.AppResult;
import base.AppResultBuilder;
import base.ResultStringUtil;
import entity.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.IUserService;


@RestController
@RequestMapping("/user")
public class UserController {
    private static final Logger logger = LogManager.getLogger(StudentController.class.getName());

    @Autowired
    @Qualifier("userService")
    private IUserService userService;

    /**
     * 用户登录
     *
     * @param phone_num 手机号码
     * @param password 密码
     * @return 用户登录信息
     * @throws Exception 系统异常
     */
    @GetMapping("/login")
    public AppResult<User> get(@RequestParam("phone_num") Long phone_num,
                                  @RequestParam("password") String password) throws Exception {
        User paramUser = new User();
        paramUser.setPhoneNum(phone_num);
        paramUser.setPassword(password);
        User resultUser = userService.findUser(paramUser);
        if (resultUser != null) {
            // 更新登录信息

            // 返回用户信息
            return AppResultBuilder.buildSuccessMessageResult(resultUser, ResultStringUtil.LOGIN_SUCCESS);
        }
        return AppResultBuilder.buildFailedMessageResult(ResultStringUtil.LOGIN_FAIL);
    }
}
