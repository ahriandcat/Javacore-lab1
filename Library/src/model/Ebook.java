package model;

public class Ebook extends Library{
    private double dungLuong;
    private String picture;
    private int download;

    public Ebook(int id, String name, String[] type, String publisher, int year, double dungLuong, String picture, int download) {
        super(id, name, type, publisher, year);
        this.dungLuong = dungLuong;
        this.picture = picture;
        this.download = download;
    }

    public double getDungLuong() {
        return dungLuong;
    }

    public void setDungLuong(double dungLuong) {
        this.dungLuong = dungLuong;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public int getDownload() {
        return download;
    }

    public void setDownload(int download) {
        this.download = download;
    }

    @Override
    public String toString() {
        return super.toString() + " Dung lượng : "+dungLuong+ " Ảnh : "+picture+ " Số lượt tải : "+download;
    }
}