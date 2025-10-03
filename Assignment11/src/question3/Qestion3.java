package question3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Qestion3 {
	  public static List<Integer> list= new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
	    
	    public static void displayList() {
	    	list.forEach(e->System.out.print(e+ " "));
	    }
		
	    public static void changeList(int removnum,int addednum) {
	         if(removnum-1<0||removnum-1>list.size()) {
	        	 System.out.println("Invalid choice ");
	         }
	         else {
	        	 list.remove(removnum-1);
	        	 list.add(removnum-1, addednum);
	        	 System.out.println("Operation successfull ");
	         }
	    	
	    	
	    }
	    
		public static void main(String[] args) {
			System.out.println("Array List display before modify");
			System.out.println();
			displayList();
			System.out.println();
			Scanner sc= new Scanner(System.in);
		    	System.out.print("Enter the position of element you want to change:");
		    	int pos=sc.nextInt();
		    	System.out.println();
		    	System.out.print("Enter the element you want to add:");
		    	int num=sc.nextInt();
			
			changeList(pos, num);
			System.out.println();
			System.out.println("Array List display after modifing :");
			displayList();
			
		}
		

	}

