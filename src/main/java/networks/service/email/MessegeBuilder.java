package networks.service.email;

import networks.model.User;

public interface MessegeBuilder {

    String build(User user);
}
