package networks.dao;

import networks.data.Database;
import networks.exeption.NoFoundUserExeption;
import networks.model.User;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Igor Hnes on 06.12.17.
 */
public class UserDao {

    public List<User> getAll() {
        return Database.getAllUsers();

    }

    public List<User> getByName (String name){
        List<User> users = getAll();
        List<User> usersByName = new LinkedList<>();
        for (User elem : users){
            if (name.equals(elem.getName())){
                usersByName.add(elem);
            }
        }

        if (usersByName.size() == 0) {
            throw new NoFoundUserExeption();
        }
        return usersByName;
    }

    public List<User> getByAge (int age){
        List<User> users = getAll();
        List<User> usersByAge = new LinkedList<>();
        for (User elem : users) {
            if (elem.getAge() == age){
                usersByAge.add(elem);
            }
        }
        return usersByAge;
    }
}
