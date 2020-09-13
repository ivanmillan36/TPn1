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
public class ej_11 {
    public static void main(String[] args) {
        
        String pass_ok = "pepe1234";
        String pass;
        int intentos = 3;
        Boolean pass_correct = false;
        
        do{
            pass = JOptionPane.showInputDialog("Ingresa la contraseña");
            if (pass.equals(pass_ok)){
                pass_correct = true;
                break;
            }
            intentos--;
        }while(intentos > 0);
        
        if (pass_correct){
            JOptionPane.showMessageDialog(null, "Acceso Correcto");
        }else{
            JOptionPane.showMessageDialog(null, "Acceso no permitido, exedio el numero de intentos");
        }
    }
}
