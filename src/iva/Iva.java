/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package iva;
import java.util.Scanner;
/**
 *
 * @author erik.hernandez
 */
public class Iva {

    public static void main(String[] args) {
       
        double precio,
                PrecioIVA;
        Scanner InDate= new Scanner(System.in);
        
        System.out.println("What is the price of the product?");
        precio=InDate.nextDouble();
        PrecioIVA=precio+(precio*0.25);
        System.out.println("The final cost with 25% VAT is " +PrecioIVA);    
    }
}
