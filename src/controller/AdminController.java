package controller;

import model.Course;
import model.Depart;
import model.Student;
import model.Teacher;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    /**
     * 查看学生列表
     * @param map 存放返回到视图的内容
     * @return 结果
     */
    @RequestMapping("/adminListStudent")
    public String listStudent(HashMap<String, Object> map){
        List<Student> studentList = null;
        studentList = adminService.listStudent();
        //studentList = adminService.getStudentByPage(1);//按页面查询
        map.put("studentList",studentList);
        return "listStudent";
    }

    /**
     * 条件查询学生
     * @param condition 查询条件
     * @param map 结果集合
     * @return 查询成功返回条件
     */
    @RequestMapping("/findStudentByCondition")
    public String findStudent(String condition,HashMap<String,Object> map){
        List<Student> studentList = null;
        studentList = adminService.listStudentByCondition(condition);
        if(null  != studentList){
            map.put("studentList",studentList);
            return "listStudent";
        }
        return "error";
    }

    /**
     * 删除学生
     * @param studentId 删除学生的学号
     * @return 删除结果
     */
    @RequestMapping("/deleteStudent")
    public String deleteStudent(String studentId){
        if(adminService.deleteStudent(studentId))
        return "redirect:adminListStudent";//页面重定向
        else
            return "error";
    }

    /**
     * 更新学生信息
     * @param student 值对象 更新后的学生信息
     * @return 更新成功返回学生列表
     */
    @RequestMapping("/updateStudent")
    public String updateStudent(Student student){
        if(adminService.updateStudent(student)){
            return  "redirect:adminListStudent";
        }
        else return "error";
    }



    /**
     * 添加学生
     * @param student 待添加的学生
     * @return 添加成功重定向至listStudent 否则报错 指向error
     */
    @RequestMapping("/addStudent")
    public String addStudent(Student student){
        if(adminService.addStudent(student)){
            return "redirect:adminListStudent";
        }else {
            return "error";
        }
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


    /**
     * 添加教师信息
     * @param teacher 添加的教师信息
     * @return 结果集
     */
    @RequestMapping("/addTeacherController")
    public String addTeacher(Teacher teacher){
        if(adminService.addTeacher(teacher)){
            return "redirect:listTeacher";
        }
        else
            return "error";
    }


    /**
     * 条件查询教师
     * @param condition 查询条件
     * @param map 结果集
     * @return 返回条件
     */
    @RequestMapping("/findTeacherByCondition")
    public String selectTeacher(String condition,HashMap<String,Object> map){
        List<Teacher> teacherList = null;
        teacherList = adminService.listTeacherByCondition(condition);
        if(null  != teacherList){
            map.put("teacherList",teacherList);
            return "listTeacher";
        }
        return "error";
    }

    /**
     * 更新教师信息
     * @param teacher 更新后的教师信息值对象
     * @return 返回结果
     */
    @RequestMapping("/updateTeacherController")
    public String updateTeacher(Teacher teacher){
        if(adminService.updateTeacher(teacher)){
            return "redirect:listTeacher";
        }
        else
            return "error";
    }

    /**
     * 删除教师信息
     * @param teacherId 教师工号
     * @return 返回结果
     */
    @RequestMapping("/deleteTeacherController")
    public String deleteTeacher(String teacherId){
        if(adminService.deleteTeacher(teacherId)){
            return "redirect:listTeacher";//重定向
        }
        else
            return "error";
    }


    /**
     * 获取课程信息列表
     * @param map 结果集合
     * @return 返回结果
     */
    @RequestMapping("/listCourse")
    public String listCourse(HashMap<String,Object> map){
        List<Course> courseList = null;
        courseList = adminService.listCourse();
        if(null != courseList){
            map.put("courseList",courseList);
        }
        return "listCourse";
    }

    /**
     * 添加课程信息
     * @param course 课程信息值对象
     * @return 返回结果集
     */
    @RequestMapping("/addCourseController")
    public String addCourse(Course course){
        if(adminService.addCourse(course))
        return "redirect:listCourse";
        else return "error";

    }

    /**
     * 条件查询课程
     * @param condition 查询条件
     * @param map 存放结果的HashMap
     * @return 返回结果集
     */
    @RequestMapping("/findCourseByCondition")
    public String selectCourseByCondition(String condition,HashMap<String,Object> map){
        List<Course> courseList = null;
        courseList = adminService.listCourseByCondition(condition);
        if(null  != courseList){
            map.put("courseList",courseList);
            return "listCourse";
        }
        return "error";
    }


    @RequestMapping("/listDepartment")
    public String listDepartment(HashMap<String,Object> map){
        List<Depart> departList = adminService.listDepart();
        map.put("departList",departList);
        return "listDepart";
    }

    @RequestMapping("/listDepartmentByCondition")
    public String listDepartmentByCondition(@RequestParam("condition")String condition, HashMap<String,Object> map){
        List<Depart> departList = adminService.listDepartByCondition(condition);
        map.put("departList",departList);
        return "listDepart";
    }
}
