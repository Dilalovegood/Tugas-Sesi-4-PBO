
package oop21e;

/**
 *
 * @author Dila
 */
public class Durasi extends Movie {
    protected int jml_durasi;
    
    public Durasi(int jml_durasi, String subtitle)  {
        super(subtitle);
        this.jml_durasi = jml_durasi;
    }
    
public void infoMovie(){
    System.out.println("Nama Movie: " + super.nama_movie);
    System.out.println("Total durasi : " + this.jml_durasi + " jam" + " 30 menit");
}
    
}
