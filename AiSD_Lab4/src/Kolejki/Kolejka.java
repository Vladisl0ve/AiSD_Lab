package Kolejki;

public class Kolejka<E> implements Queue<E> {

	private Lista head = null;
	private Lista tail = null;
	private int size = 0;

	public void insert(E obj) {

		if (!isFull()) {

			Lista ob = new Lista();
			ob.setObject(obj);
			if (head == null) {
				head = ob;
			} else {
				tail.setNext(ob);
			}

			tail = ob;
			size++;
		}

	}

	public E get(int index) {

		if (size == 0 || index >= size || index < 0) {
			return null;
		}

		Lista current = head;
		int pos = 0;

		while (pos < index) {

			current = current.getNext();
			pos++;
		}

		E obj = current.getObject();
		return obj;
	}

	public E remove() {

		if (size == 0) {
			return null;
		}

		E obj = head.getObject();

		head = head.getNext();

		if (head == null) {
			tail = null;
		}

		size--;

		return obj;
	}

	public int size() {
		return size;
	}

	private class Lista {

		private E object;
		private Lista next;

		public E getObject() {
			return object;
		}

		public void setObject(E object) {
			this.object = object;
		}

		public Lista getNext() {
			return next;
		}

		public void setNext(Lista next) {
			this.next = next;
		}

	}

	@Override
	public boolean isFull() {
		

		if (size >= 5)
			System.out.println("Kolejka jest przepolniona \nNie wiecej niz 5 osob w kolejce");

		return size >= 5;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return head == null;
	}

	@Override
	public boolean clear() {
		head = null;
		tail = head;
		return true;
	}

}