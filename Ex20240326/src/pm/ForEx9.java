package pm;

public class ForEx9 {

	public static void main(String[] args) {
		// 구구단을 외자. 구구단을 외자.
		// randNum단을 출력하자!
		/*
		예시)
			3단
			----------
			3 * 1 = 3
			3 * 2 = 6
			...
			3 * 8 = 24
			3 * 9 = 27
		*/
		int randNum = (int) (Math.random() * 8 + 2);
		
		System.out.printf("\r\n  %d단\r\n ------------\r\n\r\n", randNum); // \r\n이 정석적인 Enter(BrakeLine)이다.
		
		for(int i=1; i<=9; i++) {
			System.out.printf("  %d * %d = %d\r\n", randNum, i, randNum * i );
		}

	}

}
