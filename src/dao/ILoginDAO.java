package dao;

import model.User;

public interface ILoginDAO {
    //验证用户信息是否正确
    User getUserById(String id);

}
