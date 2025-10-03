package question1;

import java.util.Scanner;
public class Tester {
	public static int menulist() {
		Scanner sc= new Scanner(System.in);
		System.out.println("--------MENU---------");
		System.out.println("1.Choose Fixed Stack");
		System.out.println("2.Choose Growable Stack");
		System.out.println("3.Push data");
		System.out.println("4.Pop and dispaly the same");
		System.out.println("5.exit");
		System.out.print("Enter your choice :");
		int choice =sc.nextInt();
		return choice;
		
	}

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int choice;
		Stack stk=null;
		while ((choice=menulist())!=5) {
			switch (choice) {
			case 1:
				if(stk==null) {
					stk= new FixedStack();
				}
				else {
					System.out.println("Already chosen ");
				}
						
				break;
			case 2:
				if(stk==null) {
				stk= new GrowableStack();
				}
				else {
					System.out.println("Already chosen ");
				}
				break;
			case 3:
				if(stk!=null) {
					System.out.println("Enter ID:");
					int id = sc.nextInt();
					sc.nextLine(); // consume leftover newline

					System.out.println("Enter Name:");
					String name = sc.nextLine(); // now this waits for real input

					System.out.println("Enter Salary:");
					double salary = sc.nextDouble();
					
					sc.nextLine(); // consume newline after salary (important for next iteration!)
					Employee e = new Employee(id, name, salary);
					stk.push(e);
				}
				if(stk==null) {
					System.out.println("No stack choosen");
				}
				break;
			case 4:
				if(stk==null) {
					System.out.println("No stack chosen");
				}
				else {
					Employee e= stk.pop();
					System.out.println(e);
				}
				break;
			default:
				System.out.println("Invalid entry");
				break;
			}
		}
	}
	}


