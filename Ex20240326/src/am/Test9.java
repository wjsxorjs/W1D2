package am;

import java.util.Scanner;

public class Test9 {

	public static void main(String[] args) {
		// 화면에 점수 입력 문자출력
		System.out.print("점수를 입력해주세요: ");
		
		//키보드와 연결된 스캐너 준비
		Scanner scanScore = new Scanner(System.in);
		
		//준비된 스캐너로부터 점수 하나 입력받기
		int score = scanScore.nextInt();
		
		//받은 score값이 100 초과 : "잘못된 값입니다."
		//				 100 이하 60 이상 : "합격!!!"
		//				 60 미만 : "다음 기회에..."

		if(score>100 || score<0) {
			System.out.println("잘못된 값입니다.");
		} else if(score>=60) { //제어가 이쪽으로 왔다는 것은 score가 100이하라는 뜻이므로 자연스럽게 범위가 지정됨.
			System.out.println("합격!!!");
		} else {
			System.out.println("다음 기회에...");
		}
		
		
		
	}

}
