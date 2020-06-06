/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author ACER I3 VGA
 */
public class practice2 {
    public static void main (String [] args){
        byte [] b = new byte [5];
        try{
            System.in.read(b);
        } catch (java.io.IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Hasil :" +(char) b[9] +(char) b[3] +(char) b[2]);
    }
}
