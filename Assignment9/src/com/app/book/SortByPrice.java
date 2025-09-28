package com.app.book;

import java.util.Comparator;

public class SortByPrice implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
	int diff = Double.compare(o2.getPrice(),o1.getPrice());
	return diff;
	}

}
