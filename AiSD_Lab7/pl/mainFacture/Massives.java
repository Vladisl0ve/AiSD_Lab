package pl.mainFacture;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Massives {

	Random rand = new Random();

	public int[] massRand() {

		int arr[] = new int[100000];

		for (int i = 0; i < arr.length; i++) {

			arr[i] = rand.nextInt(100000) - 50000;

		}
		return arr;
	}

	public int[] massIncr() {

		int arr[] = new int[100000];

		for (int i = 0; i < arr.length; i++) {

			arr[i] = rand.nextInt(100000) - 50000;

		}
		Arrays.sort(arr);
		return arr;
	}

	public int[] massDecr() {

		Integer arr[] = new Integer[100000];

		for (int i = 0; i < arr.length; i++) {

			arr[i] = rand.nextInt(100000) - 50000;

		}
		Arrays.sort(arr, Collections.reverseOrder());
		int[] arrInt = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {

			arrInt[i] = arr[i].intValue();

		}

		return arrInt;
	}

}
