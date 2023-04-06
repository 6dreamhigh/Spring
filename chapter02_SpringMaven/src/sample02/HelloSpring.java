package sample02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Calc calc = (Calc) context.getBean("calcAdd");
		Calc calc2 = (Calc) context.getBean("calcMul");
		calc.calculate();
		calc2.calculate();
	}

}
