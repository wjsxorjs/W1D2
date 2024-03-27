package pm;

import java.util.Scanner;

public class SwitchEx3 {

	public static void main(String[] args) {
		
		/* 
			[조건]
			  num1의 값이 1, 2, 3 중에 하나라고 가정함.
			  1일 때는 "1번",
			  2일 때는 "2번",
			  3일 때는 "3번"이라고 출력하고자한다.
		*/
		
		System.out.print("정수 입력(1~3): ");
		
		Scanner scanInt = new Scanner(System.in);
		
		int num1 = scanInt.nextInt();
		
		System.out.println("--------IF--------");
		
		if(num1 == 1) {
			System.out.println("1번");
		} else if(num1 == 2) {
			System.out.println("2번");
		} else if(num1 == 3) {
			System.out.println("3번");
		} else {
			System.out.println("잘못된 값");
		}
		
		
		System.out.println("------SWITCH------");
		/*
		 switch문의 구성
		  switch(조건값){
		    case 비교값1 :
		    	실행문1;
		    	실행문2;
		    	break; //switch문 탈출
		    case 비교값2 :
		    	실행문3;
		    	...
		    	break; //switch문 탈출
		    case 비교값n : //얼마든지 넣을 수 있다.
		    	실행문n;
		    	break; //switch문 탈출
		    default :
		    	//if문의 else와 같은 영역

		  }
		 */
		
		
		switch(num1) { //같은 값을 바로찾아가므로 같은 값을 찾는 경우에는 if보다 더 효율적일 수 있음
		case 1:
			System.out.println("1번");
			break;
			
		case 2:
			System.out.println("2번");
			break;
			
		case 3:
			System.out.println("3번");
			break;
			
		default :
			System.out.println("잘못된 값");
			
		}

	}

}
