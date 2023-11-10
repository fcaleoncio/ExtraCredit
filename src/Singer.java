/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author France Leoncio
 */
public class Singer {
    String name;
    int noOfPerformances;
    String favoriteSong;
    int performForAudience;
    int earnings;
    String changeFavSong;
    
    public Singer(String a, int c, String e, String g) {
        name = a;
        noOfPerformances = c;
        favoriteSong = e;
        performForAudience = 12;
        earnings = performForAudience * 100;
        changeFavSong = g;
    }
}
