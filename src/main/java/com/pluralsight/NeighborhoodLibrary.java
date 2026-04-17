package com.pluralsight;

public class NeighborhoodLibrary {
    private static Book[] books = new Book[20]; // An array of books that goes up to 20

    private static int numBooks = 20; // Amount of books in array

    public static void main(String[] args) {

        books[0] = new Book(001, "B-123-01", "Lord of the rings");
        System.out.println(books[0]);
    }
}
