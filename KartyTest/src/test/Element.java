package test;
public class Element {

	private Karta card;
	private Element next;

	public Element(Karta card) {
		this.card = card;
	}

	public Karta getValue() {
		return card;
	}

	public void setValue(Karta card) {
		this.card = card;
	}

	public Element getNext() {
		return next;
	}

	public Element setNext(Element next) {
		this.next = next;
		return next;
	}

}
