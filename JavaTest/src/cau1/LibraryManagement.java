/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cau1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Nguyen Viet Long
 */
public class LibraryManagement {

    public List<BorrowingRecord> initalizeRecodes() {
        List<BorrowingRecord> records = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng bản ghi sách:");
        int numberOfRecords = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numberOfRecords; i++) {
            System.out.println("Nhập thông tin cho bản ghi thứ " + (i + 1) + ":");
            System.out.println("Tiêu đề: ");
            String title = sc.nextLine();

            System.out.println("Số trang: ");
            int pages = sc.nextInt();
            sc.nextLine();

            System.out.println("Tác giả: ");
            String author = sc.nextLine();

            System.out.print("Tên thành viên: ");
            String memberName = sc.nextLine();

            System.out.println("ID thành viên: ");
            String memberId = sc.nextLine();

            System.out.print("Số ngày mượn: ");
            int borrowedDays = sc.nextInt();
            sc.nextLine(); // Đọc dòng mới

            addRecord(records, title, pages, author, memberName, memberId, borrowedDays);
        }
        return records;
    }

    public void addRecord(List<BorrowingRecord> records, String title, int pages, String author, String memberName, String memberId, int borrowedDays) {
        Book book = new Book(title, pages, author);
        Member member = new Member(memberName, memberId);
        BorrowingRecord record = new BorrowingRecord(book, borrowedDays, member);
        records.add(record);
    }
    
    public BorrowingRecord getLongestBorrowed(List<BorrowingRecord> records) {
        return records.stream()
                .max(Comparator.comparingInt(BorrowingRecord::getBorrowedDays))
                .orElse(null);
    }

    public BorrowingRecord getShortestBorrowed(List<BorrowingRecord> records) {
        return records.stream()
                .min(Comparator.comparingInt(BorrowingRecord::getBorrowedDays))
                .orElse(null);
    }

    public long countTotalBooks(List<BorrowingRecord> records) {
        return records.stream().count();
    }

}
