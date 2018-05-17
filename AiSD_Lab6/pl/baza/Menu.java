package pl.baza;

import java.util.Scanner;

public class Menu {

	BazaDanych b = new BazaDanych();

	public void menu() {

		Scanner scan = new Scanner(System.in);
		int cos = 0;
		System.out.println("1. Utworzenie nowej bazy danych\r\n" + "2. Odczyt bazy z pliku\r\n"
				+ "3. Wyswietlenie wszystkich rekordow\r\n" + "4. Wyswietlenie danych jednego pracownika\r\n"
				+ "5. Dopisanie nowego pracownika\r\n" + "6. Usuniecie pracownika z bazy\r\n"
				+ "7. Aktualizowanie danych pracownika\r\n" + "8. Zapis bazy do pliku\r\n"
				+ "9. Obliczenie sredniej wyplaty\r\n"
				+ "0. Koniec programu\r\n");
		cos = scan.nextInt();

		switch (cos) {
		case 1: // Utworzenie nowej bazy danych
			b.utworzBaze();
			Pracownik p1 = new Pracownik(12, "Lapko", "Vlad", "14.10.1998", "student", 100, 0);
			Pracownik p2 = new Pracownik(15, "Kuchko", "Kirushka", "07.02.1980", "sekretarka", 500, 10);
			Pracownik p3 = new Pracownik(17, "Jankowski", "Leh", "30.04.1971", "dyrektor", 4000, 29);
			Pracownik p4 = new Pracownik(20, "Baltrauk", "Dima", "20.05.1999", "goniec", 1000, 0);
			Pracownik p5 = new Pracownik(25, "Kawalczyk", "Natalka", "15.09.1968", "ksiegowy", 2500, 20);
			b.addPracownik(p1);
			b.addPracownik(p2);
			b.addPracownik(p3);
			b.addPracownik(p4);
			b.addPracownik(p5);
			menu();
			break;
		case 2: // Odczyt bazy z pliku
			System.out.println("Wprowadz imie pliku");
			String nazwaPlikuOdczyt;
			nazwaPlikuOdczyt = scan.next();
			b.odczytBazy(nazwaPlikuOdczyt);
			menu();
			break;
		case 3: // Wyswietlenie wszystkich rekordow
			b.wyswietlBaze();
			menu();
			break;
		case 4: // Wyswietlenie danych jednego pracownika
			System.out.println("Wprowadz numer peselu pracownika");
			int numer = scan.nextInt();

				if (b.poszukPoPeselu(numer) != -1)
					b.wyswietlPracownika(b.poszukPoPeselu(numer));
				else
					System.out.println("Nie ma takiego pracownika");

			menu();
			break;
		case 5: // Dopisanie nowego pracownika
			b.dodawaniePracownika();
			menu();
			break;
		case 6: // Usuniecie pracownika z bazy
			System.out.println("Wprowadz pesel pracownika");
			int pes = scan.nextInt();
			b.usunieciePracownika(pes);
			menu();
			break;
		case 7: // Aktualizowanie danych pracownika
			b.aktualizDanych();
			
			menu();
			break;
		case 8: // Zapis bazy do pliku
			System.out.println("Wprowadz nazwe pliku");
			String nazwaPlikuZapis = scan.next();
			b.zapisBazy(nazwaPlikuZapis);
			menu();
			break;
		case 9: 	//srednieZarobki
			b.obliczenieSredniaWyplate();
			menu();
			break;
		case 0:
			System.out.println("Koniec programu...");
			break;
			

		default:
			System.out.println("Zla odpowiedz, sprobuj ponownie");
			menu();
			break;
		}

	}

}
