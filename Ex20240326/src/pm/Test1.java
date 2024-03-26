package pm;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		System.out.print("값 입력: ");
		
		Scanner scanInt = new Scanner(System.in); // new는 새롭게 객체를 만들 때 사용하는 키워드
												  // 자료형 변수명 = 새롭게 만들어야 한다 얘를(자료형!)
												  // Scanner라는 객체가 만들어져서 scanInt에 저장한 상태
												  // 해당 자료형을 물려받은(상속한) 객체 새롭게 생성해서 변수에 저장할 수 있음
		int num1 = scanInt.nextInt();
		
		/* 
			[조건]
			  num1의 값이 1, 2, 3 중에 하나라고 가정함.
			  1일 때는 "1번",
			  2일 때는 "2번",
			  3일 때는 "3번"이라고 출력하고자한다.
		*/

		if(num1 == 1) {
			System.out.println("1번");
		} else if(num1 == 2) {
			System.out.println("2번");
		} else if(num1 == 3) {
			System.out.println("3번");
		} else {
			System.out.println("잘못된 값! 1, 2, 3 중 하나를 입력하세요.");
		}
		
		
	}
	
}
