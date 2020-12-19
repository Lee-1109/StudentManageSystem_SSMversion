package dao;

import model.Depart;

import java.util.List;

/**
 * @Author 南昌航空大学 18045221-李扬
 * @Date 2020/12/18 20:12
 * @Version 1.0
 */
public interface IDepartDAO {
    //获取全部部门信息
    List<Depart> getAllDepartment();
    Depart getDepartDetailByClassId(String classId);
}
