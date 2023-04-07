package sample04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class SungJukInput implements SungJuk {
	@Autowired
	private SungJukDTO2 sungJukDTO2 = null;	
	@Autowired
	@Qualifier("arrayList")//어떤 자식 클래스가 올지 명시해야 함
	private List<SungJukDTO2> list = null;
	//private ArrayList<SungJukDTO2> list = null;
	//property를 통해 injection하는 대신 SungJukDTO2타입을 찾아서 자동으로 매핑해라 =>@Autowired
	

	@Override
    public void execute() {
    	
    	//데이터
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("이름 입력 : ");
		String name = sc.next();
		System.out.print("국어 입력 : ");
		int kor = sc.nextInt();
		System.out.print("영어 입력 : ");
		int eng = sc.nextInt();
		System.out.print("수학 입력 : ");
		int math = sc.nextInt();
		System.out.println();
		
		int tot = kor+eng+math;
		double avg = tot/3.;
		sungJukDTO2.setName(name);
		sungJukDTO2.setKor(kor);
		sungJukDTO2.setEng(eng);
		sungJukDTO2.setMath(math);
		sungJukDTO2.setTot(tot);
		sungJukDTO2.setAvg(avg);
		//ArrayList에 담기
		//List list = new ArrayList();
		list.add(sungJukDTO2);
		
		//출력
		System.out.println(name+"님이 데이터를 입력하였습니다.");

        
    }
}







