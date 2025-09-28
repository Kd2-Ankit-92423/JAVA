/*
 * Use Arrays.sort() to sort array of Students using Comparator. The 1st level sorting should be on city
 (desc), 2nd level sorting should be on marks (desc), 3rd level sorting should be on name (asc).
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class Assignment8_3 {
public static class Student { 
    private int roll; 
    private String name; 
    private String city; 
    private double marks; 
    public Student() {
        
    }
public Student(int roll, String name, String city, double marks) { 
    this.roll = roll;
    this.name = name;
    this.city = city;
    this.marks = marks;
}
public int getRoll() { 
    return roll;        
} 
public String getName() { 
    return name;   
}
public String getCity() { 
    return city;
}
public double getMarks() {
    return marks; 
}

@Override
public String toString() {
    return "Student [roll=" + roll + ", name=" + name + ", city=" + city + ", marks=" + marks + "]";
}
@Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (!(obj instanceof Student))
        return false;
    Student other = (Student) obj;
    if (this.roll == other.roll)
        return true;
    return false;
}
}
public static class SortByCity implements java.util.Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        int diff = s2.getCity().compareTo(s1.getCity()); // Descending order for city
        return diff;

    }
}
public static class SortByMarks implements java.util.Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        int diff = Double.compare(s2.getMarks(), s1.getMarks()); // Descending order for marks
        return diff;
    }
}
public static class SortByName implements java.util.Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        int diff = s1.getName().compareTo(s2.getName()); // Ascending order for name
        return diff;
    }
}

public static List<Student> student = new ArrayList<>();
public static Scanner sc = new Scanner(System.in);

public static void display() {
    for (Student student : student) {
        System.out.println(student.toString());
    }
}
public static void getInstances(){
    student.add(new Student(1, "Ankit", "New Delhi", 99.5));
    student.add(new Student(2, "Bholaa", "Pune", 90.0));
    student.add(new Student(3, "Chandu", "Mumbai", 78.0));
    student.add(new Student(4, "Dev", "Karad", 88.5));
    student.add(new Student(5, "Amit", "Goa", 92.0));
    student.add(new Student(6, "Nemika", "Ghaziabad", 95.0));

}
public static int menulist(){
    System.out.println("0. Exit");
    System.out.println("1. Display all the students");
    System.out.println("2. Sort by City (desc)");
    System.out.println("3. Sort by Marks (desc)");
    System.out.println("4. Sort by Name (asc)");
    System.out.print("Enter your choice: ");
    return sc.nextInt();
}


public static void main(String[] args) {
    int choice;

    while((choice=menulist())!=0){
        switch(choice){
            case 1:
                getInstances();
                display();
                break;
            case 2:
                Comparator<Student> comparator = new SortByCity();
                student.sort(comparator);
                display();
                break;
            case 3:
                Comparator<Student> comparator1 = new SortByMarks();
                student.sort(comparator1);                
                display();
                break;
            case 4:
                Comparator<Student> comparator2 = new SortByName();
                student.sort(comparator2);                
                display();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
    sc.close();
}
}