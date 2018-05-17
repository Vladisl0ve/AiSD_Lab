package test;

public class Lista {

	Element pierwszy = null;

	public Lista() {
	}

	public int size() {
		int pos = 0;
		Element el = pierwszy;
		while (el != null) {
			pos++;
			el = el.getNext();
		}
		return pos;
	}

	public boolean pusta() {
		return pierwszy == null;
	}

	public Element getElement(int i) {
		Element newEl = pierwszy;
		while (i > 0 && newEl != null) {
			i--;
			newEl = newEl.getNext();
		}
		return newEl;
	}

	public void dodaj(Karta cr) {
		this.dodaj(0, cr);
	}

	public boolean dodaj(int pos, Karta kart) {
		if (pos < 0)
			return false;
		Element el = new Element(kart);
		if (pos == 0) {
			el.setNext(pierwszy);
			pierwszy = el;

			return true;
		}
		Element curEl = getElement(pos - 1);
		if (curEl == null)
			return false;
		el.setNext(curEl.getNext());
		curEl.setNext(el);
		return true;
	}

	public void usun(int pos) {
		if (pierwszy == null)
			return;
		if (pos == 0) {
			pierwszy = pierwszy.getNext();
		}
		Element curEl = getElement(pos - 1);
		if (curEl == null || curEl.getNext() == null)
			return;
		curEl.setNext(curEl.getNext().getNext());
	
	}

	public Element szukaj(Element el) {
		Element nel = pierwszy;
		while (nel != null) {
			if (el.getValue().getKolor() == nel.getValue().getKolor()
					|| el.getValue().getWartosc() == nel.getValue().getWartosc())
				return nel;
			nel = nel.getNext();
		}
		return null;
	}

	public void szukajWartosc(int wart) {
		Element nel = pierwszy;
		while (nel != null) {
			if (nel.getValue().getWartosc() == wart) {
				if (nel.getValue().getWartosc() == 14)
					continue;
				nel.getValue().wyswietl();
			}
			nel = nel.getNext();
		}
	}

	public void szukajKolor(int kol) {
		Element nel = pierwszy;
		while (nel != null) {
			if (nel.getValue().getKolor() == kol) {
				if (nel.getValue().getWartosc() == 14)
					continue;
				nel.getValue().wyswietl();
			}
			nel = nel.getNext();
		}
	}

	public void wyswietl() {
		if (this.size() == 0) {
			System.out.println("Lista pusta");
			return;
		}
		Element nel = pierwszy;
		while (nel != null) {

			nel.getValue().wyswietl();
			nel = nel.getNext();
		}
	}

	public void clear() {
		if (this.size() == 0)
			return;
		for (int i = 0; i < this.size(); i++)
			this.usun(0);
	}

	public void clearJednakowe() {
		Element poszuk = pierwszy;
		Element nel = poszuk;
		while (poszuk != null) {
			while (nel != null) {
				if (nel.getNext() == null)
					break;
				if (nel.getNext().getValue().getKolor() == poszuk.getValue().getKolor()
						&& nel.getNext().getValue().getWartosc() == poszuk.getValue().getWartosc()) {
					nel.setNext(nel.getNext().getNext());
				}
				nel = nel.getNext();
			}
			poszuk = poszuk.getNext();
			nel = poszuk;
		}
	}

	public void usuniecieZamknietych() {
		Element poszuk = pierwszy;
		if (pierwszy.getValue().getWartosc() == 14) {
			pierwszy = null;
		}
		while (poszuk != null) {
			if (poszuk.getNext().getValue().getWartosc() == 14) {
				poszuk.setNext(null);
				return;
			}
			poszuk = poszuk.getNext();
		}

	}

	public void dodKoniec(Karta cr) 
	{
		if (this.pusta()) {
			this.dodaj(0, cr);
		}
		dodaj(this.size(), cr);
	}

}
