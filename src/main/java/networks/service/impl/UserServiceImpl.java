package networks.service.impl;

import networks.dao.UserDao;
import networks.dao.impl.UserDaoImpl;
import networks.model.User;
import networks.service.MessegeServise;
import networks.service.UserService;
import networks.service.email.HappyBirthDayBuilder;
import networks.service.email.MassengeBuilder;
import networks.service.email.RecoverPasswordBuilder;

import java.time.LocalDate;
import java.util.List;

/**
 * @author Igor Hnes on 20.12.17.
 */
public class UserServiceImpl implements UserService {

    @Override
    public List<User> getAll() {
        final UserDao userDao = new UserDaoImpl();
        return userDao.getAll();
    }

    @Override
    public List<User> getByName(String name) {
        UserDao  userDao = new UserDaoImpl();
        return userDao.getByName(name);
    }

    @Override
    public List<User> getByAge(int age) {
        UserDao userDao = new UserDaoImpl();
        return userDao.getByAge(age);
    }

    @Override
    public void changePassword(User user, String newPassword) {
        user.setPassword(newPassword);
        MassengeBuilder builder = new RecoverPasswordBuilder();
        String message = builder.build(user);
        MessegeServise messegeServise = new MessegeServiseImpl();
        messegeServise.sendMassege(message, user.getEmail());

    }

    @Override
    public void happyBirthday(User user) {
        if (user.getBirthday().equals(LocalDate.now())) {

            MassengeBuilder builder = new HappyBirthDayBuilder();
            String message = builder.build(user);
            MessegeServise messegeServise = new MessegeServiseImpl();
            messegeServise.sendMassege(message, user.getEmail());
        } else {
            System.out.println("sorry, but b-day not today");
        }

    }

}
