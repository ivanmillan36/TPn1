/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tpn1;
import javax.swing.JOptionPane;
import java.util.Scanner;
/**
 *
 * @author ivanmillan36
 */
public class ej_2 {
    public static void main(String[] args) {
        
        String nombre;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce tu nombre: ");
        nombre = sc.nextLine();
        System.out.println("Bienvenido " + nombre);
        
        nombre = JOptionPane.showInputDialog("Introduce tu nombre.");
        System.out.println("Bienvenido " + nombre);
        
    }
}
