package controller;

import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import service.ILoginService;
import service.impl.LoginServiceImpl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class LoginController{

    private ILoginService loginService;

    @RequestMapping("/loginController")
    public String doLogin(HttpServletRequest request,User user) {
        String type= user.getType();
        if(loginService.validate(user.getId(), user.getPassword(), user.getType())){
            HttpSession session = request.getSession();
            session.setAttribute("nowUser",user.getId());//将信息存入session
            switch (type) {
                case "0":
                    return "studentMain";
                case "1":
                    return "teacherMain";
                case "2":
                    return "adminMain";
                default:
                    return "login";
            }
            }
        return "login";
    }

    /**
     * 注销登陆
     * @param request request获取session  对象
     * @return 返回登陆界面
     */
    @RequestMapping("/logoutController")
    public String doLogout(HttpServletRequest request){
        HttpSession session = request.getSession();
        session.removeAttribute("nowUser");
        return "login";
    }


    @Autowired
    public void setLoginService(LoginServiceImpl loginService) {
        this.loginService = loginService;
    }

}
