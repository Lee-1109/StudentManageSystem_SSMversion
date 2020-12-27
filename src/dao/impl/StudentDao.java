package dao.impl;

import dao.IStudentDAO;
import model.Student;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.HashMap;
import java.util.List;

/**
 * @Author 南昌航空大学 18045221-李扬
 * @Date 2020/12/19 14:23
 * @Version 1.0
 */

public class StudentDao extends SqlSessionDaoSupport implements IStudentDAO {
    @Override
    public boolean add(Student student) {
        return this.getSqlSession().insert("model.Student.addStudent",student) == 1;
    }

    @Override
    public List<Student> selectAllStudent() {
        return this.getSqlSession().selectList("model.Student.fromStudents");
    }

    @Override
    public List<Student> selectStudentByPage(HashMap<String,Integer> map) {
        return this.getSqlSession().selectList("model.Student.selectStudentByPage",map);
    }

    @Override
    public List<Student> findByCondition(String condition) {
        return this.getSqlSession().selectList("model.Student.findByCondition","%"+condition+"%");
    }

    @Override
    public boolean updateStudent(Student student) {
        //更新成功返回true 否则返回false
        return this.getSqlSession().update("model.Student.updateOneStudent", student) == 1;
    }

    @Override
    public boolean deleteOneStudent(String studentId) {
        //删除成功返回true 不成功返回false
        return this.getSqlSession().delete("deleteOneStudent", studentId) != 0;
    }

}
