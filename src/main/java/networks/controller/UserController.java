package networks.controller;

import networks.config.EmailConfig;
import networks.exeption.NoFoundUserExeption;
import networks.model.User;
import networks.service.UserService;
import networks.service.email.HappyBirthDayBuilder;
import networks.service.email.MassengeBuilder;
import networks.service.impl.UserServiceImpl;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.time.LocalDate;
import java.util.List;

/**
 * @author Igor Hnes on 06.12.17.
 */
public class UserController {

    public static void main(String[] args) {

       UserService userService = new UserServiceImpl();
        User user = new User();
        user.setName("Andrii");
        user.setEmail("andrii.kolesov@gmail.com");
        user.setBirthday(LocalDate.now().plusDays(1));

        LocalDate now = LocalDate.now();
        LocalDate tomorrow = LocalDate.now().plusDays(1);

        userService.happyBirthday(user);

//        User first = userService.getAll().get(0);

//        String newPassword = "qwerty123456";

//        userService.changePassword(first, newPassword);

//        System.out.println(first);
    }
}



