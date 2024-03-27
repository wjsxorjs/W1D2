package pm;

public class ForEx7 {

	public static void main(String[] args) {
		// 1부터 10까지의 합 출력
		
		int summ = 0;
		
		for(int i=1; i<=10; i++) {
			summ += i;
		}
		
		System.out.printf("1부터 10까지의 합: %d\n", summ);
		
		System.out.println("-----------------------");
		
		System.out.print("3의 배수: ");
		for(int j=1; j<=10; j++) {
			if(j%3==0) {
				System.out.printf("%d ",j);
			}
		}
		
		System.out.println("\n\n---------- RANDOM 활용 ----------");
		//  랜덤함수의 구성
		// Math.random() 난수(0.0 <= x < 1.0) 발생 < double형
		// Math.random() * 범위 + 시작수 
		int randNum = (int) (Math.random() * 10 + 1); // 1부터 10까지 중 랜덤한 수
		
		System.out.printf("Random Number: %d\n\n", randNum);
		
		System.out.println("--------- RANDOM 활용 2 ---------");
		
		int randNum2 = 0;
		for(int k=1; k<=10; k++) {
			randNum2 = (int) (Math.random() * 10 + 1);
			System.out.printf("RANDOM NUMBER #%d: %d\n", k, randNum2);
		}
		
		
	}

}
