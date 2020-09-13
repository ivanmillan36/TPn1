/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tpn1;
import javax.swing.JOptionPane;
/**
 *
 * @author ivanmillan36
 */
public class ej_3 {
    public static void main(String[] args) {
        float num1= 100, num2= 50;
        
        JOptionPane.showMessageDialog(null, "La suma es: " + (num1 + num2));
        JOptionPane.showMessageDialog(null, "La resta es: " + (num1 - num2));
        JOptionPane.showMessageDialog(null, "La multiplicacion es: " + (num1 * num2));
        JOptionPane.showMessageDialog(null, "La division es: " + (num1 / num2));
        JOptionPane.showMessageDialog(null, "El modulo es: " + (num1 % num2));
        
    }
}
