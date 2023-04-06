package sample04;

import org.springframework.stereotype.Component;

@Component// 클래스명과 아이디가 동일한 경우 생략 가능

public class CalcAdd implements Calc {

	@Override
	public void calculate(int a, int b) {
		System.out.println(a +" + "+ b +" = "+(a+b));
		
	}

}
