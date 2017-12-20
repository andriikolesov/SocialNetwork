package networks.controller;
import networks.model.Post;
import networks.service.PostService;

import java.util.List;

/**
 * @author Igor Hnes on 06.12.17.
 */
public class PostController {

    public static void main(String[] args) {
        final PostService postService = new PostService();
        final List<Post> posts = postService.getAll();
        final List<Post> posts1 = postService.getByTitle("Hello");

        for (Post elem : posts) {
            System.out.println(elem);
        }
        System.out.println("All post printed");

        for (Post elem : posts1){
            System.out.println(elem);
        }
        System.out.println("11");

        }
    }




