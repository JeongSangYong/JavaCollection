package util.hashmap;

import java.util.HashMap;
import java.util.Map;

public class MemberServiceImpl implements MemberService{
	//Map<String, Member> map = new HashMap<String,Member>();
	//<String, Object>가 정석이지만
	//쉽게하기위해 <String, String>d으로
	Map<String, String> map = new HashMap<String,String>();	
	Member member = new Member();
	String id, password, name, address;
	int age;
	
	@Override
	public void join(String id, String password, String name, int age, String address) {
		member.setId(id);
		member.setPassword(password);
		member.setName(name);
		member.setAge(age);
		member.setAddress(address);
		
		map.put("id", member.getId());
		map.put("password", member.getPassword());
		map.put("name", member.getName());
		map.put("age", String.valueOf(member.getAge()));
		//int를 String으로 바꾸는 문법
		map.put("address", member.getAddress());
	}

	@Override
	public String login(String id, String password) {
		String msg = "";
		
		if (map.get("id").equals(id) && map.get("password").equals(password)) {//두 조건을 모두 충족
			msg = "환영합니다."+member.getId()+"님";
		} else if(map.get("id").equals(id) && !map.get("password").equals(password)){//아이디 맞고, 비번 틀리고
			msg = "비번이 다릅니다. 다시 입력하세요";
		}else{
			msg = "입력하신 ID는 존재하지 않거나, 일치하지 않습니다. 다시 입력하세요";
		}		
		return msg;
	}

	@Override
	public void logout() {
		// TODO Auto-generated method stub
		
	}

}
