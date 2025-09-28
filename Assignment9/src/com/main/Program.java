package com.main;

import com.app.book.Tester;

public class Program {
//public static List<Book> list = new ArrayList<>();
public static void main(String[] args) {
	int choice;
	while((choice = Tester.menulist())!=0) {
		switch (choice) {
		case 1:{
			Tester.addBooks();
			break;
		}	
		case 2: {
			Tester.displayforward(Tester.list);
			break;
		}
		case 3:
			Tester.displayReverse(Tester.list);
			break;
		case 4: 
			Tester.sc.nextLine();
			System.out.print("Enter the ISBN to delete the book: ");
			String index = Tester.sc.nextLine();
			boolean result = Tester.deleteBook(index);
			System.out.println(result ? "Book deleted successfully." : "Book not found.");
			break;
		case 5:
			Tester.sortByPrice();
			System.out.println("Books sorted by price (descending).");
			break;
		default:
			System.out.println("Invalid choice! Enter a valid choice.");
			break;
		}
	}
}
}
