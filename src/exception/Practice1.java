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
public class Practice1 {
    public static void main (String [] args) {
        int n = 0;
        try{
            n = System.in.read();
        } catch (java.io.IOException f){
            System.err.println(f.getMessage());
        }
        System.out.println("Hasil : "+(char) n);
    }
}
