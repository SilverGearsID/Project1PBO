/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kegalauanpakbejo;

/**
 *
 * @author Rizky Alif
 */
public class KegalauanPakBejo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Keramik kA = new Keramik();
        /* atribut/properties Keramik A */
        kA.huruf = 'A';
        kA.panjang = 30;
        kA.lebar = 30;
        kA.tanah = 100;
        kA.isiBox = 10;
        kA.harga = 54000;
        kA.luasTotal = kA.hitungLuas();
        kA.luasMeter();
        kA.luasBox();
        kA.box();
        kA.biaya();
        
        Keramik kB = new Keramik();
        /* atribut/properties Keramik B */
        kB.huruf = 'B';
        kB.panjang = 40;
        kB.lebar = 40;
        kB.tanah = 100;
        kB.isiBox = 5;
        kB.harga = 65000;
        kB.luasTotal = kB.hitungLuas();
        kB.luasMeter();
        kB.luasBox();
        kB.box();
        kB.biaya();
        
        Keramik kC = new Keramik();
        /* atribut/properties Keramik C */
        kC.huruf = 'C';
        kC.panjang = 30;
        kC.lebar = 40;
        kC.tanah = 100;
        kC.isiBox = 8;
        kC.harga = 60000;
        kC.luasTotal = kC.hitungLuas();
        kC.luasMeter();
        kC.luasBox();
        kC.box();
        kC.biaya();
        
        /* menentukan harga keramik yang paling murah */
        if (kA.hargaTotal < kB.hargaTotal){
            if (kA.hargaTotal < kC.hargaTotal){
                System.out.println("Harga Keramik yang paling murah adalah: Keramik " + kA.huruf);
            }
        }
        if (kB.hargaTotal < kA.hargaTotal){
            if (kB.hargaTotal < kC.hargaTotal){
                System.out.println("Harga Keramik yang paling murah adalah: Keramik " + kB.huruf);
            }
        }
        if (kC.hargaTotal < kA.hargaTotal){
            if (kC.hargaTotal < kB.hargaTotal){
                System.out.println("Harga Keramik yang paling murah adalah: Keramik " + kC.huruf);
            }
        }
    }
    
}
