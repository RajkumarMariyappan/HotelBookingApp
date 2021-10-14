package roomBookingApp;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class RegistrationDatabase {

	public void RegisterData(RegistrationSetParameters rs) throws ClassNotFoundException {

		String FirstName = rs.getFirstName();
		// System.out.println("hai setParameter");
		String LastName = rs.getLastName();
		String UserName = rs.getUserName();
		String Password = rs.getPassword();
		String DOB = rs.getDOB();
		String PhoneNumber = rs.getPhoneNumber();

		// Data storing in database code....
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dbUrl = "jdbc:mysql://localhost:3306/roombooking";
			String user = "student";
			String pass = "student";

			
			Connection conn = DriverManager.getConnection(dbUrl, user, pass);
			ResultSet myRs = null;
			Statement Stmnt1 = conn.createStatement();
			myRs = Stmnt1.executeQuery("select * from userregistration");

			int result = Stmnt1.executeUpdate(
					"insert into userregistration(FirstName, LastName,UserName,Password,DOB, PhoneNumber) values('"
							+ FirstName + "','" + LastName + "','" + UserName + "','" + Password + "','" + DOB + "','"
							+ PhoneNumber + "')");
			System.out.println("Hai" + UserName + "!Login with userName & password");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
