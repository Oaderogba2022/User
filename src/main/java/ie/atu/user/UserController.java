package ie.atu.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;


@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("newUser/{name}/{email}")
    public String registerUser(@PathVariable String name, @PathVariable String email) {
        userService.registerUser(name, email);
        return "Congratulation";
    }

    @PostMapping("/registerUserBody")
    @ResponseStatus(HttpStatus.CREATED)
    public User registerUserBody(@RequestBody User user) {
        System.out.println("User ID: " + user.getName());
        System.out.println("User ID: " + user.getEmail());
        return user;
    }
}
