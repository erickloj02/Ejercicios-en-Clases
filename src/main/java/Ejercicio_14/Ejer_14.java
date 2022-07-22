/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_14;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ejer_14 {
     
    public static void main(String[] args) {
       
        double  num1, num2, num3, num4, num5, suma, resultado, multi;
        
        System.out.println("Ingrese el primer numero:");
        Scanner CapturaLado1 = new Scanner (System.in);
        num1 = CapturaLado1.nextDouble();
        
        System.out.println("Ingrese el segundo numero:");
        Scanner CapturaLado2 = new Scanner (System.in);
        num2 = CapturaLado2.nextDouble();
        
        System.out.println("Ingrese el tercer numero:");
        Scanner CapturaLado3 = new Scanner (System.in);
        num3 = CapturaLado3.nextDouble();
        
        System.out.println("Ingrese el cuarto numero:");
        Scanner CapturaLado4 = new Scanner (System.in);
        num4 = CapturaLado4.nextDouble();

        System.out.println("Ingrese el quinto numero:");
        Scanner CapturaLado5 = new Scanner (System.in);
        num5 = CapturaLado5.nextDouble();
        
        suma = (num1 + num2 + num3)/2;
        multi =  1/3 + (num4 * num5);  
        resultado= suma + multi;
                
                
        System.out.println("El resultado es:" +resultado); 
    } 
}


/*
1 2 3 4 5

suma =6/2 
suma= 3

multi = 1/3 + 20
multi = 20.33

resultado= suma + multi
resultado = 23.33
*/