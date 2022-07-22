/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_18;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ejer_18 {
    
    public static void main(String[] args) {
       
        int numeros [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,};
        Arrays.sort(numeros);
        
        for (int i=numeros.length-1; i>=0; i--){
            
            System.out.println(""+numeros[i]);
        
        }
    } 
}
