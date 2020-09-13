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
public class ej_12 {
    public static void main(String[] args) {
        
        int dia;
        
        do{
            dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un dia de la semana (1 a 7)"));
        }while(dia < 1 || dia > 7);
        
        switch(dia){
            case 1:
                JOptionPane.showMessageDialog(null, "Dia laboral");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Dia laboral");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Dia laboral");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Dia laboral");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Dia laboral");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "Dia no laboral");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "Dia no laboral");
                break;
        }
    }
}
