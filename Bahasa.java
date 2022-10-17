
package oop21e;

/**
 *
 * @author Dila
 */
public class Bahasa extends Movie {
    protected String bahasa;
    
    public Bahasa(String bahasa, String subtitle) {
        super(subtitle);
        this.bahasa = bahasa;
    }
    public void infoMovie(){
        System.out.println("Nama movie : " + super.nama_movie);
        System.out.println("Movie Berbahasa : " +this.bahasa);
    }
}
