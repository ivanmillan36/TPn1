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
public class ej_6 {
    static final float IVA = 0.21f;
    
    public static void main(String[] args) {
        
        float precio;
        
        precio = Float.parseFloat(JOptionPane.showInputDialog("Ingresa el precio del producto"));
        
        precio = precio + (precio * IVA);
        
        JOptionPane.showMessageDialog(null, "El precio del producto con IVA es: " + precio);
    }
}
