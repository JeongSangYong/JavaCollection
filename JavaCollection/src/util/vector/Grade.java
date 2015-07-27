package util.vector;

public class Grade {
	private int kor, eng, math;
	private String hakbun, name;
	//생성자는 setter 대신에 생성자로 점수를 입력받음
	
	public Grade() {}//아래처럼 파라미터가 있는 생성자를 만들면
	//디폴트 생성자를 별도로 추가해 만들어 줘야 함
	
	
	
	public Grade(String hakbun, String name, int kor, int eng, int math) {
		this.hakbun = hakbun;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}	
	
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	
	public int getMath() {
		return math;
	}
	
	public String getHakbun() {
		return hakbun;
	}
	
	public String getName() {
		return name;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}

	public void setName(String name) {
		this.name = name;
	}
	//getTotal 메소드를 직접 생성
	//파라미터로 국어, 영어, 수학
	//리턴값으로 파라미터 값의 합계
	public int getTotal(int kor, int eng, int math){
		int total = 0;
		total = kor + eng + math;
		return total;		
	}	
	@Override
	public String toString() {
		return "성적표 [이름 : "+name+", 학번 : "+hakbun+"]\n"
				+ "국어 : "+kor+", 영어 : "+eng+", 수학 : "+math+"\n"
				+ "총합 : "+getTotal(kor, eng, math);
	}


}
