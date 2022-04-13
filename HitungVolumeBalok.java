package Tugas2_OOP;
/**
 *
 * @author I Gusti Ngurah Angga Putra Sukanta
 *         19103028
 */
public class HitungVolumeBalok {
    
    private float panjang;
    private float lebar;
    private float tinggi;
    double volume;
    
    public HitungVolumeBalok (float PJ, float LB, float TG){
      
       this.panjang = PJ;    
       this.lebar   = LB; 
       this.tinggi  = TG; 
    }
    
    /*
    Method setPANJANG
    Parameter float PJ
    Untuk set nilai ke property/Atribut panjang
    */
    public void setPANJANG(float PJ){
        // check validasi
        this.panjang = PJ;
    }
     /*
    Method setLEBAR
    Parameter float LB
    Untuk set nilai ke property/Atribut lebar
    */
    public void setLEBAR (float LB){
        this.lebar = LB;
    }
     /*
    Method setTINGGI
    Parameter float TG
    Untuk set nilai ke property/Atribut tinggi
    */
    public void setTINGGI (float TG){
        this.tinggi = TG;
    }
    
    private double HitungVolume(){
        this.volume = panjang * lebar * tinggi;
        return volume;
    }
    public void CetakVolume(){
        this.HitungVolume();
        System.out.println("Hitung Volume Balok");
        System.out.println("---------------------");
        System.out.println("Nilai Panjang   : "+this.panjang+" cm");
        System.out.println("Nilai Lebar     : "+this.lebar+" cm");
        System.out.println("Nilai Tinggi    : "+this.tinggi+" cm");
        System.out.println("Volume          : "+this.volume+" cm³");
        
        
    }
    
}
