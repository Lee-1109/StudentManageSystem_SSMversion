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
    /**
     * 查询所有部门
     * @return 部门信息列表
     */
    @Override
    public List<Depart> selectList() {
        try {
          return this.getSqlSession().selectList("model.Depart.fromInsMaj");
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }

    /**
     * 查询一个部门详情
     * @param condition 查询条件
     * @return 符合条件的部门列表
     */
    @Override
    public List<Depart> selectListByCondition(String condition) {
        return this.getSqlSession().selectList("model.Depart.selectByCondition",condition);
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
