package Uczelnia;

import java.io.Serializable;

public class Pracownik implements Serializable {

	String nazwisko;
	String imie;
	long pesel;
	int staz;
	double pensja;

	public Pracownik(String imie, String nazwisko, long pesel, int staz, double pensja) {

		this.nazwisko = nazwisko;
		this.imie = imie;
		this.pesel = pesel;
		this.staz = staz;
		this.pensja = pensja;
	}

	public Pracownik() {

		this.imie = "Marcin";
		this.nazwisko = "Tabakoff";
		this.pesel = 0001234214;
		this.staz = 15;
		this.pensja = 3565.5;

	}

	public String toString() {

		String y = String.format("%s, %s, %d, %d, %.2f", getImie(), getNazwisko(), getPesel(), getStaz(),
				getPensja());

		return y;
	}

	public void wyswetl(Pracownik[] test) {
		
		System.out.println("________________________________________________________________");		
		System.out.printf("%-16s%-16s%-14s%-6s%-11s%n", "|Imie", "|Nazwisko", "|Pesel", "|Staz ", "|Pensja    |");
		System.out.println("----------------------------------------------------------------");

		for (int i = 0; i < test.length; i++) {

			System.out.printf("|%-15s|%-15s|%-13d|%-5d|%-7.2f zl|%n", test[i].getImie(), test[i].getNazwisko(), test[i].getPesel(), test[i].getStaz(), test[i].getPensja());

		}
		System.out.println("________________________________________________________________");		


	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public long getPesel() {
		return pesel;
	}

	public void setPesel(long pesel) {
		this.pesel = pesel;
	}

	public int getStaz() {
		return staz;
	}

	public void setStaz(int staz) {
		this.staz = staz;
	}

	public double getPensja() {
		return pensja;
	}

	public void setPensja(double pensja) {
		this.pensja = pensja;
	}

}
