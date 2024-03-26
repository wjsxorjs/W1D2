package am;

import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		// 키보드로부터 점수를 입력받아서 60점 이상이면 "합격!!!", 미만이면 "다음 기회에..."
		
		System.out.print("점수를 입력하세요: ");
		
		Scanner scanScore = new Scanner(System.in);
		int score = scanScore.nextInt();
		
//		if(score<=100 && score >= 60) { //if문은 범위 지정에 최적화 되어있음. 범위 비교할 때 좋음
		if(score>100) {			
			System.out.println("잘못된 값입니다.");
		} else if(score>=60) {
			System.out.println("합격!!!");
		} else {
			System.out.println("다음 기회에...");
		}
		

	}

}
