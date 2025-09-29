package com.app.book;

import java.util.Objects;

public class Book {
   private String isbn;
   private String bookName;
   private double price;
   private String authorName;
   private int quantity;

   public Book() {
   }

   public Book(String isbn, String bookName, double price, String authorName, int quantity) {
      this.isbn = isbn;
      this.bookName = bookName;
      this.price = price;
      this.authorName = authorName;
      this.quantity = quantity;
   }

   public String getIsbn() {
      return this.isbn;
   }

   public void setIsbn(String isbn) {
      this.isbn = isbn;
   }

   public String getBookName() {
      return this.bookName;
   }

   public void setBookName(String bookName) {
      this.bookName = bookName;
   }

   public double getPrice() {
      return this.price;
   }

   public void setPrice(double price) {
      this.price = price;
   }

   public String getAuthorName() {
      return this.authorName;
   }

   public void setAuthorName(String authorName) {
      this.authorName = authorName;
   }

   public int getQuantity() {
      return this.quantity;
   }

   public void setQuantity(int quantity) {
      this.quantity = quantity;
   }

   public String toString() {
      return "Book [Isbn= " + this.isbn + ", bookName=" + this.bookName + ", price=" + this.price + ", authorName=" + this.authorName + ", quantity=" + this.quantity + "]";
   }

   public int hashCode() {
      return Objects.hash(new Object[]{this.isbn});
   }

   public boolean equals(Object obj) {
      if (this == obj) {
         return true;
      } else if (obj == null) {
         return false;
      } else if (!(obj instanceof Book)) {
         return false;
      } else {
         Book other = (Book)obj;
         return this.getIsbn() == other.getIsbn();
      }
   }
}
