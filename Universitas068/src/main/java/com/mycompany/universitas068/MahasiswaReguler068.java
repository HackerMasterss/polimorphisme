/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.universitas068;

/**
 *
 * @author acer
 */

// Kelas Turunan MahasiswaReguler068 yang mewarisi dari Mahasiswa068
class MahasiswaReguler068 extends Mahasiswa068{
    public MahasiswaReguler068(String nama) {
        super (nama);
    }

    public void kuliah() {
        System.out.println(nama + " kuliah secara reguler.");
    }
}





