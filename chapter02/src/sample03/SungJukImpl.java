package sample03;

import java.util.List;
import java.util.Scanner;

import sample04.SungJukDTO2;

//@AllArgsConstructor
public class SungJukImpl implements SungJuk {
	private SungJukDTO sungJukDTO = null;
	
	public SungJukImpl(SungJukDTO sungJukDTO) {
		this.sungJukDTO = sungJukDTO;
	}
	
	@Override
	public void calcTot() {
		sungJukDTO.setTot(sungJukDTO.getKor()+ sungJukDTO.getEng()+ sungJukDTO.getMath());
		

	}

	@Override
	public void calcAvg() {
		sungJukDTO.setAvg(sungJukDTO.getTot()/3.);

	}

	@Override
	public void display() {
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println(sungJukDTO);//sungJukDTO뒤에 toString이 생략되어 있음 
		/*
		 * System.out.println(sungJukDTO.getName()+ "\t" + sungJukDTO.getKor()+ "\t" +
		 * sungJukDTO.getEng()+ "\t" + sungJukDTO.getMath()+ "\t" + sungJukDTO.getTot()+
		 * "\t" + String.format("%.3f",sungJukDTO.getAvg()));
		 */
	}

	@Override
	public void modify() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력 :");
		sungJukDTO.setName(sc.next());
		System.out.print("국어 입력 :");
		sungJukDTO.setKor(sc.nextInt());
		System.out.print("영어 입력 :");
		sungJukDTO.setEng(sc.nextInt());
		System.out.print("수학 입력 :");
		sungJukDTO.setMath(sc.nextInt());
		
		
		
	}

	@Override
	public void execute(List<SungJukDTO2> list) {
		// TODO Auto-generated method stub
		
	}


}
