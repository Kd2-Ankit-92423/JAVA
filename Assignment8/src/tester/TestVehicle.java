/* Hint : override equals method inherited from Object class : to replace ref equality by content 
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

package tester;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
//import tester.InvalidException;
import java.util.Scanner;
import com.app.vehicle.*;

public class TestVehicle{
public static Scanner sc = new Scanner(System.in);
public static List<Vehicle> list = new ArrayList<>();

public static void addVehicle() throws InvalidException{
		Vehicle v = new Vehicle();
		System.out.print("Enter the chasis no: ");
		int chasisNo = sc.nextInt();
		v.setChasisNo(chasisNo);
		for(Vehicle e: list) {
			if(v.equals(e)){
			throw new InvalidException("Already Exists");
		}
		}

		System.out.print("Enter the Vehicle color: ");
		v.setColor(sc.nextLine());
		sc.nextLine();
		System.out.print("Enter the price: ");
		v.setPrice(sc.nextDouble());
		sc.nextLine();
		
		System.out.print("Enter the Category: ");
		String category = sc.nextLine();
		List<String> cats = new ArrayList<>();
		Collections.addAll(cats, "Petrol","Diesel","CNG","EV","Hybrid");
		boolean flag = false;
		for(String s: cats) {
			if(category.equalsIgnoreCase(s)) {
				v.setCategory(category);
				flag = true;
				break;
			}
		}
		if(!flag) {
		throw new InvalidException("Invalid Category");
		}
		System.out.println("Enter the manufacturing Date: ");
		System.out.print("Enter the day: ");
		int day = sc.nextInt();
		System.out.print("Enter the Month: ");
		int month = sc.nextInt();
		System.out.print("Enter the Year: ");
		int year = sc.nextInt();
		Date dt = new Date(year,month-1,day); 
		Date startDate = new Date(2021,3,1);
		Date endDate = new Date(2022,2,31);
		if(dt.after(startDate) && dt.before(endDate)) {
			v.setMfgDate(dt);
		}
		else 
			throw new InvalidException("Enter the valid Date");
		
		list.add(v);
		System.out.println("Vehicle added successfully");
}

public static void printRecord() {
	if(list.size() == 0) {
		System.out.println("Enter the vehicle's first");
		return;
	}
	else {
		for(Vehicle v: list) {
			System.out.println(v.toString());
		}
	}
}
}

