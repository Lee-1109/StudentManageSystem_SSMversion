package service;

import model.Course;
import model.Depart;
import model.Student;
import model.Teacher;

import java.util.List;

/**
 * @Author 南昌航空大学 18045221-李扬
 * @Date 2020/12/19 14:08
 * @Version 1.0
 */

public interface IAdminService {



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
    boolean deleteCourse(String courseId);
    List<Teacher> listTeacherByCondition(String condition);
    List<Student> listStudentByCondition(String condition);
    List<Course> listCourseByCondition(String condition);
    List<Depart> listDepartByCondition(String condition);
    List<Course> listCourse();
    List<Depart> listDepart();
    List<Teacher> listTeacher();
    List<Student> listStudent();
    List<Student> listStudentByPage(int page);
    //通过开设专业查询课程
    List<Course> selectCourseListByMajorId(String majorId);
    List<Course> selectCourseListByStudentId(String studentId);


}
