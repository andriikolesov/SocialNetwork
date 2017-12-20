package networks.dao;

import networks.data.Database;
import networks.exeption.NoFoundPostExeption;
import networks.exeption.NoFoundUserExeption;
import networks.model.Post;
import networks.model.User;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Igor Hnes on 06.12.17.
 */
public class PostDao {


    public List<Post> getAll() {
        return Database.getAllPosts();
    }

    public List<Post> getByTitle (String title){
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
