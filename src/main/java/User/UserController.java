package User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller("/users")
public class UserController {


    @RequestMapping(value = "/create", method=RequestMethod.GET)
    public Users createUser(Users users){
        String va = "Sun Lode";
        System.out.println(va);
        return null;
    }
}
