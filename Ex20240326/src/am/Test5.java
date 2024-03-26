package am;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		// 화면에 정수를 입력하라는 안내문 출력
		System.out.print("정수 입력: ");
		//키보드와 연결된 스캐너 준비하기
		Scanner scanInt = new Scanner(System.in); //키보드를 가지고 스캐너를 만들었다는 의미.
		//입력받은 숫자를 정수형 변수 num1에 저장함
		int num1 = scanInt.nextInt();
		
		//100 초과는 허용하지 않음. 100 초과는 100으로 나눈 나머지 값만 출력
		int num2 = (num1>100) ? (num1%100): (num1);
		System.out.println(num2);

		int num3 = (num1>100) ? (num1%100): ((num1<0) ? ((num1*-1)%100): (num1));
		System.out.println(num3);

	}

}
