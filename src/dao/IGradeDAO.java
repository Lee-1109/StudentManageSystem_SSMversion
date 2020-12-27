package dao;

import model.Grade;

import java.util.List;

/**
 * @Author 南昌航空大学 18045221-李扬
 * @Date 2020/12/19 12:44
 * @Version 1.0
 */

public interface IGradeDAO {
    /**
     *
     * @param couId   查询的课程号
     * @param teacherId 任课教师Id
     * @param classId 班级编号
     * @return  classId班 couId课程的成绩列表
     */
    List<Grade> teacherSelectOneCourseScoreList(String couId, String teacherId, String classId);
    //学生通过学号获取所有课程成绩
    List<Grade> studentSelectGradeListByStudentId(String studentId);

    //通过课程号、学号获取 一位学生一门课程的成绩信息
    Grade stuGetOneGradeById(Grade grade);


    //更新一门课程成绩
    boolean updateOne(Grade grade);
    //添加一位同学 一门课程成绩
    boolean insertOne(Grade grade);

}
