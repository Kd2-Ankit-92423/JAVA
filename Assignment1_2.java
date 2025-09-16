/* Accept 2 double values from User (using Scanner). Check data type. If arguments are not doubles, supply suitable 
error message & terminate. If numbers are double values, print its average.  */
import java.util.Scanner;
public class Assignment1_2 {
public static void main(String[] args){
    double num1, num2;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the first number: ");
    if(!sc.hasNextDouble()){
        System.out.println("Error: Please enter valid double values.");
        return;
    }
    num1 = sc.nextDouble();
    System.out.print("Enter the second number: ");
    if(!sc.hasNextDouble()){
        System.out.println("Error: Please enter valid double values.");
        return;
    }
    num2 = sc.nextDouble();
    double avg = (num1+num2)/2;
    System.out.println("Average: "+ avg);        
}
}
