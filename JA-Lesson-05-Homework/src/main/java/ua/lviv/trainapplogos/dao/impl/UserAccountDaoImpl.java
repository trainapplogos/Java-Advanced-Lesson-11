package ua.lviv.trainapplogos.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import ua.lviv.trainapplogos.dao.UserAccountDao;
import ua.lviv.trainapplogos.domain.UserAccount;
import ua.lviv.trainapplogos.utils.ConnectionUtils;

public class UserAccountDaoImpl implements UserAccountDao {
	private static String READ_ALL = "SELECT * FROM USER";
	private static String CREATE = "INSERT INTO USER (email, first_name, last_name, role) VALUES (?, ?, ?, ?)";
	private static String READ_BY_ID = "SELECT * FROM USER WHERE ID = ?";
	private static String UPDATE_BY_ID = "UPDATE USER SET email = ?, first_name = ?, last_name = ?, role = ?  WHERE ID = ?";
	private static String DELETE_BY_ID = "DELETE FROM USER WHERE ID = ?";
	
	private Connection connection;
	private PreparedStatement preparedStatement;

	public UserAccountDaoImpl() throws ClassNotFoundException, SQLException {
		this.connection = ConnectionUtils.openConnection();
	}
	
	@Override
	public UserAccount create(UserAccount user) {
		try {
			preparedStatement = connection.prepareStatement(CREATE, Statement.RETURN_GENERATED_KEYS);
			preparedStatement.setString(1, user.getEmail());
			preparedStatement.setString(2, user.getFirstName());
			preparedStatement.setString(3, user.getLastName());
			preparedStatement.setString(4, user.getRole());
			preparedStatement.executeUpdate();
			
			ResultSet resSet =  preparedStatement.getGeneratedKeys();
			resSet.next();
			user.setId(resSet.getInt(1));
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return user;
	}

	@Override
	public UserAccount read(Integer id) {
		UserAccount user = null;
		try {
			preparedStatement = connection.prepareStatement(READ_BY_ID);
			preparedStatement.setInt(1, id);
			ResultSet result = preparedStatement.executeQuery();
			if (result.next()) {
				// Integer userId = result.getInt("id");
				String email = result.getString("email");
				String firstName = result.getString("first_name");
				String lastName = result.getString("last_name");
				String role = result.getString("role");
				user = new UserAccount(id, email, firstName, lastName, role);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public UserAccount update(UserAccount user) {
		try {
			preparedStatement = connection.prepareStatement(UPDATE_BY_ID);
			preparedStatement.setString(1, user.getEmail());
			preparedStatement.setString(2, user.getFirstName());
			preparedStatement.setString(3, user.getLastName());
			preparedStatement.setString(4, user.getRole());
			preparedStatement.setInt(5, user.getId());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user; //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	}

	@Override
	public void delete(Integer id) {
		try {
			preparedStatement = connection.prepareStatement(DELETE_BY_ID);
			preparedStatement.setInt(1, id);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<UserAccount> readAll() {
		List<UserAccount> listOfUsers = new ArrayList<>();
		try {
			preparedStatement = connection.prepareStatement(READ_ALL);
			ResultSet result = preparedStatement.executeQuery();

			while (result.next()) {
				Integer userId = result.getInt("id");
				String email = result.getString("email");
				String firstName = result.getString("first_name");
				String lastName = result.getString("last_name");
				String role = result.getString("role");
								
				listOfUsers.add(new UserAccount(userId, email, firstName, lastName, role));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return listOfUsers;
	}

}
