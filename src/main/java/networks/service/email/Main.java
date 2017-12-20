package networks.service.email;

import networks.model.User;
import tranning.Task5.Printer;

import javax.jws.soap.SOAPBinding;

/**
 * @author Igor Hnes on 20.12.17.
 */
public class Main {
    public static void main(String[] args) {

        final User user = new User();
        user.setName("Andrii");
        MassengeBuilder massengeBuilder = new HappyBirthDayBuilder();

        massengeBuilder.build(user);
    }
}
