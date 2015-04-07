/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class RegistroLibro {

    private ArrayList<Libro> listaLibros;

    public RegistroLibro() {
        listaLibros = new ArrayList<Libro>();
    }

    public String addBook(Libro libro) {
        String aux="";
        if (libro != null) {
            if (verificacionID(libro.getiD())==true) {
                listaLibros.add(libro);
                aux="El libro se registro corectamente";
            }
        } else {
            aux="el objeto es null";
        }
        return aux;
    }

    public boolean verificacionID(String id) {
        boolean aux=true;
        if (!id.equalsIgnoreCase("")) {
            if (listaLibros.size() != 0) {
                for (int i=0;i<listaLibros.size();i++) {
                    if (listaLibros.get(i).getiD().equalsIgnoreCase(id)) {
                        aux= false;
                    }
                }
            }
        }
     return aux;
    }
    
    
}
