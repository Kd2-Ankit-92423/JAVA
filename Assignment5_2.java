//Write a java code to check string is palindrome. 

import java.util.Scanner;

public class Assignment5_2 {
    class Palindrome{
        public static boolean checkPalindrome(String str) {
            int left = 0;
            int right = str.length() - 1;
            while (left < right) {
                if (str.charAt(left) != str.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }
    }
        public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter a string: ");
            String string = sc.nextLine();
            boolean isPalindrome = Palindrome.checkPalindrome(string);
            if (isPalindrome) {
                System.out.println(string + " is a palindrome.");
            } else {
                System.out.println(string + " is not a palindrome.");
            }            
        }
}
}
