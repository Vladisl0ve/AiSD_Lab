package Kolejki;

public interface Queue<E> {
	
	boolean isFull();
	boolean isEmpty();
	E remove();
	void insert(E element);
	int size();
	boolean clear();
	E get(int index);

}
