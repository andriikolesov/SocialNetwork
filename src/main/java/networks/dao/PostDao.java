package networks.dao;

import networks.data.Database;
import networks.exeption.NoFoundPostExeption;
import networks.exeption.NoFoundUserExeption;
import networks.model.Post;
import networks.model.User;

import java.util.LinkedList;
import java.util.List;

public interface PostDao {

    List<Post> getAll();
    List<Post> getByTitle(String title);
}
