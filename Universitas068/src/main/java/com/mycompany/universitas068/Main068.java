/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.universitas068;

/**
 *
 * @author acer
 */
public class Main068{
    public static void main(String[] args) {
        Mahasiswa068 mhs1 = new MahasiswaReguler068("Alvinnur");
        Mahasiswa068 mhs2 = new MahasiswaPascasarjana068("Syakur");

        mhs1.kuliah(); // Output: Alvinnur kuliah secara reguler.
        mhs2.kuliah(); // Output: Syakir kuliah di tingkat pascasarjana.
    }
}
