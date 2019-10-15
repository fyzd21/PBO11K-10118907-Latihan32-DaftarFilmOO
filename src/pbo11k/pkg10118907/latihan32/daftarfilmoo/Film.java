/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118907.latihan32.daftarfilmoo;

/**
 *
 * @author programmer
 */
public class Film {
    public String filmName, filmGenre;
    public Double filmRating;
    public int filmDuration;
    
    public void nowPlaying() {
        System.out.println("Judul film : "+filmName);
        System.out.println("Genre film : "+filmGenre);
        System.out.println("Rating film : "+filmRating);
        System.out.println("Durasi film : "+filmDuration+" menit");
        System.out.println("");
    }
}
