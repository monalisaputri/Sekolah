package bean;

public class User {
	private String firstName;
	private String lastName;
	private String address;
	private String phone;
	private String dob;
	private char sex;
	private String email;
	private String password;
	private int isAdmin;
	private int isActive = 1;
	
	public User() {
		
	}
	
	public User(String firstName, String lastName, String address, String phone, String dob, char sex, String email,
			String password, int isAdmin, int isActive) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phone = phone;
		this.dob = dob;
		this.sex = sex;
		this.email = email;
		this.password = password;
		this.isActive = isActive;
		this.isAdmin = isAdmin;
	}



	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public int isAdmin() {
		return isAdmin;
	}

	public void setAdmin(int isAdmin) {
		this.isAdmin = isAdmin;
	}

	public int isActive() {
		return isActive;
	}

	public void setActive(int isActive) {
		this.isActive = isActive;
	}

	
	public User(String email, String password) {
		this.email = email;
		this.password = password;
	}
	
	
}
