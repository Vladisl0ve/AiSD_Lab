package pl.code;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import pl.sort.Shell;

public class Main {

	public void sortowanie5k() throws IOException {

		System.out.println("_________Wyniki dla 5k elementow_______");

		PobieranieLiczb Fl = new PobieranieLiczb();
		Shell shell = new Shell();

		int arr5k[] = Fl.dane("5k.txt", 5000);

		ArrayList<Long> results = new ArrayList<>();

		// wersja 1

		long startTimeA1 = System.currentTimeMillis();
		shell.sortShellaA(arr5k, 1);
		long timeA1 = System.currentTimeMillis() - startTimeA1;
		results.add(timeA1);

		long startTimeB1 = System.currentTimeMillis();
		shell.sortShellaB(arr5k, 1);
		long timeB1 = System.currentTimeMillis() - startTimeB1;
		results.add(timeB1);

		long startTimeC1 = System.currentTimeMillis();
		shell.sortShellaC(arr5k, 1);
		long timeC1 = System.currentTimeMillis() - startTimeC1;
		results.add(timeC1);

		long startTimeD1 = System.currentTimeMillis();
		shell.sortShellaD(arr5k, 1);
		long timeD1 = System.currentTimeMillis() - startTimeD1;
		results.add(timeD1);

		// wersja 2

		long startTimeA2 = System.currentTimeMillis();
		shell.sortShellaA(arr5k, 2);
		long timeA2 = System.currentTimeMillis() - startTimeA2;
		results.add(timeA2);

		long startTimeB2 = System.currentTimeMillis();
		shell.sortShellaB(arr5k, 2);
		long timeB2 = System.currentTimeMillis() - startTimeB2;
		results.add(timeB2);

		long startTimeC2 = System.currentTimeMillis();
		shell.sortShellaC(arr5k, 2);
		long timeC2 = System.currentTimeMillis() - startTimeC2;
		results.add(timeC2);

		long startTimeD2 = System.currentTimeMillis();
		shell.sortShellaD(arr5k, 2);
		long timeD2 = System.currentTimeMillis() - startTimeD2;
		results.add(timeD2);

		// wersja 3

		long startTimeA3 = System.currentTimeMillis();
		shell.sortShellaA(arr5k, 3);
		long timeA3 = System.currentTimeMillis() - startTimeA3;
		results.add(timeA3);

		long startTimeB3 = System.currentTimeMillis();
		shell.sortShellaB(arr5k, 3);
		long timeB3 = System.currentTimeMillis() - startTimeB3;
		results.add(timeB3);

		long startTimeC3 = System.currentTimeMillis();
		shell.sortShellaC(arr5k, 3);
		long timeC3 = System.currentTimeMillis() - startTimeC3;
		results.add(timeC3);

		long startTimeD3 = System.currentTimeMillis();
		shell.sortShellaD(arr5k, 3);
		long timeD3 = System.currentTimeMillis() - startTimeD3;
		results.add(timeD3);

		System.out.printf("%-5s|%-10s|%-10s|%-10s|", " ", "Wersja 1", "Wersja 2", "Wersja 3");
		System.out.println("\n-----|----------|----------|----------|");
		System.out.printf("%-5s|%10d|%10d|%10d|", "A", timeA1, timeA2, timeA3);
		System.out.println("\n_____|__________|__________|__________|");
		System.out.printf("%-5s|%10d|%10d|%10d|", "B", timeB1, timeB2, timeB3);
		System.out.println("\n_____|__________|__________|__________|");
		System.out.printf("%-5s|%10d|%10d|%10d|", "C", timeC1, timeC2, timeC3);
		System.out.println("\n_____|__________|__________|__________|");
		System.out.printf("%-5s|%10d|%10d|%10d|", "D", timeD1, timeD2, timeD3);
		System.out.println("\n_____|__________|__________|__________|");

		System.out.println("Najlepszy wynik to " + Collections.min(results));
		System.out.println("Najgorszy wynik to " + Collections.max(results));
		System.out.println("\n\n");

	}

	public void sortowanie10k() throws IOException {
		System.out.println("_________Wyniki dla 10k elementow_______");
		PobieranieLiczb Fl = new PobieranieLiczb();
		Shell shell = new Shell();

		int arr10k[] = Fl.dane("10k.txt", 10000);

		ArrayList<Long> results = new ArrayList<>();

		// wersja 1

		long startTimeA1 = System.currentTimeMillis();
		shell.sortShellaA(arr10k, 1);
		long timeA1 = System.currentTimeMillis() - startTimeA1;
		results.add(timeA1);

		long startTimeB1 = System.currentTimeMillis();
		shell.sortShellaB(arr10k, 1);
		long timeB1 = System.currentTimeMillis() - startTimeB1;
		results.add(timeB1);

		long startTimeC1 = System.currentTimeMillis();
		shell.sortShellaC(arr10k, 1);
		long timeC1 = System.currentTimeMillis() - startTimeC1;
		results.add(timeC1);

		long startTimeD1 = System.currentTimeMillis();
		shell.sortShellaD(arr10k, 1);
		long timeD1 = System.currentTimeMillis() - startTimeD1;
		results.add(timeD1);

		// wersja 2

		long startTimeA2 = System.currentTimeMillis();
		shell.sortShellaA(arr10k, 2);
		long timeA2 = System.currentTimeMillis() - startTimeA2;
		results.add(timeA2);

		long startTimeB2 = System.currentTimeMillis();
		shell.sortShellaB(arr10k, 2);
		long timeB2 = System.currentTimeMillis() - startTimeB2;
		results.add(timeB2);

		long startTimeC2 = System.currentTimeMillis();
		shell.sortShellaC(arr10k, 2);
		long timeC2 = System.currentTimeMillis() - startTimeC2;
		results.add(timeC2);

		long startTimeD2 = System.currentTimeMillis();
		shell.sortShellaD(arr10k, 2);
		long timeD2 = System.currentTimeMillis() - startTimeD2;
		results.add(timeD2);

		// wersja 3

		long startTimeA3 = System.currentTimeMillis();
		shell.sortShellaA(arr10k, 3);
		long timeA3 = System.currentTimeMillis() - startTimeA3;
		results.add(timeA3);

		long startTimeB3 = System.currentTimeMillis();
		shell.sortShellaB(arr10k, 3);
		long timeB3 = System.currentTimeMillis() - startTimeB3;
		results.add(timeB3);

		long startTimeC3 = System.currentTimeMillis();
		shell.sortShellaC(arr10k, 3);
		long timeC3 = System.currentTimeMillis() - startTimeC3;
		results.add(timeC3);

		long startTimeD3 = System.currentTimeMillis();
		shell.sortShellaD(arr10k, 3);
		long timeD3 = System.currentTimeMillis() - startTimeD3;
		results.add(timeD3);

		System.out.printf("%-5s|%-10s|%-10s|%-10s|", " ", "Wersja 1", "Wersja 2", "Wersja 3");
		System.out.println("\n-----|----------|----------|----------|");
		System.out.printf("%-5s|%10d|%10d|%10d|", "A", timeA1, timeA2, timeA3);
		System.out.println("\n_____|__________|__________|__________|");
		System.out.printf("%-5s|%10d|%10d|%10d|", "B", timeB1, timeB2, timeB3);
		System.out.println("\n_____|__________|__________|__________|");
		System.out.printf("%-5s|%10d|%10d|%10d|", "C", timeC1, timeC2, timeC3);
		System.out.println("\n_____|__________|__________|__________|");
		System.out.printf("%-5s|%10d|%10d|%10d|", "D", timeD1, timeD2, timeD3);
		System.out.println("\n_____|__________|__________|__________|");

		System.out.println("Najlepszy wynik to " + Collections.min(results));
		System.out.println("Najgorszy wynik to " + Collections.max(results));
		System.out.println("\n\n");
	}

	public void sortowanie50k() throws IOException {
		System.out.println("_________Wyniki dla 50k elementow_______");
		PobieranieLiczb Fl = new PobieranieLiczb();
		Shell shell = new Shell();

		int arr50k[] = Fl.dane("50k.txt", 50000);

		ArrayList<Long> results = new ArrayList<>();

		// wersja 1

		long startTimeA1 = System.currentTimeMillis();
		shell.sortShellaA(arr50k, 1);
		long timeA1 = System.currentTimeMillis() - startTimeA1;
		results.add(timeA1);

		long startTimeB1 = System.currentTimeMillis();
		shell.sortShellaB(arr50k, 1);
		long timeB1 = System.currentTimeMillis() - startTimeB1;
		results.add(timeB1);

		long startTimeC1 = System.currentTimeMillis();
		shell.sortShellaC(arr50k, 1);
		long timeC1 = System.currentTimeMillis() - startTimeC1;
		results.add(timeC1);

		long startTimeD1 = System.currentTimeMillis();
		shell.sortShellaD(arr50k, 1);
		long timeD1 = System.currentTimeMillis() - startTimeD1;
		results.add(timeD1);

		// wersja 2

		long startTimeA2 = System.currentTimeMillis();
		shell.sortShellaA(arr50k, 2);
		long timeA2 = System.currentTimeMillis() - startTimeA2;
		results.add(timeA2);

		long startTimeB2 = System.currentTimeMillis();
		shell.sortShellaB(arr50k, 2);
		long timeB2 = System.currentTimeMillis() - startTimeB2;
		results.add(timeB2);

		long startTimeC2 = System.currentTimeMillis();
		shell.sortShellaC(arr50k, 2);
		long timeC2 = System.currentTimeMillis() - startTimeC2;
		results.add(timeC2);

		long startTimeD2 = System.currentTimeMillis();
		shell.sortShellaD(arr50k, 2);
		long timeD2 = System.currentTimeMillis() - startTimeD2;
		results.add(timeD2);

		// wersja 3

		long startTimeA3 = System.currentTimeMillis();
		shell.sortShellaA(arr50k, 3);
		long timeA3 = System.currentTimeMillis() - startTimeA3;
		results.add(timeA3);

		long startTimeB3 = System.currentTimeMillis();
		shell.sortShellaB(arr50k, 3);
		long timeB3 = System.currentTimeMillis() - startTimeB3;
		results.add(timeB3);

		long startTimeC3 = System.currentTimeMillis();
		shell.sortShellaC(arr50k, 3);
		long timeC3 = System.currentTimeMillis() - startTimeC3;
		results.add(timeC3);

		long startTimeD3 = System.currentTimeMillis();
		shell.sortShellaD(arr50k, 3);
		long timeD3 = System.currentTimeMillis() - startTimeD3;
		results.add(timeD3);

		System.out.printf("%-5s|%-10s|%-10s|%-10s|", " ", "Wersja 1", "Wersja 2", "Wersja 3");
		System.out.println("\n-----|----------|----------|----------|");
		System.out.printf("%-5s|%10d|%10d|%10d|", "A", timeA1, timeA2, timeA3);
		System.out.println("\n_____|__________|__________|__________|");
		System.out.printf("%-5s|%10d|%10d|%10d|", "B", timeB1, timeB2, timeB3);
		System.out.println("\n_____|__________|__________|__________|");
		System.out.printf("%-5s|%10d|%10d|%10d|", "C", timeC1, timeC2, timeC3);
		System.out.println("\n_____|__________|__________|__________|");
		System.out.printf("%-5s|%10d|%10d|%10d|", "D", timeD1, timeD2, timeD3);
		System.out.println("\n_____|__________|__________|__________|");

		System.out.println("Najlepszy wynik to " + Collections.min(results));
		System.out.println("Najgorszy wynik to " + Collections.max(results));
		System.out.println("\n\n");

	}

	public void sortowanie100k() throws IOException {
		System.out.println("_________Wyniki dla 100k elementow_______");
		PobieranieLiczb Fl = new PobieranieLiczb();
		Shell shell = new Shell();

		int arr100k[] = Fl.dane("100k.txt", 100000);

		ArrayList<Long> results = new ArrayList<>();

		// wersja 1

		long startTimeA1 = System.currentTimeMillis();
		shell.sortShellaA(arr100k, 1);
		long timeA1 = System.currentTimeMillis() - startTimeA1;
		results.add(timeA1);

		long startTimeB1 = System.currentTimeMillis();
		shell.sortShellaB(arr100k, 1);
		long timeB1 = System.currentTimeMillis() - startTimeB1;
		results.add(timeB1);

		long startTimeC1 = System.currentTimeMillis();
		shell.sortShellaC(arr100k, 1);
		long timeC1 = System.currentTimeMillis() - startTimeC1;
		results.add(timeC1);

		long startTimeD1 = System.currentTimeMillis();
		shell.sortShellaD(arr100k, 1);
		long timeD1 = System.currentTimeMillis() - startTimeD1;
		results.add(timeD1);

		// wersja 2

		long startTimeA2 = System.currentTimeMillis();
		shell.sortShellaA(arr100k, 2);
		long timeA2 = System.currentTimeMillis() - startTimeA2;
		results.add(timeA2);

		long startTimeB2 = System.currentTimeMillis();
		shell.sortShellaB(arr100k, 2);
		long timeB2 = System.currentTimeMillis() - startTimeB2;
		results.add(timeB2);

		long startTimeC2 = System.currentTimeMillis();
		shell.sortShellaC(arr100k, 2);
		long timeC2 = System.currentTimeMillis() - startTimeC2;
		results.add(timeC2);

		long startTimeD2 = System.currentTimeMillis();
		shell.sortShellaD(arr100k, 2);
		long timeD2 = System.currentTimeMillis() - startTimeD2;
		results.add(timeD2);

		// wersja 3

		long startTimeA3 = System.currentTimeMillis();
		shell.sortShellaA(arr100k, 3);
		long timeA3 = System.currentTimeMillis() - startTimeA3;
		results.add(timeA3);

		long startTimeB3 = System.currentTimeMillis();
		shell.sortShellaB(arr100k, 3);
		long timeB3 = System.currentTimeMillis() - startTimeB3;
		results.add(timeB3);

		long startTimeC3 = System.currentTimeMillis();
		shell.sortShellaC(arr100k, 3);
		long timeC3 = System.currentTimeMillis() - startTimeC3;
		results.add(timeC3);

		long startTimeD3 = System.currentTimeMillis();
		shell.sortShellaD(arr100k, 3);
		long timeD3 = System.currentTimeMillis() - startTimeD3;
		results.add(timeD3);

		System.out.printf("%-5s|%-10s|%-10s|%-10s|", " ", "Wersja 1", "Wersja 2", "Wersja 3");
		System.out.println("\n-----|----------|----------|----------|");
		System.out.printf("%-5s|%10d|%10d|%10d|", "A", timeA1, timeA2, timeA3);
		System.out.println("\n_____|__________|__________|__________|");
		System.out.printf("%-5s|%10d|%10d|%10d|", "B", timeB1, timeB2, timeB3);
		System.out.println("\n_____|__________|__________|__________|");
		System.out.printf("%-5s|%10d|%10d|%10d|", "C", timeC1, timeC2, timeC3);
		System.out.println("\n_____|__________|__________|__________|");
		System.out.printf("%-5s|%10d|%10d|%10d|", "D", timeD1, timeD2, timeD3);
		System.out.println("\n_____|__________|__________|__________|");

		System.out.println("Najlepszy wynik to " + Collections.min(results));
		System.out.println("Najgorszy wynik to " + Collections.max(results));
		System.out.println("\n\n");

	}

	public static void sprawdzienieSort(int arr[]) {

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {

				System.out.println("Zle posortowane");
				return;

			}

		}
		System.out.println("Dobre posortowane");
	}

	public static void main(String[] args) throws IOException {

		Main m = new Main();
		System.out.println("***Wszystkie wyniki sa w milisekundach\n");

		m.sortowanie5k();
		m.sortowanie10k();
		m.sortowanie50k();
		m.sortowanie100k();

		System.out.println("\nJak mozemy zobaczyc, ze dla malych tablic (do 5k elementow) najliepszy czas "
				+ "sortowania wynika z insertSort 'co h' i bubbleSort 'co 1' && [2^k + 1]");
		System.out.println(
				"Ale juz dla duzych tablic najlepsze wyniki sa z insertSort 'co h' i bubbleSort 'co 1' && [h = 3h + 1]");

	}

}
