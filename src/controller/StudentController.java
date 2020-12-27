package controller;

import model.Grade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.IStudentService;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;

/**
 * @Author 南昌航空大学 18045221-李扬
 * @Date 2020/12/20 15:39
 * @Version 1.0
 */

@Controller
public class StudentController {

    private IStudentService studentService;

    @Autowired
    public void setStudentService(IStudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping("/getGradeByCourseName")
    public String selectOneCourseGrade(HttpSession session, String courseName, HashMap<String,Object> map){
        String stuId = (String) session.getAttribute("nowUser");
        Grade grade =null;
        //通过课程名查找课程成绩
        grade = studentService.getOneCourseGrade(stuId, courseName);
        if(null != grade){
            //将成绩传入jsp页面
            map.put("courseId",grade.getCourseId());
            map.put("studentId",grade.getStudentId());
            map.put("studentName",grade.getStudentName());
            map.put("courseName",grade.getCourseName());
            map.put("courseGrade",grade.getGrade());
        }
        return "studentSearchGrade";

    }

    @RequestMapping("/listStudentGrade")
    public String listGrade(HttpSession session,HashMap<String,Object> map){
        String userId= (String) session.getAttribute("nowUser");

        List<Grade> gradeList=null;
        if( null != (gradeList=studentService.selectGradeList(userId) )){
            map.put("gradeList",gradeList);
            return "studentSearchGrade";
        }
        return "";
    }
}
