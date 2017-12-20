package networks.service.impl;

import networks.config.EmailConfig;
import networks.service.MessegeServise;
import networks.service.email.RecoverPasswordBuilder;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;

/**
 * @author Igor Hnes on 20.12.17.
 */
public class MessegeServiseImpl implements MessegeServise {
    @Override
    public void sendMassege(String text, String to) {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setTo(to);
        simpleMailMessage.setSubject(new RecoverPasswordBuilder().getSUBJECT());
        simpleMailMessage.setText(text);

        final JavaMailSenderImpl javaMailSender = EmailConfig.mailSender();
        javaMailSender.send(simpleMailMessage);


    }
}
