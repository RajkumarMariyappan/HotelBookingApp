package roomBookingApp;

public class LoginSetParameters {

	private String UserName;
	private String Password;

	public void SetParameters(String UserName, String Password) {

		this.UserName = UserName;
		this.Password = Password;

		// System.out.println("hai setParameter");
	}

	public String getUserName() {
		return UserName;
	}

	public String getPassword() {
		return Password;
	}

}
