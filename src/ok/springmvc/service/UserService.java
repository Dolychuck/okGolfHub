package ok.springmvc.service;

import ok.springmvc.model.Login;
import ok.springmvc.model.User;

public interface UserService {

  void register(User user);

  User validateUser(Login login);
}