package ONP;

import Stack.Stos;

public class wyczytONP {
	public String ONP;
	public Stos<String> operator;
	String operatory[] = { "+", "-", "*", "/", "%", "(", ")", "^" };

	public wyczytONP() {
		// pusty
	}

	public double convert(String infix) {
		double wynik = 0;
		ONP = infix;
		String arr[];
		operator = new Stos<String>();
		arr = infix.split(" ");
		int i = 0;
		while (i < arr.length) {
			if (isOperator(arr[i]) == false) {
				operator.push(arr[i]);
				i++;
				continue;
			} else {
				wynik = liczenie(arr[i]);
				i++;
			}
		}
		return wynik;
	}
	
	public double backConvert(String infix) {
		double wynik = 0;
		ONP = infix;
		String arr[];
		operator = new Stos<String>();
		arr = infix.split(" ");
		int i = 0;
		while (i < arr.length) {
			if (isOperator(arr[i]) == false) {
				operator.push(arr[i]);
				i++;
				continue;
			} else {
				wynik = liczenie(arr[i]);
				i++;
			}
		}
		return wynik;
	}

	private boolean isOperator(String string) {
		for (int i = 0; i < 8; i++) {
			if (string.equals(operatory[i]) == true)
				return true;
		}
		return false;
	}

	private double liczenie(String a) {
		double suma = 0;
		double i, j;

		i = Double.parseDouble(operator.pop());
		try {
			j = Double.parseDouble(operator.pop());
		} catch (NullPointerException e) {
			j = 0;
		}
		switch (a) {
		case ("+"):
			suma = i + j;
			break;
		case ("-"):
			suma = j - i;
			break;
		case ("%"): {
			try {
				suma = j % i;
				if (i < 0) 
					throw new IllegalArgumentException("Nieprawidlowo napisano");
				
			} catch (IllegalArgumentException e) {
				
				System.out.println(e);
				
			}
			
		}

			break;
		case ("/"): {

			try {

				suma = j / i;
				if (i == 0) {
					throw new IllegalArgumentException();
				}

			} catch (IllegalArgumentException e) {
				System.out.println("Nie mozna dzielic przez zero! " + e);
			}

		}
			break;
		case ("*"):
			suma = i * j;
			break;
		case ("^"):
			suma = potengowanie(j, (int) i);
		}

		operator.push(Double.toString(suma));
		return suma;
	}

	public double potengowanie(double i, int j) {
		double suma = i;
		for (int x = 1; x < j; x++)
			suma *= i;
		return suma;
	}
}
