package networks.service.impl;

import networks.dao.UserDao;
import networks.dao.factory.DaoFactory;
import networks.model.User;
import networks.service.MessegeService;
import networks.service.UserService;
import networks.service.email.HappyBirthDayBuilder;
import networks.service.email.RecoverPasswordBuilder;
import java.time.LocalDate;
import java.util.List;

public class UserServiceImpl implements UserService {


    @Override
    public void update(User entity) {
    }

    @Override
    public void create(User user) {
        UserDao userDao = DaoFactory.getUserDao();
    }

    @Override
    public void delete(Long aLong) {
    }

    @Override
    public List<User> findAll() {
        final UserDao userDao = DaoFactory.getUserDao();
        return userDao.findAll();
    }

    @Override
    public List<User> getByName(String name) {
        UserDao  userDao = DaoFactory.getUserDao();
        return userDao.getByName(name);
    }

    @Override
    public List<User> getByAge(int age) {
        UserDao userDao = DaoFactory.getUserDao();
        return userDao.getByAge(age);
    }

    @Override
    public void changePassword(User user, String newPassword) {
        user.setPassword(newPassword);
        RecoverPasswordBuilder builder = new RecoverPasswordBuilder();
        String message = builder.build(user);
        MessegeService messegeServise = new MessegeServiceImpl();
        messegeServise.sendMessege(message, user.getEmail());

    }

    @Override
    public void happyBirthday(User user) {
        if (user.getBirthday().equals(LocalDate.now())) {

            HappyBirthDayBuilder builder = new HappyBirthDayBuilder();
            String message = builder.build(user);
            MessegeService messegeServise = new MessegeServiceImpl();
            messegeServise.sendMessege(message, user.getEmail());
        } else {
            System.out.println("sorry, but b-day not today");
        }
    }
}
