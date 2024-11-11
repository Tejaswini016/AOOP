package com.library;

public class LibraryBookTracker {
	public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("123", "The Great Gatsby", "F. Scott Fitzgerald", "Classic");
        Book book2 = new Book("456", "1984", "George Orwell", "Dystopian");

        library.addBook(book1);
        library.addBook(book2);

        library.borrowBook(book1, "Alice");
        library.listAvailableBooks();

        library.returnBook(book1);
        library.listBorrowedBooks();
    }


}
