package networks.service.email;

import networks.model.User;

/**
 * @author Igor Hnes on 20.12.17.
 */
public class RecoverPasswordBuilder implements MassengeBuilder {
    @Override
    public String build(User user) {
        return "Dear "
                +user.getName()
                +" you recover password";
    }
}
