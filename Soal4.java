    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jihan
 */
public class Soal4 {
    static class ConvertDataType {
        static short method0ne(long l) {
            int i = (int) l;
            return (short) i;
        }
        
        public static void main(String[] args) {
            double d = 10.25;
            float f = (float) d;
            byte b = (byte) method0ne((long) f);
            
            System.out.println(b);
        }
    }
}
