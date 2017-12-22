package networks.service.email;

import networks.model.User;

/**
 * @author Igor Hnes on 20.12.17.
 */
public class Main {
    public static void main(String[] args) {

        final User user = new User();
        user.setName("Andrii");
        MessegeBuilder messegeBuilder = new HappyBirthDayBuilder();

        messegeBuilder.build(user);
    }
}
