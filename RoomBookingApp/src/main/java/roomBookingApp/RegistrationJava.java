package roomBookingApp;

import java.io.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class RegistrationJava extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		String FirstName = req.getParameter("FirstName");
		String LastName = req.getParameter("LastName");
		String UserName = req.getParameter("UserName");
		String Password = req.getParameter("Password");
		String DOB = req.getParameter("DOB");
		String PhoneNumber = req.getParameter("PhoneNumber");
		// System.out.println(PhoneNumber);
		// PrintWriter out = res.getWriter();
		// out.println("Add " + FirstName + " " + LastName);

		RegistrationSetParameters rs = new RegistrationSetParameters();
		rs.SetParameters(FirstName, LastName, UserName, Password, DOB, PhoneNumber);
		RegistrationDatabase rdb = new RegistrationDatabase();
		try {
			rdb.RegisterData(rs);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher rd = req.getRequestDispatcher("Login.jsp");
		rd.forward(req, res);
	}
}
