package pm;

import java.util.Scanner;

public class SwitchEx4 {

	public static void main(String[] args) {		
		System.out.print("코드(S,E,L) 입력: ");
		
		Scanner scanStr = new Scanner(System.in);
		
		String code = scanStr.nextLine(); //키보드로부터 문자열 받기
		
		switch(code) {
			case "S": 
				System.out.println("스포츠 용품");
				break;
			case "E":
				System.out.println("전자제품");
				break;
			case "L":
				System.out.println("생활용품");
				break;
		}

	}

}
