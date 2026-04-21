package com.pluralsight;

import java.util.Scanner;

public class NeighborhoodLibrary {
    private static Book[] books = new Book[20]; // An array of books that goes up to 20

    private static int numBooks = 20; // Amount of books in array

    public static void main(String[] args) {
        // Making Books, giving id, isbn, title
        books[0] = new Book(101, "B-123-11", "The Lord of The Rings");
        books[1] = new Book(102, "B-123-22", "1984");
        books[2] = new Book(103, "B-123-33", "Harry Potter and the Goblet of Fire");
        books[3] = new Book(104, "B-123-44", "The Great Gatsby");
        books[4] = new Book(105, "B-123-55", "The Road");
        books[5] = new Book(106, "B-123-66", "Beloved");
        books[6] = new Book(107, "B-123-77", "The Kite Runner");
        books[7] = new Book(108, "B-123-88", "The Hunger Games");
        books[8] = new Book(109, "B-123-99", "The Hobbit");
        books[9] = new Book(110, "B-124-11", "Dracula");
        books[10] = new Book(111, "B-124-22", "The Odyssey");
        books[11] = new Book(112, "B-124-33", "Animal Farm");
        books[12] = new Book(113, "B-124-44", "Allegiant");
        books[13] = new Book(114, "B-124-55", "Brave New World");
        books[14] = new Book(115, "B-124-66", "The 48 Laws of Power");
        books[15] = new Book(116, "B-124-77", "The Cat in the Hat");
        books[16] = new Book(117, "B-124-88", "Wuthering Heights");
        books[17] = new Book(118, "B-124-99", "Life of Pi");
        books[18] = new Book(119, "B-125-11", "The Da Vinci Code");
        books[19] = new Book(120, "B-125-22", "The Maze Runner");

        Scanner scanner = new Scanner(System.in);

        boolean isDone = false;

        while (!isDone) {
            // Asking User for input on what they want to do
            System.out.println("Welcome to the Neighborhood Library: ");
            System.out.println(" 1 - Show Available Books");
            System.out.println(" 2 - Show Checked Out Books");
            System.out.println(" 3 - Exit");
            System.out.println("Enter your command:");

            int input = scanner.nextInt(); // Stores users input
            scanner.nextLine(); // Prevents input from glitching

            switch (input) {
                case 1:
                    availableBooks(scanner);
                    break;

            }
            }




        }
        // Method for showing available books when user selects 1
        public static void availableBooks(Scanner scanner) {
            System.out.println("Available Books: ");

            for (int i = 0; i < numBooks; i++) {
                if (!books[i].isCheckedOut()) {
                    System.out.println("ID: " + books[i].getId() + " | ISBN: " + books[i].getIsbn() + " | Title: " + books[i].getTitle());
                }

            }
            System.out.println("Enter Book ID to check out book(X to exit): ");
            String bookInput = scanner.nextLine();

            if (bookInput.equalsIgnoreCase("X")) {
                return;
            }






        }







    }

