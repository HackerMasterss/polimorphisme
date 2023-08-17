/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.kendaraan068;

/**
 *
 * @author acer
 */
public class main {
    public static void main(String[] args) {
        Kendaraan068 kendaraan = new Kendaraan068();

        float jariJari = 5.0f;
        double panjang = 10.0;

        float luasDenganJariJari = kendaraan.luas(jariJari);
        double luasDenganPanjang = kendaraan.luas(panjang);

        System.out.println("Luas Kendaraan dengan Jari-jari " + jariJari + " = " + luasDenganJariJari);
        System.out.println("Luas Kendaraan dengan Panjang " + panjang + " = " + luasDenganPanjang);
    }
}