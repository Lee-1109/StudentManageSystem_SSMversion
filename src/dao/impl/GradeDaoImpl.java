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
    public List<Grade> teacherSelectGradeListByCourseId(String courseId) {
        return this.getSqlSession().selectList("model.Grade.fromGrade",courseId);
    }

    @Override
    public List<Grade> studentSelectGradeListByStudentId(String studentId) {
        return this.getSqlSession().selectList("model.Grade.studentFromGrade",studentId);

    }

    @Override
    public Grade stuGetOneGradeById(Grade grade) {
        System.out.println("===junjun this is dao===:"+grade.getStudentId()+grade.getCourseId());
        return this.getSqlSession().selectOne("model.Grade.selectOne",grade);
    }


}
