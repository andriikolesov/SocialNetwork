package networks.dao.impl;

import networks.dao.UserDao;
import networks.data.Database;
import networks.exeption.NoFoundUserExeption;
import networks.model.User;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Igor Hnes on 20.12.17.
 */
public class UserDaoImpl implements UserDao{
    @Override
    public List<User> getAll() {
        return Database.getAllUsers();
    }

    @Override
    public List<User> getByName(String name) {
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

    @Override
    public List<User> getByAge(int age) {
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

