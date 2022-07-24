package find.a.pair.main;

import java.util.Scanner;

import find.a.pair.services.FindAPair;
import find.a.pair.services.FindAPair.Node;

public class DriverClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Node root = null;

		FindAPair obj = new FindAPair();

		System.out.println("Enter the no of nodes to input");
		int size = sc.nextInt();
		for (int i = 0; i < size; i++) {
			int key = sc.nextInt();
			root = obj.insert(root, key);
		}

		System.out.println("Enter the value of sum =");
		int sum = sc.nextInt();

		obj.findPairOfGivenSum(root, sum);
		sc.close();
	}

}
