package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.IDepartService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Author 南昌航空大学 18045221-李扬
 * @Date 2020/12/18 20:35
 * @Version 1.0
 */

@Controller
public class DepartController {

    private IDepartService departService;

    @RequestMapping("/getClassDetailController")
    public String getDepartDetailByClassId(HttpServletRequest request){
        String classId=request.getParameter("classId");
        departService.getDepartDetailByClassId(classId);
        return "adminClassDetail";
    }

    @RequestMapping("/getAllDepartmentController")
    public String getAllDepartment(){
        departService.getAllDepartment();
        return "adminDepartManage";
    }


    @Autowired
    public void setDepartService(IDepartService departService) {
        this.departService = departService;
    }
}
