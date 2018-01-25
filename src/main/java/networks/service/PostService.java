package networks.service;

import networks.model.Post;
import java.util.List;

public interface PostService extends CrudService {

    List<Post> getAll();
    List<Post> getByTitle(String title);

}
