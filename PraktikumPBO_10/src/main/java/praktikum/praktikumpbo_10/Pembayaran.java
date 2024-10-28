/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.praktikumpbo_10;

/**
 *
 * @author Raymond
 */
public interface Pembayaran {
    double hitungPajak(double harga);
}

class Elektronik implements Pembayaran{
    @Override
    public double hitungPajak(double harga){
        return harga*0.1;
    }
}

class Makanan implements Pembayaran{
    @Override
    public double hitungPajak(double harga){
        return harga*0.05;
    }
}
