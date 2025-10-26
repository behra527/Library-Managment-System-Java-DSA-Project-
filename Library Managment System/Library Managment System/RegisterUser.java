
public class RegisterUser {
	private String username;
	private String password;
		
	    public RegisterUser(String username, String password) {
	        this.username = username;
	        this.password = password;
	    }// end of over loaded cons

	    public String getUsername() {
	        return username;
	    }// end of getter

	    public String getPassword() {
	        return password;
	    }// end of get password
	    public void setUsername(String username) {
			this.username = username;
		}// end of set user
		public void setPassword(String password) {
			this.password = password;
		}// end of set password

		public String toString() {
	        return "User [username=" + username + ", password=" + password + "]";
	    }// end of to string

}// end of class
