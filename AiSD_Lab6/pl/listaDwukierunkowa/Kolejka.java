package pl.listaDwukierunkowa;

public class Kolejka<E> implements IQueue<E> {

	Element sentinel = null;

	public Kolejka() {
		sentinel = new Element(null);
		sentinel.setNext(sentinel);
		sentinel.setPrev(sentinel);
	}

	private Element getElement(int index) {
		Element elem = sentinel.getNext();
		int counter = 0;
		while (elem != sentinel && counter < index) {
			counter++;
			elem = elem.getNext();
		}
		if (elem == sentinel)
			throw new IndexOutOfBoundsException();
		return elem;
	}

	private Element getElement(E value) {
		Element elem = sentinel.getNext();
		while (elem != sentinel && !value.equals(elem.getValue())) {
			elem = elem.getNext();
		}
		if (elem == sentinel)
			return null;
		return elem;
	}
	
	

	@Override
	public boolean isEmpty() {
		return sentinel.getNext() == sentinel;
	}

	@Override
	public void clear() {
		sentinel.setNext(sentinel);
		sentinel.setPrev(sentinel);
	}

	public boolean contains(E value) {
		return indexOf(value) != -1;
	}

	@Override
	public E get(int index) {
		Element elem = getElement(index);
		return elem.getValue();
	}

	public E set(int index, E value) {
		Element elem = getElement(index);
		E retValue = elem.getValue();
		elem.setValue(value);
		return retValue;
	}

	public boolean add(E value) {
		Element newElem = new Element(value);
		sentinel.insertBefore(newElem);
		return true;
	}

	public boolean add(int index, E value) {
		Element newElem = new Element(value);
		if (index == 0)
			sentinel.insertAfter(newElem);
		else {
			Element elem = getElement(index - 1);
			elem.insertAfter(newElem);
		}
		return true;
	}

	public int indexOf(E value) {
		Element elem = sentinel.getNext();
		int counter = 0;
		while (elem != sentinel && !elem.getValue().equals(value)) {
			counter++;
			elem = elem.getNext();
		}
		if (elem == sentinel)
			return -1;
		return counter;
	}

	@Override
	public E remove(int index) {
		Element elem = getElement(index);
		elem.remove();
		return elem.getValue();
	}

	public boolean remove(E value) {
		Element elem = getElement(value);
		if (elem == null)
			return false;
		elem.remove();
		return true;
	}

	@Override
	public int size() {
		Element elem = sentinel.getNext();
		int counter = 0;
		while (elem != sentinel) {
			counter++;
			elem = elem.getNext();
		}
		return counter;
	}

	private class Element {
		private E value;
		private Element next;
		private Element prev;

		public E getValue() {
			return value;
		}

		public void setValue(E value) {
			this.value = value;
		}

		public Element getNext() {
			return next;
		}

		public void setNext(Element next) {
			this.next = next;
		}

		public Element getPrev() {
			return prev;
		}

		public void setPrev(Element prev) {
			this.prev = prev;
		}

		Element(E data) {
			this.value = data;
		}

		public void insertAfter(Element elem) {
			elem.setNext(this.getNext());
			elem.setPrev(this);
			this.getNext().setPrev(elem);
			this.setNext(elem);
		}

		public void insertBefore(Element elem) {
			elem.setNext(this);
			elem.setPrev(this.getPrev());
			this.getPrev().setNext(elem);
			this.setPrev(elem);
		}

		public void remove() {
			this.getNext().setPrev(this.getPrev());
			this.getPrev().setNext(this.getNext());
		}
	}
}
