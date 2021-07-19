package ua.lviv.trainapplogos.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtils {
	private static String USER_NAME = "root";
	private static String USER_PASSWORD = "12345678";
	private static String URL = "jdbc:mysql://localhost/i_shop"; //find in the internet actual url

	public static Connection openConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection(URL, USER_NAME, USER_PASSWORD);
	}
}
