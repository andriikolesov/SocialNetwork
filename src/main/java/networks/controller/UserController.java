package networks.controller;

import networks.config.EmailConfig;
import networks.exeption.NoFoundUserExeption;
import networks.model.User;
import networks.service.UserService;
import networks.service.email.HappyBirthDayBuilder;
import networks.service.email.MassengeBuilder;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.util.List;

/**
 * @author Igor Hnes on 06.12.17.
 */
public class UserController {

    public static void main(String[] args) {

        final UserService userService = new UserService();
        final List<User> users = userService.getAll();

        for (User elem : users) {
            System.out.println(elem);
        }

        System.out.println("All user printed");

        User user = new User();
        user.setName("Andrii");

        MassengeBuilder massengeBuilder = new HappyBirthDayBuilder();

        final String build = massengeBuilder.build(user);

        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setTo("andrii.kolesov@gmail.com");
        simpleMailMessage.setSubject("MiracleIT");
        simpleMailMessage.setText(build);

        final JavaMailSenderImpl javaMailSender = EmailConfig.mailSender();
        javaMailSender.send(simpleMailMessage);

    }
}



