package com.projects;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ProjectManager{
		
		public static Scanner sc = new Scanner(System.in);
		public static Set<Project> set = new HashSet<Project>();
		public static Project pro = new Project();
		public static List<Project> list = new ArrayList<>();
		
		
		public static Project[] getDummyProject() {
			Project[] arr = new Project[] {
					new Project(1, "Train Reservation System",9, 5000000, "Java"),
					new Project(2, "Airline Reservation System",3, 6000000, ".NET"), 
					new Project(4, "Online Grocery Shop", 6, 3000000, "Java"),
					new Project(5, "Online Book Shop", 2, 3000000, ".NET"),
					new Project(3, "Online Jewelry Shop", 4, 4000000, "Java"),
					new Project(8, "Bus Reservation System", 3, 3500000, "JS")
					
			};
			return arr;
		}

		public static void addProject(Project[] arr) {
			for(Project e: arr) {
			if(set.add(e)) {
				System.out.println("Project added");				
			}
			else {
				System.out.println("Duplicate Detected!");
			}
			}
				
		}

		public static void addProjectManually() {
			System.out.print("Enter the id: "); 
			pro.setId(sc.nextInt());
			System.out.print("Enter the Project Name: "); pro.setTitle(sc.next());
			System.out.print("Enter the team size: "); pro.setTeamSize(sc.nextInt());
			System.out.print("Enter the Project cost: "); pro.setProjectCost(sc.nextDouble());
			System.out.print("Enter the technologia: "); pro.setTechnology(sc.next());
			if(set.add(pro)) {
				System.out.println("Project added successfully");	
		}
			else {
			System.out.println("Duplicate id, project could not be added");
			}
			if(set.add(pro)) {
				System.out.println("Project added");				
			}
			else {
				System.out.println("Duplicate Detected!");
			}
		}
		public static boolean deleteById(int empid) {
//			System.out.println("Enter the Id of the project to remove: ");
//			int id = sc.nextInt();
//			boolean success = set.removeIf(p -> p.getId() == id);
			Project p = new Project();
			p.setId(empid);
			if(set.contains(p)) {
				set.remove(p);
				return true;
			}
			else
				return false;
		}
		public static void arrayListProject() {
			//list.addAll(set);
			list = new ArrayList<>(set);
			System.out.println("Successfully converted to list!");
		}
		public static void displayList() {
			//list.forEach(e-> System.out.println(e));
			list.forEach(System.out:: println);
		}
		public static void sortByCost(){
			list.sort(new SortByCost());
			displayList();
		}
		public static void maxTeamSize() {
			Project max = null;
			for (Project p : set) {
			    if (max == null || p.getTeamSize() > max.getTeamSize()) {
			        max = p;
			    }
			}
			System.out.println("Max team size project: " + max);

		}
		public static void writeProject() throws Exception{
			try(ObjectOutputStream oout = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("project.txt")))){
				oout.writeObject(set);
				System.out.println("Project is successfully written.");
			}
		}
		@SuppressWarnings("unchecked")
		public static void readProject() throws Exception {
			try(ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream("project.txt")))){
				set.clear();	
				set = (Set<Project>)ois.readObject();
				System.out.println("Project is readed successfully");
				System.out.println(set.toString());
			}

		}
		
		public static int menuList() {
			System.out.println();
			System.out.println("1. Add Dummy Data of Projects in the Set \r\n"
					+ "2. Input a Project from user and add in Set \r\n"
					+ "3. Display all Projects in Set \r\n"
					+ "4. Delete a Project by Id from Set \r\n"
					+ "5. Copy All Projects from Set to ArrayList \r\n"
					+ "6. Display all Projects from List \r\n"
					+ "7. Sort all Projects in List by cost \r\n"
					+ "8. Find project with Max team size \r\n"
					+ "9. Write Record \r\n"
					+ "10. Read Record ");
			System.out.println("Enter choice: ");
			return sc.nextInt();
		}
}

