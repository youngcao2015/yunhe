package service;

import entity.User;
import entity.UserAuth;

/**
 * @descripthion:
 * @author: Young Cao
 * @date: 下午11:28 18/7/2
 */
public interface IUserService {
    public User findUser(User user) throws Exception;
    public int insertUserAuth(UserAuth userAuth) throws Exception;
    public int insertUser(User user) throws Exception;
    public int updateUser(User user) throws Exception;
}
