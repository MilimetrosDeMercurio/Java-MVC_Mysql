/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.margarita.edificacion;

//import java.util.ArrayList;

import com.margarita.edificacion.Edificacion;


/**
 *
 * @author Margarita
 * 
 * Es el recurso para poder recolectar
 * y por defecto tiene cierta cantidad de vida para poder empezar a ser
 * utilizado
 */
public class Recolector<R> extends Edificacion {
    
//ATRIBUTOS
    R Recurso;
    
//CONSTRUCTOR POR DEFECTO
    
    public Recolector(int vida) {
        super(vida);
    }

    public R getRecurso() {
        return Recurso;
    }

    public void setRecurso(R Recurso) {
        this.Recurso = Recurso;
    }

    
            
            
    
}
