package relations.composition;

import java.util.ArrayList;
import java.util.List;

public class GFG {

	public static void main(String[] args) {
		
		Book book1 = new Book("Harry Potter", "J.K Rowling");
		Book book2 = new Book("Lord of the Rings", "J.R.R Tolkien");
		Book book3 = new Book("2001, A Space Odyssey", "Arthur C Clarke");

		List<Book> books = new ArrayList<Book>();
		books.add(book1);
		books.add(book2);
		books.add(book3);
		
		Library library = new Library(books);
		List<Book> totalBooks = library.getTotalBooksInLibrary();
		System.out.println("Total number of books : " + totalBooks.size());
		for(Book book: totalBooks) {
			System.out.print("Book is " + book.title + " and the author is " + book.author);
			System.out.println();
		}
	}

}
