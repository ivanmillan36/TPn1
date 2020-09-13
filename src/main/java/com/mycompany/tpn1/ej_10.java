/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tpn1;
import java.util.Scanner;
/**
 *
 * @author ivanmillan36
 */
public class ej_10 {
    public static void main(String[] args) {
        
        float num;
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.println("Ingresa un numero por consola: ");
            num = sc.nextFloat();
        }while (num < 0); 
        
        System.out.println("El numero ingresado es: " + num);
        
    }
}
