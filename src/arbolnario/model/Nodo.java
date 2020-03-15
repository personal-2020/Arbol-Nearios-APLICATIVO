/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolnario.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cefar-dico
 */

public class Nodo {
    
    private boolean raiz;
    private String nombre;
    private int peso;
    private int nHijos;
//    private Nodo  hijos[];
    private List<Nodo> hijos;
    private Nodo siguiente;
    private Nodo anterior;
    
    public Nodo(){}

    
    public Nodo(String nombre){
        this.raiz=false;
        this.nombre=nombre;
        this.peso=0;
        this.nHijos=0;
        hijos=new ArrayList<Nodo>();

    }
    
    public void gregarHijo(Nodo nodo){
        if (hijos.isEmpty()) {
//            nodo.setAnterior(nodo);
            nodo.setSiguiente(nodo);
            hijos.add(nodo);
        } else {
            int tt = hijos.size() - 1;
            Nodo temp = hijos.get(hijos.size() - 1);
            // Asegurarnos que el primero conozca al ultimo y viceversa
            temp.setSiguiente(nodo);//NOs aseguramos que el nodo anterior conozca al nuevo.
//            nodo.setAnterior(temp);
            nodo.setSiguiente(temp);
            hijos.set(tt, temp);
            hijos.add(nodo);
        }    
    
    }
    public int getCantHIjos(){
        return hijos.size();
    }
    
    public List<Nodo> getHijos(){
        return hijos;
    }
    
    public Nodo getSiguiente(){
        return siguiente;
    }
    public void setSiguiente(Nodo siguiente){
        this.siguiente=siguiente;
    }
    public Nodo getAnterior(){
        return anterior;
    }
    public void setAnterior(Nodo anterior){
        this.anterior=anterior;
    }    
    public  String getNombre(){
        return nombre;
    }
}
