package pl.sort;

public class Shell {

	Wybor w = new Wybor();

	public void sortShellaA(int[] arr, int wersja) {
		int h = 1;
		while (h < arr.length / 3) {
			h = 3 * h + 1;
		}
		while (h > 0) {
			w.wyborWersji(wersja, arr, h);
			h = h / 3;
		}

	}

	public void sortShellaB(int[] arr, int wersja) {
		int liczba = 2;
		int potega = 1;
		while (liczba < arr.length) {
			liczba = (int) (Math.pow(2, potega) - 1);
			potega++;
		}

		liczba = liczba / 2;
		while (liczba > 0) {
			w.wyborWersji(wersja, arr, liczba);
			liczba = liczba / 2;
		}

	}

	public void sortShellaC(int[] arr, int wersja) {
		int liczba = 2;
		int potega = 1;
		while (liczba < 65) {
			liczba = (int) (Math.pow(2, potega) + 1);
			potega++;
		}

		liczba = liczba / 2 + 1;
		while (liczba >= 3) {
			w.wyborWersji(wersja, arr, liczba);
			liczba = liczba / 2 + 1;
		}
		liczba = liczba / 2;
		w.wyborWersji(wersja, arr, liczba);

	}

	public void sortShellaD(int[] arr, int wersja) {
		int first = 1;
		int second = 1;
		int third = 0;
		while ((first + second) < arr.length) {
			third = first + second;
			first = second;
			second = third;

		}
		third = first + second;

		while (first > 0) {
			w.wyborWersji(wersja, arr, second);
			int tmp;
			tmp = second;
			second = first;
			first = tmp - first;
		}

	}

}
