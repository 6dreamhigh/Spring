package sample03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
		//ApplicationContext context = new FileSystemXmlApplicationContext("src/applicationContext.xml");
		//applicationContext.xml 파일 읽어오기 
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		MessageBean bean = (MessageBean) context.getBean("messageBean");//bean의 class에 대한 주소를 받아와 언제든지 사용할 수 있게 함 -부모 = 자식
		bean.sayHello("Spring");
		
		MessageBean bean2 =context.getBean("messageBean", MessageBean.class);//bean의 class에 대한 주소를 받아와 언제든지 사용할 수 있게 함 -부모 = 자식
		bean2.sayHello("Spring");
		
		MessageBean bean3 = (MessageBean) context.getBean("messageBean");//bean의 class에 대한 주소를 받아와 언제든지 사용할 수 있게 함 -부모 = 자식
		bean3.sayHello("Spring");
	}

}//스프링 컨테이너가 서버를 생성해줌=>applicationContext.xml 
