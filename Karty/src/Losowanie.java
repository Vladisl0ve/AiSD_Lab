import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Losowanie implements Iterator<Karty> {

	private String odpString;
	private int pos = 0;

	ArrayList<Karty> arrKarty = new ArrayList<>();
	Comparator<Karty> comp = new KartyWartoscComparator().thenComparing(new KartyKolorComparator());

	public void dod() {
		arrKarty.add(tmp1);
	}

	Karty tmp1 = new Karty(1, 0);

	public Karty utworzenie() {

		int wartosc = (int) (Math.random() * 14);
		int kolor = (int) (Math.random() * 4);

		if (wartosc != 0) {
			return new Karty(wartosc, kolor);
		} else
			return null;

	}

	public void dodawanie() {

		Karty tmp = utworzenie();

		if (tmp != null) {

			arrKarty.add(tmp);
			System.out.println("Dodalismy karte");

			dodawanie();
			sortowanie();
		
		} else
			System.out.println("Koniec dodawania");

	}

	public void remove() {

		for (int i = 0; i < arrKarty.size(); i++) {

			for (int j = 0; j < arrKarty.size(); j++) {

				if (arrKarty.get(i).getWartosc() == arrKarty.get(j).getWartosc()
						&& arrKarty.get(i).getKolor() == arrKarty.get(j).getKolor() && i != j)
					arrKarty.remove(j);

			}

		}

	}

	public void wydruk() {

		for (Karty s : arrKarty) {

			System.out.println(s);

		}

	}

	public void wydrukFor() {

		for (int i = 0; i < arrKarty.size(); i++) {

			System.out.println(arrKarty.get(i));
		}

	}

	public void wydrukWhile() {

		int i = 0;

		while (i < arrKarty.size()) {
			System.out.println(arrKarty.get(i));
			i++;
		}

	}

	public void wydrukIterator() {

		while (hasNext())
			System.out.println(next());

	}

	public void liczbaElementow() {

		System.out.println("Liczba elementow: " + arrKarty.size());

	}

	public void sortowanie() {

		
		arrKarty.sort(comp);

	}

	

	public void wyswetlWartosc() {

		Scanner sc = new Scanner(System.in);

		System.out.print("Jaka wartosc chcesz wyswetlic?: ");

		odpString = sc.next();

		int i = wyborWart();
		int x = 0;

		if (i != -1) {

			for (Karty w : arrKarty) {

				if (w.getWartosc() == wyborWart()) {

					System.out.println(w.getOpis());
					x += 1;
				}

			}
			if (x == 0)
				System.out.println("Nie ma zadnej karty o takiej wartosci");
		} else
			System.out.println("Nie ma takiej wartosci");

	}

	public void wyswetlKolor() {

		Scanner sc = new Scanner(System.in);

		System.out.print("Jaki kolor chcesz wyswetlic?: ");

		odpString = sc.next();
		int i = wyborKolor();
		int x = 0;

		if (i != -1) {

			for (Karty w : arrKarty) {

				if (w.getKolor() == wyborKolor()) {

					System.out.println(w.getOpis());
					x += 1;
				}
			}
			if (x == 0)
				System.out.println("Nie ma zadnej karty takiego koloru");

		} else
			System.out.println("Nie ma takiego koloru");

	}

	public int wyborWart() {

		odpString = odpString.toLowerCase();

		switch (odpString) {

		case "a":
			return 1;
		case "as":
			return 1;

		case "walet":
			return 11;

		case "w":
			return 11;

		case "d":
			return 12;

		case "dama":
			return 12;

		case "k":
			return 13;

		case "krol":
			return 13;

		case "2":
			return 2;

		case "3":
			return 3;

		case "4":
			return 4;

		case "5":
			return 5;

		case "6":
			return 6;

		case "7":
			return 7;

		case "8":
			return 8;

		case "9":
			return 9;

		case "10":
			return 10;

		default:
			return -1;

		}
	}

	public int wyborKolor() {

		odpString = odpString.toLowerCase();

		switch (odpString) {

		case "kier":
			return 0;

		case "karo":
			return 1;

		case "trefl":
			return 2;

		case "pik":
			return 3;

		default:
			return -1;

		}

	}

	public void menu() {

		System.out.println(
				"Menu:\n1. Utworzenie listy\n2. Wyswietlanie listy\n3. Wyswietlanie liczby elementow listy\n4. Wyswietlanie kart o podanej wartosci\n5. Wyswietlanie kart o podanym kolorze\n6. Wyrzucic podobne karty\n0. Koniec programu");

		Scanner sc = new Scanner(System.in);

		int odpInt = sc.nextInt();

		switch (odpInt) {

		case 1:
			dodawanie();
			menu();
			break;
		case 2:
			wydruk();
			menu();
			break;
		case 3:
			liczbaElementow();
			menu();
			break;
		case 4:
			wyswetlWartosc();
			menu();
			break;
		case 5:
			wyswetlKolor();
			menu();
			break;
		case 6:
			remove();
			menu();
			break;
		case 7:
			dod();
			dod();
			dod();
			menu();
			break;
	
		case 0:
			System.out.println("Koniec programu...");
			break;
		default:
			System.out.println("Nieprawidlowa odpowiedz, sprobuj ponownie");
			menu();
			break;

		}

	}

	@Override
	public boolean hasNext() {
		return pos < arrKarty.size();
	}

	@Override
	public Karty next() throws NoSuchElementException {

		if (hasNext())
			return arrKarty.get(pos++);
		else
			throw new NoSuchElementException();

	}

}
