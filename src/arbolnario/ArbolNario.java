/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolnario;

import arbolnario.model.Arbol;
import arbolnario.model.Nodo;

/**
 *
 * @author cefar-dico
 */
public class ArbolNario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 

        Nodo raiz = new Nodo("A");
        Arbol ar = new Arbol(raiz);

        Nodo h1 = new Nodo("1");
        Nodo h2 = new Nodo("2");
        Nodo h3 = new Nodo("3");
        Nodo h4 = new Nodo("4");
        Nodo h5 = new Nodo("5");
        Nodo h6 = new Nodo("6");
        Nodo h7 = new Nodo("7");
        Nodo h8 = new Nodo("8");
        Nodo h9 = new Nodo("9");
        Nodo h10 = new Nodo("10");

        ar.agregarHijo(h1);
        ar.agregarHijo(h2);
        ar.agregarHijo(h3);
        ar.agregarHijo(h4);
        ar.agregarHijo(h5);
        ar.agregarHijo(h6);
        ar.agregarHijo(h7);
        ar.agregarHijo(h8);
        ar.agregarHijo(h9);
        ar.agregarHijo(h10);

        ar.agregarHijo(new Nodo("100"),h1);
        ar.agregarHijo(new Nodo("50"),h1);
        ar.agregarHijo(new Nodo("90"),h10);
        ar.agregarHijo(new Nodo("200"),h10);
        ar.agregarHijo(new Nodo("300"),h2);
        ar.agregarHijo(new Nodo("500"),h2);
        ar.agregarHijo(new Nodo("50"),h2);
        ar.agregarHijo(new Nodo("30"),h3);
        ar.agregarHijo(new Nodo("75"),h3);

        ar.mostrarhijos();

    }

}
