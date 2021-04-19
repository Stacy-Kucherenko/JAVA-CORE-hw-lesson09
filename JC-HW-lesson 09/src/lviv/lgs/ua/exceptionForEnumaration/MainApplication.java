/* 
 * *Logos IT Academy 
 * 
 * Java Code Convention for Homework
 * 
 * */
package lviv.lgs.ua.exceptionForEnumaration;

import java.util.Scanner;

/**
 * @author Anastasiia Kucherenko
 * @since Java SE 15
 * @version 1.1  19.04.2021
 */

public class MainApplication {
	
	/* displays the application menu on the console */
	static void menu() {

		System.out.println("Натисніть 1, щоб пеевірити чи існує такий місяць ");
		System.out.println("Натисніть 2, щоб вивести всі місяці які мають таку саму кількість днів ");
		System.out.println("Натисніть 3, щоб вивести на екран всі місяці які мають меншу кількість днів ");
		System.out.println("Натисніть 4, щоб вивести на екран всі місяці які мають більшу кількість днів ");
		System.out.println("Натисніть 5, щоб вивести на екран наступну пору року ");
		System.out.println("Натисніть 6, щоб вивести на екран попередню пору року");
		System.out.println("Натисніть 7, щоб вивести на екран всі місяці які мають парну кількість днів");
		System.out.println("Натисніть 8, щоб вивести на екран всі місяці які мають непарну кількість днів");
		System.out.println("Натисніть 9, щоб вивести на екран чи введений з консолі місяць має парну кількість днів");

	}
	
public static void main(String[] args) throws WrongInputConsoleParametersException {
	Months[] mas = Months.values();
	Scanner sc = new Scanner(System.in);

	/* infinite loop called by menu method */
	
	while (true) {
		menu();
		
		/* check values that are input in the scanner and runs the appropriate case */
		switch (sc.next()) {
		
		/* checks months for existence */
		case "1": {
			System.out.println("Enter month ");
			sc = new Scanner(System.in);
			String months = sc.next().toUpperCase();

			boolean flag = areMonthsExist(mas, months);
			if(flag==false)  {
				String message = "Month dosen't exist ";
				throw new WrongInputConsoleParametersException(message);
			}
			break;
		}
		
		/* checks months with the same number of days */
		case "2": {
			System.out.println("Enter number of days per month ");
			sc = new Scanner(System.in);
			int days = sc.nextInt();

			boolean flag = false;

			for (Months m : mas) {
				if (m.getDays() == days) {
					System.out.println(m);
					flag = true;
				} 
			} if(flag==false) {
				String message = "Month wich has such number of the days dosen't exist";
				throw new WrongInputConsoleParametersException(message);
			}
			
			break;

		}
		
		/* checks month with the less number of days */
		case "3": {
			System.out.println("Enter number of the days  ");
			sc = new Scanner(System.in);
			int days = sc.nextInt();

			boolean flag = false;

			for (Months m : mas) {
				if (m.getDays() < days) {
					System.out.println(m);
					flag = true;
				}
				if (flag == false) {
					String message = "Month with less amount of the days dosen't exist";
					throw new WrongInputConsoleParametersException(message);
				}
				break;
			}
		}
		
		/* checks month with the bigger number of days */
		case "4": {
			System.out.println("Enter number of the days  ");
			sc = new Scanner(System.in);
			int days = sc.nextInt();

			boolean flag = false;

			for (Months m : mas) {
				if (m.getDays() > days) {
					System.out.println(m);
					flag = true;
				}
				if (flag==false) {
					String message = "Month with bigger amount of the days dosen't exist";
					throw new WrongInputConsoleParametersException(message);
				}

			}

		}
		
		/* checks the next season */
		case "5": {
			System.out.println("Enter season  ");
			sc = new Scanner(System.in);
			String seasons = sc.nextLine().toUpperCase();
			Seasons[] season = Seasons.values();
			Seasons season1 = Seasons.valueOf(seasons);
			int ordinal = season1.ordinal();

			if (ordinal == season.length) {
				ordinal = -1;
				System.out.println(season[ordinal + 1]);
			}
			
			else {
				String message = "ERROR";
				throw new WrongInputConsoleParametersException(message);
			}

		}
		
		/* checks the previous season */
		case "6": {
			System.out.println("Enter season  ");
			sc = new Scanner(System.in);
			String seasons = sc.nextLine().toUpperCase();
			Seasons[] season = Seasons.values();
			Seasons season1 = Seasons.valueOf(seasons);
			int ordinal = season1.ordinal();

			if (ordinal == 0) {
				ordinal = 4;
				System.out.println(season[ordinal - 1]);
			}
		
			else {
				String message = "ERROR";
				throw new WrongInputConsoleParametersException(message);
			}

		}

		/* checks months with a paired numbers of days */
		case "7": {

			System.out.println("Months with paired number of days: ");

			for (Months m : mas) {
				if (m.getDays() % 2 == 0) {

					System.out.println(m);

				} 
			}
		}
		
		/* checks months with a unpaired numbers of days */
		case "8": {

			System.out.println("Months with unpaired number of days: ");

			for (Months m : mas) {
				if (m.getDays() % 2 != 0) {

					System.out.println(m);

				} 
				
				}
			
		}
		
		/* checks  the months for paired/unpaired numbers of days */
		case "9": {

			System.out.println("Enter month ");
			sc = new Scanner(System.in);
			String months = sc.next().toUpperCase();

			boolean flag = false;
			for (Months m : mas) {
				if (m.toString().equals(months) && m.getDays() % 2 == 0) {
					System.out.println("This month has paired number of days ");
					flag = true;
				}
			}
			if (flag == false) {
				String message = "This month has unpaired number of days ";
				throw new WrongInputConsoleParametersException(message);
			}
		}

		}
	}
}

/**
 * Checks if the month exists in array and returns a boolean expression
 * 
 * @param arrayMonths, month
 * 
 * @return boolean expression
 * 
 */

private static boolean areMonthsExist(Months[] mas, String months) {
	boolean flag = false;

	for (Months m : mas) {
		if (m.name().equals(months)) {
			System.out.println("Month is exist ");
			flag = true;
		}
	}
	return flag;
}


}
