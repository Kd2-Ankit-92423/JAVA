package question2;
import java.util.*;
public class Question2 {
    public static List<String> list= new ArrayList<>();
    
    public static void addColors() {
    	Scanner sc= new Scanner(System.in);
    	System.out.println("How may color's you want to add(number) :");
    	int num=sc.nextInt();
    	sc.nextLine();
    	int i=0;
    	while(i<num) {
    	System.out.println("Enter the color :");
    	String color=sc.next();
        list.add(color);
        i++;
    	}
    	
    }
    
    public static void disColors(){
    	System.out.println("Before Sorting");
    	list.forEach(e->System.out.println(e));
    }
    public static void disColorWithSort() {
    	System.out.println("After sorting ");
    	list.sort((x,y)->x.compareToIgnoreCase(y));
    	list.forEach(e->System.out.println(e));
    }
	
    public static void main(String[] args) {
		addColors();
		System.out.println();
		disColors();
		System.out.println();
		disColorWithSort();
	}
    
    
}
