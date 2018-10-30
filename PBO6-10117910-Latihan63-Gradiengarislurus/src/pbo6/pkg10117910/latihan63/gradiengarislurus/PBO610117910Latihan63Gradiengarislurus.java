/*
 *
 * @author
 * NAMA 	: Ricky Yudha Pratama Kawamura
 * KELAS	: PBO6
 * NIM		: 10117910
 * 
 * Description : Program Gradien garis lurus
 *
 */
package pbo6.pkg10117910.latihan63.gradiengarislurus;

/**
 *
 * @author User
 */
public class PBO610117910Latihan63Gradiengarislurus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Koordinat k = new Koordinat(2, 10, 5, 7);
        
        System.out.println("Garis yang melalui titik "
                + "(" + k.getX1() + "," + k.getY1() + ")" 
                +" dan (" + k.getX2() + "," + k.getY2() + ")");
        System.out.println("memiliki gradien sebesar "+k.hitungGradien());
        
        Koordinat k2 = new Koordinat(5, 1, 3, 12);
        
        System.out.println("Garis yang melalui titik "
                + "(" + k2.getX1() + "," + k2.getY1() + ")" 
                +" dan (" + k2.getX2() + "," + k2.getY2() + ")");
        System.out.println("memiliki gradien sebesar "+k2.hitungGradien());
        
    }
    
}
