package networks.service.impl;

import networks.dao.PostDao;
import networks.dao.impl.PostDaoImpl;
import networks.model.Post;
import networks.service.PostService;

import java.util.List;

/**
 * @author Igor Hnes on 20.12.17.
 */
public class PostServiceImpl implements PostService{

    @Override
    public List<Post> getAll() {
        final PostDao postDao = new PostDaoImpl();
        return postDao.getAll();
    }

    @Override
    public List<Post> getByTitle(String title) {
        PostDao postDao = new PostDaoImpl();
        return postDao.getByTitle(title);
    }
}
