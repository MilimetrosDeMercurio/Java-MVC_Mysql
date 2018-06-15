/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.margarita.vehiculo;

import com.margarita.vehiculo.TipoVehiculo;
import com.margarita.vehiculo.Vehiculo;

/**
 *
 * @author Margarita
 */
public class VehiculoFactory {
    
    public static Vehiculo getVehiculo(TipoVehiculo Tipo){
        
        switch(Tipo){
            case VEHICULO1:
                return new Vehiculo("VEHICULO 1");
            case VEHICULO2:
                return new Vehiculo("VEHICULO 2");
        }
        return null;
    }
    
}
