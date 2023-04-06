package sample05;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		SungJuk sungJuk = (SungJuk) context.getBean("sungJukImpl");
		sungJuk.calc();
		sungJuk.display();
		
		

	}

}
//main메소드에서 이름, 국어 영어, 수학의 점수를 입력하여 calc() 총점과 평균을 구하여 display()에서 출력하시오.