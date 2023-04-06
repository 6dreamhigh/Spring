package sample03;

import java.util.List;

import sample04.SungJukDTO2;

public interface SungJuk {
	public void calcTot(); //총점 계산
    public void calcAvg(); //평균 계산
    public void display(); //출력
    public void modify(); //수정
	public void execute(List<SungJukDTO2> list);
}
