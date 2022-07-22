/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_12;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ejer_12 {
    
    public static void main(String[] args) {
       
        double  num1, num2, num3, suma, multiplicacion;
        
        System.out.println("Ingrese el primer numero:");
        Scanner CapturaLado1 = new Scanner (System.in);
        num1 = CapturaLado1.nextDouble();
        
        System.out.println("Ingrese el segundo numero:");
        Scanner CapturaLado2 = new Scanner (System.in);
        num2 = CapturaLado2.nextDouble();
        
        System.out.println("Ingrese el tercer numero:");
        Scanner CapturaLado3 = new Scanner (System.in);
        num3 = CapturaLado3.nextDouble();

        suma = num2 + num3;
        multiplicacion = num1 * suma;  
        
        System.out.println("El multiplicacion es:" +multiplicacion); 
    } 
}
