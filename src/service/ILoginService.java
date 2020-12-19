package service;

import model.User;

public interface ILoginService {
    boolean validate(String id,String password,String type);
}
