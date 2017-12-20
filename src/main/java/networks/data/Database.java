package networks.data;

import networks.model.Post;
import networks.model.User;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Igor Hnes on 06.12.17.
 */
public class Database {

    public static List<User> getAllUsers() {

        List<User> list = new LinkedList<>();
        final User user = new User("Igormail", "134", "Igor", 22, "Single");
        final User user2 = new User("Alexmail", "134", "Alex", 25, "Single");
        final User user3 = new User("Bobmail", "134", "Bob", 30, "Married");

        list.add(user);
        list.add(user2);
        list.add(user3);

        return list;
   }


    public static List<Post> getAllPosts() {
        List<Post> list = new LinkedList<>();
        final Post post = new Post();
        post.setTitle("Hello");
        list.add(post);

        return list;
    }

    public static List<Post> getByTitle(){
        List<Post> list = new LinkedList<>();
        Post post = new Post();
        list.add(post);

        return list;
    }


}
