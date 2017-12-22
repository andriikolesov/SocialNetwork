package networks.service.email;

import networks.model.User;

/**
 * @author Igor Hnes on 20.12.17.
 */
public class HappyNewYearBuilder implements MessegeBuilder {
    @Override
    public String build(User user) {
        return "Dear "
                +user.getName()
                +" Happy New Year from MiracleIT";
    }
}
