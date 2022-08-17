package by.academy.homework5;

import java.util.Iterator;

public class Task3<T> implements Iterator<T> {
	private T[][] array;

	public Task3() {
		super();
	}

	public Task3(T[][] array) {
		this.array = array;
	}

	@Override
	public boolean hasNext() {
		
		return false;
	}

	@Override
	public T next() {
		// TODO Auto-generated method stub
		return null;
	}

}
