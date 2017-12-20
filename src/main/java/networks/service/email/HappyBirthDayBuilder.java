package networks.service.email;

import networks.model.User;

/**
 * @author Igor Hnes on 20.12.17.
 */
public class HappyBirthDayBuilder implements MassengeBuilder {
    @Override
    public String build(User user) {
        return "Dear "
                +user.getName()
                +user.getAge()
                +" Happy B-Day from MiracleIT";
    }
}
