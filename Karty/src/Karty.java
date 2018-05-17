
public class Karty {

	int wartosc;
	int kolor;
	String opis;

	public Karty(int wartosc, int kolor) {

		this.wartosc = wartosc;
		this.kolor = kolor;
		opis = wart[wartosc] + " " + kol[kolor];

	}

	String[] wart = { " ", "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "W", "D", "K" };
	String[] kol = { "Kier", "Karo", "Trefl", "Pik" };

	public static void main(String[] args) {

		Losowanie los = new Losowanie();

		los.menu();
		System.out.println(
				"______________________________________________________________________________________\n Wydruk wedlug petli For: ");
		los.wydrukFor();
		System.out.println(
				"______________________________________________________________________________________\n Wydruk wedlug petli While");
		los.wydrukWhile();
		System.out.println(
				"______________________________________________________________________________________\n Wydruk wedlug iteratora");
		los.wydrukIterator();

	}

	public String toString() {

		return opis;

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

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

}
