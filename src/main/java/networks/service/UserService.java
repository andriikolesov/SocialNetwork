package networks.service;

import networks.dao.UserDao;
import networks.model.User;

import java.util.List;

/**
 * @author Igor Hnes on 06.12.17.
 */
public interface UserService {

    List<User> getAll();

    List<User> getByName(String name);

    List<User> getByAge(int age);

    void changePassword(User user, String newPassword);

    void happyBirthday(User user);

    }


