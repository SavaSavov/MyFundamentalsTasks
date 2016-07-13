package bookexmethodsandrecursion;

public class Ex1 {

	public static void main(String[] args) {
		

		printNum(1);
		System.out.println();
		printNum1(10);

	}
	
	static int printNum(int num){
		
		if(num > 10){
			return 10;
		}
		
		System.out.print(num + " ");
		
		return printNum(num + 1);
	}
	
	static int printNum1(int num){
		
		if(num < 1){
			return 1;
		}
		
		System.out.print(num + " ");
		
		return printNum1(num - 1);
	}

}
