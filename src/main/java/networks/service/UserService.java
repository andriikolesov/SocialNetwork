package networks.service;

import networks.dao.UserDao;
import networks.model.User;

/**
 * @author Igor Hnes on 06.12.17.
 */
public class UserService {

    public User[] getAll() {
        final UserDao userDao = new UserDao();
        return userDao.getAll();
    }
}
