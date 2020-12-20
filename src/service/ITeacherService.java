package service;

import model.Course;
import model.Grade;
import java.util.List;

/**
 * @Author 南昌航空大学 18045221-李扬
 * @Date 2020/12/19 14:07
 * @Version 1.0
 */

public interface ITeacherService {
    //批量录入学生成绩
    boolean addGradeList(List<Grade> gradeList);
    //修改一个学生一门课程成绩
    boolean updateOneGrade(Grade grade);
    //查询教师任教课程
    List<Course> selectTeachCourse(String teacherId);
    //查询教师已经录入课程
    List<Course> selectEnterCourse(String teacherId);
    //查询暂未录入课程
    List<Course> selectNotEnterCourse(String teacherId);

}
