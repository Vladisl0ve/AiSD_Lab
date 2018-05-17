package ONP;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		liczenie();
		
	}


	public static void liczenie()
	{
		String tmp;
		Scanner scan = new Scanner(System.in);
		InfixtoPostfix inf = new InfixtoPostfix();
		wyczytONP wO = new wyczytONP();
		String strONP;
		
		System.out.println("Wprowadz wyrazenie dla liczenia: ");

		tmp = scan.next();
		strONP = inf.convert(tmp);
		System.out.print("\nWprowadzone wyrazenie: " + tmp);
		System.out.println("\nOdwrotna notacja polska: " +  strONP);
		System.out.println("Wynik: " +  wO.convert(strONP));
		
		tmp = "((2+3)*2+2)%5";
		strONP = inf.convert(tmp);
		System.out.print("\nWprowadzone wyrazenie: " + tmp);
		System.out.println("\nOdwrotna notacja polska: " +  strONP);
		System.out.println("Wynik: " +  wO.convert(strONP));
		
		
		tmp = "(2+2)/(2-2)";
		strONP = inf.convert(tmp);
		System.out.print("\nWprowadzone wyrazenie: " + tmp);
		System.out.println("\nOdwrotna notacja polska: " +  strONP);
		System.out.println("Wynik: " +  wO.convert(strONP));
		
		tmp = "((10+2)*(2+3))/10";
		strONP = inf.convert(tmp);
		System.out.print("\nWprowadzone wyrazenie: " + tmp);
		System.out.println("\nOdwrotna polska notacja: " +  strONP);
		System.out.println("Wynik: " +  wO.convert(strONP));

	}
}
