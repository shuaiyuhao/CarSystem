package carSystem.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by shuaiyuhao on 2017/12/21.
 */
@Controller
public class indexController {
    @RequestMapping(value = "/pasMessage")
    public String pasMessage(){return "pasMessage";}

    @RequestMapping(value = "/driMessage")
    public String driMessage(){return "driMessage";}

    @RequestMapping(value = "/index")
    public String index(){return "index";}

    @RequestMapping(value = "/userInfo")
    public String userInfo(){
        return "userInfo";
    }

    @RequestMapping(value = "/waitPassenger")
    public String waitPassenger(){return "waitPassenger";}

    @RequestMapping(value = "/waitDriver")
    public String waitDriver(){
        return "waitDriver";
    }


//    @RequestMapping(value = "/textView")
//    public String textView(){return "TEXT_VIEW";}

//    @RequestMapping(value = "/login")
//    public String login(){return "Login";}

}
