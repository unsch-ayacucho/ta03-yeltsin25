/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Yeltsin-Pc
 */
public class Ejercicio001 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String[] numeros = new String[100];
        
        for(int i=0; i<numeros.length; i++){
            numeros[i] = String.valueOf((int) (Math.random()*20)+1);
            System.out.print(numeros[i] + " ");
            
        }
        System.out.println();
        System.out.println("Ingrese el primer numero");
        int numero1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        int numero2 = sc.nextInt();
        
        for(int i=0; i<numeros.length; i++){
            if(String.valueOf(numero1).equals(numeros[i])){
                numeros[i]=String.valueOf("'"+numero2+"'");
            }
            
        }
        for(int i=0; i < numeros.length; i++){
            System.out.print(numeros[i]+" ");
        }
    }   
}
