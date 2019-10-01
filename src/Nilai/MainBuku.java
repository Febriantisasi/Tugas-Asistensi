/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nilai;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class MainBuku {
   public static void main(String[]args){
       BukuClass B = new BukuClass();
       System.out.println("DATA BUKU");
        Scanner input=new Scanner(System.in);
        B.setNamaPengarang("Febrianti Silviana Saputri");
        B.setJudulBuku("Kala Senja di Laut Itu");
        B.setTahunTerbit(2017);
        B.setCetakanKe(3);
        B.setHargaJual(150000);
        B.infoBuku();
   } 
}
