package dao;

import model.Course;

import java.util.List;

/**
 * @Author 南昌航空大学 18045221-李扬
 * @Date 2020/12/20 9:56
 * @Version 1.0
 */

public interface ICourseDAO {
    //管理员添加课程
    boolean add(Course course);
    //管理员更新课程
    boolean update(Course course);
    //管理员删除课程
    boolean delete(String courseId);
    //管理员查询所有课程
    List<Course> selectList();
    //通过开设专业查询课程
    List<Course> selectListByMajorId(String majorId);
    //条件查询
    List<Course> findByCondition(String condition);

    //开设专业课程
    boolean addOneMajorCourse(String majorId,String courseId);


    //通过课程号 返回课程名
    String getCourseNameByCourId(String courseId);
    //通过课程号 返回课程名
    String getCourseIdByCourName(String courName);

    //通过教师工号查询任教课程（已经录入）
    List<Course> enterCourseList(String teacherId);
    //通过教师工号查询任教课程（未录入成绩）
    List<Course> notEnterCourseList(String teacherId);

}
