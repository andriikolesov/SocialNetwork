package networks.service.impl;

import networks.dao.UserDao;
import networks.model.User;
import networks.service.UserService;

import java.util.List;

/**
 * @author Igor Hnes on 20.12.17.
 */
public class UserServiceImpl implements UserService {

    @Override
    public List<User> getAll() {
        final UserDao userDao = new UserDao();
        return userDao.getAll();
    }

    @Override
    public List<User> getByName(String name) {
        UserDao  userDao = new UserDao();
        return userDao.getByName(name);
    }

    @Override
    public List<User> getByAge(int age) {
        UserDao userDao = new UserDao();
        return userDao.getByAge(age);
    }
}
