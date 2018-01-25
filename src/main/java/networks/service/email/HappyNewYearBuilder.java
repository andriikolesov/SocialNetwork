package networks.service.email;

import networks.model.User;

public class HappyNewYearBuilder implements MessegeBuilder {
    @Override
    public String build(User user) {
        return "Dear "
                +user.getName()
                +" Happy New Year from MiracleIT";
    }
}
