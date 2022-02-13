package Search;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class UserBean {
	@Id
String user;
String password;
public String getUser() {
	return user;
}
public void setUser(String user) {
	this.user = user;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
String phone;
String Address;
}
