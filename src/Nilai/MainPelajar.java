/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nilai;

import java.util.Scanner;

/**
 *
 * @author LENOVO006
 */
public class MainPelajar {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("NIP\t: ");
        String nrp = input.nextLine();
        System.out.print("Nama\t:");
        String nama = input.nextLine();
        System.out.print("    A. Nilai 1\t\t: ");
        double nilai1 = input.nextDouble();
       // p.getNilai1();
        System.out.print("    B. Nilai 2\t\t: ");
        double nilai2 = input.nextDouble();
        //p.getNilai2();
        System.out.print("    C. Nilai Tugas\t: ");
        double tugas = input.nextDouble();
        //p.getTugas();
        System.out.println("================================");
        Pelajar p = new Pelajar(nrp,nama,nilai1,nilai2,tugas);
        p.infoNilai();
        p.isLulus();
    }

}
