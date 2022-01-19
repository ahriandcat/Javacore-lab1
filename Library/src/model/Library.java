package model;

import java.util.Arrays;

public class Library{
    private int id;
    private String name;
    private String [] category;
    private String publisher;
    private int year;

    public Library(int id, String name, String[] type, String publisher, int year) {
        this.id = id;
        this.name = name;
        this.category = type;
        this.publisher = publisher;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getCategory() {
        return category;
    }

    public void setCategory(String[] category) {
        this.category = category;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", Tên : " + name +
                ", Danh mục" + Arrays.toString(category) +
                ", Nhà xuất bản : " + publisher +
                ", Năm xuất bản : " + year ;
    }
}