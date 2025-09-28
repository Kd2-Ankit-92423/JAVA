/*Solve Vehicle equality assignment
 Problem: Create a classVehicle ,under the package: com.app.vehicles ,to represent any vehicle.
 Supply tight encapsulation
 state(data members) : chasisNo: int , color: String , price : double
 chasisNo MUSTbeunique(non duplicate)for any vehicle(primary Key : unique ID) 
Get complete state : toString
 Hint : override equals method inherited from Object class : to replace ref equality by content 
equality(based upon unique ID : PK)
 Create a class TestVehicleunder the package"tester" 
Accept details of 2 vehicles from user .
 Display "SAME"or "DIFFERENT" ,in case of same or different chasis no's. 
Hint : invoke equals
 Objective : Use exception handling , string handling & Date in vehicle showroom based scenario
 Vehicle's state(attributes)--chasisNo : String , color : String ,category:string, price : double ,
 manufactureDate(Date)
 Add validation rules for the inputs :
 chasisNo id unique
 category : Petrol , Diesel,EV , Hybrid , CNG
 manufactureDate: in this financial year (1st Apr 2021 to 31Mar 2022)
 Create a main class as Showroom. By giving Options
 1. Add Vehicle
 Apply all validation rules . In case of success , add the vehicleintheshowroomOtherwiseraise custom 
exception, alert user using exc handling.
 2. Display All Vehicles
 3. Exit 
 */

package com.app.vehicle;

import java.util.Date;
public class Vehicle {
private int chasisNo;
private String color;
private double price;
private String category;
Date mfgDate;
public Vehicle(){
	//nothing to do
}

public Vehicle(int chasisNo, String color, double price,String category, Date mfgDate) {
	this.chasisNo = chasisNo;
	this.color = color;
	this.price = price;
	this.category = category;
	this.mfgDate = mfgDate;
}

public int getChasisNo() {
	return chasisNo;
}

public void setChasisNo(int chasisNo) {
	this.chasisNo = chasisNo;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}
public String getCategory() {
	return category;
}
public Date getMfgDate() {
	return mfgDate;
}
public void setCategory(String category) {
	this.category = category;
}
public void setMfgDate(Date mfgDate) {
	this.mfgDate = mfgDate;
}
@Override
public String toString() {
	return "Vehicle [chasisNo=" + chasisNo + ", color=" + color + ", price=" + price + ", category=" + category + ", mfgDate=" + mfgDate + "]";
}
@Override
	public boolean equals(Object obj) {
		if(obj == null)
			return false;
		if(this == obj)
			return true;
		if(!(obj instanceof Vehicle))
			return false;
		Vehicle v = (Vehicle)obj;
		if(this.getChasisNo() == v.getChasisNo())
			return true;
		return false;
	}

}
