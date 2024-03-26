package am;

public class Test2 {

	public static void main(String[] args) {
		// 대입연산자
		//  = : 우측의 값을 좌측변수에 저장
		// += : 우측의 값을 좌측변수에 더하면서 저장
		// -= : 우측의 값을 좌측변수에 빼면서 저장
		// *= : 우측의 값을 좌측변수에 곱하면서 저장
		// /= : 우측의 값을 좌측변수에 나누면서 저장
		// %= : 우측의 값을 좌측변수에 나머지값을 구해서 저장
		
		int a = 10;
		int b = 7;
		System.out.println("a: "+a+", b: "+b);
		
		a += b; // a = a+b; a의 값(10)을 b의 값(7)으로 더한 값(17)을 a에 저장한다.
		System.out.println("a+b: "+a);
		
		a %= b; // a의 값(17)을 b의 값(7)으로 나눈 나머지 값(3)을 a에 저장한다.
	
		System.out.println("a%b: "+a);
		

	}

}
