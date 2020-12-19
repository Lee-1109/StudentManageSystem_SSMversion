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
    public Grade stuGetOneGradeById(Grade grade) {
        Grade result=null;
        result = this.getSqlSession().selectOne("model.Grade.stuGetOneGrade",grade);
        return  result;
    }

    @Override
    public List<Grade> teaGetAllStuGrade(String couId) {
        return null;
    }
}
