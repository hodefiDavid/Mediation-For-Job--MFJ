package string.web_server.userManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;


@RestController
public class UserManagerController {
    @Autowired
    private UserManagerService userManagerService;

    public List<User> getAllUsers(){

    }

    @RequestMapping(method = RequestMethod.POST, value = "/users")
    public int postNewUser(@RequestBody User newUser) {
        userManagerService.put(newUser);
        return 0;
    }
}
