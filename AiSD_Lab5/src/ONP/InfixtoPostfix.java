package ONP;

import java.util.ArrayList;
import java.util.StringTokenizer;
import Stack.*;

public class InfixtoPostfix {
	public String postfix;
	public Stos<String> operator;
	String operatory[] = { "+", "-", "*", "/", "%", "(", "[", "{", ")", "]", "}", "^" };

	public String convert(String infix) {
		postfix = new String();
		String arr[];
		operator = new Stos<String>();
		arr = infix.split("");
		StringTokenizer sp = new StringTokenizer(infix, "-+*/()[]{}%^", true);
		arr = StringToArray(sp);
		int i = 0;
		while (i < arr.length) {
			if (isOperator(arr[i]) == false) {
				postfix += arr[i];
				postfix += " ";
				i++;
				continue;
			} else {
				proccessOperator(arr[i]);
			}
			i++;
			if (i == 13) {
				System.out.println(" ");
			}
		}
		while (operator.empty() != true) {
			postfix += operator.pop();
			postfix += " ";
		}
		return postfix;
	}

	private void proccessOperator(String actOp) {
		if (operator.empty() == true || (Nawias(actOp) == 1)) {
			operator.push(actOp);
			return;
		}
		String topOp;
		topOp = operator.peek();
		if (precedence(topOp) < precedence(actOp)) {
			operator.push(actOp);
			return;
		}
		while (precedence(topOp) >= precedence(actOp)) {

			operator.pop();
			postfix += topOp;
			postfix += " ";

			if (operator.empty() == true) {
				operator.push(actOp);
				return;
			}

			topOp = operator.peek();

			if (Nawias(actOp) == 2) {
				if (Nawias(topOp) == 1) {
					operator.pop();
					return;
				}
			}

			if (Nawias(topOp) == 1) {
				operator.push(actOp);
				break;
			}

			if (precedence(topOp) < precedence(actOp)) {
				operator.push(actOp);
				return;
			}
		}
	}

	private int precedence(String op) {
		for (int i = 0; i < 2; i++) {
			if (op.equals(operatory[i]) == true)
				return 1;
		}
		for (int i = 2; i < 5; i++) {
			if (op.equals(operatory[i]) == true)
				return 2;
		}
		for (int i = 5; i < 11; i++) {
			if (op.equals(operatory[i]) == true)
				return -1;
		}
		return 3;
	}

	private boolean isOperator(String op) {
		for (int i = 0; i < 12; i++) {
			if (op.equals(operatory[i]) == true)
				return true;
		}
		return false;
	}

	public String[] StringToArray(StringTokenizer st) {
		String[] arr1;
		ArrayList<String> arr = new ArrayList<String>();
		while (st.hasMoreTokens()) {
			arr.add(st.nextToken());
		}
		arr1 = new String[arr.size()];
		arr1 = arr.toArray(arr1);
		return arr1;
	}

	public int Nawias(String op) {
		for (int i = 5; i < 8; i++) {
			if (op.equals(operatory[i]) == true)
				return 1;
		}
		for (int i = 8; i < 11; i++)
			if (op.equals(operatory[i]) == true)
				return 2;
		return 0;
	}

	// public String[] SprawdzeniePodwojnych(String arr[]) {
	// String arr1[];
	// ArrayList<String> arr2 = new ArrayList<String>();
	//
	// for (int i = 0; i < arr.length; i++) {
	// if ((isOperator(arr[i]) == isOperator(arr[i + 1])) && (isOperator(arr[i]) ==
	// false)) {
	// arr[i] += arr[i + 1];
	// arr2.add(arr[i]);
	// i++;
	// continue;
	// }
	// arr2.add(arr[i]);
	//
	// }
	// arr1 = new String[arr2.size()];
	// arr1 = arr2.toArray(arr1);
	// return arr1;
	// }

}
