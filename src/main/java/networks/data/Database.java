package networks.data;

import networks.model.Post;
import networks.model.User;

/**
 * @author Igor Hnes on 06.12.17.
 */
public class Database {

    public static User[] getAllUsers() {
        User users[] = new User[3];
        final User user = new User("joyulr", "134", "Igor", 22, "Single");
        final User user2 = new User("joyulr", "134", "Igor", 22, "Single");
        final User user3 = new User("joyulr", "134", "Igor", 22, "Single");

        users[0] = user;
        users[1] = user2;
        users[2] = user3;

        return users;
    }

    public static Post[] getAllPosts() {
        Post posts[] = new Post[4];
        final Post post = new Post();
        posts[0] = post;

        return posts;
    }
}
