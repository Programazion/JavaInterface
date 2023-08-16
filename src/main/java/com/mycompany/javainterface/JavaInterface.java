    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javainterface;

import javax.swing.JOptionPane;

/**
 *
 * @author progr
 */
public class JavaInterface {

    public static void main(String[] args) {
//        System.out.println("My First Interface!");
        String cadena; 
        int entero; 
        char letra;
        float num;
        
        cadena = JOptionPane.showInputDialog("Digite una cadena");// JOption Pan es para strings
//        entero = JOptionPane.showInputDialog("Digita un entero"); // Se debe Castear
        entero = Integer.parseInt(JOptionPane.showInputDialog("Digita un entero"));
        letra = JOptionPane.showInputDialog("Digite una letra").charAt(0);
        num = Float.parseFloat(JOptionPane.showInputDialog("Digite un numero double"));
        
        JOptionPane.showMessageDialog(null,"La cadena es: " + cadena);
        JOptionPane.showMessageDialog(null,"El entero es: " + entero);
        JOptionPane.showMessageDialog(null,"La letra es " + letra);
        JOptionPane.showMessageDialog(null,"El numero double es: " + num); // en ventana colocar punto 
        
        
    }
}
