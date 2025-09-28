/*
 *  Store book details in a library in a list -- ArrayList.
 Book details: isbn(string), price(double), authorName(string), quantity(int)
 Write a menu driven program to
 1. Add new book in list
 2. Display all books in forward order
 3. Display all books in reverse order
 4. Delete a book at given index.
 5. Sort all books by price in desc order -- list.sort();
 */

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
public Book(String isbn,String bookName, double price, String authorName, int quantity) {
	
	this.isbn = isbn;
	this.bookName = bookName;
	this.price = price;
	this.authorName = authorName;
	this.quantity = quantity;
}
public String getIsbn() {
	return isbn;
}
public void setIsbn(String isbn) {
	this.isbn = isbn;
}
public String getBookName() {
	return bookName;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getAuthorName() {
	return authorName;
}
public void setAuthorName(String authorName) {
	this.authorName = authorName;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
@Override
public String toString() {
	return "Book [Isbn= " + isbn + ", bookName=" + bookName + ", price=" + price + ", authorName=" + authorName + ", quantity=" + quantity
			+ "]";
}
@Override
public int hashCode() {
	return Objects.hash(isbn);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (!(obj instanceof Book))
		return false;
	Book other = (Book)obj;
	if(this.getIsbn() == other.getIsbn())
		return true;
	return false;
}

}
