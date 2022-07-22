/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_4;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ejer_4 {
    
    public static void main(String[] args) {
        
        double precioNormal, precioPagar, descu1, descuento;
        
        Scanner lector1 = new Scanner (System.in);
        System.out.println("Ingrese el precio normal:");
        precioNormal= lector1.nextDouble();
       
        Scanner lector2 = new Scanner (System.in);
        System.out.println("Ingrese el precio a pagar:");
        precioPagar = lector2.nextDouble();
        
        descu1 = precioNormal - precioPagar;
        descuento = (descu1/precioNormal)*100;
        
        System.out.println("Su descuento es: "+descuento+" %");
    }
}
