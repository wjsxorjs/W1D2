package am;

public class Test1 {
	
	public static String intToBinary(int bfBin) {
		String resultBin = "";		
		while(true){
			resultBin = (bfBin % 2) + resultBin;
			bfBin /= 2;
			if (bfBin == 0) break;
		}
		return resultBin;
	}

	public static void main(String[] args) {
		// Start of the program
		
		//Variable a with 13 its value.
		int a = 13; // 0b1101
		// Variable b with 7 its value.
		int b = 7;  // 0b0111
	
		
		// 비트연산자 중 논리곱(and: &)을 이용하라.	
		int c = a&b;		
		/*
		 	a -> 0000...1101 = 13 (8+4+1)
		 	b -> 0000...0111 = 7  (4+2+1)
		 	& -----------------------------
		 	c -> 0000...0101 = 5  (4+1)
		*/
		
		System.out.printf("%d : (binary) %s\n",c,intToBinary(c));
		
		int a1 = 15; // 0b1111
		int b1 = 8;  // 0b1000
		
		int c1 = a1|b1;
		
		/*
		 	a -> 0000...1111 = 15 (8+4+2+1)
		 	b -> 0000...1000 = 8  (8)
		 	+ -------------------------------
		 	c -> 0000...1111 = 15  (8+4+2+1)
		*/
		
		System.out.printf("%d : (binary) %s\n",c1,intToBinary(c1));
		
		
	}

}
