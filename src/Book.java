/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author France Leoncio
 */
public class Book {
    private String name;
    private int books;
    private int years;
    
    public Book(String n, int b, int y) {
        name = n;
        books = b;
        years = y;
    }
    
    public String getName() {
        return name;
    }
    
    public int getBooks() {
        return books;
    }
    
    public int getYears() {
        return years;
    }
}
