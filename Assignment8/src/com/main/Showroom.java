package com.main;
import java.util.Scanner;

import com.app.vehicle.*;
import tester.*;


public class Showroom{
public static Scanner sc = new Scanner(System.in);
public static int menulist(){
	System.out.println("1.Add Vehicle");
	System.out.println("2.Show Vehicle");
	System.out.println("3.Exit");
	System.out.print("Enter the choice: ");
	return sc.nextInt();
}
public static void main(String[] args) {
	int choice;
	while((choice = menulist())!= 3) {
		switch(choice) {
		case 1:{
			try {
			TestVehicle.addVehicle();
			}
			catch(InvalidException i) {
				System.out.println(i.getMessage());
			}
			break;
		}
		case 2: {
			TestVehicle.printRecord();
			break;
		}
		default: 
			System.out.println("Invalid Input, Enter the valid input");
			break;
		}
	}
}
}
