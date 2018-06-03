package ok.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;

import ok.springmvc.dao.UserDao;
import ok.springmvc.model.Login;
import ok.springmvc.model.User;

public class UserServiceImpl implements UserService {

  @Autowired
  public UserDao userDao;

  public void register(User user) {
    userDao.register(user);
  }

  public User validateUser(Login login) {
    return userDao.validateUser(login);
  }

}