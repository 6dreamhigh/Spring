package sample01;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;



@RequiredArgsConstructor
public class MessageBeanImpl implements MessageBean {
	@NonNull
	private String fruit;//생성자
	@Setter
	private int cost, qty;//setter
	
	/*
	 * //fruit 생성자 이용- Constructor injection public MessageBeanImpl(String fruit) {
	 * super(); this.fruit = fruit; }
	 * 
	 * //cost, qty setter 이용- Setter Injection
	 * 
	 * public String getFruit() { return fruit; }
	 * 
	 * public void setFruit(String fruit) { this.fruit = fruit; }
	 */
	@Override
	public void sayHello() {
		System.out.println(fruit+"\t"+cost+"\t"+qty);
		
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	@Override
	public void sayHello(String fruit, int cost) {
		System.out.println(fruit+"\t"+cost+"\t"+qty);
		
	}

	@Override
	public void sayHello(String fruit, int cost, int qty) {
		System.out.println(fruit+"\t"+cost+"\t"+qty);
		
	}

}
