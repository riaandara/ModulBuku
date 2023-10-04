package org.example;

public class Main {
    public static void main(String[] args) {
        Buku a,b = new Buku();
        a = new Buku("The Picture of Dorian Gray", "Oscar Wilde");
        b = new Buku();
        a.cetakKeLayar();
        b.cetakKeLayar();
    }
}