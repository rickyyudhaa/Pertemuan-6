/*
 *
 * @author
 * NAMA 	: Ricky Yudha Pratama Kawamura
 * KELAS	: PBO6
 * NIM		: 10117910
 * 
 * Description : Program Living Thing
 *
 */
package pbo6.pkg10117910.latihan62.livingthing;

/**
 *
 * @author User
 */
public class PBO610117910Latihan62Livingthing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Human h = new Human();
        h.setNama("Rizki Adam Kurniawan");
        h.walk(h.getNama());
        h.breath(h.getNama());
        h.eat(h.getNama());
    }
    
}
