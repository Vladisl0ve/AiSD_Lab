package pl.mainFacture;

import pl.sortsMethods.*;

public class Time {

	Massives mass = new Massives();
	BubbleSort bubble = new BubbleSort();

	HeapSort heap = new HeapSort();
	InsertSort insert = new InsertSort();
	MergeSort merge = new MergeSort();
	QuickSort quick = new QuickSort();
	SelectionSort select = new SelectionSort();

	public double[] timeRand() {

		// Bubble - 0
		// Heap - 1
		// Insert - 2
		// Merge - 3
		// Quick - 4
		// Selection - 5

		double[] time = new double[6];

		time[0] = bubble.sort(mass.massRand());
		time[1] = heap.sort(mass.massRand());
		time[2] = insert.sort(mass.massRand());
		time[3] = merge.sort(mass.massRand());
		time[4] = quick.sort(mass.massRand());
		time[5] = select.sort(mass.massRand());

		return time;
	}

	public double[] timeIncr() {

		// Bubble - 0
		// Heap - 1
		// Insert - 2
		// Merge - 3
		// Quick - 4
		// Selection - 5

		double[] time = new double[6];

		time[0] = bubble.sort(mass.massIncr());
		time[1] = heap.sort(mass.massIncr());
		time[2] = insert.sort(mass.massIncr());
		time[3] = merge.sort(mass.massIncr());
		time[4] = quick.sort(mass.massIncr());
		time[5] = select.sort(mass.massIncr());

		return time;
	}

	public double[] timeDecr() {

		// Bubble - 0
		// Heap - 1
		// Insert - 2
		// Merge - 3
		// Quick - 4
		// Selection - 5

		double[] time = new double[6];

		time[0] = bubble.sort(mass.massDecr());
		time[1] = heap.sort(mass.massDecr());
		time[2] = insert.sort(mass.massDecr());
		time[3] = merge.sort(mass.massDecr());
		time[4] = quick.sort(mass.massDecr());
		time[5] = select.sort(mass.massDecr());

		return time;
	}

	public void showTime() {
		
		System.out.println("Zaczynamy, prosze poczekac...");
		// Bubble - 0
		// Heap - 1
		// Insert - 2
		// Merge - 3 |BubbleSort|HeapSort |InsertSort|MergeSort |QuickSort |SelectSort|
		// _______________|__________|__________|__________|__________|__________|__________|
		// Quick - 4
		// Selection - 5
		double[] rand = timeRand();
		double[] incr = timeIncr();
		double[] decr = timeDecr();

		System.out.printf("%-15s|%-10s|%-10s|%-10s|%-10s|%-10s|%-10s|\n", "", "BubbleSort", "HeapSort", "InsertSort",
				"MergeSort", "QuickSort", "SelectSort");
		System.out.println("===============|==========|==========|==========|==========|==========|==========|");
		System.out.printf("%-15s|%10.1f|%10.1f|%10.1f|%10.1f|%10.1f|%10.1f|\n", "DANE LOSOWE", rand[0], rand[1],
				rand[2], rand[3], rand[4], rand[5]);
		System.out.println("_______________|__________|__________|__________|__________|__________|__________|");
		System.out.printf("%-15s|%10.1f|%10.1f|%10.1f|%10.1f|%10.1f|%10.1f|\n", "DANE ROSNACO", incr[0], incr[1],
				incr[2], incr[3], incr[4], incr[5]);
		System.out.println("_______________|__________|__________|__________|__________|__________|__________|");

		System.out.printf("%-15s|%10.1f|%10.1f|%10.1f|%10.1f|%10.1f|%10.1f|\n", "DANE MALEJACO", decr[0], decr[1],
				decr[2], decr[3], decr[4], decr[5]);
		System.out.println("_______________|__________|__________|__________|__________|__________|__________|");
		System.out.printf("%-15s|%10.1f|%10.1f|%10.1f|%10.1f|%10.1f|%10.1f|\n", "SREDNIA",
				(decr[0] + rand[0] + incr[0]) / 3, (decr[1] + rand[1] + incr[1]) / 3, (decr[2] + rand[2] + incr[2]) / 3,
				(decr[3] + rand[3] + incr[3]) / 3, (decr[4] + rand[4] + incr[4]) / 3,
				(decr[5] + rand[5] + incr[5]) / 3);
		System.out.println("=================================================================================|");

	}

	public void showTimeRand() {

		double[] rand = timeRand();

		for (int i = 0; i < rand.length; i++) {
			System.out.println(rand[i]);
		}

	}

	public void showTimeIncr() {

		double[] incr = timeIncr();

		for (int i = 0; i < incr.length; i++) {
			System.out.println(incr[i]);
		}

	}

	public void showTimeDecr() {

		double[] decr = timeDecr();

		for (int i = 0; i < decr.length; i++) {
			System.out.println(decr[i]);
		}

	}

}
