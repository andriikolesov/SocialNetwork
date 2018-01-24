package networks.dao;

import networks.model.User;

import java.util.List;

/**
 * @author Igor Hnes on 06.12.17.
 */
public interface UserDao extends CrudDao<User, Long>{

    List<User> getByName(String name);

    List<User> getByAge(int age);
}
