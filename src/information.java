import java.awt.*;
public class information {
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getLive_in() {
		return live_in;
	}
	public void setLive_in(String live_in) {
		this.live_in = live_in;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	private String nickname="";
	private String name="";
	private String ID="";
	private String pass;
	private String live_in="";
	private String email="";
	private boolean gender=false;
	
	
}
