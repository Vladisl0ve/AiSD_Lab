package Uczelnia;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Main {

	public static void wprowadz(Pracownik[] test) {

		Scanner sc = new Scanner(System.in);
		String nazwisko;
		String imie;
		long pesel;
		int staz;
		double pensja;

		for (int i = 0; i < test.length; i++) {

			System.out.println("Wprowadz imie: ");
			imie = sc.next();
			System.out.println("Wprowadz nazwisko: ");
			nazwisko = sc.next();
			System.out.println("Wprowadz pesel: ");
			pesel = sc.nextLong();
			System.out.println("Wprowadz staz: ");
			staz = sc.nextInt();
			System.out.println("Wprowadz pensje: ");
			pensja = sc.nextDouble();

			test[i] = new Pracownik(imie, nazwisko, pesel, staz, pensja);

		}
		sc.close();
	}

	public static void zapis(Pracownik[] Tab, int g) throws FileNotFoundException, IOException {

		File plik = new File("Pracowniki.dat");

		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(plik));

		out.writeObject(g);

		for (int i = 0; i < g; i++) {
			out.writeObject(Tab[i]);
		}

		out.close();
	}

	public static void odczyt() throws FileNotFoundException, IOException, ClassNotFoundException {
		Pracownik[] p = new Pracownik[2];
		int ilosc = 0;
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("Pracowniki.dat"));

		ilosc = (Integer) in.readObject();

		for (int i = 0; i < ilosc; i++) {

			p[i] = (Pracownik) in.readObject();

		}

		in.close();

		
			new Pracownik().wyswetl(p);

		

	}

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		Pracownik prac1 = new Pracownik("Vlad", "Lapko", 1000001l, 21, 4532.553);
		Pracownik prac2 = new Pracownik();

		Pracownik[] tab = new Pracownik[2];

		System.out.println(prac1.toString());
		System.out.println(prac2.toString());

		wprowadz(tab);

		System.out.println("\n\nWprowadzone pracowniki: ");

		new Pracownik().wyswetl(tab);

		zapis(tab, 2);
		System.out.println("\n\nOdczytane pracowniki z pliku: ");
		odczyt();

	}

}
