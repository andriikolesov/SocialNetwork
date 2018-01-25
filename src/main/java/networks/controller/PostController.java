package networks.controller;
import networks.model.Post;
import networks.service.PostService;
import networks.service.factory.ServiceFactory;
import networks.service.impl.PostServiceImpl;
import javax.xml.ws.Service;
import java.util.List;

public class PostController {

    public static void main(String[] args) {
        final PostService postService = ServiceFactory.getPostService();
        final List<Post> posts = postService.getAll();
        final List<Post> posts1 = postService.getByTitle("Hello");

        for (Post elem : posts) {
            System.out.println(elem);
        }
        System.out.println("All post printed");

        for (Post elem : posts1){
            System.out.println(elem);
        }
        System.out.println("All titles printed");
        }
    }
