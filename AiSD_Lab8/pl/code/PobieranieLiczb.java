package pl.code;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class PobieranieLiczb {

	public int[] dane(String txt, int rozmiar) throws IOException {
		File file = new File(txt);
		int arr[] = new int[rozmiar];

		FileReader fr = new FileReader(file);
		Scanner scan = new Scanner(fr);
		int count = 0;
		while (scan.hasNextLine()) {
			arr[count] = Integer.parseInt(scan.nextLine());
			count++;
		}

		fr.close();
		File plik = new File(txt);
		int array[] = new int[rozmiar];
		Random myRand = new Random();
		FileWriter writer = new FileWriter(plik);

		for (int i = 0; i < array.length; i++) {
			array[i] = myRand.nextInt(1000);
			writer.write(array[i] + "\n");
		}

		writer.flush();
		writer.close();

		return arr;
	}

}
