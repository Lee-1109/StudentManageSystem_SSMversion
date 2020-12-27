package service.impl;

import dao.ILoginDAO;
import model.User;
import service.ILoginService;

import javax.annotation.Resource;

public class LoginServiceImpl implements ILoginService {


    private ILoginDAO loginDao;

    @Override
    public boolean validate(String id, String password, String type) {
        User user=loginDao.getUserById(id);
        if (null==user) return false;
        return user.getPassword().equals(password) && user.getType().equals(type);
    }

    public void setLoginDao(ILoginDAO loginDao) {
        this.loginDao = loginDao;
    }
}
