package Sklep;

public class Zamowienie {

	String nazwaTowaru;
	int liczbaSztuk;
	int cenaJednostkowa;

	public Zamowienie(String nazwaTowaru, int liczbaSztuk, int cenaJednostkowa) {
		super();
		this.nazwaTowaru = nazwaTowaru;
		this.liczbaSztuk = liczbaSztuk;
		this.cenaJednostkowa = cenaJednostkowa;

	}

	public String getNazwaTowaru() {
		return nazwaTowaru;
	}

	public void setNazwaTowaru(String nazwaTowaru) {
		this.nazwaTowaru = nazwaTowaru;
	}

	public int getLiczbaSztuk() {
		return liczbaSztuk;
	}

	public void setLiczbaSztuk(int liczbaSztuk) {
		this.liczbaSztuk = liczbaSztuk;
	}

	public int getCenaJednostkowa() {
		return cenaJednostkowa;
	}

	public void setCenaJednostkowa(int cenaJednostkowa) {
		this.cenaJednostkowa = cenaJednostkowa;
	}
	
	public void wyswietl() {
		
		System.out.println("Nazwa Towaru: " + nazwaTowaru + ", Liczba:" 
				+ liczbaSztuk + ", Cena:" 
				+ cenaJednostkowa + " zl");
		
	}

}