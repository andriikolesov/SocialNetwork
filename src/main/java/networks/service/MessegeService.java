package networks.service;

public interface MessegeService extends CrudService {
    void sendMessege(String text, String to);
}
