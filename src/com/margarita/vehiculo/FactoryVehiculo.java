/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.margarita.vehiculo;

/**
 *
 * @author Margarita
 */
public class FactoryVehiculo {
    
    public static Vehiculo getVehiculo(TipoVehiculo tipo){
        switch(tipo){
            case VEHICULO1:
                return new Vehiculo1();
            case VEHICULO2:
                   return new Vehiculo2("VEHICULO 2");
        }
        return null;
    }
    
}
