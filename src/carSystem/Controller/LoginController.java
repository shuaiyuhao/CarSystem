package carSystem.Controller;

import carSystem.Info.userInfo;
import carSystem.logic.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by shuaiyuhao on 2017/12/20.
 */
@Controller
public class LoginController {
    //登录
    @RequestMapping(value = "/login")
    public String Login() {
        return "Login";
    }

    @RequestMapping(value = "/userLogin", method = RequestMethod.POST)
    public String userLogin(HttpServletRequest request,@RequestParam("userName") String userName, @RequestParam("passWord") String passWord) {
        User user = new User();
        userInfo userinfo = user.login(userName, passWord);
        //判断user_Info是否为空
        if (userinfo != null) {
            request.getSession().setAttribute("userInfo",userinfo);
            return "index";

        }else {
            request.setAttribute("info","用户吗或密码错误");
            return "wrong";
        }
    }

    //注册
    @RequestMapping(value = "/register")
    public String Register(){return "Register";}

    @RequestMapping(value = "/userRegister")
    public String userRegister(HttpServletRequest request,@RequestParam("userName") String userName, @RequestParam("passWord") String passWord, Model model){
        User user = new User();
        if(userName != null && !userName.isEmpty()){
            if(user.userIsExist(userName)){
                userInfo userinfo = new userInfo();
                userinfo.setuserName(userName);
                userinfo.setpassWord(passWord);
                user.saveUser(userinfo);
                request.setAttribute("info","注册成功");
                return "Login";
            }
            else {
                request.setAttribute("info","该用户名已存在");
            }
        }
        return "wrong";
    }





}

