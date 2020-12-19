package controller;

import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import service.ILoginService;
import service.impl.LoginServiceImpl;

@Controller
public class LoginController{

    private ILoginService loginService;

    @RequestMapping("/loginController")
    public String doLogin(User user,Model model) {
        String type= user.getType();
        if(loginService.validate(user.getId(), user.getPassword(), user.getType())){
            model.addAttribute("useName",user.getId());
            switch (type) {
                case "0":
                    return "main";
                case "1":
                    return "teacherMain";
                case "2":
                    return "adminMain";
            }
            }
        return "login";
    }

    @Autowired
    public void setLoginService(LoginServiceImpl loginService) {
        this.loginService = loginService;
    }

}
