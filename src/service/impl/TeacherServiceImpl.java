package service.impl;

import dao.ICourseDAO;
import dao.IDepartDAO;
import dao.IGradeDAO;
import dao.IStudentDAO;
import model.Course;
import model.Grade;
import model.Student;
import service.ITeacherService;

import java.util.List;

/**
 * @Author 南昌航空大学 18045221-李扬
 * @Date 2020/12/20 19:03
 * @Version 1.0
 */

public class TeacherServiceImpl implements ITeacherService {
    private IGradeDAO gradeDAO;
    private ICourseDAO courseDAO;
    private IStudentDAO studentDAO;

    public void setCourseDAO(ICourseDAO courseDAO) {
        this.courseDAO = courseDAO;
    }

    public void setGradeDAO(IGradeDAO gradeDAO) {
        this.gradeDAO = gradeDAO;
    }

    public void setStudentDAO(IStudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    /**
     *
     * @param courseId 课程号
     * @param classId 上课专业
     * @param teacherId 任教教师工号
     * @return HashMap gradeList
     */
    @Override
    public List<Grade> listOneCourseScoreByClass(String courseId, String classId, String teacherId) {
        return gradeDAO.teacherSelectOneCourseScoreList(courseId,teacherId, classId);
    }

    /**
     * 查询出一个班的同学信息
     * @param classId 班级号
     * @return 该班级所有同学信息
     */
    @Override
    public List<Student> listOneClass(String classId) {
        return studentDAO.findByCondition(classId);
    }

    /**
     * 批量添加成绩
     * @param gradeList 成绩列表
     * @return 添加成功返回true 否则返回false
     */
    @Override
    public boolean addGradeList(List<Grade> gradeList) {
        for(Grade grade:gradeList){
            if(!gradeDAO.insertOne(grade)){
                System.out.println("TeacherService==ERROR:==批量录入成绩出错");
                return false;
            }
        }
        return true;
    }

    /**
     * 更新一门成绩
     * @param grade 更新的成绩信息
     * @return 成功返回true 否则返回false
     */
    @Override
    public boolean updateOneGrade(Grade grade) {
        return gradeDAO.updateOne(grade);
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
