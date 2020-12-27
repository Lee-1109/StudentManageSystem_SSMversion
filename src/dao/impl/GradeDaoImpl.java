package dao.impl;

import dao.IGradeDAO;
import model.Grade;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * @Author 南昌航空大学 18045221-李扬
 * @Date 2020/12/19 12:52
 * @Version 1.0
 */

public class GradeDaoImpl extends SqlSessionDaoSupport implements IGradeDAO {


    @Override
    public List<Grade> teacherSelectOneCourseScoreList(String courseId, String teacherId, String classId) {
        return this.getSqlSession().selectList("model.Grade.fromGrade",new Grade(courseId,classId,teacherId));
    }

    @Override
    public List<Grade> studentSelectGradeListByStudentId(String studentId) {
        return this.getSqlSession().selectList("model.Grade.studentFromGrade",studentId);
    }

    @Override
    public Grade stuGetOneGradeById(Grade grade) {
        System.out.println("=== this is dao===:"+grade.getStudentId()+grade.getCourseId());
        return this.getSqlSession().selectOne("model.Grade.selectOne",grade);
    }

    @Override
    public boolean updateOne(Grade grade) {
        return this.getSqlSession().update("model.Grade.updateOne",grade) == 1;
    }

    /**
     * 更新一门课程信息
     * @param grade 课程
     * @return
     */
    @Override
    public boolean insertOne(Grade grade) {
        return this.getSqlSession().insert("model.Grade.insertOne",grade) == 1;
    }


}
