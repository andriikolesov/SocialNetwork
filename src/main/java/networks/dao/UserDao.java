package networks.dao;

import networks.model.User;

import java.util.List;

/**
 * @author Igor Hnes on 06.12.17.
 */
public interface UserDao {

    List<User> getAll();

    List<User> getByName(String name);

    List<User> getByAge(int age);
}
