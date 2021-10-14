package roomBookingApp;

import java.sql.*;

public class LoginDatabase {
	public int LoginData(LoginSetParameters ls) throws ClassNotFoundException {
		int result = 0;
		String UserName = ls.getUserName();
		String Password = ls.getPassword();
		try {
			Connection myconn = null;
			Statement myStmt = null;
			ResultSet myRs = null;
			Class.forName("com.mysql.jdbc.Driver");
			String DbUrl = "jdbc:mysql://localhost:3306/roombooking";
			String user = "student";
			String pass = "student";

			myconn = DriverManager.getConnection(DbUrl, user, pass);

			myStmt = myconn.createStatement();

			myRs = myStmt.executeQuery("select UserName,Password from userregistration");

			while (myRs.next()) {
				if (UserName.equals(myRs.getString("UserName"))) {
					if (Password.equals(myRs.getString("Password"))) {
						System.out.print("Login is Validated");
						result++;
					}
				}

			}
		} catch (Exception e) {
			System.out.println(e);

		}
		return result;

	}
}
