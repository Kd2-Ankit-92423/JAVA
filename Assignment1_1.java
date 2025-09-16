 /*Accept a integer number and when the program is executed print the 
binary, octal and hexadecimal equivalent of the given number. 
Sample Output: 
java Test 
Enter Number : 20 
Given Number :20 
Binary equivalent :10100 
Octal equivalent :24 
Hexadecimal equivalent :14 */

import java.util.Scanner;

public class Assignment1_1{
    public static void main(String[] args){
        int num1;
        // Integer num = num1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        num1 = sc.nextInt();
        String bstr = Integer.toBinaryString(num1);
        String hstr = Integer.toHexString(num1);
        String ostr = Integer.toOctalString(num1);
        System.out.println("Integer to binary: "+bstr);
        System.out.println("Integer to octal: "+ostr);
        System.out.println("Integer to hexadecimal: "+hstr);
    }
}