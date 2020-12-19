package service;

import model.Depart;

import java.util.List;

/**
 * @Author 南昌航空大学 18045221-李扬
 * @Date 2020/12/18 20:23
 * @Version 1.0
 */

public interface IDepartService {
    //通过班级号获得详细信息
    Depart getDepartDetailByClassId(String classId);
    List<Depart> getAllDepartment();
}
