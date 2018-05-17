package test;

import java.util.Random;
import java.util.Scanner;

public class Menu {

	Lista listCard = new Lista();

	public Menu() {
		utworzMenu();

	}

	public void utworzMenu() {

		Scanner scan = new Scanner(System.in);
		int index;
		boolean odp = true;
		while (odp) {
			wyswietlMenu();
			index = scan.nextInt();
			switch (index) {
			case 1:
				tworzenieListy();
				break;
			case 2:
				listCard.wyswietl();
				break;
			case 3:
				liczbaElementow();
				break;
			case 4:
				Scanner scan1 = new Scanner(System.in);
				System.out.println("Prosze podac wartosc: ");
				listCard.szukajWartosc(scan1.nextInt());
				break;
			case 5:
				Scanner scan2 = new Scanner(System.in);
				System.out.println("Prosze podac kolor: ");
				listCard.szukajKolor(scan2.nextInt());
				break;
			case 6:
				listCard.clearJednakowe();
				break;
			case 7:
				listCard.usuniecieZamknietych();
				break;
			case 0:
				odp = false;
				break;
			default: {
				System.out.println("Nieprawidlowa odpowiedz: " + index + "\n");
				break;

			}

			}
		}
	}

	private void wyswietlMenu() {
		System.out.println(
				"Wybierz opieracje:\n 1. Utworzenie listy\n 2. Wyswietlanie list\n 3. Wyswietlanie liczby elementow listy\n 4. Wyswietlanie kart o podanej wartosci\n 5. Wyswietlanie kart o podanym kolorze\n 6. Usuniecie kart jednakowych\n7. Usuniecie kart zamknietych\n 0. Koniec programu\n");

	}

	private void tworzenieListy() {
		listCard.clear();
		Random random = new Random();
		int wartosc = 1;
		int kolor;
		Karta c;

		while (true) {
			wartosc = random.nextInt(15);
			if (wartosc == 0)
				break;
			if (wartosc == 14) {
				c = new Karta(14, 2);
				c.setZnacznik(false);
				listCard.dodKoniec(c);
				continue;
			}
			kolor = random.nextInt(4);
			c = new Karta(wartosc, kolor);
			sortowanie(c);
			System.out.println("Dodalismy karte");
		}
	}

	private void sortowanie(Karta tmp) {
		if (listCard.size() == 0) {
			listCard.dodaj(tmp);
			return;
		}
		for (int i = 0; i < listCard.size(); i++) {
			if (tmp.getWartosc() < listCard.getElement(i).getValue().getWartosc()) {
				listCard.dodaj(i, tmp);
				return;
			}
			if (tmp.getWartosc() == listCard.getElement(i).getValue().getWartosc()) {
				if (tmp.getKolor() <= listCard.getElement(i).getValue().getKolor()) {
					listCard.dodaj(i, tmp);
					;
					return;
				}
			}
			if (i == listCard.size() - 1) {
				listCard.dodaj(i + 1, tmp);
				return;
			}
		}

	}

	private void liczbaElementow() {
		int zamk = 0;
		int otw = 0;
		for (int i = 0; i < listCard.size(); i++) {
			if (listCard.getElement(i).getValue().getZnacznik() == true)
				otw++;
			else
				zamk++;
		}
		System.out.println("Liczba kart zamknietych: " + zamk + "\n otwartych: " + otw + "\n");
	}

}
