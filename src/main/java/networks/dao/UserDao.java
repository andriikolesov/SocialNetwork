package networks.dao;

import networks.data.Database;
import networks.model.User;

/**
 * @author Igor Hnes on 06.12.17.
 */
public class UserDao {

    public User[] getAll() {
        return Database.getAllUsers();
    }
}
