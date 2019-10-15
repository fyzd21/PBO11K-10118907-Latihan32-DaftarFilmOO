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
public class PBO11K10118907Latihan32DaftarFilmOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("--Daftar film sedang tayang--");
        Film f = new Film();
        f.filmName = "Venom";
        f.filmGenre = "Action, Horror, Scifi";
        f.filmRating = 8.5;
        f.filmDuration = 120;
        f.nowPlaying();
        
        
        Film f2 = new Film();
        f2.filmName = "Small Foot";
        f2.filmGenre = "Animation";
        f2.filmRating = 9.0;
        f2.filmDuration = 96;
        f2.nowPlaying();
        
        
        Film f3 = new Film();
        f3.filmName = "Crazy Rich Asian";
        f3.filmGenre = "Comedy";
        f3.filmRating = 7.8;
        f3.filmDuration = 119;
        f3.nowPlaying();
        
        
        Film f4 = new Film();
        f4.filmName = "Asih";
        f4.filmGenre = "Horror";
        f4.filmRating = 6.0;
        f4.filmDuration = 100;
        f4.nowPlaying();
        
        
    }
    
}
