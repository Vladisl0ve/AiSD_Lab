package Sklep;

public class Main {

	public static void magazyn() {
		
		
		//Magazyn1 

		Klient k1 = new Klient("Vlad1");
		Klient k2 = new Klient("Vlad2");
		Klient k3 = new Klient("Vlad3");
		Klient k4 = new Klient("Vlad4");
		Klient k5 = new Klient("Vlad5");
		Klient k6 = new Klient("Vlad6");

		Magazyn mag = new Magazyn("X-com");

		mag.addKlient(k1);
		mag.addKlient(k2);
		mag.addKlient(k3);
		mag.addKlient(k4);
		mag.addKlient(k5);
		mag.addKlient(k6);

		Zamowienie zam;
		zam = new Zamowienie("Laptop", 1, 3000);
		mag.zamKlienta(0, zam);
		zam = new Zamowienie("Xerox", 1, 800);
		mag.zamKlienta(0, zam);
		zam = new Zamowienie("Telefon", 2, 100);
		mag.zamKlienta(1, zam);
		zam = new Zamowienie("PC", 1, 4500);
		mag.zamKlienta(2, zam);
		zam = new Zamowienie("Iphone 5", 1, 2500);
		mag.zamKlienta(3, zam);
		zam = new Zamowienie("Xiaomi", 1, 1500);
		mag.zamKlienta(4, zam);
		

		mag.wyswietl();
		mag.paragon();
		
		
		
		
		//Magazyn 2
		
	
		Magazyn mag2 = new Magazyn("Saturn");
		mag2.addKlient(k1);
		mag2.addKlient(k2);
		mag2.addKlient(k3);
		mag2.addKlient(k4);
		
		
		
		zam = new Zamowienie("Tel", 1, 250);
		mag2.zamKlienta(0, zam);
		zam = new Zamowienie("Tel2", 2, 1000);
		mag2.zamKlienta(0, zam);
		zam = new Zamowienie("Tel3", 1, 600);
		mag2.zamKlienta(1, zam);
		
		//Firma 
		
		Firma firm = new Firma("Lap&Co");
		firm.addMagazyn(mag);
		firm.addMagazyn(mag2);
		
		firm.wyswietlFirm();
		firm.sumaParagonow();
		

	}

	public static void main(String[] args) {

		Main.magazyn();

	}

}
