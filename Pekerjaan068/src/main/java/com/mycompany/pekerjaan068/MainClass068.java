/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pekerjaan068;

/**
 *
 * @author acer
 */
public class MainClass068 {
    public static void main(String[] args) {
        NamaPekerjaan068 pekerjaanUmum = new NamaPekerjaan068("Umum", "Melakukan berbagai tugas umum");
        PekerjaanKantor068 pekerjaanKantor = new PekerjaanKantor068("Administrasi", "Mengelola administrasi perkantoran");
        PekerjaanLapangan068 pekerjaanLapangan = new PekerjaanLapangan068("Pertanian", "Mengurus kegiatan pertanian");

        pekerjaanUmum.deskripsi(); // Memanggil metode deskripsi() dari kelas NamaPekerjaan
        System.out.println();
        pekerjaanKantor.deskripsi(); // Memanggil metode deskripsi() dari kelas PekerjaanKantor
        System.out.println();
        pekerjaanLapangan.deskripsi(); // Memanggil metode deskripsi() dari kelas PekerjaanLapangan
    }
}
