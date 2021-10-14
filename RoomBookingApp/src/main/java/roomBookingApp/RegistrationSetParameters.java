package roomBookingApp;

public class RegistrationSetParameters {

	private String FirstName;
	private String LastName;
	private String UserName;
	private String Password;
	private String DOB;
	private String PhoneNumber;

	public void SetParameters(String FirstName, String LastName, String UserName, String Password, String DOB,
			String PhoneNumber) {
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.UserName = UserName;
		this.Password = Password;
		this.DOB = DOB;
		this.PhoneNumber = PhoneNumber;
		// System.out.println("hai setParameter");
	}

	public String getFirstName() {
		// System.out.println("hai setParameter");
		return FirstName;
	}

	public String getLastName() {
		return LastName;
	}

	public String getUserName() {
		return UserName;
	}

	public String getPassword() {
		return Password;
	}

	public String getDOB() {
		return DOB;
	}

	public String getPhoneNumber() {

		return PhoneNumber;
	}

}
