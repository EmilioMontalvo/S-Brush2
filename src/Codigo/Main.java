/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo;

import Interfaz.JFEmpleados;
import com.sun.org.apache.bcel.internal.generic.AALOAD;
import javax.swing.UIManager;

/**
 *
 * @author HP
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    try { 
    UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel"); 
    } catch (Exception ex) { 
        ex.printStackTrace(); 
    }
       
        JFEmpleados emp =new JFEmpleados();
        
    }
    
}
