/* Q1) Define a new exception, called ExceptionLineTooLong, that prints out the error message "The
 strings is too long". Write a program that reads a String from user and calculates its length. and throws
 an exception of type ExceptionLineTooLong in the case where a string of length is more than 80
 characters. */

import java.util.Scanner;

class ExceptionLineTooLong extends Exception{
@Override
public String getMessage(){
    return "The strings is too long";
}
 }
public class Assignment7_1 {
    public static String string(String str) throws ExceptionLineTooLong{
        if (str.length()>80){
            throw new ExceptionLineTooLong();
        }
        return str;
    }
    public static void main(String[] args){
        
       try{ try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter a string: ");
            String str = sc.nextLine();
            System.out.println("String: "+string(str));
        }
    } 
    catch (ExceptionLineTooLong e){
        System.out.println(e.getMessage());
    }
    }
}
