package dao.impl;

import dao.ILoginDAO;
import model.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public class LoginDaoImpl extends SqlSessionDaoSupport implements ILoginDAO {

    @Override
    public User getUserById(String id) {
        User user=null;
        try {
            user = this.getSqlSession().selectOne("model.User.fromUserById",id);
            return user;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
