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
        
        Song racingIntoTheNight = new Song("Racing Into the Night");
        Song theArcher = new Song("The Archer");
        Singer conanGray = new Singer("Conan Gray", racingIntoTheNight, 0, 0.0);
        
        Song yellow = new Song("YELLOW");
        Song vibeWithMe = new Song("Vibe With Me");
        Singer yohKamiyama = new Singer("Yoh Kamiyama", yellow, 0 ,0.0);
        
        conanGray.performForAudience(12);
        yohKamiyama.performForAudience(9);
        conanGray.changeFavSong(theArcher);
        yohKamiyama.changeFavSong(vibeWithMe);

        System.out.println("Before performances: ");
        System.out.println(conanGray.getName() + "\nFavorite song: " + conanGray.favoriteSong.getTitle() + ".\n");
        System.out.println(yohKamiyama.getName() + "\nFavorite song: " + yohKamiyama.favoriteSong.getTitle() + ".\n\n");
        
        System.out.println(conanGray.getName() + "'s no of performances: " + conanGray.getNoOfPerformances() + "\n");
        System.out.println(yohKamiyama.getName() + "'s no of performances: " + yohKamiyama.getNoOfPerformances() + "\n");
        
        System.out.println("Total number of performances: " + (conanGray.getNoOfPerformances() + yohKamiyama.getNoOfPerformances()) + "\n");
        System.out.println("Total earnings: " + (conanGray.getEarnings() + yohKamiyama.getEarnings()) + "\n\n");
        System.out.println("If split equally between them: " + "\n");
        System.out.println("Conan Gray's earnings: " + (((conanGray.getEarnings() + yohKamiyama.getEarnings())/2)) + "\n");
        System.out.println("Yoh Kamiyama's earnings: " + (((conanGray.getEarnings() + yohKamiyama.getEarnings())/2)) + "\n\n");
        System.out.println("If split according to their audience/s: " + "\n");
        System.out.println("Conan Gray's earnings: " + conanGray.getEarnings());
        System.out.println("Yoh Kamiyama's earnings: " + yohKamiyama.getEarnings() + "\n\n");
        
        System.out.println("After performances: ");
        
        System.out.println(conanGray.getName() + "\nFavorite song: " + theArcher.getTitle() + ".\n");
        System.out.println(yohKamiyama.getName() + "\nFavorite song: " + vibeWithMe.getTitle() + ".\n\n");
    }
}
