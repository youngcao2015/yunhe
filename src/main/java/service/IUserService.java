package service;

import entity.User;

/**
 * @descripthion:
 * @author: Young Cao
 * @date: 下午11:28 18/7/2
 */
public interface IUserService {
    public User findUser(User user) throws Exception;
}
