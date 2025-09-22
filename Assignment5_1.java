// Q1) Write a java program to reverse a String without using inbuilt function.

import java.util.Scanner;

public class Assignment5_1 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter a string to reverse: ");
            String string = sc.nextLine();
            String reversed = reverseString(string);
            System.out.println("Reversed string: " + reversed);
        }
    }

    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}