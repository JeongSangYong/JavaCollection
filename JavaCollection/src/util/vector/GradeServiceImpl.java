package util.vector;

import java.util.Vector;

public class GradeServiceImpl implements GradeService{
	//필드에 아래 메소드들이 공유할 자료구조를 뭘 쓸까 고민
	private Vector<Grade> vec = new Vector<Grade>();
	Grade grade = new Grade();	//에러뜨면 디폴트 생성자를 만듬
	@Override
	public void input(Grade grade) {
		// 성적표 입력
		// 만약 자료구조로 배열을 사용했다면 vec[0] = hong;
		vec.add(grade);
	}

	@Override
	public void printList() {
		//전체 출력
		System.out.println(vec.toString());
	}

	@Override
	public String searchGradeByHakbun(String hakbun) {
		// 학번으로 검색
		String msg = "";
		Grade grade = null;	//지변으로 인스턴스를 선언했으므로 초기화 해야함
		
		for (int i = 0; i < vec.size(); i++) {
			String searchHakbun = vec.elementAt(i).getHakbun();
			//배열로 생각하면  vec.get(i);
			if (hakbun.equalsIgnoreCase(searchHakbun)) {
				String name = vec.elementAt(i).getName();
				int kor = vec.elementAt(i).getKor();
				int eng = vec.elementAt(i).getEng();
				int math = vec.elementAt(i).getMath();
				grade = new Grade(searchHakbun,name,kor,eng,math);
				msg = grade.toString();
				break;	//중간이라도 학번이 일치하면 그래도 stop
			} else {
				msg = "조회하는 학번이 존재하지 않습니다.";
			}			
		}
		return msg;
	}

	@Override
	public void ascGradeTotal() {
		// 성적 정렬
		
	}


}
