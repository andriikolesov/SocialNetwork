package networks.service.email;

import networks.model.User;

public class RegistrationBuilder implements MessegeBuilder {
    @Override
    public String build(User user) {
        return "Dear "
                +user.getName()
                +" Congradulation with successfull registration";
    }
}
