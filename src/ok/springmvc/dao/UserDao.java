package ok.springmvc.dao;

import ok.springmvc.model.Login;
import ok.springmvc.model.User;

public interface UserDao {
	void register(User user);

	User validateUser(Login login);
}
