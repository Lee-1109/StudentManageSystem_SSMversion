package service.impl;

import dao.IStudentDAO;
import dao.ITeacherDAO;
import model.Course;
import model.Student;
import model.Teacher;
import service.IAdminService;
import java.util.HashMap;
import java.util.List;

/**
 * @Author 南昌航空大学 18045221-李扬
 * @Date 2020/12/19 14:15
 * @Version 1.0
 */

public class AdminService implements IAdminService {

    private IStudentDAO studentDAO;
    private ITeacherDAO teacherDAO;


    public void setStudentDAO(IStudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    public void setTeacherDAO(ITeacherDAO teacherDAO) {
        this.teacherDAO = teacherDAO;
    }

    @Override
    public List<Teacher> getAllTeacher() {
        teacherDAO.getAllTeacher();
        return null;
    }

    @Override
    public List<Student> getAllStudent() {
        return studentDAO.selectAllStudent();
    }

    /**
     * 实现分页查询学生
     * @param page 页数
     * @return 查询的学生列表
     */
    @Override
    public List<Student> getStudentByPage(int page) {
        int pageSize=5;//每页大小 默认为5个
        HashMap<String,Integer> map=new HashMap<>();
        map.put("startIndex",(page-1)*pageSize);//开始处
        map.put("pageSize",pageSize);//请求页面
        return studentDAO.selectStudentByPage(map);
    }

    @Override
    public List<Course> getAllCourse() {
        return null;
    }

    @Override
    public boolean addTeacher(Teacher teacher) {
        return false;
    }

    @Override
    public boolean addStudent(Student student) {
        return false;
    }

    @Override
    public boolean addCourse(Course course) {
        return false;
    }

    @Override
    public boolean updateTeacher(Teacher teacher) {
        return false;
    }

    /**
     * 更新学生信息 update student information
     * @param student 要修改的学生信息
     * @return 修改成功返回true 失败返回false
     */
    @Override
    public boolean updateStudent(Student student) {


        return false;
    }

    @Override
    public boolean updateCourse(Course course) {
        return false;
    }

    @Override
    public boolean deleteTeacher(Teacher teacher) {
        return false;
    }

    @Override
    public boolean deleteStudent(String studentId) {

        return studentDAO.deleteOneStudent(studentId);
    }

    @Override
    public boolean deleteCourse(Course course) {
        return false;
    }
}
