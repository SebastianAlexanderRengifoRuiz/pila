/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import datos.Productos;
import modelo.Pila;

/**
 *
 * @author sebit
 */
public class MainPila {
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pila<Productos> pilaP=new Pila<>();
        pilaP.apilar(new Productos ("arroz", 2, 5000));
        pilaP.apilar(new Productos ("huevos", 1, 14000));
        pilaP.apilar(new Productos ("carne", 2, 15000));
        pilaP.apilar(new Productos ("azucar", 2, 8000));;
        
        System.out.println("Pila "+pilaP.toString());
        
        pilaP.desapilar();
        System.out.println("Pila  "+pilaP.toString());
        
        // TODO code application logic here
    }
    
}
