/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package praktikum.praktikumpbo_10;

/**
 *
 * @author Raymond
 */
public class PraktikumPBO_10 {

    public static void main(String[] args) {
        
//        OperasiHitung penjumlahan = new Penjumlahan();
//        System.out.println("Penjumlahan: " + 
//                penjumlahan.hitung(10, 5));
//        
//        OperasiHitung pengurangan = new Pengurangan();
//        System.out.println("Pengurangan: " + 
//                pengurangan.hitung(10, 5));
        
        Pembayaran elektronik = new Elektronik();
        System.out.println("Pajak Elektronik: " + 
                elektronik.hitungPajak(10500));
        
        Pembayaran makanan = new Makanan();
        System.out.println("Pajak Makanan: " + 
                makanan.hitungPajak(5500));
    }
}
