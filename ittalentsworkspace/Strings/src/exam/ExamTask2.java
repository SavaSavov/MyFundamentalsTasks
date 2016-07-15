package exam;

import java.util.Scanner;

public class ExamTask2 {

	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);
		
		int attemptsCount = 0;
		int aKCount = 0;
		
		do{
			
			System.out.println("Enter something:");
			String text = input.nextLine();
			
			while(!validateInput(text)){
				System.out.println("Enter text again:");
				text = input.nextLine();

			}
			
			
			char firstChar = text.charAt(0);
			char secondChar = text.charAt(2);
			
			
			if(!((firstChar == 'A' && secondChar == 'K') || (firstChar == 'K' && secondChar == 'A'))){
				aKCount = 0;
				attemptsCount++;
			}else{
				aKCount++;
				attemptsCount++;
			}
			
			if(aKCount == 3){
				System.out.println(attemptsCount);
				break;
			}
			
		}while(true);
		
		input.close();

	}
	
	static boolean validateInput(String text){
		
		boolean isOk = true;
		
		String[] arr = text.split(" ");
		
		for (int i = 0; i < arr.length; i++) {
			char firstChar = arr[i].charAt(0);
			if(!((firstChar < '2' || firstChar > '9') || (firstChar != 'T' || firstChar != 'A' || firstChar != 'J' 
					|| firstChar != 'Q' || firstChar != 'K'))){
				
				isOk = false;
			}
		}
		

		
		if(!isOk){
			System.out.println("Invalid input!");
		}
		
		return isOk;
	}

}
