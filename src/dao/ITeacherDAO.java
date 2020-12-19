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
    List<Teacher> getAllTeacher();
}
