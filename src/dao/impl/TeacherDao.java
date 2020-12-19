package dao.impl;

import dao.ITeacherDAO;
import model.Teacher;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * @Author 南昌航空大学 18045221-李扬
 * @Date 2020/12/19 15:55
 * @Version 1.0
 */

public class TeacherDao extends SqlSessionDaoSupport implements ITeacherDAO {
    @Override
    public List<Teacher> getAllTeacher() {
        return null;
    }
}
