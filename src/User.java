
public class User {
	 private String firstName = "jay";
	 private String lastName = "wu";
	 private long personCode = 95025063;
	 private String email = "wu@gmail.com";
	 private String password = "ad334sdf";
	
	 public User(String firstName, String lastName) {
		 this.firstName = firstName;
		 this.lastName = lastName;
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
	public long getPersonCode() {
		return personCode;
	}
	public void setPersonCode(long personCode) {
		this.personCode = personCode;
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

	 
     
   
}