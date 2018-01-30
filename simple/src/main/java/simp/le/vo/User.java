package simp.le.vo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class User {
	private String name;
	private int age;
	private int uino;
	private String uiid;
	private String uipwd;
	private int cino;
	private String address;
	private String uiregdate;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getUino() {
		return uino;
	}
	public void setUino(int uino) {
		this.uino = uino;
	}
	public String getUiid() {
		return uiid;
	}
	public void setUiid(String uiid) {
		this.uiid = uiid;
	}
	public String getUipwd() {
		return uipwd;
	}
	public void setUipwd(String uipwd) {
		this.uipwd = uipwd;
	}
	public int getCino() {
		return cino;
	}
	public void setCino(int cino) {
		this.cino = cino;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getUiregdate() {
		return uiregdate;
	}
	public void setUiregdate(String uiregdate) {
		this.uiregdate = uiregdate;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", uino=" + uino + ", uiid=" + uiid + ", uipwd=" + uipwd
				+ ", cino=" + cino + ", address=" + address + ", uiregdate=" + uiregdate + "]";
	}

	
}
