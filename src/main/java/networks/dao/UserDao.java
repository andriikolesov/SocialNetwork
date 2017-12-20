package networks.dao;

import networks.data.Database;
import networks.exeption.NoFoundUserExeption;
import networks.model.User;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Igor Hnes on 06.12.17.
 */
public interface UserDao {
    /**
     *
     * @return get all users
     */
    List<User> getAll();

    /**
     *
     * @return get by name
     */

    List<User> getByName(String name);

    List<User> getByAge(int age);
}
