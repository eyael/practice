package com.company;

import java.awt.print.Book;

public class Bookapp {
    private String Booktitle;
    private String autor;
    private String Discription;
    private double price;
    private boolean isinstock;

    public Bookapp() {
    }

    public Bookapp(String booktitle, String autor, String discription, double price, boolean isinstock) {
        Booktitle = booktitle;
        this.autor = autor;
        Discription = discription;
        this.price = price;
        this.isinstock = isinstock;
    }

    @Override
    public String toString() {
        return "Bookapp{" +
                "Booktitle='" + Booktitle + '\'' +
                ", autor='" + autor + '\'' +
                ", Discription='" + Discription + '\'' +
                '}';
    }

    public String getBooktitle() {
        return Booktitle;
    }

    public void setBooktitle(String booktitle) {
        Booktitle = booktitle;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDiscription() {
        return Discription;
    }

    public void setDiscription(String discription) {
        Discription = discription;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isIsinstock() {
        return isinstock;
    }

    public void setIsinstock(boolean isinstock) {
        this.isinstock = isinstock;
    }
}








