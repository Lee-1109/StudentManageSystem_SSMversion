package service;

import model.Grade;

import java.util.List;

/**
 * @Author 南昌航空大学 18045221-李扬
 * @Date 2020/12/19 14:07
 * @Version 1.0
 */

public interface IStudentService {
    //查询该学生的所有成绩
    List<Grade> selectGradeList(String studentId);
    //查询该学生一门课程成绩
    Grade getOneCourseGrade(String studentId, String courseName);
}
