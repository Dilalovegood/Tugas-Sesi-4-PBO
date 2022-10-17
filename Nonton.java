
package oop21e;

/**
 *
 * @author Dila
 */
public class Nonton {
    public static void main(String[] args) {
        Movie mymovie = null;
        
        Bahasa mylanguage = new Bahasa ("Indonesia", "Stranger Things Season 4");
        Durasi jml_durasi = new Durasi(2, "Stranger Things Season 4");
        mymovie = mylanguage;
        mymovie.infoMovie();
        
        mymovie = jml_durasi;
        mymovie.infoMovie();
        
    }            
}
