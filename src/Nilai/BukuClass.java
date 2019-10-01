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
public class BukuClass {
    private String namaPengarang;
    private String judulBuku;
    private int tahunTerbit;
    private int cetakanKe;
    private double hargaJual;

    public BukuClass(String namaPengarang, String judulBuku, int tahunTerbit, int cetakanKe, double hargaJual) {
        this.namaPengarang = namaPengarang;
        this.judulBuku = judulBuku;
        this.tahunTerbit = tahunTerbit;
        this.cetakanKe = cetakanKe;
        this.hargaJual = hargaJual;
    }
    public BukuClass(){}
    

    public String getNamaPengarang() {
        return namaPengarang;
    }

    public void setNamaPengarang(String namaPengarang) {
        this.namaPengarang = namaPengarang;
    }

    public String getJudulBuku() {
        return judulBuku;
    }

    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public int getCetakanKe() {
        return cetakanKe;
    }

    public void setCetakanKe(int cetakanKe) {
        this.cetakanKe = cetakanKe;
    }

    public double getHargaJual() {
        return hargaJual;
    }

    public void setHargaJual(double hargaJual) {
        this.hargaJual = hargaJual;
    }
    
    public void infoBuku(){
        System.out.println("Nama Pengarang\t\t:"+getNamaPengarang());  
        System.out.println("Judul Buku\t\t:"+getJudulBuku());
        System.out.println("Tahun Terbit\t\t:"+getTahunTerbit());
        System.out.println("Cetakan ke\t\t:"+getCetakanKe()); 
        System.out.println("Harga Jual\t\t:Rp"+getHargaJual()); 

}
        
    
    
    
}
