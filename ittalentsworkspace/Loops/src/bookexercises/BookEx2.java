package bookexercises;

public class BookEx2 {

	public static void main(String[] args) {
		

		int x = 231;
		
		int y = (((x&4)^(1<<9))^(1<<8));
		
		System.out.println(y);
		

	}

}
