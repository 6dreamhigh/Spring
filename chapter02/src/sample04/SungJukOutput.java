package sample04;

import java.util.List;

import lombok.Setter;
@Setter
public class SungJukOutput implements SungJuk {
	private List<SungJukDTO2> list = null;
	
    @Override
    public void execute() {
        System.out.println();
    	System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
        
    	for(SungJukDTO2 sungJukDTO2 :list) {
    		System.out.println(sungJukDTO2);
    	}//for
		
    }
}
