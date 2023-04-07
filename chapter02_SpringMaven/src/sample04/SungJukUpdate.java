package sample04;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class SungJukUpdate implements SungJuk {
	@Autowired
	@Qualifier("arrayList")//어떤 자식 클래스가 올지 명시해야 함
	private List<SungJukDTO2> list = null;
	
	@Override
	public void execute() {
		System.out.println();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수정 할 이름 입력 : ");
		String name = sc.next();
		
		//list에서 데이터 찾기
		int sw = 0;
		for(SungJukDTO2 sungJukDTO2:  list) {
			if(sungJukDTO2.getName().equals(name)) {
				sw = 1;
				
				System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
				System.out.println(sungJukDTO2);
				
				System.out.println();
				
				System.out.print("국어 입력 : ");
				int kor = sc.nextInt();
				System.out.print("영어 입력 : ");
				int eng = sc.nextInt();
				System.out.print("수학 입력 : ");
				int math = sc.nextInt();
				System.out.println();
				
				int tot = kor+eng+math;
				double avg = tot/3.;
				
				sungJukDTO2.setKor(kor);
				sungJukDTO2.setEng(eng);
				sungJukDTO2.setMath(math);
				sungJukDTO2.setTot(tot);
				sungJukDTO2.setAvg(avg);
				
				System.out.println(name+"님의 데이터를 수정하였습니다.");
				break;
			}//if
		}//for
		if(sw ==0) System.out.println("찾고자 하는 이름이 없습니다.");
		
	}

	

}
