package model;

import java.time.LocalDate;

public class Paper extends Library {
    private LocalDate date;
    private int quantity;
    private int numOfPage;

    public Paper(int id, String name, String[] type, String publisher, int year, LocalDate date, int quantity, int numOfPage) {
        super(id, name, type, publisher, year);
        this.date = date;
        this.quantity = quantity;
        this.numOfPage = numOfPage;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getNumOfPage() {
        return numOfPage;
    }

    public void setNumOfPage(int numOfPage) {
        this.numOfPage = numOfPage;
    }

    @Override
    public String toString() {
        return super.toString() + " Ngày xuất bản : " + date + " Số lượng : "+ quantity + " Số trang : "+ numOfPage;
    }
}