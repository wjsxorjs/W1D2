package pm;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		/*
		 [문제]
		   키보드로부터 점수를 하나 받는다.
		   해당 점수가 80~100이면 "우수",
		   			   60~79이면 "보통",
		   			   40~59이면 "재시험",
		   			   그 이하는 "하지마~^^"출력
		*/ 

		System.out.print("점수 입력: ");
		
		Scanner scanScore = new Scanner(System.in);
		
		int score = scanScore.nextInt(); //정수 받기
		
		if(score<0 || score>100) {
			System.out.println("잘못된 값이 입력되었습니다.\n점수는 0점 이상, 100점 이하이어야 합니다");
		} else if(score>=80) { // 80~100
			if(score>=95) {
				System.out.print("최");
			}
			System.out.println("우수");
		} else if(score>=60) { //60~79
			System.out.println("보통");
		} else if(score>=40) { //40~59
			System.out.println("재시험");
		} else { //0~39
			System.out.println("하지마~^^");
		}
		
		
		
		
	}

}
