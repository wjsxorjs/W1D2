package pm;

public class BfTest {

	public static void main(String[] args) {
		// 1번 문제
		// 정수형 x에 10을, 정수형 y에 20을 저장하고.
		// 정수형 z에 증가연산자 x 와 y 감소연산자를 더한 값을 저장한 후
		// z값을 출력하라.
		
		System.out.println("\n---1번 문제---");
		
		int x = 10;
		int y = 20;
		
		int z = (++x) + (y--);
		 System.out.println(z); //31
		
		
		
		
		// 2번 문제
		// 정수형 score에 85를 저장하고
		// 문자열형 result에 score가 90 초과인지 확인하는 조건문(삼항연산자)을 통해
		// 참일 경우 "가"를 거짓일 경우 "나"를 저장한 후
		// result값을 출력하라.
		 
		System.out.println("\n---2번 문제---");
			
		int score = 85;
		
		String result = (score>90) ? "가" : "나";
		
		System.out.println(result);
		
		
		
		// 3번 문제
		// 정수형 pencils에 534을, 정수형 students에 30을 저장하고.
		// 정수형 pencilsPerStudent에 학생(students) 한 명이 가지는 연필 수를 구하여 저장한 후 해당 값을 출력하라. 
		// 그 후 정수형 pencilsLeft에 남은 연필 수를 구하고 저장한 후 해당 값을 출력하라.
		
		System.out.println("\n---3번 문제---");
		
		int pencils = 534;
		int students = 30;
		
		int pencilsPerStudent = pencils / students;
		System.out.println(pencilsPerStudent);
		
		int pensilsLeft = pencils % students;
		System.out.println(pensilsLeft);
		
		
		
		
		// 4번 문제
		// 정수형 value에 356을 저장하고.
		// value의 십의 자리 이하를 버린 값을 구한 후 출력하라.
		
		System.out.println("\n---4번 문제---");
		int value = 356;
		System.out.println(value  - (value % 100));
		System.out.println((value / 100) * 100);
		
		
		
		
		// 5번 문제
		// 정수형 lengthTop에 5를 저장하고,
		// 정수형 lengthBottom에 10을 저장하고,
		// 정수형 height에 7를 저장하고,
		// 실수형 area에 정확히 소수 자릿수가 나올 수 있도록 하는 사다리꼴 넓이 연산식을 통해 구한 값을 저장한 후
		// area 값을 출력하라.
		
		System.out.println("\n---5번 문제---");
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area1 = (lengthTop+lengthBottom) * height / 2.0;
		double area2 = (lengthTop+lengthBottom) * height * 1.0 / 2;
		double area3 = (double) (lengthTop+lengthBottom) * height / 2;
		double area4 = (double) ((lengthTop+lengthBottom) * height / 2);

		System.out.println("연산식 1: "+area1);
		System.out.println("연산식 2: "+area2);
		System.out.println("연산식 3: "+area3);
		System.out.println("연산식 4: "+area4);
		
				
		// 6번 문제
		// 정수형 x에 10을, 정수형 y에 5를 저장하고.
		// (x가7보다 크다는 비교연산식)과 (y가5보다 작거나 같다는 비교연산식)의 논리곱 값을 출력하고,
		// ((x를 3으로 나눈 나머지 값)이 2와 같다는 비교연산식)과
		// ((y를 2로 나눈 나머지 값)이 1과 같지않다는 비교연산식)의 논리합 값을 출력하라.
		
		System.out.println("\n---6번 문제---");
		int x1 = 10;
		int y1 = 5;
		
		System.out.printf("(x1>7)&&(y1<=5): %b\n", (x1>7)&&(y1<=5));
		System.out.printf("((x1(mod)3)==2)||(y1!=1)): %b\n", ((x1%3)==2)||(y1!=1));
		
		
		
		
		// 7번 문제
		// 실수형 x에 5.0을, 실수형 y에 0.0을 저장하고,
		// 실수형 z에 5.0을 y로 나눈 나머지 값을 저장한 후
		// 조건문 중 비교문(분기문)을 사용하여 특정 조건을 만족할 경우
		// "0.0으로 나눌 수 없습니다."를 출력하라.
		// 해당 조건을 만족시키지 못한다면
		// 실수형 result에 z값에 10을 더한 값을 저장한 후
		// "결과: [result 값]"이 되도록 출력하라.
		
		System.out.println("\n---7번 문제---");
		double x2 = 5.0;
		double y2 = 0.0;
		double z2 = x2 / y2;
		System.out.println(z2);
		if (y2 == 0.0) {
			System.out.println("0.0으로 나눌 수 없습니다.");
		} else {
			double result1 = z + 10;
			System.out.printf("결과: %f\n", result1);
		}
		
		
		
		
		
	}

}
