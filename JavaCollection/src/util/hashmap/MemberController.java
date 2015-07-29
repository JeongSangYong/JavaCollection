package util.hashmap;

import java.util.Scanner;

public class MemberController {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		MemberService service = new MemberServiceImpl();
		String input = "";

		while (true) {
			System.out.println("[JOIN] : 회원가입, [LOGIN] : 로그인, [LOGOUT] : 로그아웃");
			input = scanner.next();
			if (input.equals("logout")) {
				System.out.println("로그아웃");
				break;
			} else {
				switch (input) {
				case "join":
					
					System.out.println("회원가입시 필요한 회원정보를 입력하세요 : ");
					System.out.println("id : ");
					String id = scanner.next();
					System.out.println("password : ");
					String password = scanner.next();
					System.out.println("name : ");
					String name = scanner.next();
					System.out.println("age : ");
					int age = scanner.nextInt();
					System.out.println("address : ");
					String address = scanner.next();
					service.join(id, password, name, age, address);
					//Member member = new Member();
					System.out.println("회원가입 성공");					
					break;
			
				case "login":
					System.out.println("id : ");
					String logid = scanner.next();
					System.out.println("password : ");
					String logpassword = scanner.next();
					String result = service.login(logid, logpassword);
					
					String flag = result.substring(0,5);
					//->받아온 String을 0~5번째 자리까지 자름
					if (flag.equals("환영합니다")) {
						System.out.println(result);
						break;
					} else if(flag.equals("비번이 다")) {
						System.out.println(result);
					}
					else{
						System.out.println(result);
					}
					break;

				}
			}
		}
	}
}
