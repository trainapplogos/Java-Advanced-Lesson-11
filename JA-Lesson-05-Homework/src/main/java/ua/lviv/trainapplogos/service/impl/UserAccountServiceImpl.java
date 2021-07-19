package ua.lviv.trainapplogos.service.impl;

import java.sql.SQLException;
import java.util.List;

import ua.lviv.trainapplogos.dao.UserAccountDao;
import ua.lviv.trainapplogos.dao.impl.UserAccountDaoImpl;
import ua.lviv.trainapplogos.domain.UserAccount;
import ua.lviv.trainapplogos.service.UserAccountService;

public class UserAccountServiceImpl implements UserAccountService {

	private UserAccountDao userDao;
	
	public UserAccountServiceImpl() {
		try {
			userDao = new UserAccountDaoImpl();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public UserAccount create(UserAccount user) {
		return userDao.create(user);
	}

	@Override
	public UserAccount read(Integer id) {
		return userDao.read(id);
	}

	@Override
	public UserAccount update(UserAccount user) {
		return userDao.update(user);
	}

	@Override
	public void delete(Integer id) {
		userDao.delete(id);
	}

	@Override
	public List<UserAccount> readAll() {
		return userDao.readAll();
	}
}
