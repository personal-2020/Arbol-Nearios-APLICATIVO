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
public class Arbol {

    private boolean raizz;
    private Nodo raiz;
    private Nodo padre;
    private int nHijos;
    private List<Nodo> hijos;

    public Arbol() {
    }

    public Arbol(Nodo raiz) {
        this.raizz = true;
        this.raiz = raiz;
        this.nHijos = 0;
        hijos = new ArrayList<Nodo>();

    }

    /**
     * Este metdo agrega hijos directamente a la raiz o padre principal.
     *
     * @param nodo
     */
    public void agregarHijo(Nodo nodo) {

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
            nodo.setSiguiente(hijos.get(0));
            hijos.set(tt, temp);
            hijos.add(nodo);
        }
    }

    public void agregarHijo(Nodo nodo, Nodo padre) {

        if (hijos.contains(padre)) {
            padre.gregarHijo(nodo);

        } else {
            System.out.println("Ese padre no exste");
        }
    }
    public void eliminarNodo() {

    }
    public void mostrarhijos() {

        System.out.println("su padre es : " + raiz.getNombre());
        for (Nodo f : hijos) {
            System.out.println("--------------------");
            System.out.println("NOmbre del hijo es: " + f.getNombre());
            System.out.println("--------------------");
            System.out.println("Y SU HERMANO ES : " + f.getSiguiente().getNombre());

            System.out.println("--------------------");
            int g = f.getCantHIjos();
            System.out.println("¿tiene hijso, cuantos? : " + f.getCantHIjos());
            if (g > 0) {
                List<Nodo> qq = f.getHijos();
                for (Nodo ff : qq) {
                    System.out.println("--------------------");
                    System.out.println("NOmbre del NIETO es: " + ff.getNombre());
                    System.out.println("--------------------");
                    System.out.println("Y SU HERMANO ES : " + ff.getSiguiente().getNombre());
                    System.out.println("--------------------");
                    System.out.println("--------------------");                
                    System.out.println("¿tiene hijso, cuantos? : " + ff.getCantHIjos());                    
                }
            }
            System.out.println("--------------------");
        }
    }
}
