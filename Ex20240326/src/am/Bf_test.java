package am;

public class Bf_test {

//	public static void func1() {
//		System.out.println("TO FUNC2!");
//		func2();
//	}
//	
//	public static void func2() {
//		System.out.println("TO FUNC1!");
//		func1();
//	}
//	
	
	public static void main(String[] args) {
		//
//		func1(); // 무한루프 걸린다. func1 > func2 > func1 > func2 > ...
		
		int a = 65;
		while(true) { //반복문
			if(74<a && a<81) {++a; continue;} // 조건문
			System.out.println(a+" ==(char)==> "+((char)a++));
			if(a>=91) {break;}
		}

		System.out.println("END!");
		
	}

}
