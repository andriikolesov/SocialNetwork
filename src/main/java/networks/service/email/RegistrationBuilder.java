package networks.service.email;

import networks.model.User;

/**
 * @author Igor Hnes on 20.12.17.
 */
public class RegistrationBuilder implements MessegeBuilder {
    @Override
    public String build(User user) {
        return "Dear "
                +user.getName()
                +" Congradulation with successfull registration";
    }
}
