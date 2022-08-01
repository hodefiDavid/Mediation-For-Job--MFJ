package userManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class UserManagerController {
    @Autowired
    private UserManagerService userManagerService;

    public List<User> getAllUsers(){

    }

}
