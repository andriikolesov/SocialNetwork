package networks.service;

import networks.dao.PostDao;
import networks.model.Post;

import java.util.List;

/**
 * @author Igor Hnes on 06.12.17.
 */
public class PostService {

    public List<Post> getAll() {
        final PostDao postDao = new PostDao();
        return postDao.getAll();
    }

    public List<Post> getByTitle(String title){
        PostDao postDao = new PostDao();
        return postDao.getByTitle(title);
    }

}
