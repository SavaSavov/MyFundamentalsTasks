package homework;

public class Exercise23 {

	public static void main(String[] args) {
		
		int number = 1;
		int count = 1;
		
		
		while(count<=9){
			while(number <= 9){
				System.out.print(count+"*"+number+"  ");
				number++;
			}
			number = (count+1);
			count++;
			System.out.println();
		}

	}

}
