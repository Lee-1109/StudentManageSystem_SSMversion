package controller;

import model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.IAdminService;
import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

/**
 * @Author 南昌航空大学 18045221-李扬
 * @Date 2020/12/19 14:27
 * @Version 1.0
 */

@Controller
public class AdminController {

    @Resource(name = "adminService")
    private IAdminService adminService;

    @RequestMapping("/adminListStudent")
    public String getAllStudent(HashMap<String, Object> students){
        List<Student> studentList = null;
        studentList = adminService.getAllStudent();
        //studentList = adminService.getStudentByPage(1);//按页面查询
        students.put("studentList",studentList);
        return "adminStudentMain";
    }

    @RequestMapping("/deleteStudent")
    public String deleteStudent(String studentId){
        if(adminService.deleteStudent(studentId))
        return "redirect:adminListStudent";//页面重定向
        else
            return "error";
    }

    @RequestMapping("/updateStudent")
    public String updateStudent(Student student){
        if(adminService.updateStudent(student))
        return  "updateStudent";
        else return "error";
    }


}
