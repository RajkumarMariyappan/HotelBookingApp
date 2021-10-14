package roomBookingApp;

import java.io.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class LoginJava extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		String LoginUserName = req.getParameter("UserName");
		String LoginPassword = req.getParameter("Password");
		// System.out.println(PhoneNumber);
		PrintWriter out = res.getWriter();
		// System.out.println(LoginUserName);
		out.println("Hai " + LoginUserName);

		LoginSetParameters ls = new LoginSetParameters();
		ls.SetParameters(LoginUserName, LoginPassword);
		LoginDatabase ldb = new LoginDatabase();
		try {
			int a = ldb.LoginData(ls);
			if (a == 1) {

				RequestDispatcher rd = req.getRequestDispatcher("RoomSqlTag.jsp");
				rd.forward(req, res);
			} else {
				RequestDispatcher rd = req.getRequestDispatcher("RegistrationPage.jsp");
				rd.forward(req, res);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
