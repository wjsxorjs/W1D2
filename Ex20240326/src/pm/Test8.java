package pm;

public class Test8 {

	public static void main(String[] args) {
		// 난수만큼 반복문
		
		int randNum = (int) (Math.random() * 50 + 1);
		
		System.out.println(randNum+"\n----------\n");
		
		for(int i=0; i<randNum; i++) {
//			System.out.println(i+1); //0을 출력하지않고자 할 때 1을 더한 후 출력한다.
//			System.out.printf("%d ", i+1); //%d에 i+1을 대입해서 출력해준다.
			System.out.printf("%3d", i+1); //i+1을 세자리로 나타내라. 빈자리는 공백으로 둔다.
										   // %3d : 세자리로 나타내며 수를 우측으로 붙인다.
										   // %-3d : 세자리로 나타내며 수를 좌측으로 붙인다.
		}

	}
	
	
	

}
