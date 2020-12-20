package dao;

import dao.impl.TeacherDao;
import model.Teacher;

import java.util.List;

/**
 * @Author 南昌航空大学 18045221-李扬
 * @Date 2020/12/19 15:54
 * @Version 1.0
 */

public interface ITeacherDAO {
    boolean add(Teacher teacher);
    boolean update(Teacher teacher);
    List<Teacher> selectAllTeacher();
    boolean delete(String teacherId);
    List<Teacher> findByCondition(String condition);
}
