package Sklep;

import Kolejki.Kolejka;

public class Klient {

	String imie;
	Kolejka<Zamowienie> zam;

	public Klient(String imie) {

		this.imie = imie;
		zam = new Kolejka<Zamowienie>();

	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public Kolejka<Zamowienie> getZam() {
		return zam;
	}

	public void setZam(Kolejka<Zamowienie> zam) {
		this.zam = zam;
	}

	public void wyswietl() {

		System.out.println(imie + "\nZamowienie: ");
		int size = zam.size();

		if (size == 0) {
			System.out.println("Klient jeszcze nie ma zamowien");
			return;
		}
		for (int i = 0; i < size; i++) {

			System.out.print("[" + (i + 1) + "]: ");
			zam.get(i).wyswietl();

		}

	}

}
