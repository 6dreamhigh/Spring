package sample04;

public class CalcAdd implements Calc {
public CalcAdd() {
	// TODO Auto-generated constructor stub
}
	@Override
	public void calculate(int a, int b) {
		System.out.println(a +" + "+ b +" = "+(a+b));
		
	}

}
