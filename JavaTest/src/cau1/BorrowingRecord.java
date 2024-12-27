/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cau1;

/**
 *
 * @author Nguyen Viet Long
 */
public class BorrowingRecord {
    private Book book;
    private int borrowedDays;
    private Member member;

    public BorrowingRecord(Book book, int borrowedDays, Member member) {
        this.book = book;
        this.borrowedDays = borrowedDays;
        this.member = member;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public int getBorrowedDays() {
        return borrowedDays;
    }

    public void setBorrowedDays(int borrowedDays) {
        this.borrowedDays = borrowedDays;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }
    
    
}
