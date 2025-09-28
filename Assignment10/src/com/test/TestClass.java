package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import com.students.*;


public class TestClass {
public static Scanner sc = new Scanner(System.in);

public static List<Students> list = new ArrayList<>();

public static void addStudents() throws Exception {
	Students student = new Students();
	System.out.print("Enter the roll no: ");
	int roll = sc.nextInt();
	student.setRollNo(roll);
	for(Students s : list) {
		if(student.equals(s))
			throw new Exception("This roll no already exists");
	}
	sc.nextLine();		//consumes the line
	System.out.print("Enter the name: ");
	student.setName(sc.nextLine());
	
	System.out.print("Enter the marks: ");
	student.setMarks(sc.nextInt());
	sc.nextLine();   //consumes the line
	
	list.add(student);
	System.out.println("Student added Successfully");
	System.out.println();
}
public static void displayStudents() {
ListIterator<Students> trav = list.listIterator();
while(trav.hasNext()) {
	Students s = trav.next();
	System.out.println(s.toString());
}
}
public static void findStuent(int roll) throws Exception {
	Students key = new Students();
	key.setRollNo(roll);
	int index = list.indexOf(key);
	if(index!=-1) {
		System.out.println(list.get(index));
	}
	else{
		throw new Exception("Employee Not found");
	}
}

}
