/*
 *
 * @author
 * NAMA 	: Ricky Yudha Pratama Kawamura
 * KELAS	: PBO6
 * NIM		: 10117910
 * 
 * Description : Program Bangun Ruang
 *
 */
package pbo6.pkg10117910.latihan61.bangunruang;

/**
 *
 * @author User
 */
public class PBO610117910Latihan61Bangunruang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tabung t = new Tabung();
        Kerucut k = new Kerucut();
        Bola b = new Bola();
        b.setR(7);
        t.setR(10);
        t.setH(21);
        k.setH(9);
        k.setR(14);
        System.out.printf("Volume Bola     : %.1f cm3 \n",b.volume());
        System.out.printf("Volume Tabung   : %.0f cm3 \n",t.volume());
        System.out.printf("Volume Kerucut  : %,3.0f cm3 \n",k.volume());
    }
}
