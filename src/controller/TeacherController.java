package controller;

import model.Course;
import model.Grade;
import model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.ITeacherService;
import service.impl.TeacherServiceImpl;
import util.studentScoreListVo;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;

/**
 * @Author 南昌航空大学 18045221-李扬
 * @Date 2020/12/20 19:02
 * @Version 1.0
 */
@Controller
public class TeacherController {

    private ITeacherService teacherService;

    @Autowired
    public void setTeacherService(TeacherServiceImpl teacherService) {
        this.teacherService = teacherService;
    }


    /**
     * 教师获取所有任教的课程
     * @return 所有任教课程列表
     */
    @RequestMapping("/teacherListCourse")
    public String listCourse(HttpServletRequest request, HashMap<String,Object> map){
        HttpSession session=request.getSession();
        String userId = (String) session.getAttribute("nowUser");
        List<Course> enterCourseList;
        List<Course> notEnterCourseList;
        enterCourseList = teacherService.selectEnterCourse(userId);
        notEnterCourseList = teacherService.selectNotEnterCourse(userId);
        //已录入课程
        if(null != enterCourseList){
            map.put("enterCourseCount",enterCourseList.size());
            map.put("enterCourseList",enterCourseList);
        }
        //未录入课程
        if(null != notEnterCourseList){
            map.put("notEnterCourseCount",notEnterCourseList.size());
            map.put("notEnterCourseList",notEnterCourseList);
        }
        return "teacherCourseList";
    }



    /**
     *  获取一个班级 一门课程的成绩
     * @param request 获取session对象
     * @param courseId 课程号
     * @param classId 班级号
     * @return 查询成功列出 否则出错
     */

    @RequestMapping("/teacherListOneCourseByClass")
    public String listOneCourseScoreByClass(HashMap<String,Object> map,
                                            HttpServletRequest request,
                                            String courseId,String classId){
        List<Grade> gradeList;
        System.out.println("AdminController:===courseId:"+courseId+"classId:"+classId);
        HttpSession session=request.getSession();
        String teacherId = (String) session.getAttribute("nowUser");
        gradeList = teacherService.listOneCourseScoreByClass(courseId,"180452",teacherId);
        if( null !=gradeList){
            map.put("gradeList",gradeList);
            return "oneCourseScoreDetail";
        }else {
            return "error";
        }
    }



    @RequestMapping("/teacherListOneClass")
    public String listOneClassScoreByClass(HashMap<String,Object> map,String courseId){
        List<Student> students = teacherService.listOneClass("180452");
        map.put("courseId",courseId);
        map.put("students",students);
        return "oneCourseScoreInput";
    }



    /**
     * 更新课程成绩
     * @param courseId 课程号
     * @param studentScoreListVo 更新的列表
     * @return 更新成功返回界面 否则报错
     */
    @RequestMapping("/updateScore")
    public String updateScore(@RequestParam("courseId")String courseId,
                              studentScoreListVo studentScoreListVo){
        List<Grade> gradeList= studentScoreListVo.getStudentList();
        if(gradeList.isEmpty()){
            return "error";
        }else {
           for(Grade grade:gradeList){
               teacherService.updateOneGrade(  new Grade(courseId, grade.getStudentId(),grade.getGrade()) );
           }
           return "redirect:teacherListCourse";
        }
    }

    /**
     * 批量录入成绩
     * @param studentScoreListVo 封装了成绩列表
     * @return 成功跳回课程录入列表 否则报错
     */
    @RequestMapping("/enterScore")
    public String addScore(@RequestParam("courseId")String courseId,
                           studentScoreListVo studentScoreListVo){
        List<Grade> gradeList= studentScoreListVo.getStudentList();
        if(null != gradeList){
            for(Grade grade:gradeList){
                grade.setCourseId(courseId);
            }
            teacherService.addGradeList(gradeList);
            return "redirect:teacherListCourse";
        }
        else return "error";

    }
}
