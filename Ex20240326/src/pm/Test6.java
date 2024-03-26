package pm;

public class Test6 {

	public static void main(String[] args) {
		// 단순반복문
		/*
		  for문의 구성
		  for(초기식; 조건식; 증감식){
		  	수행문1;
		  	수행문2;
		  }
		  
		  for문 수행 순서
		  초기식 > 조건식 > 수행문 > 증감식 > 조건식 > 수행문 > 증감식 > ... > 조건식(불만족시) > for문 종료 
		  
		 */


		for(int i = 1; i <= 10; i++) { //i++나 ++i나 별 차이가 없다. 세 식이 다 별개의 식이기 때문임.
			System.out.println(i);
		}
	}

}
