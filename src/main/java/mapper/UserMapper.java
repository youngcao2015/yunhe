package mapper;

import entity.User;

/**
 * @descripthion:
 * @author: Young Cao
 * @date: 下午11:07 18/7/2
 */
public interface UserMapper {
    public User findUser(User user) throws Exception;
}
