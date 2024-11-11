package com.library;

public class Library {
	 private Set<Book> books = new HashSet<>();
	    private Map<Book, String> borrowedBooks = new HashMap<>();

	    public void addBook(Book book) {
	        System.out.println(books.add(book) ? "Added: " + book : "Book already exists.");
	    }
	    public void borrowBook(Book book, String member) {
	        if (books.contains(book) && !borrowedBooks.containsKey(book)) {
	            borrowedBooks.put(book, member);
	            System.out.println(member + " borrowed " + book);
	        } else {
	            System.out.println("Book unavailable.");
	        }
	    }
	    public void returnBook(Book book) {
	        System.out.println(borrowedBooks.remove(book) != null ? "Returned: " + book : "Book not borrowed.");
	    }

	    public void listAvailableBooks() {
	        books.stream().filter(b -> !borrowedBooks.containsKey(b)).forEach(System.out::println);
	    }

	    public void listBorrowedBooks() {
	        borrowedBooks.forEach((book, member) -> System.out.println(book + " borrowed by " + member));
	    }
	}

