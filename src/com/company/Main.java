package com.company;


public class Main {

    public static void main(String[] args) {

//        Book bookapp = new Book();
//        bookapp.setAutor("book title");
//        bookapp.setDiscription("Discription");


        Bookapp bookapp1 = new Bookapp();
        bookapp1.setAutor("book title");
        bookapp1.setDiscription("book Discription");

        Bookapp bookapp2= new Bookapp("bookapp1 title","bookapp1 autor","bookapp1",  20.20, false);
        System.out.println(bookapp2.toString());







    }
}
