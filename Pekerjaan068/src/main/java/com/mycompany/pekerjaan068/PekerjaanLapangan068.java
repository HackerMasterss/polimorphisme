/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pekerjaan068;

/**
 *
 * @author acer
 */
class PekerjaanLapangan068 extends NamaPekerjaan068{
    PekerjaanLapangan068(String namaPekerjaan, String tugas) {
        super(namaPekerjaan, tugas);
    }

    @Override
    void deskripsi() {
        System.out.println("Pekerjaan Lapangan:");
        super.deskripsi();
    }
}
