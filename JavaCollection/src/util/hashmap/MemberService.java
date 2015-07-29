package util.hashmap;

public interface MemberService {
	
	public void join(String id, String password, String name, int age, String address);
	
	public String login(String id, String password);
	
	public void logout();
}
