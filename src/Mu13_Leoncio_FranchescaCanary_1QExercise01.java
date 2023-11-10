/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author France Leoncio
 */
public class Mu13_Leoncio_FranchescaCanary_1QExercise01 {
    public static void main(String[] args){
        String book1 = "Harry Potter";
        String book2 = "Twilight";
        String book3 = "Percy Jackson";
        byte no1 = 7;
        byte no2 = 7;
        byte no3 = 6;
        int year1 = 26;
        int year2 = 18;
        int year3 = 18;
        boolean noofbooks = (no1 == no2);
        boolean noofryears = (year1 == year2);
        
        System.out.println("Book 1");
        System.out.println("Name: " + book1);
        System.out.println("Total Number of Books: " + no1);
        System.out.println("Years since first release: " + year1);
        System.out.println("");
        System.out.println("Book 2");
        System.out.println("Name: " + book2); 
        System.out.println("Total Number of Books: " + no2);
        System.out.println("Years since first release: " + year2);
        System.out.println("");
        System.out.println("Book 3");
        System.out.println("Name: " + book3);  
        System.out.println("Total Number of Books: " + no3);
        System.out.println("Years since first release: " + year3);
        System.out.println("");
        System.out.println("");
        System.out.println("Harry Potter and Twilight, same number of books: " + (noofbooks));
        System.out.println("Twilight and Percy Jackson, same release year: " + (noofryears));
        System.out.println("Total years since release for all three books: " + (year1 + year2 + year3));
        
        
    }
}
