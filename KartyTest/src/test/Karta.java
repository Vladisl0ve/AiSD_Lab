package test;

public class Karta {

	private int wartosc;
	private int kolor;
	private boolean znacznik;

	public Karta(int w, int k) {
		this.wartosc = w;
		this.kolor = k;
		this.setZnacznik(true);

	}

	public void wyswietl() {
		if (this.znacznik == false) {
			System.out.println("Karta zamknieta");
			return;
		}

		String wart = null;
		String kolor = null;

		switch (this.wartosc) {

		case 0:
			wart = "As";
			break;
		case 1:
			wart = "1";
			break;
		case 2:
			wart = "2";
			break;
		case 3:
			wart = "3";
			break;
		case 4:
			wart = "4";
			break;
		case 5:
			wart = "5";
			break;
		case 6:
			wart = "6";
			break;
		case 7:
			wart = "7";
			break;
		case 8:
			wart = "8";
			break;
		case 9:
			wart = "9";
			break;
		case 10:
			wart = "10";
			break;

		case 11:
			wart = "Walet";
			break;
		case 12:
			wart = "Dama";
			break;
		case 13:
			wart = "Krol";
			break;

		}

		switch (this.kolor) {

		case 0:
			kolor = "Kier";
			break;
		case 1:
			kolor = "Karo";
			break;
		case 2:
			kolor = "Trief";
			break;
		case 3:
			kolor = "Pik";
			break;

		}
		System.out.printf("%s, %s\n", wart, kolor);
	}

	public int getWartosc() {
		return wartosc;
	}

	public void setWartosc(int wartosc) {
		this.wartosc = wartosc;
	}

	public int getKolor() {
		return kolor;
	}

	public void setKolor(int kolor) {
		this.kolor = kolor;
	}

	public boolean getZnacznik() {
		return znacznik;
	}

	public void setZnacznik(boolean znacznik) {
		this.znacznik = znacznik;
	}

}
