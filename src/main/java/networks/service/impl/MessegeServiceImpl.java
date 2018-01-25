package networks.service.impl;

import networks.config.EmailConfig;
import networks.model.AbstractEntity;
import networks.service.MessegeService;
import networks.service.email.RecoverPasswordBuilder;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import java.util.List;

public class MessegeServiceImpl implements MessegeService {
    @Override
    public void sendMessege(String text, String to) {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setTo(to);
        simpleMailMessage.setSubject(new RecoverPasswordBuilder().getSUBJECT());
        simpleMailMessage.setText(text);

        final JavaMailSenderImpl javaMailSender = EmailConfig.mailSender();
        javaMailSender.send(simpleMailMessage);
    }

    @Override
    public void update(AbstractEntity entity) {
    }

    @Override
    public void create(AbstractEntity entity) {
    }

    @Override
    public void delete(Object o) {
    }

    @Override
    public List findAll() {
        return null;
    }
}
