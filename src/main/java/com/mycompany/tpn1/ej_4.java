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
public class ej_4 {
    public static void main(String[] args) {
        float num1= 100, num2= 100;
        
        if (num1 > num2) {
            JOptionPane.showMessageDialog(null, "El mayor de los dos es: " + num1);
        }else if (num2 > num1) {
            JOptionPane.showMessageDialog(null, "El mayor de los dos es: " + num2);
        }else{
            JOptionPane.showMessageDialog(null, "Los numeros ingresados son iguales.");
        }
        
    }
}
