package pl.listaDwukierunkowa;

public interface IQueue<E> {

	boolean isEmpty();

	int size();

	void clear();

	E get(int index);

	E remove(int index);
	

}
