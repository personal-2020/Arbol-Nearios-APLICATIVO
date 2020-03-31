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

        Nodo h1 = new Nodo("1",900);Nodo h2 = new Nodo("2");Nodo h3 = new Nodo("3");
        Nodo h4 = new Nodo("4");Nodo h5 = new Nodo("5");Nodo h6 = new Nodo("6");
        Nodo h7 = new Nodo("7");Nodo h8 = new Nodo("8");Nodo h9 = new Nodo("9");
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
        //Creacion otros nodos
        Nodo h11=new Nodo("100",20);
        Nodo h12= new Nodo("17",2);
        
        ar.agregarHijo2(new Nodo("100",20),h1);
        ar.agregarHijo2(new Nodo("174",1),h11);
        ar.agregarHijo2(h12,h11);
        ar.agregarHijo2(new Nodo("99",1),h12);
        ar.agregarHijo2(new Nodo("67",10),h12);
        ar.agregarHijo2(new Nodo("50",80),h1);
        ar.agregarHijo2(new Nodo("90",10),h10);
        ar.agregarHijo2(new Nodo("200",30),h10);
        ar.agregarHijo2(new Nodo("300",90),h2);
        ar.agregarHijo2(new Nodo("500",50),h2);
        ar.agregarHijo2(new Nodo("50",60),h2);
        ar.agregarHijo2(new Nodo("30",70),h3);
        ar.agregarHijo2(new Nodo("75",65),h3);

        ar.mostrarhijos();        
        
        System.out.println("PESO DE LA RAMA 1 : +"+ar.suma(h1));                       

    }

}
