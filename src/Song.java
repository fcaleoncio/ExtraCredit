/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author France Leoncio
 */
public class Song {
    private String title;
    
    public Song(String t) {
        title = t;
    }
    
    public String getTitle() {
        return title;
    }
    
    @Override
        public String toString()
        {
            return title;
        }
}
