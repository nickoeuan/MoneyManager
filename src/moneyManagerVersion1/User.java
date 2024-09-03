package moneyManagerVersion1;

public class User {
	private int ID;
	private String Name;
	private String Email;
	
	//Basic Constructor
	public User(int ID, String Name, String Email) {
		this.ID = ID;
		this.Name = Name;
		this.Email = Email;
	}
	
	public int getID() {
		return ID;
	}
	
	public String getName() {
		return Name;
	}
	
	public String getEmail() {
		return Email;
	}
	public void setID(int ID) {
		this.ID = ID;
	}
	
	public void setName(String Name){
		this.Name = Name;
	}
	
	public void setEmail(String Email){
		this.Email = Email;
	}
	public String toString() {
		return "User{" + "id=" + ID + "Name=" + Name + "Email=" + Email + "}";
	}
}
