package pl.baza;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

import pl.listaDwukierunkowa.Kolejka;

public class BazaDanych implements Serializable {

	Kolejka<Pracownik> kol;
	Kolejka<Pracownik> kolSer;
	Scanner scan = new Scanner(System.in);

	public BazaDanych() {

		kol = new Kolejka<Pracownik>();

	}

	public void obliczenieSredniaWyplate() {

		int srednia = 0;
		int sr = 0;

		for (int i = 0; i < kol.size(); i++) {

			srednia = srednia + kol.get(i).getPensja() + kol.get(i).getPremia();
			sr++;

		}
		srednia = srednia / sr;

		System.out.println("Srednia wyplata w firmie jest: " + srednia);

		int zarobkiNaOsobe;
		int ilosc = 0;

		for (int i = 0; i < kol.size(); i++) {
			zarobkiNaOsobe = kol.get(i).getPensja() + kol.get(i).getPremia();

			if (zarobkiNaOsobe < srednia)
				ilosc++;

		}

		System.out.println("Ilosc osob, zarabiajace ponizej sredniej: " + ilosc);

	}

	public void usunieciePracownika(int pesel) {

		int index = poszukPoPeselu(pesel);

		if (index != -1) {
			kol.remove(index);
			System.out.println("Pracownik o podanym peselu jest usuniety");
		} else
			System.out.println("Nie ma takiego pracownika");

	}

	public void aktualPremii(int index) {

		int premia = kol.get(index).getPensja();

		if (kol.get(index).getStaz() >= 20)
			kol.get(index).setPremia(premia * 20 / 100);

		if (kol.get(index).getStaz() < 20 && kol.get(index).getStaz() >= 10)
			kol.get(index).setPremia(premia * 10 / 100);

	}

	public void aktualizDanych() {
		System.out.println("Wprowadz pesel pracownika");
		int pesAkt = scan.nextInt();
		int index = poszukPoPeselu(pesAkt);
		System.out.println("Co chcesz zmienic?");
		System.out.println("1.PESEL\n2.Nazwisko\n3.Imie\n4.Date Urodzenia\n5.Stanowisko\n6.Pensje\n7.Staz");
		int wybor = scan.nextInt();
		switch (wybor) {
		case 1:
			System.out.println("Wprowadz nowy pesel");
			int peselNowy = scan.nextInt();
			kol.get(index).setPesel(peselNowy);
			break;
		case 2:
			System.out.println("Wprowadz nowe nazwisko");
			String nazwiskoNowe = scan.next();
			kol.get(index).setNazwisko(nazwiskoNowe);
			break;
		case 3:
			System.out.println("Wprowadz nowe imie");
			String imieNowe = scan.next();
			kol.get(index).setImie(imieNowe);
			break;
		case 4:
			System.out.println("Wprowadz nowa date urodzenia");
			String dataNowa = scan.next();
			kol.get(index).setDataUrodzenia(dataNowa);

			break;
		case 5:
			System.out.println("Wprowadz nowe stanowisko");
			String stanNowe = scan.next();
			kol.get(index).setStanowisko(stanNowe);
			break;
		case 6:
			System.out.println("Wprowadz nowa pensje");
			int pensjaNowa = scan.nextInt();
			kol.get(index).setPensja(pensjaNowa);
			aktualPremii(index);
			break;
		case 7:
			System.out.println("Wprowadz nowy staz");
			int stazNowy = scan.nextInt();
			kol.get(index).setStaz(stazNowy);
			aktualPremii(index);
			break;

		default:
			System.out.println("Zla odpowiedz, sprobuj ponownie");
			aktualizDanych();
			break;
		}
	}

	public void dodawaniePracownika() {

		Pracownik p = utworzPracownika();

		if (kol.isEmpty() == false) {
			for (int i = 1; i < kol.size(); i++) {

				if (p.getPesel() < 0) {
					System.out.println("Nieprwaidlowo wprowadziles pesel");
					return;
				}

				if (kol.get(0).getPesel() > p.getPesel()) {
					kol.add(0, p);
					return;
				}
				if (kol.get(i).getPesel() < p.getPesel() && kol.size() != i + 1
						&& kol.get(i + 1).getPesel() > p.getPesel()) {
					kol.add(i + 1, p);
					return;
				}
				if (kol.get(i).getPesel() < p.getPesel() && kol.size() == i + 1) {
					kol.add(p);
					return;
				}
				///////////////////

				// tut uje tancuju ja. Prowerka na esli wse rawny.
				if (kol.get(0).getPesel() == p.getPesel()) {
					kol.add(0, p);
					return;
				}
				if (kol.get(i).getPesel() == p.getPesel() && kol.size() != i + 1
						&& kol.get(i + 1).getPesel() == p.getPesel()) {
					kol.add(i + 1, p);
					return;
				}
				if (kol.get(i).getPesel() == p.getPesel() && kol.size() == i + 1) {
					kol.add(p);
					return;
				}
				/////////////////////

				// 4to-by w prawilnoe mesto postawit rawnye 4asti dobawil es4o dwe prowerki

				// eto 1-ya

				if (kol.get(i).getPesel() < p.getPesel() && kol.size() != i + 1
						&& kol.get(i + 1).getPesel() == p.getPesel()) {
					kol.add(i + 1, p);
					return;
				}
				////////////////////

				// eto 2-ya
				if (kol.get(i).getPesel() == p.getPesel() && kol.size() != i + 1
						&& kol.get(i + 1).getPesel() > p.getPesel()) {
					kol.add(i, p);
					return;
				}

			}
		} else {
			kol.add(p);

			// ya spat'
		}

	}

	public Pracownik utworzPracownika() {

		System.out.println("Wprowadz pesel");
		int pesel = scan.nextInt();
		System.out.println("Wprowadz nazwisko");
		String nazwisko = scan.next();
		System.out.println("Wprowadz imie");
		String imie = scan.next();
		System.out.println("Wprowadz date urodzenia");
		String data = scan.next();
		System.out.println("Wprowadz stanowisko");
		String stan = scan.next();
		System.out.println("Wprowadz pensje");
		int pensja = scan.nextInt();
		System.out.println("Wprowadz staz");
		int staz = scan.nextInt();

		Pracownik tmp = new Pracownik(pesel, nazwisko, imie, data, stan, pensja, staz);
		return tmp;
	}

	public void addPracownik(Pracownik tmp) {
		kol.add(tmp);
	}

	public void wyswietlPracownika(int index) {

		kol.get(index).wyswietlPracownik();

	}

	public int poszukPoPeselu(int pesel) {

		int exit = -1;

		for (int i = 0; i < kol.size(); i++) {

			if (pesel == kol.get(i).getPesel()) {

				exit = i;
			}
		}
		return exit;

	}

	public void wyswietlBaze() {

		System.out.println("                                      " + "BAZA DANYCH"
				+ "                                           ");

		if (kol.size() == 0) {
			System.out.println("Baza danych jest pusta");
			return;
		}

		System.out.println(
				"______________________________________________________________________________________________");

		System.out.printf("%-7s|%-10s|%-10s|%-15s|%-15s|%-10s|%-10s|%-10s|\n", "PESEL", "NAZWISKO", "IMIE",
				"DATA URODZENIA", "STANOWISKO", "PENSJA", "STAZ", "PREMIA");
		System.out.println(
				"-------|----------|----------|---------------|---------------|----------|----------|----------|");

		for (int i = 0; i < kol.size(); i++) {

			kol.get(i).wyswietlPracownik();
			System.out.println(
					"_______|__________|__________|_______________|_______________|__________|__________|__________|");
		}

	}

	public void wyswietlKolejke(Kolejka<Pracownik> tmp) {

		int index = 0;

		if (tmp.get(0) == null) {
			System.out.println("Kolejka jest pusta");
			return;
		}

		while (tmp.get(index) != null) {
			System.out.println(tmp.get(index));
			index++;

		}

	}

	public void removePracownik(Pracownik tmp) {
		kol.remove(tmp);
	}

	public void utworzBaze() {
		kol.clear();
	}

	public void zapisBazy(String nazwaPliku) {

		nazwaPliku = nazwaPliku + ".ser";
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nazwaPliku))) {

			for (int i = 0; i < kol.size(); i++) {

				oos.writeObject(kol.get(i));

			}

		} catch (Exception ex) {

			System.out.println(ex.getMessage());
		}

	}

	public void odczytBazy(String nazwaPliku) {

		nazwaPliku = nazwaPliku + ".ser";

		Pracownik odczytanyPracownik;

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nazwaPliku))) {

			System.out.println("\n " + "                          ODCZYTANA BAZA Z PLIKU" + " ");
			System.out.println(
					"______________________________________________________________________________________________");
			System.out.printf("%-7s|%-10s|%-10s|%-15s|%-15s|%-10s|%-10s|%-10s|\n", "PESEL", "NAZWISKO", "IMIE",
					"DATA URODZENIA", "STANOWISKO", "PENSJA", "STAZ", "PREMIA");
			System.out.println(
					"-------|----------|----------|---------------|---------------|----------|----------|----------|");

			while (true) {

				odczytanyPracownik = (Pracownik) ois.readObject();
				odczytanyPracownik.wyswietlPracownik();
				System.out.println(
						"_______|__________|__________|_______________|_______________|__________|__________|__________|");
			}

		} catch (Exception ex) {

		}

	}

	public Kolejka<Pracownik> getKol() {
		return kol;
	}

	public void setKol(Kolejka<Pracownik> kol) {
		this.kol = kol;
	}

}
