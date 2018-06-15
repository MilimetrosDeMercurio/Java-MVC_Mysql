/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.margarita.Entrenar;

/**
 *
 * @author Margarita
 * 
 * Es la fabrica de mis soldados y escuadrones para entrenar
 */
public class FactoryEntrenar {
    
    public static Entrenar getEntrenar(TipoEntrenar tipo){
        switch(tipo){
            case SOLDADOS:
              return new Entrenar("SOLDADOS");
            case ESCUADRONES:
                return new Entrenar("ESCUADRONES");
        }
        return null;
    }
    
}
