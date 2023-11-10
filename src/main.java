/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author France Leoncio
 */
public class main {
    public static void main(String[] args){
        Book harryPotter = new Book("Harry Potter", 7, 26);
        Book twilight = new Book("Twilight", 7, 18);
        Book percyJackson = new Book("Percy Jackson", 5, 18);
        
        Song racingIntoTheNight = new Song("Racing Into the Night", 2019);
        Song theArcher = new Song("The Archer", 2019);
        
        Singer conanGray = new Singer("Conan Gray", 1, racingIntoTheNight.song, theArcher.song);
        
        System.out.println("Book 1");
        System.out.println("Name: " + harryPotter.name);
        System.out.println("No. of books: " + harryPotter.books);
        System.out.println("Years since release: " + harryPotter.years);
        System.out.println("");
        System.out.println("Book 2");
        System.out.println("Name: " + twilight.name);
        System.out.println("No. of books: " + twilight.books);
        System.out.println("Years since release: " + twilight.years);
        System.out.println("");
        System.out.println("Book 3");
        System.out.println("Name: " + percyJackson.name);
        System.out.println("No. of books: " + percyJackson.books);
        System.out.println("Years since release: " + percyJackson.years);
        System.out.println("");
        System.out.println("");
        System.out.println("Singer");
        System.out.println(conanGray.name + "'s favorite song is" + conanGray.favoriteSong + ".");
        System.out.println(conanGray.name + " performed " + conanGray.noOfPerformances + " performance to " + conanGray.performForAudience + " people.");
        System.out.println(conanGray.name + "'s fave song is changed to " + conanGray.changeFavSong + ".");
    }
}
