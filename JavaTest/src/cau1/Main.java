/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package cau1;

import java.util.List;

/**
 *
 * @author Nguyen Viet Long
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        LibraryManagement libraryManagement = new LibraryManagement();

        // Initialize records
        List<BorrowingRecord> records = libraryManagement.initalizeRecodes();

        // Add a new record from user input
        libraryManagement.addRecord(records, "New Book", 300, "New Author", "New Member", "M006", 5);

        // Total books borrowed
        long totalBooks = libraryManagement.countTotalBooks(records);
        System.out.println("Total number of books borrowed: " + totalBooks);

        // Record with longest borrowed period
        BorrowingRecord longestBorrowed = libraryManagement.getLongestBorrowed(records);
        if (longestBorrowed != null) {
            System.out.println("Record with longest borrowed period:");
            System.out.println("Book Title: " + longestBorrowed.getBook().getTitle());
            System.out.println("Borrowed Days: " + longestBorrowed.getBorrowedDays());
            System.out.println("Member: " + longestBorrowed.getMember().getName());
        }

        // Record with shortest borrowed period
        BorrowingRecord shortestBorrowed = libraryManagement.getShortestBorrowed(records);
        if (shortestBorrowed != null) {
            System.out.println("Record with shortest borrowed period:");
            System.out.println("Book Title: " + shortestBorrowed.getBook().getTitle());
            System.out.println("Borrowed Days: " + shortestBorrowed.getBorrowedDays());
            System.out.println("Member: " + shortestBorrowed.getMember().getName());
        }
    }
}
