package com.sorting;

import java.util.Comparator;

import com.students.Students;

public class SortByMarks implements Comparator<Students>{

	@Override
	public int compare(Students o1, Students o2) {
		return o1.getMarks() - o2.getMarks();
	}

}
