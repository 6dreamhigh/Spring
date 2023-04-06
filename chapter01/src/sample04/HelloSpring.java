package sample04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class HelloSpring {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Calc calc = (Calc) context.getBean("calcBean1");
		calc.calculate(25, 36);
		
		Calc calc2 = (Calc) context.getBean("calcBean2");
		calc2.calculate(25, 36);
	}
}
