package networks.service.email;

import networks.model.User;

/**
 * @author Igor Hnes on 20.12.17.
 */
public interface MessegeBuilder {

    String build(User user);
}
