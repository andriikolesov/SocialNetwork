package networks.service;

import networks.dao.PostDao;
import networks.model.Post;

import java.util.List;

/**
 * @author Igor Hnes on 06.12.17.
 */
public interface PostService {

    List<Post> getAll();

    List<Post> getByTitle(String title);

}
