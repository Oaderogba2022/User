package ie.atu.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private EmailService emailService;

    @Autowired
    public UserService(EmailService emailService){
        this.emailService = emailService;
    }

    public void registerUser(String name, String email){

        emailService.sendEmail(email, "Message recieved" );
    }



}
