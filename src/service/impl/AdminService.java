package service.impl;

import dao.ICourseDAO;
import dao.IDepartDAO;
import dao.IStudentDAO;
import dao.ITeacherDAO;
import model.Course;
import model.Depart;
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
    private ICourseDAO courseDAO;
    private IDepartDAO departDAO;

    public void setCourseDAO(ICourseDAO courseDAO) {
        this.courseDAO = courseDAO;
    }

    public void setStudentDAO(IStudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    public void setTeacherDAO(ITeacherDAO teacherDAO) {
        this.teacherDAO = teacherDAO;
    }

    public void setDepartDAO(IDepartDAO departDAO) {
        this.departDAO = departDAO;
    }

    /**
     * 获取所有教师信息
     * @return 教师详细信息
     */
    @Override
    public List<Teacher> listTeacher() {
        return teacherDAO.selectAllTeacher();
    }

    @Override
    public List<Student> listStudent() {
        return studentDAO.selectAllStudent();
    }

    /**
     * 实现分页查询学生
     * @param page 页数
     * @return 查询的学生列表
     */
    @Override
    public List<Student> listStudentByPage(int page) {
        int pageSize=5;//每页大小 默认为5个
        HashMap<String,Integer> map=new HashMap<>();
        map.put("startIndex",(page-1)*pageSize);//开始处
        map.put("pageSize",pageSize);//请求页面
        return studentDAO.selectStudentByPage(map);
    }

    @Override
    public boolean addOneMajorCourse(String majorId, String courseId) {
        return false;
    }

    @Override
    public boolean addTeacher(Teacher teacher) {
        if(teacherDAO.add(teacher)){
            System.out.println("AdminController:teacher"+teacher.getTeacherName()+"add success");
            return true;
        }else {
            System.out.println("AdminController:teacher"+teacher.getTeacherName()+"add error");
            return false;
        }
    }

    @Override
    public boolean addStudent(Student student) {
        if(studentDAO.add(student)){
            System.out.println("===AdminService_addStudent:"+student.getId()+student.getName()+"添加成功");
            return true;
        }else {
            System.out.println("===AdminService_addStudent:"+student.getId()+student.getName()+"添加失败");
            return false;
        }

    }

    @Override
    public boolean addCourse(Course course) {
        return courseDAO.add(course);
    }

    @Override
    public boolean updateTeacher(Teacher teacher) {
        if(teacherDAO.update(teacher)){
            System.out.println("AdminController:update teacher"+teacher.getTeacherId()+"successful!");
            return true;
        }else {
            System.out.println("AdminController:update teacher"+teacher.getTeacherId()+"error!");
            return false;
        }
    }

    /**
     * 更新学生信息 update student information
     * @param student 要修改的学生信息
     * @return 修改成功返回true 失败返回false
     */
    @Override
    public boolean updateStudent(Student student) {
        return studentDAO.updateStudent(student);
    }

    @Override
    public boolean updateCourse(Course course) {
        return courseDAO.update(course);
    }

    @Override
    public boolean deleteTeacher(String teacherId) {
        if(teacherDAO.delete(teacherId)){
            System.out.println("====AdminService:teacher:"+teacherId+" delete success!===");
            return true;
        }
        else {
            System.out.println("====AdminService:teacher:"+teacherId+" delete error!===");
            return false;
        }
    }

    @Override
    public boolean deleteStudent(String studentId) {

        return studentDAO.deleteOneStudent(studentId);
    }

    @Override
    public List<Teacher> listTeacherByCondition(String condition) {
        if(condition==null) condition="";
        return teacherDAO.findByCondition(condition);
    }

    @Override
    public List<Student> listStudentByCondition(String condition) {
        if(condition==null) condition="";
        return studentDAO.findByCondition(condition);
    }

    @Override
    public List<Course> listCourseByCondition(String condition) {
        if(condition==null) condition="";
        return courseDAO.findByCondition(condition);
    }

    @Override
    public boolean deleteCourse(String courseId) {
        return false;
    }

    @Override
    public List<Course> listCourse() {
        return courseDAO.selectList();
    }



    @Override
    public List<Course> selectCourseListByMajorId(String majorId) {
        return null;
    }

    @Override
    public List<Course> selectCourseListByStudentId(String studentId) {
        return null;
    }


    /**
     * 查询所有的部门信息
     * @return 返回部门结果集
     */
    @Override
    public List<Depart> listDepart() {
        List<Depart> departs = departDAO.selectList();
        if(null != departs){
            System.out.println("====adminService listDepartment ====: select list department success!");
        }else {
            System.out.println("====adminService listDepartment ====: select list department error:it is null!");
        }
        return departs;
    }

    /**
     * 条件查询部门信息
     * @param condition 查询条件
     * @return 返回查询的部门列表结果集
     */
    @Override
    public List<Depart> listDepartByCondition(String condition) {
        List<Depart> departs = departDAO.selectListByCondition("%"+condition+"%");
        if(null != departs){
            System.out.println("====adminService listDepartment ====: select condition department success!");
        }else {
            System.out.println("====adminService listDepartment ====: select condition department error:it is null!");
        }
        return departs;

    }
}
