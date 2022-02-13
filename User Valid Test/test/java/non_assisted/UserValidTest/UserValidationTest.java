package non_assisted.UserValidTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserValidationTest {

	@Test
	public void test() {
		UserValidation u=new UserValidation();
		assertEquals("Sucess", u.uservalid("Asif", "12345"));
	}

	@Test
	public void test2() {
		UserValidation u=new UserValidation();
		assertEquals("failure", u.uservalid("David", "56789"));
	}

}
