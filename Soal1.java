/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jihan
 */

import java.util.Scanner;
        
public class Soal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        
        for (int i = 0; i < T; i++) {
            try {
                long n = scanner.nextLong();
                System.out.println(n + "can be fitted in: ");
                
                if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                if (n >=Short.MIN_VALUE && n <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                if (n >= Long.MIN_VALUE && n <= Long.MAX_VALUE){
                    System.out.println("* long");
                }
            }
            catch (Exception e) {
                System.out.println(scanner.next() + "can't be fitted anywhere.");
            }
        }
        scanner.close();
    }
}