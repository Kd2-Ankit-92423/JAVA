package com.projects;

import java.util.HashSet;
import java.util.Set;

public class Program {
public static void main(String[] args) throws Exception{
		int choice;
		Set<Project> set = new HashSet<>();
		while((choice = ProjectManager.menuList()) != 0) {
			switch(choice) {
			case 1: 
				ProjectManager.addProject(ProjectManager.getDummyProject());
				System.out.println("Dummy Project added Successfully");
				break;
			
			case 2:
				 ProjectManager.addProjectManually();
                 break;
			
             case 3:
                 System.out.println("Projects in Set:");
                 ProjectManager.set.forEach(System.out::println);
                 break;

             case 4:
                 System.out.print("Enter project ID to delete: ");
                 int id = ProjectManager.sc.nextInt();
                 boolean removed = ProjectManager.deleteById(id);
                 System.out.println(removed ? "Project deleted." : "Project not found.");
                 break;

             case 5:
                 ProjectManager.arrayListProject();
                 break;

             case 6:
                 System.out.println("Projects in List:");
                 ProjectManager.displayList();
                 break;

             case 7:
                 ProjectManager.sortByCost(); // Comparator not needed, already defined
                 break;

             case 8:
                 ProjectManager.maxTeamSize(); // Now prints all projects with max team size
                 break;
             case 9:
                 ProjectManager.writeProject();
                 break;

             case 10:
                 ProjectManager.readProject();
                 break;

             default:
                 System.out.println("Invalid choice. Try again.");
                 break;
			}
		}
	}
}
