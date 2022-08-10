package class301;

import java.util.Scanner;

public class Hj implements Print {
	//본인 이니셜로 클래스 만들어서 이떄 프린트 인터페이스를 구현할것
	@Override
	public void print() {
		Scanner sc=new Scanner(System.in); 
		System.out.println("무엇을 하는 걸까요");
		String	a= "어쩔티비...";
		String	b= "저쩔티비...";
		
		System.out.println(a+b+b);
		
		sc.close();
	}

	

}
