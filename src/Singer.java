/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author France Leoncio
 */
public class Singer {
    private String name;
    private int noOfPerformances;
    private static int totalPerformances;
    private double earnings;
    public Song favoriteSong;
    private String new1;
    private int aud;
    private Object changeFavSong;
    
    
    public void performForAudience(int aud) {
        noOfPerformances++;
        totalPerformances++;
        earnings = 100 * aud;
    }
    
    public void performForAudience(int aud, Singer conanGray, Singer yohKamiyama) {
        noOfPerformances++;
        conanGray.noOfPerformances++;
        yohKamiyama.noOfPerformances++;
        
        totalPerformances++;
        
        earnings = 100 * aud;
        conanGray.earnings = 100 * aud;
        yohKamiyama.earnings = 100 * aud;
    }
    
    public void changeFavSong(Song new1) {
        this.favoriteSong = new1;
    }
    
    public Singer(String a, Song c, int nOP, double earn) {
        this.name = a;
        this.favoriteSong = c;
        this.noOfPerformances = nOP;
        this.earnings = earn;
    }
    public String getName() {
        return name;
    }

    public int getNoOfPerformances() {
        return noOfPerformances;
    }    
    
    public Song getFavoriteSong() {
        return favoriteSong;
    }
    
    public double getEarnings() {
        return earnings;
    }
    
    public static int getTotalPerformances() {
        return totalPerformances;
    }
    
    public void setEarnings(double earn) {
        earnings = earnings + earn;
    }
    
    public void setTotalPerformances() {
        totalPerformances++;
    }
}
