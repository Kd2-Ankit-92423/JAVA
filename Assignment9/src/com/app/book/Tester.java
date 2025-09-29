package com.app.book;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Tester {
   public static Scanner sc;
   public static List<Book> list;

   static {
      sc = new Scanner(System.in);
      list = new ArrayList<Book>();
   }

   public static void addBooks() {
      Book book = new Book();
      sc.nextLine();
      System.out.print("Enter the ISBN: ");
      String check = sc.nextLine();
      Iterator<Book> var3 = list.iterator();

      while(var3.hasNext()) {
         Book b = (Book)var3.next();
         if (check.equals(b.getIsbn())) {
            System.out.println("This ISBN already exists.");
            return;
         }
      }

      book.setIsbn(check);
      System.out.print("Enter the name of the book: ");
      book.setBookName(sc.nextLine());
      System.out.print("Enter the price: ");
      book.setPrice((double)sc.nextInt());
      sc.nextLine();
      System.out.print("Enter the Author Name: ");
      book.setAuthorName(sc.nextLine());
      System.out.print("Enter the quantity: ");
      book.setQuantity(sc.nextInt());
      sc.nextLine();
      list.add(book);
      System.out.println("Book added Successfully");
   }

   public static void displayforward(List<Book> list) {
      ListIterator<Book> trav = list.listIterator();

      while(trav.hasNext()) {
         Book b1 = (Book)trav.next();
         System.out.println(b1.toString());
      }

   }

   public static void displayReverse(List<Book> list) {
      ListIterator<Book> trav = list.listIterator(list.size());

      while(trav.hasPrevious()) {
         Book b = (Book)trav.previous();
         System.out.println(b.toString());
      }

   }

   public static boolean deleteBook(String isbn) {
      Book key = new Book();
      key.setIsbn(isbn);
      if (list.contains(key)) {
         list.remove(key);
         return true;
      } else {
         return false;
      }
   }

   public static void sortByPrice() {
      Comparator<Book> comparator = new SortByPrice();
      list.sort(comparator);
      Iterator<Book> var2 = list.iterator();

      while(var2.hasNext()) {
         Book b = (Book)var2.next();
         System.out.println(b.toString());
      }

   }

   public static int menulist() {
      System.out.println();
      System.out.println(" 0. Exit");
      System.out.println(" 1. Add new book in list");
      System.out.println(" 2. Display all books in forward order");
      System.out.println(" 3. Display all books in reverse order");
      System.out.println(" 4. Delete a book at given index.");
      System.out.println(" 5. Sort all books by price in desc order");
      System.out.println();
      System.out.print("Enter the choice: ");
      return sc.nextInt();
   }
}
