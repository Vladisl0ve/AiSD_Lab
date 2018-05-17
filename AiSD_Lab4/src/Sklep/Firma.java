package Sklep;

import Kolejki.Kolejka;

public class Firma {

	public String nazwa;
	public Kolejka<Magazyn> kol;

	public Firma(String nazwa) {

		this.nazwa = nazwa;
		kol = new Kolejka<Magazyn>();
	}

	public Kolejka<Magazyn> getKol() {

		return kol;

	}

	public void addMagazyn(Magazyn tmp) {

		kol.insert(tmp);

	}

	public void removeMagazyn() {

		kol.remove();

	}

	public void wyswietlFirm() {

		System.out.println("\nXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		System.out.println("______________FIRMA: " + nazwa + "________________");

		if (kol.size() == 0) {

			System.out.println("Pusta kolejka");
			System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
			return;
		}

		for (int i = 0; i < kol.size(); i++) {

			System.out.println("______________________________________________________");
			System.out.print("MAGAZYN [" + (i + 1) + "]: ");
			kol.get(i).wyswietl();

		}

		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

	}

	public void sumaParagonow() {

		int suma = 0;
		for (int i = 0; i < kol.size(); i++) {

			suma += kol.get(i).liczSumyMagazyn();

		}

		System.out.println("Firma " + this.nazwa + "ma w sumie: " + suma + " zl");

	}

}
