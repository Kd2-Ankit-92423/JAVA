/*
 Create a menu driven code that have below menus 
1. add the student in the collection - accept the details from user and add in the collection 
2. Display all the students using iterator. 
3. search the student on rollNo and if found display his details. 
4. sort the students on rollNo
5. sort the students on name 
6. sort the students on marks 
(Hint - use List Interface and Object of ArrayList) 
 */
package com.students;

public class Students {

private int rollNo;
private String name;
private int marks;

public Students() {
	//nothing to do here
}

public Students(int rollNo, String name, int marks) {
	super();
	this.rollNo = rollNo;
	this.name = name;
	this.marks = marks;
}

public int getRollNo() {
	return rollNo;
}

public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getMarks() {
	return marks;
}

public void setMarks(int marks) {
	this.marks = marks;
}

@Override
	public String toString() {
	return String.format("%-5d%5s%5d",rollNo, name, marks);
	}
@Override
	public boolean equals(Object obj) {
		if(obj == null)
			return false;
		if(this == obj)
			return true;
		if(!(obj instanceof Students))
			return false;
		Students s = (Students)obj;
		if(this.getRollNo() == s.getRollNo())
			return true;
		return false;
	}
}
