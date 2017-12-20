package networks.service.email;

import networks.model.User;

/**
 * @author Igor Hnes on 20.12.17.
 */
public interface MassengeBuilder {

    String build(User user);
}
