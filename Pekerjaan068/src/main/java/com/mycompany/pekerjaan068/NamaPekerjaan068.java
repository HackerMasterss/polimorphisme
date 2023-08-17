/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pekerjaan068;

/**
 *
 * @author acer
 */
class NamaPekerjaan068{
    protected String namaPekerjaan;
    protected String tugas;
    NamaPekerjaan068(String namaPekerjaan, String tugas) {
        this.namaPekerjaan = namaPekerjaan;
        this.tugas = tugas;
    }

    void deskripsi() {
        System.out.println("Nama Pekerjaan: " + namaPekerjaan);
        System.out.println("Tugas: " + tugas);
    }
}
