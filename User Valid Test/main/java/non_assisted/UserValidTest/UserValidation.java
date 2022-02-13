package non_assisted.UserValidTest;

public class UserValidation {
	public String uservalid(String username,String Password) {
		String user="Asif";
		String Pass="12345";
		if(user.equals(username) && Pass.equals(Password)) {
			return "Sucess";
		}
		else {
			return "failure";
		}
	}

}
