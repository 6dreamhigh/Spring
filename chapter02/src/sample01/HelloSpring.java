package sample01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		MessageBean messageBean = (MessageBean) context.getBean("messageBeanImpl");
		messageBean.sayHello();
		messageBean.sayHello("포도",12000);
		messageBean.sayHello("딸기",15000,2);
		//의존 관계가 연결이 안되기 때문에 절대 new하면 안된다. 
	}

}
