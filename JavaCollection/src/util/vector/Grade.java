package util.vector;

public class Grade {
	private int kor, eng, math;
	private String hakbun, name;
	//생성자는 setter 대신에 생성자로 점수를 입력받음
	
	public Grade(String hakbun, String name, int kor, int eng, int math) {
		this.hakbun = hakbun;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}	
	
	//getTotal 메소드를 직접 생성
	//파라미터로 국어, 영어, 수학
	//리턴값으로 파라미터 값의 합계
	public int getTotal(int kor, int eng, int math){
		int total;
		total = kor + eng + math;
		return total;		
	}	
}
