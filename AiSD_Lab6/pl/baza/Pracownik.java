package pl.baza;

import java.io.Serializable;

public class Pracownik implements Serializable {

	int pesel;
	String nazwisko;
	String imie;
	String dataUrodzenia;
	String stanowisko;
	int pensja;
	transient int staz;
	transient int premia;

	public Pracownik(int pesel, String nazwisko, String imie, String dataUrodzenia, String stanowisko, int pensja,
			int staz) {
		this.pesel = pesel;
		this.nazwisko = nazwisko;
		this.imie = imie;
		this.dataUrodzenia = dataUrodzenia;
		this.stanowisko = stanowisko;
		this.pensja = pensja;
		this.staz = staz;
		premia = liczeniePremii();
	}

	public int liczeniePremii() {

		if (staz >= 20)
			return premia = pensja * 20 / 100;

		if (staz < 20 && staz >= 10)
			return premia = pensja * 10 / 100;
		else 
			return premia = 0;

	}
	
	public void wyswietlPracownik() {

		System.out.printf("%-7d|%-10s|%-10s|%-15s|%-15s|%-10d|%-10d|%-10d|\n", pesel, nazwisko, imie, dataUrodzenia,
				stanowisko, pensja, staz, premia);
	}

	public int getPesel() {
		return pesel;
	}

	public void setPesel(int pesel) {
		this.pesel = pesel;
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

	public String getDataUrodzenia() {
		return dataUrodzenia;
	}

	public void setDataUrodzenia(String dataUrodzenia) {
		this.dataUrodzenia = dataUrodzenia;
	}

	public String getStanowisko() {
		return stanowisko;
	}

	public void setStanowisko(String stanowisko) {
		this.stanowisko = stanowisko;
	}

	public int getPensja() {
		return pensja;
	}

	public void setPensja(int pensja) {
		this.pensja = pensja;
	}

	public int getStaz() {
		return staz;
	}

	public void setStaz(int staz) {
		this.staz = staz;
	}

	public int getPremia() {
		return premia;
	}

	public void setPremia(int premia) {
		this.premia = premia;
	}

}
