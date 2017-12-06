package networks.controller;

import networks.model.User;
import networks.service.UserService;

/**
 * @author Igor Hnes on 06.12.17.
 */
public class UserController {

    public static void main(String[] args) {

        final UserService userService = new UserService();
        final User[] users = userService.getAll();

        for (User elem : users) {
            System.out.println(elem);
        }
    }
}
