package networks.service.email;

import networks.model.User;

public class HappyBirthDayBuilder implements MessegeBuilder {
    @Override
    public String build(User user) {
        return "Dear "
                +user.getName()
                +user.getAge()
                +" Happy B-Day from MiracleIT";
    }
}
