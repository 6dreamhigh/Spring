package spring.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import sample01.MessageBeanImpl;
import sample02.CalcAdd;
import sample02.CalcMul;

//빈 생성하는 환경설정 파일

@Configuration
public class SpringConfiguration {
	//sample01
	
	@Bean	
	public MessageBeanImpl messageBeanImpl(){
		return new MessageBeanImpl("사과");
	}
	
	
	//sample02
	
		@Bean	
		public CalcAdd calcAdd(){
			return new CalcAdd(25, 36);
		}
		
		@Bean(name="calcMul")
		public CalcMul getCalcMul(){
			return new CalcMul();
		}
	
}
/*
 @Bean 
 - 메소드에서 return 되는 값을 bean으로 생성함
 - 메소드의 이름은 반드시 빈의 id명으로 만들어야 한다. 
*/
