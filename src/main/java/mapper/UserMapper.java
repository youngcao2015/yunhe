package mapper;

import entity.User;
import entity.UserAuth;

/**
 * @descripthion:
 * @author: Young Cao
 * @date: 下午11:07 18/7/2
 */
public interface UserMapper {
    public User findUser(User user) throws Exception;
    public int insertUserAuth(UserAuth userAuth) throws Exception;
    public int insertUser(User user) throws Exception;
    public int updateUser(User user) throws Exception;
}
