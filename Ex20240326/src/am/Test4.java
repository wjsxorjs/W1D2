package am;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		// 키보드로부터 정수 하나를 입력 받는다.
		
		System.out.print("정수를 입력하세요: ");
		
		Scanner scanInt = new Scanner(System.in); //키보드와 연결된 스캐너가 준비됨
		//준비된 키보드와 연결된 스캐너를 통해 숫자 하나를 받는다.
		int num1 = scanInt.nextInt();
		
		//100 초과면 "잘못된 값", 이하일 경우 "적절한 값" < 조건연산자를 활용하여 구현
		
		System.out.println((num1>100) ? "잘못된 값" : "적절한 값");
		System.out.println((num1>100) ? "잘못된 값" : num1);
		System.out.println((num1>100) ? num1 : "적절한 값");

	}

}
