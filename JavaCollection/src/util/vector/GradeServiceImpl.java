package util.vector;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;

public class GradeServiceImpl implements GradeService{
	//필드에 아래 메소드들이 공유할 자료구조를 뭘 쓸까 고민
	private List<Grade> vec = new ArrayList();
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
			String searchHakbun = vec.get(i).getHakbun();
			//배열로 생각하면  vec.get(i);
			if (hakbun.equalsIgnoreCase(searchHakbun)) {
				String name = vec.get(i).getName();
				int kor = vec.get(i).getKor();
				int eng = vec.get(i).getEng();
				int math = vec.get(i).getMath();
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
	
	@Override
	public  Vector<Grade> searchGradeByName(String name) {
		 Vector<Grade> temp = new  Vector<Grade>();
		 String msg = "";
		 Grade grade = null;
		 
		 for (int i = 0; i < vec.size(); i++) {
			String searchName = vec.get(i).getName();
			if (name.equalsIgnoreCase(searchName)) {
				
				grade = new Grade(vec.get(i).getHakbun(),
						searchName,vec.get(i).getKor(),
						vec.get(i).getEng(),vec.get(i).getMath());
				temp.add(grade);
				//msg = grade.toString();
			} else {
				temp.remove(new Grade());
				//temp라는 백터를 완전히 비워서 null로 리턴
			}
		}
		return temp;
	}

	@Override
	public void descByTotal() {
		//Java API중에서 정렬을 담당하는 클래스 Comparator
		Comparator<Grade> desc = new Comparator<Grade>() {
			
			@Override
			public int compare(Grade g1, Grade g2) {
				//삼항연산자
				/*
				 if(condition){
				 	--> true면 이구역(statement) 실행
				 }else{
				 	-> false면 이구역(statement) 실행
				 } 
				 (조건식) ? 참 : 거짓;
				 **/

//				if ((g1.getTotal()<g2.getTotal())) {
//					return 1;					
//				} else {
//					if (g1.getTotal()==g2.getTotal()) {
//						return 0;
//					} else {
//						return -1;
//					}
//				}
				return (g1.getTotal()<g2.getTotal()) ? 1 : 
					(g1.getTotal()==g2.getTotal()) ? 0 : -1;
			}
		};
		Collections.sort(vec, desc);
		System.out.println(vec.toString());
	}

	@Override
	public void ascByName() {
		Comparator<Grade> asc = new Comparator<Grade>() {
			
			@Override
			public int compare(Grade g1, Grade g2) {
				// 값()이 int타입이 아니고
				// String 타입의 우선순위 결정할 때는
				// compareTo 메소드를 사용해야 한다.
				//return (g1.getTotal() > g2.getTotal()) ? 1 : (g1.getTotal() == g2.getTotal()) ? 0 : -1;
				return g1.getName().compareTo(g2.getName());
			}
		};
		Collections.sort(vec, asc);
		System.out.println(vec.toString());
	}
}
