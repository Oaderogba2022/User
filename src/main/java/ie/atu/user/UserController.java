package ie.atu.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService user) { this.userService = user;}

    @GetMapping("newUser/{name}/{email}")
    public String registerUser(@PathVariable String name, @PathVariable String email)
    {
        userService.registerUser(name, email);
        return " Congratulation";
    }

}
