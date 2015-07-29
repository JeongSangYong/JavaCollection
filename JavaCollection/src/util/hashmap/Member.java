package util.hashmap;

public class Member {
	private String id, password, name, address;
	private int age;
	
	public Member() {
	}
	
	public Member(String id, String password, String name, String address, int age){
		this.id = id;
		this.password = password;
		this.name = name;
		this.address = address;
		this.age = age;
	}
	
	public String getId() {
		return id;
	}
	public String getPassword() {
		return password;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public int getAge() {
		return age;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
