package com.main;

import java.util.Scanner;

import com.sorting.*;
import com.test.TestClass;

public class Program {
public static Scanner sc = new Scanner(System.in);

public static int menulist() {
	System.out.println();
	System.out.println("0.Exit");
	System.out.println("1.Add Student");
	System.out.println("2.Display the Student");
	System.out.println("3.Find the Students");
	System.out.println("4.Sort By Roll No");
	System.out.println("5.Sort By Name");
	System.out.println("6.Sort By Marks");
	System.out.println();
	System.out.print("Enter the Choice: ");
	return sc.nextInt();
}
public static void main(String[] args) {
	int choice;
	while((choice = menulist())!=0) {
		switch (choice) {
		case 1:{
			try {
				TestClass.addStudents();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			break;
		}
		case 2:{
			TestClass.displayStudents();
		}
		break;
		case 3:{
			System.out.print("Enter the student's roll: ");
			int find = sc.nextInt();
			try {
				TestClass.findStuent(find);
			} 
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		break;
		case 4:{
			//Comparator<Students> comparator = new SortByRollNo();
			TestClass.list.sort(new SortByRollNo());
			TestClass.displayStudents();
			break;
		}
		
		case 5:
			TestClass.list.sort(new SortByName());
			TestClass.displayStudents();
			break;
			
		case 6:
			TestClass.list.sort(new SortByMarks());
			TestClass.displayStudents();
			break;
			
		default:
			System.out.println("Invalid choice! Enter the valid choice");
			break;
		}
	}
}
}
