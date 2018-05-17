package Sklep;

import Kolejki.Kolejka;

public class Magazyn {

	Kolejka<Klient> kol;
	String nazwa;

	public Magazyn(String nazwa) {

		kol = new Kolejka<Klient>();
		this.nazwa = nazwa;
	}

	public void addKlient(Klient tmp) {

		kol.insert(tmp);

	}

	public void removeKlient() {

		kol.remove();
	}

	public void wyswietl() {

		System.out.println("\n\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		System.out.println("___________________" + nazwa + "______________________________");

		if (kol.size() == 0) {
			System.out.println("Pusta kolejka");
			System.out.println("-----------------------------------------------------");
			return;
		}
		for (int i = 0; i < kol.size(); i++) {
			System.out.print("Klient w kolejce [" + (i + 1) + "]: ");
			kol.get(i).wyswietl();
			System.out.println("______________________________________________________");
		}
		System.out.println("---------------------------------------------------------");

	}

	public void zamKlienta(int i, Zamowienie zam) {

		kol.get(i).getZam().insert(zam);

	}

	public int liczSumy(Klient tmp) {

		int sztuki;
		int cena;
		int suma = 0;

		Zamowienie tmpZam;

		while ((tmpZam = tmp.getZam().remove()) != null) {

			cena = tmpZam.getCenaJednostkowa();
			sztuki = tmpZam.getLiczbaSztuk();
			suma += sztuki * cena;

		}

		return suma;

	}

	public void paragon() {

		System.out.println("\nParagon z magazyna " + nazwa);
		Klient tmpKlient = kol.remove();

		System.out.println("Zlecenie zrealizowane. " + tmpKlient.getImie() + " ma do zaplaty: " + liczSumy(tmpKlient) + " zl");
		System.out.println("______________________________________________________");

	}
	
	public void paragonMag() {
		
		System.out.println("Magazyn " + this.nazwa + " ma w sumie: " + liczSumyMagazyn() + " zl");
		
	}

	public int liczSumyMagazyn() {

		int suma = 0;
		Klient tmpKlient = null;
		Zamowienie tmpZam;

		for (int i = 0; i < kol.size(); i++) {

			tmpKlient = kol.get(i);
			int t = tmpKlient.getZam().size();

			for (int j = 0; j < t; j++) {

				tmpZam = tmpKlient.getZam().get(j);
				suma += tmpZam.getLiczbaSztuk() * tmpZam.getCenaJednostkowa();

			}

		}

		return suma;

	}

}
