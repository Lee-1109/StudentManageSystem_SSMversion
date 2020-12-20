package service.impl;

import dao.ICourseDAO;
import model.Course;
import model.Grade;
import service.ITeacherService;

import java.util.List;

/**
 * @Author 南昌航空大学 18045221-李扬
 * @Date 2020/12/20 19:03
 * @Version 1.0
 */

public class TeacherServiceImpl implements ITeacherService {
    private ICourseDAO courseDAO;

    public void setCourseDAO(ICourseDAO courseDAO) {
        this.courseDAO = courseDAO;
    }

    @Override
    public boolean addGradeList(List<Grade> gradeList) {
        return false;
    }

    @Override
    public boolean updateOneGrade(Grade grade) {
        return false;
    }

    @Override
    public List<Course> selectTeachCourse(String teacherId) {
        return null;
    }

    @Override
    public List<Course> selectEnterCourse(String teacherId) {
        return courseDAO.enterCourseList(teacherId);
    }

    @Override
    public List<Course> selectNotEnterCourse(String teacherId) {
        return courseDAO.notEnterCourseList(teacherId);
    }
}
