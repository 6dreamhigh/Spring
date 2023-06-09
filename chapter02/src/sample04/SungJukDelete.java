package sample04;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import lombok.Setter;

public class SungJukDelete implements SungJuk {
	@Setter
	private List<SungJukDTO2> list = null;
	
	
	@Override
	public void execute() {
		System.out.println();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("삭제 할 이름 입력 : ");
		String name = sc.next();
		
		Iterator<SungJukDTO2> it = list.iterator();
		int sw = 0;
		while(it.hasNext()) {
			//it가 가리키는 곳의 항목을 꺼내서 buffer와 같은 임시 항목에 저장 후 다음 항목으로 이동한다. 
			SungJukDTO2 sungJukDTO2 = it.next();
			if(sungJukDTO2.getName().equals(name)) {
				sw =1;
				it.remove();//아까 따로 보관한 항목을 제거한다.
				System.out.println(name+"님이 데이터를 삭제하였습니다");
			}//if
		}//while
			if(sw == 0)System.out.println("찾고자하는 배이름이 없습니다.");
		
	}
}
