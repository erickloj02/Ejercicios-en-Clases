/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_2;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ejer_2 {
   
    public static void main(String[] args) {
        
        double v1, grados;
        
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese la Temperatura:");
    
        v1= leer.nextInt();
        grados = (v1 * 9/5) + 32;
        System.out.println("La temperatura en grados Fahrenheit es:"+grados);
    }
}
