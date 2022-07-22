/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_8;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ejer_8 {
    
    public static void main(String[] args) {
       
        double base, lado1, lado2, area, area1, perimetro, semiperimetro;
        
        System.out.println("Ingrese el primer lado:");
        Scanner CapturaLado1 = new Scanner (System.in);
        lado1 = CapturaLado1.nextDouble();
        
        System.out.println("Ingrese el segundo lado:");
        Scanner CapturaLado2 = new Scanner (System.in);
        lado2 = CapturaLado2.nextDouble();
        
        System.out.println("Ingrese el tercer lado(base):");
        Scanner CapturaLado3 = new Scanner (System.in);
        base = CapturaLado3.nextDouble();

        perimetro = base+lado1+lado2;
        System.out.println("El perimetro del Triangulo es:"+perimetro);
        
        semiperimetro = perimetro/2;
        System.out.println("El semiperimetro de un Triangulo es:" +semiperimetro);
        
        area1 = semiperimetro*((semiperimetro-lado1)*(semiperimetro-lado2)*(semiperimetro-base));
        area = Math.sqrt(area1);
        System.out.println("El area del Triangulo es:" +area);
    }
}
