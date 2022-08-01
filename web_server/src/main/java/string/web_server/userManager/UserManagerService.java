package string.web_server.userManager;

import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class UserManagerService {

    private HashMap<String,User> users = new HashMap<>();

    public UserManagerService() {
        User ex1 = new User("david","hodefi","davidhodefi0@walla.com","0509660488");
        User ex2 = new User("ohad","hodefi","dfr%gkl.com","0527086934");

    }

    public String put(User newUser) {
        if(users.containsKey(newUser.getUserName())){
            return newUser.getUserName() + " already exist";
        }else{
            newUser.setIdKey();
            users.put(newUser.getUserName(), newUser);
            return "ok";
        }

    }
}
