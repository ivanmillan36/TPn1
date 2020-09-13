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
public class ej_13 {
    public static void main(String[] args) {
        
        int num;
        Boolean primo = true;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entero"));
        
        if(num <= 1){
            primo = false;
        }else{
            
            for (int i=2 ; i<num; i++){
                if (num % i == 0){
                    primo = false;
                }
            }
        }
        
        if(primo){
            JOptionPane.showMessageDialog(null, "El numero " + num + " es primo");
        }else {
            JOptionPane.showMessageDialog(null, "El numero " + num + " no es primo");
        }
    }
}
