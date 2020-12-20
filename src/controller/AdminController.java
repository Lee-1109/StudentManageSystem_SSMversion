package controller;

import model.Course;
import model.Student;
import model.Teacher;
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
    public String listStudent(HashMap<String, Object> map){
        List<Student> studentList = null;
        studentList = adminService.listStudent();
        //studentList = adminService.getStudentByPage(1);//按页面查询
        map.put("studentList",studentList);
        return "listStudent";
    }

    @RequestMapping("/findStudentByCondition")
    public String findStudent(String condition,HashMap<String,Object> map){
        List<Student> studentList = null;
        studentList = adminService.findStudentByCondition(condition);
        if(null  != studentList){
            map.put("studentList",studentList);
            return "listStudent";
        }
        return "error";
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

    /**
     * 列出所有教师信息
     * @param map 用以传输数据给jsp页面
     * @return 处理结果
     */
    @RequestMapping("/listTeacher")
    public String listTeacher(HashMap<String,Object> map){
        List<Teacher> teacherList=null;
        if(null!=(teacherList=adminService.listTeacher())){
            map.put("teacherList",teacherList);
            //展示教师信息
            return "listTeacher";
        }else return "error";//出错处理
    }

    @RequestMapping("/addTeacherController")
    public String addTeacher(Teacher teacher){
        if(adminService.addTeacher(teacher)){
            return "redirect:listTeacher";
        }
        else
            return "error";
    }

    @RequestMapping("/findTeacherByCondition")
    public String selectTeacher(String condition,HashMap<String,Object> map){
        List<Teacher> teacherList = null;
        teacherList = adminService.findTeacherByCondition(condition);
        if(null  != teacherList){
            map.put("teacherList",teacherList);
            return "listTeacher";
        }
        return "error";
    }

    @RequestMapping("/updateTeacherController")
    public String updateTeacher(Teacher teacher){
        if(adminService.updateTeacher(teacher)){
            return "redirect:listTeacher";
        }
        else
            return "error";
    }

    @RequestMapping("/deleteTeacherController")
    public String deleteTeacher(String teacherId){
        if(adminService.deleteTeacher(teacherId)){
            return "redirect:listTeacher";//重定向
        }
        else
            return "error";
    }

    @RequestMapping("/listCourse")
    public String listCourse(HashMap<String,Object> map){
        List<Course> courseList = null;
        courseList = adminService.listCourse();
        if(null != courseList){
            map.put("courseList",courseList);
        }
        return "listCourse";
    }
    @RequestMapping("/addCourseController")
    public String addCourse(Course course){
        if(adminService.addCourse(course))
        return "redirect:listCourse";
        else return "error";

    }

    @RequestMapping("/findCourseByCondition")
    public String selectCourseByCondition(String condition,HashMap<String,Object> map){
        List<Course> courseList = null;
        courseList = adminService.findCourseByCondition(condition);
        if(null  != courseList){
            map.put("courseList",courseList);
            return "listCourse";
        }
        return "error";
    }

}
