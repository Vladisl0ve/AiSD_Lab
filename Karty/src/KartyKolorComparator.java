import java.util.Comparator;

public class KartyKolorComparator implements Comparator<Karty> {

	@Override
	public int compare(Karty a, Karty b) {
		
		if (a.getKolor() > b.getKolor())
			return 1;
		else if (a.getKolor() < b.getKolor())
			return -1;
		else
			return 0;
		
	}

}
