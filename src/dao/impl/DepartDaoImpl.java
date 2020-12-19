package dao.impl;

import dao.IDepartDAO;
import model.Depart;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * @Author 南昌航空大学 18045221-李扬
 * @Date 2020/12/18 20:13
 * @Version 1.0
 */


public class DepartDaoImpl extends SqlSessionDaoSupport implements IDepartDAO {

    @Override
    public List<Depart> getAllDepartment() {
        try {
          return this.getSqlSession().selectList("model.Depart.fromInsMaj");
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Depart getDepartDetailByClassId(String classId) {
        try {
            return this.getSqlSession().selectOne("model.Depart.fromInsMajByClassId",classId);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("DepartDaoImplError:======");
            return null;
        }
    }
}
