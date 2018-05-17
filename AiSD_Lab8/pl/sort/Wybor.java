package pl.sort;

public class Wybor {

	public void wyborWersji(int l, int[] arr, int inc) {
		switch (l) {
		case (1):
			wersja1(arr, inc);
			break;
		case (2):
			wersja2(arr, inc);
			break;
		case (3):
			wersja3(arr, inc);
			break;

		}
	}

	public void wersja1(int[] arr, int inc) {
		Sort.insertSortCoH(arr, inc);

	}

	public void wersja2(int[] arr, int inc) {
		if (inc == 1) {
			Sort.bubbleSortCoJeden(arr);
			return;
		}
		Sort.insertSortCoH(arr, inc);
		inc = inc / 3;
	}

	public void wersja3(int[] arr, int inc) {
		if (inc == 1) {
			Sort.insertSortCoJeden(arr);
			return;
		}
		Sort.bubbleSortCoH(arr, inc);
		inc = inc / 3;
	}

}
