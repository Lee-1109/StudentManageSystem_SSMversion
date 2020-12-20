package service.impl;

import dao.ICourseDAO;
import dao.IGradeDAO;
import model.Grade;
import org.springframework.beans.factory.annotation.Autowired;
import service.IStudentService;
import java.util.List;

/**
 * @Author 南昌航空大学 18045221-李扬
 * @Date 2020/12/20 15:15
 * @Version 1.0
 */

public class StudentServiceImpl implements IStudentService {

    private IGradeDAO gradeDAO;

    private ICourseDAO courseDAO;

    public void setCourseDAO(ICourseDAO courseDAO) {
        this.courseDAO = courseDAO;
    }

    public void setGradeDAO(IGradeDAO gradeDAO) {
        this.gradeDAO = gradeDAO;
    }

    /**
     * 学生查询所有成绩
     * @param studentId 学生学号信息
     * @return 成绩列表
     */
    @Override
    public List<Grade> selectGradeList(String studentId) {
        return gradeDAO.studentSelectGradeListByStudentId(studentId);
    }

    /**
     *  学生查询一门课程成绩
     * @param studentId 学生Id
     * @param courseName 课程名
     * @return 查询结果
     */
    @Override
    public Grade getOneCourseGrade(String studentId, String courseName) {
        System.out.println("==this is StudentService:==="+studentId+courseName);
        String courseId=courseDAO.getCourseIdByCourName(courseName);
        System.out.println("==this is StudentService:===courseId:"+courseId);
        return gradeDAO.stuGetOneGradeById(new Grade(courseId,studentId));
    }
}
