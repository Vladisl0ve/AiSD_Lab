package pl.sort;

public class Sort {
	public static void insertSortCoH(int[] arr, int increment) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + increment; j - increment >= 0 && j < arr.length; j -= increment) {
				if (arr[j] < arr[j - increment]) {
					int tmp = arr[j];
					arr[j] = arr[j - increment];
					arr[j - increment] = tmp;
				}
			}
		}
	}

	public static void insertSortCoJeden(int arr[]) {
		int temp;
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j] < arr[j - 1]) {
					temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
			}
		}
	}

	public static void bubbleSortCoH(int[] arr, int increment) {
		int temp = 0;
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0 + increment; j < (arr.length - i); j += increment) {
				if (arr[j - increment] > arr[j]) {
					temp = arr[j - increment];
					arr[j - increment] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void bubbleSortCoJeden(int[] arr) {
		int temp = 0;
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

}
