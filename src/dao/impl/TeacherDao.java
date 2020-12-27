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
    public boolean add(Teacher teacher) {
        return this.getSqlSession().insert("model.Teacher.insertTeacher",teacher) == 1;
    }

    /**
     * 更新教师信息
     * @param teacher 更新的教师信息
     * @return 成功返回true 否则返回false
     */
    @Override
    public boolean update(Teacher teacher) {
        return this.getSqlSession().update("model.Teacher.updateTeacher",teacher) == 1 ;
    }

    @Override
    public List<Teacher> selectAllTeacher() {
       return this.getSqlSession().selectList("model.Teacher.fromTeacher");
    }

    @Override
    public boolean delete(String teacherId) {
         return this.getSqlSession().delete("model.Teacher.deleteTeacher",teacherId) != 0;
    }

    @Override
    public List<Teacher> findByCondition(String condition) {
        System.out.println("TeacherDAO:====="+condition);
        return  this.getSqlSession().selectList("model.Teacher.fromTeacherByCondition","%"+condition+"%");
    }
}
