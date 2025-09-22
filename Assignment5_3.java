/*write a java program to count number of words in a String. 
Hint:  You can use , trim() , length() and split() methods */

import java.util.Scanner;

public class Assignment5_3 {
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String str1 = str.trim();
        if (str1.isEmpty()) {
            System.out.println("Number of words: 0");
        } else {
            String[] words = str1.split("\\s+");
            System.out.println("Number of words: " + words.length);
        }
    }
    }
}
