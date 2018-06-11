/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.margarita.raza.exceptions;

import com.margarita.raza.Recurso;

/**
 *
 * @author Margarita
 */
public class MaximaCapacidadSuperada  extends Exception{
    Recurso recurso;
    int capacidadMaxima;

    public MaximaCapacidadSuperada(Recurso recurso, int capacidadMaxima) {
             super("Se supero la capcacidad maxima esperada de " + capacidadMaxima + " Para el recucurso de " + recurso.getCant());
        this.recurso = recurso;
        this.capacidadMaxima = capacidadMaxima;
   
    }
    
    
    
}
