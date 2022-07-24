package balanced.brackets.services;

import java.util.Stack;

public class BalancedString {

	public boolean check(String input) {
		int size;
		Stack<Character> s = new Stack<Character>();
		size = input.length();

		for (int i = 0; i < size; i++) {
			char inChar = input.charAt(i);

			if (inChar == '(' || inChar == '[' || inChar == '{') {

				s.push(inChar);
				continue;
			}

			if (s.isEmpty()) {
				return false;
			}

			char check;

			switch (inChar) {

			case ')': {
				check = s.pop();
				if (check == '[' || check == '{') {
					return false;
				}
				break;
			}

			case ']': {
				check = s.pop();
				if (check == '(' || check == '{') {
					return false;
				}
				break;
			}

			case '}': {
				check = s.pop();
				if (check == '(' || check == '[') {
					return false;
				}
				break;
			}

			}

		}

		return (s.isEmpty());
	}
}
