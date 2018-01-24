package networks.service;

/**
 * @author Igor Hnes on 20.12.17.
 */
public interface MessegeService extends CrudService {

    void sendMessege(String text, String to);
}
