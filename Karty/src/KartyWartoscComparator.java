import java.util.Comparator;

public class KartyWartoscComparator implements Comparator<Karty> {

	@Override
	public int compare(Karty a, Karty b) {

		if (a.getWartosc() > b.getWartosc())
			return 1;
		else if (a.getWartosc() < b.getWartosc())
			return -1;
		else
			return 0;
		
		

	}

}
