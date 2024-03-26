package am;

public class Test3 {

	public static void main(String[] args) {
		// 삼항연산자 ?
		// 조건식 ? 참일때 : 거짓일때
		// (조건식) ? 참값 : 거짓값 ;
		//          |  
		//   true   |   O
		//  false   |           O
		//          |  
		
		int a = 10;
		int b = 7;
		
		
		
		String result1 = (a>b) ? "A가 B보다 크다" : "A가 B보다 크지는 않다.";
		String result2 = (a==b) ? "A가 B보다 크다" : "A가 B보다 크지는 않다.";
		String result3 = (a==b) ? "A와 B는 같다" : (a>b) ? "A가 B보다 더 크다" : "B가 A보다 더 크다.";
		// 삼항연산자는 항상 값을 반환하기에 해당 값을 받아주는 변수가 있을 경우 참값, 거짓값은 항상 같은 자료형을 가져야한다.
		System.out.println(result1+"\n"+result2+"\n"+result3);

		

	}

}
