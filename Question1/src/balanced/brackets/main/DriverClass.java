package balanced.brackets.main;

import java.util.Scanner;

import balanced.brackets.services.BalancedString;

public class DriverClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BalancedString obj = new BalancedString();
		System.out.println("Enter the option 1 or 2" + '\n');
		System.out.println("Option 1 : To check the String");
		System.out.println("Option 2 : Demo" + '\n');
		int opt = sc.nextInt();
		switch (opt) {
		case 1: {
			System.out.println("Enter the String to check");
			String input = sc.next();
			if (obj.check(input)) {
				System.out.println("The entered String has Balanced Brackets");
			} else {
				System.out.println("The entered String does not contain Balanced Brackets");
			}

		}
			break;

		case 2: {
			String demo = "( [ [ { } ] ] )";
			System.out.println("Sample Input : " + '\n');
			System.out.println(demo + '\n');

			if (obj.check(demo)) {
				System.out.println("Sample Output" + '\n');
				System.out.println("The entered String has Balanced Brackets");
			} else {
				System.out.println("Sample Output" + '\n');
				System.out.println("The entered String does not contain Balanced Brackets");
			}
			break;
		}

		}
		sc.close();

	}
}
