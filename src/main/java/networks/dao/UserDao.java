package networks.dao;

import networks.model.User;
import java.util.List;

public interface UserDao extends CrudDao<User, Long>{

    List<User> getByName(String name);
    List<User> getByAge(int age);
}
