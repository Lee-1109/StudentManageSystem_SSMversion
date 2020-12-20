package dao;

import model.Grade;

import java.util.List;

/**
 * @Author 南昌航空大学 18045221-李扬
 * @Date 2020/12/19 12:44
 * @Version 1.0
 */

public interface IGradeDAO {
    //通过课程号获取所有学生的成绩信息
    List<Grade> teacherSelectGradeListByCourseId(String couId);
    //学生通过学号获取所有课程成绩
    List<Grade> studentSelectGradeListByStudentId(String studentId);

    //通过课程号、学号获取 一位学生一门课程的成绩信息
    Grade stuGetOneGradeById(Grade grade);

}
