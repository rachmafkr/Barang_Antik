/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Barang_Antik;

/**
 * Nama: Rachma Fadilah Kunianto
 * NIM: 22166019
 * Kelas: SISTEM INFORMASI
 * Semester: Tiga
 * Mata Kuliah: PBO1
 */

import java.util.Scanner; 

class BarangAntik {
    protected int umur;
    
    public BarangAntik(int umur) {
        this.umur = umur;
    }
    public void tampilUmur() {
        System.out.println("Umur barang antik ini adalah: " + umur + " tahun.");
    }
}


class Radio extends BarangAntik {
    private String name;

    public Radio(int umur) {
        super(umur);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}


public class Barang_Antik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan umur barang antik (dalam tahun): ");
        int umurBarangAntik = scanner.nextInt();

        Radio radioAntik = new Radio(umurBarangAntik);

        System.out.print("Masukkan nama radio antik: ");
        scanner.nextLine();
        String namaRadio = scanner.nextLine();
        radioAntik.setName(namaRadio);

        System.out.println();
        System.out.println("Nama barang antik: " + radioAntik.getName());
        radioAntik.tampilUmur();
    }
}