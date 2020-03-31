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
    private List<Nodo> hijos = new ArrayList<Nodo>();
    private List<Integer> pesosRamas = new ArrayList<Integer>();

    boolean sepudo = false;

    public Arbol() {
    }

    public Arbol(Nodo raiz) {
        this.raizz = true;
        this.raiz = raiz;
        this.nHijos = 0;

    }

    /**
     * Este metdo agrega hijos directamente a la raiz o padre principal.
     *
     * @param nodo
     */
    public void agregarHijo(Nodo nodo) {
        if (hijos.isEmpty()) {
            nodo.setSiguiente(nodo);
            hijos.add(nodo);
        } else {
            int tt = hijos.size() - 1;
            Nodo temp = hijos.get(hijos.size() - 1);// Asegurarnos que el primero conozca al ultimo y viceversa
            temp.setSiguiente(nodo);//NOs aseguramos que el nodo anterior conozca al nuevo.
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

    public void agregarHijo2(Nodo nodo, Nodo padre) {
        sepudo = false;
        if (hijos.contains(padre)) {
            padre.gregarHijo(nodo);
            sepudo = true;

        } else {

            pruebaPadre(nodo, padre, hijos);
            System.out.println("que dice se pud: " + sepudo);
        }

    }

    public void pruebaPadre(Nodo nodo, Nodo padre, List<Nodo> hijoss) {
        boolean paso = false;
        int index = -1;
        for (int i = 0; i < hijoss.size(); i++) {
            Nodo g = hijoss.get(i);            //System.out.println("que nombre es: "+g.getNombre());
            if (g.getNombre().equals(padre.getNombre())) {
                paso = true;
                index = i;
                padre.agregarHijo(nodo);
                hijoss.set(index, padre);
            }
        }
        if (paso) {
            sepudo = true;
        } else {
            for (Nodo f : hijoss) {
                if (f.getCantHIjos() > 0) {
                    pruebaPadre(nodo, padre, f.getHijos());
                }
            }
        }
    }

    public void eliminarNodo(Nodo nodo, Nodo padre) {

    }

    /**
     *
     * @param padre El padre que sera eliminado
     * @param nuevoPadre El nueuvo padre de sus hijos.
     */
    public void eliminarHijoNuevoPadre(Nodo padre, Nodo nuevoPadre, List<Nodo> hijoss) {
        List<Nodo> hijosk = padre.getHijos();
        boolean temp = false;
        for (int i = 0; i < hijoss.size(); i++) {
             temp = false;
            Nodo g = hijoss.get(i);
            if (g.getNombre().equals(padre.getNombre())) {
                temp = true;
                hijoss.remove(i);
            }
            if (g.getNombre().equals(nuevoPadre.getNombre())) {
                temp = true;
                for(Nodo fg:hijosk){                   
                    nuevoPadre.agregarHijo(fg);
                    hijoss.set(i, nuevoPadre);
                }
            }
        }

        if (temp) {
        } else {
            for (Nodo f : hijoss) {
                if (f.getCantHIjos() > 0) {
                    eliminarHijoNuevoPadre(padre, nuevoPadre, f.getHijos());
                }
            }
        }
    }

    public void mostrarhijos() {
        System.out.println("su padre es : " + raiz.getNombre());
        for (Nodo f : hijos) {
            System.out.println("--------------------");
            System.out.println("NOmbre del hijo es: " + f.getNombre());
            System.out.println("SU PESO:  " + f.getPeso());
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
                    System.out.println("SU PESO:  " + ff.getPeso());
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

    public Nodo NodoMasLibre() {
        Nodo temp = new Nodo();
        int temo = 0;
        for (Nodo t : hijos) {

            temo += t.getPeso();

            for (Nodo tt : t.getHijos()) {
                //temo+=tt.getPeso()+;

            }

        }

        return null;
    }

    public int suma(Nodo n) {

        if (n.getCantHIjos() > 0) {
            List<Nodo> k = n.getHijos();
            int y = 0;
            for (int i = 0; i < n.getCantHIjos(); i++) {
                Nodo t = k.get(i);
                y += suma(t);
            }
            return y + n.getPeso();
        } else {
            return n.getPeso();

        }
    }

    public List<Nodo> getHijos() {
        return hijos;
    }

    public void pesosRamas() {

        for (Nodo g : hijos) {

        }
    }
}
