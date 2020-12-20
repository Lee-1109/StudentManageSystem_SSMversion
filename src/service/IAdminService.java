package service;

import model.Course;
import model.Student;
import model.Teacher;

import java.util.List;

/**
 * @Author 南昌航空大学 18045221-李扬
 * @Date 2020/12/19 14:08
 * @Version 1.0
 */

public interface IAdminService {
    List<Teacher> listTeacher();
    List<Student> listStudent();
    List<Student> listStudentByPage(int page);


    //开设专业课程
    boolean addOneMajorCourse(String majorId,String courseId);
    boolean addTeacher(Teacher teacher);
    boolean addStudent(Student student);
    boolean addCourse(Course course);
    boolean updateTeacher(Teacher teacher);
    boolean updateStudent(Student student);
    boolean updateCourse(Course course);
    boolean deleteTeacher(String teacherId);
    boolean deleteStudent(String studentId);
    List<Teacher> findTeacherByCondition(String condition);
    List<Student> findStudentByCondition(String condition);
    //管理员删除课程
    boolean deleteCourse(String courseId);
    //管理员查询所有课程
    List<Course> selectCourseList();
    //通过开设专业查询课程
    List<Course> selectCourseListByMajorId(String majorId);
    //通过学生学号查询该学生所有课程 -> 用于查询课程表
    List<Course> selectCourseListByStudentId(String studentId);

}
