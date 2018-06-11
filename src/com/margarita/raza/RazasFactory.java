/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.margarita.raza;

/**
 *
 * @author Margarita
 */
public class RazasFactory {
    
    public static Raza getRaza(TipoRaza tipo){
        switch(tipo){
            case STARK:
                return new Raza("STARK");
            case LANNISTER:
                return new Raza("LANNISTER");
            case TARGARYEN:
                return new Raza("TARGARYEN");
        }
        return null;
    }
}
