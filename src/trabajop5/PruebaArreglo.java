/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajop5;

import javax.swing.JOptionPane;

/**
 *
 * @author Escritorio
 */
public class PruebaArreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
     int[] a= {1,2,4,6};
     Arreglo.sumarLista(a);
     
     int[][] b= {{1,2,3},{4,10,6},{0,25}};
     
        System.out.println("Mayor: "+ Arreglo.buscarMayor(b));
       
        System.out.println("Vocales: "+Arreglo.cuentaVocales("Hola MUNDO"));
       
        System.out.println("Caracteres "+ Arreglo.cuentaCaracter("Prueba ARREGLO", 'R'));
    }
   
     
     
    
}
