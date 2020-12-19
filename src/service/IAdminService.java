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
    List<Teacher> getAllTeacher();
    List<Student> getAllStudent();
    List<Student> getStudentByPage(int page);
    List<Course> getAllCourse();
    boolean addTeacher(Teacher teacher);
    boolean addStudent(Student student);
    boolean addCourse(Course course);
    boolean updateTeacher(Teacher teacher);
    boolean updateStudent(Student student);
    boolean updateCourse(Course course);
    boolean deleteTeacher(Teacher teacher);
    boolean deleteStudent(String studentId);
    boolean deleteCourse(Course course);

}
