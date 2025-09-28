package com.sorting;
import java.util.Comparator;

import com.students.*;
public class SortByRollNo implements Comparator<Students>{

	@Override
	public int compare(Students o1, Students o2) {
		int diff = o1.getRollNo()-o2.getRollNo();
		return diff;
	}

}
