/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_6;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ejer_6 {

    public static void main(String[] args) {
       
        double base, altura, area, perimetro;
        
        System.out.println("Ingrese la altura:");
        Scanner Captura = new Scanner (System.in);
        altura = Captura.nextDouble();
        
        System.out.println("Ingrese la base:");
        Scanner Captura2 = new Scanner (System.in);
        base = Captura2.nextDouble();
        
        area = base*altura;
        System.out.println("El area del Rectangulo es:" +area);
        
        perimetro = base+base+altura+altura;
        System.out.println("El perimetro del Rectangulo es:"+perimetro);
         
    }
 
}
