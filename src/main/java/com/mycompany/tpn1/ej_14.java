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
public class ej_14 {
    
    public static void main(String[] args) {
        
        int x = new Double(Math.random() * 100).intValue();
        int num, cant_intentos = 0;
        
        do{
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entre 0 y 100"));
            cant_intentos++;
            
            if(num>x){
                JOptionPane.showMessageDialog(null, "Es muy alto");
            }else if(num<x){
                JOptionPane.showMessageDialog(null, "Es muy bajo");
            }
        }while(num != x);
        
        JOptionPane.showMessageDialog(null, "Correcto, numero encontrado, cantidad de intentos: " + cant_intentos);
    }
    
}
