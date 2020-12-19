package service.impl;

import dao.IDepartDAO;
import dao.impl.DepartDaoImpl;
import model.Depart;
import org.springframework.beans.factory.annotation.Autowired;
import service.IDepartService;
import java.util.List;

/**
 * @Author 南昌航空大学 18045221-李扬
 * @Date 2020/12/18 20:25
 * @Version 1.0
 */

public class DepartServiceImpl implements IDepartService {

    private IDepartDAO departDao;

    @Override
    public Depart getDepartDetailByClassId(String classId) {
        return departDao.getDepartDetailByClassId(classId);
    }

    /**
     * 获取全部部门的信息
     * @return
     */
    @Override
    public List<Depart> getAllDepartment() {
        return departDao.getAllDepartment();
    }


    @Autowired
    public void setDepartDao(DepartDaoImpl departDao) {
        this.departDao = departDao;
    }
}
