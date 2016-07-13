package homework;

import java.util.Scanner;

public class Exersice12 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);

		int day;
		int month;
		int year;
		
		System.out.println("Please enter date from the year: ");
		day = input.nextInt();
		
		System.out.println("Please enter month from the year: ");
		month = input.nextInt();
		
		System.out.println("Please enter year: ");
		year = input.nextInt();
		
		nextDay(day, month, year);
		
		input.close();

	}
	private static int currMonthDays(int currMonth , int currYear){
		int monthDays = 0;
		
		if ( currMonth > 0 && currMonth <= 12 ){
			if (currMonth == 1) {
				monthDays = 31;
			} else if (currMonth == 2) {
				if (currYear % 400 == 0 || (currYear % 4 == 0 && currYear % 100 != 0)) {

					monthDays = 29;
				} else {
					monthDays = 28;
				}
			}else if (currMonth == 3) {
				monthDays = 31;
			}else if (currMonth == 4) {
				monthDays = 30;
			}else if (currMonth == 5) {
				monthDays = 31;
			}else if (currMonth == 6) {
				monthDays = 30;
			}else if (currMonth == 7) {
				monthDays = 31;
			}else if (currMonth == 8) {
				monthDays = 31;
			}else if (currMonth == 9) {
				monthDays = 30;
			}else if (currMonth == 10) {
				monthDays = 31;
			}else if (currMonth == 11) {
				monthDays = 30;
			}else if (currMonth == 12) {
				monthDays = 31;
			}else if (currMonth == 2 && (currYear % 400 == 0 || (currYear % 4 == 0 && currYear % 100 != 0))) {
				monthDays = 29;
			} else {
				monthDays = 28;
			}
		}else{
			System.out.println("You've entered invalid month!!!");
		}	
		return monthDays;
	}

	private static int checkDay( int testDay, int currMonth, int currYear )
	{   
		int checkDay = 0;
		if ( testDay > 0 && testDay <= currMonthDays(currMonth,currYear) ){
			checkDay = testDay;
		}else if ( currMonth == 2 && testDay == 29 && ( currYear % 400 == 0 || ( currYear % 4 == 0 && currYear % 100 != 0 ))){
			checkDay = testDay;
		}else{
			System.out.println("You've entered invalid day!!!");
		}
		return checkDay;
		
	} 

	private static boolean isLeap(int currMonth, int currYear){
		if( currMonth == 2 && ( currYear % 400 == 0 || ( currYear % 4 == 0 && currYear % 100 != 0 ))){
			return true;
		}else{
			return false;
		}
	} 
	private static void nextDay(int testDay,int currMonth, int currYear) {
		
		
			int currentMonthMaxDays = currMonthDays(currMonth,currYear);
			boolean leapYear = isLeap(currMonth, currYear);
			int day = checkDay(testDay, currMonth, currYear);
		
		if (day > 0 && day <= currMonthDays(currMonth, currYear) && currMonth > 0 && currMonth <= 12) {
			if (day < currentMonthMaxDays) {
				day += 1;
			} else if (currMonth == 2 && leapYear == true && day == 28) {
				day = 29;
			} else {
				day = 1;
				if (currMonth != 12) {
					currMonth = currMonth + 1;
				} else {
					currMonth = 1;
					currYear = currYear + 1;
				}
			}
			System.out.printf("The next day is: %d - %d - %d ", day, currMonth, currYear);
		}

	}

}
