package networks.service.email;

import networks.model.User;
import networks.service.email.MessegeBuilder;

public class NewMessegeBuilder implements MessegeBuilder {
    @Override
    public String build(User user) {
        return "Dear "
                +user.getName()
                +"you got 1 new messege";
    }
}
