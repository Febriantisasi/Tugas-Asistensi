/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nilai;

/**
 *
 * @author LENOVO
 */
public class Pelajar{
    private String nip;
    private String nama;
    private double nilai1;
    private double nilai2;
    private double tugas;

    
    public Pelajar(String nip, String nama, double nilai1, double nilai2, double tugas) {
        this.nip = nip;
        this.nama = nama;
        this.nilai1 = nilai1;
        this.nilai2 = nilai2;
        this.tugas = tugas;
    }

    Pelajar(double nilai1, double nilai2, double tugas) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public String getNip() {
        return nip;
    }
    public void setNip(String nip) {
        this.nip = nip;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public double getNilai1() {
        return nilai1;
    }
    public void setNilai1(double nilai1) {
        this.nilai1 = nilai1;
    }
    public double getNilai2() {
        return nilai2;
    }

    public void setNilai2(double nilai2) {
        this.nilai2 = nilai2;
    }
     public double getTugas() {
        return tugas;
    }

    public void setTugas(double tugas) {
        this.tugas = tugas;
    }
    public double nilaiAkhir(){
        double  A,B,C,Total;
        A=40*getNilai1()/100;
        B=40*getNilai2()/100;
        C=20*getTugas()/100;
        Total=A+B+C;
        return Total;
    }
    public void infoNilai(){
        System.out.println("Nilai Akhir\t:"+nilaiAkhir());
    }
   
    public double isLulus(){
        double Total =nilaiAkhir();
        if(Total>=60&&Total<=100){
            System.out.println("LULUS");}
        else if(Total<=60&&Total>=0){
            System.out.println("TIDAK LULUS");}
        else {
            System.out.println("ERROR");

        }
            return Total;

}
        
    public void infoKelulusan(){
        System.out.println("Status kelulusan\t: "+isLulus());
                    

}
   
    }

