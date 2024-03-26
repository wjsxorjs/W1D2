package am;

public class Test6 {

	public static void main(String[] args) {
		//		p.s.: 명명규칙.  class는 대문자로 시작. 소문자로 시작하는 변수와 함수 중 함수는 ()가 따라옴
		//			숫자로 시작할 수 없으며, 공백을 포함할 수 없다. _로 공백 효과를 나타냄.
		// 제어문
		/*
		  - 비교문(분기문)
		  	1. if문 
		  	 1) 단순 if문
		  	 2) if~else문
		  	 3) 다중if문

		    2. switch문
		    
		  - 반복문
		    1. for문
		    2. while문
		    3. do~while문
		    
		  - 탈출문
		    1. break문
		    * continue문 (탈출은 아니고 다음 회차로 넘어감)	  	
		*/
		
		int num1 = 5; // <-- 얘도 main함수에서만 사용가능한 지역변수다.
		
		/*
			[조건]
		 		num1이 10 이상이면 화면에 "10점 이상"이라는 문자열을 출력하라.
		 	
		 	해당 조건 내용을 가지고 if문 구현하면 단순if문으로 가능하다.
		 	if(조건식) {
		 		System.out.println("10점 이상");
		 	}
		 
		*/
		if(num1>=10) { //두 문장 이상일 때는 영역으로 묶어줘야한다.
			System.out.print("10점 이상");
			System.out.println("입니다."); //영역 구분(중괄호)이 없다면 조건문의 영역에 들어가지 않음.
			//해당 영역에서 선언한 변수는 해당 영역 밖에서는 사용하지 못 함.
			//이를 지역변수라고 한다.
			int b = 0; //여기서만 사용가능하다.
			System.out.println(b + 5); //< 그래서 얘는 사용가능하지만
		} //if문 끝. 그러면 지역변수 사용가능 영역도 끝!
		
		 //System.out.println(b + 5); //< 얘는 사용불가하다.(오류남)
		
		
	}

}
