package dao;

import model.Student;

import java.util.HashMap;
import java.util.List;

/**
 * @Author 南昌航空大学 18045221-李扬
 * @Date 2020/12/19 14:22
 * @Version 1.0
 */

public interface IStudentDAO {
    //查询所有学生
    List<Student> selectAllStudent();
    //实现分页查询学生 数据库limit
    List<Student> selectStudentByPage(HashMap<String,Integer> map);
    List<Student> findByCondition(String condition);
    boolean updateStudent(Student student);
    //按照ID删除学生
    boolean deleteOneStudent(String studentId);
}
