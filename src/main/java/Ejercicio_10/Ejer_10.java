/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_10;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ejer_10 {
    
     public static void main(String[] args) {
       
        int A, B;
        
        Scanner e = new Scanner (System.in);
        System.out.println("Ingrese el valor de A:");
        A= e.nextInt();
        
        System.out.println("Ingrese el valor de B:");
        B= e.nextInt();
        
        A = A+B;
        B = A-B;
        A = A-B;
        System.out.println("El valor de A es:"+A);
        System.out.println("El valor de B es:"+B);
    }
}
