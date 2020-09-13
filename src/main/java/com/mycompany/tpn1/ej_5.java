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
public class ej_5 {
    public static void main(String[] args) {
        
        float num;
        
        num = Float.parseFloat(JOptionPane.showInputDialog("Ingresa un numero"));
        
        if (num % 2 == 0){
            JOptionPane.showMessageDialog(null, "El numero " + num + " es divisible por 2.");
        }else{
            JOptionPane.showMessageDialog(null, "El numero " + num + " no es divisible por 2.");
        }
    }
}
