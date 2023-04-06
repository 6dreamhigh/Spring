package sample04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Calc calc = (Calc) context.getBean("calcAdd");
		calc.calculate(25, 36);
		
		Calc calc2 = (Calc) context.getBean("calcMul");
		calc2.calculate(25, 36);
	}
}
