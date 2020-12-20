package controller;

import model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.ITeacherService;
import service.impl.TeacherServiceImpl;

import javax.annotation.Resource;
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
        List<Course> enterCourseList = null;
        List<Course> notEnterCourseList = null;
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
        return "teacherEnterGrade";
    }
}
