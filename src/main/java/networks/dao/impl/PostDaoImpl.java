package networks.dao.impl;

import networks.dao.PostDao;
import networks.data.Database;
import networks.exeption.NoFoundPostExeption;
import networks.model.Post;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Igor Hnes on 20.12.17.
 */
public class PostDaoImpl implements PostDao {
    @Override
    public List<Post> getAll() {
        return Database.getAllPosts();
    }

    @Override
    public List<Post> getByTitle(String title) {
        List<Post> posts = getAll();
        List<Post> postsByTitle = new LinkedList<>();
        for (Post elem : posts){
            if (title.equals(elem.getTitle())){
                postsByTitle.add(elem);
            }
        }

        if (postsByTitle.size() == 0) {
            throw new NoFoundPostExeption();
        }
        return postsByTitle;
    }
    }

