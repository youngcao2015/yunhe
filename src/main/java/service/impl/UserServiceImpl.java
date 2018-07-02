package service.impl;

import entity.User;
import mapper.UserMapper;
import org.springframework.stereotype.Service;
import service.IUserService;

import javax.annotation.Resource;

/**
 * @descripthion:
 * @author: Young Cao
 * @date: 下午11:29 18/7/2
 */
@Service("userService")
public class UserServiceImpl implements IUserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public User findUser(User user) throws Exception {
        return userMapper.findUser(user);
    }
}
