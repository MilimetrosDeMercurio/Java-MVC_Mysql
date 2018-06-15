/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.margarita.edificacion;

/**
 *
 * @author Margarita
 * 
 * Permite mostrar directamente cuales son mis edificaciones
 * para poder recolectar recursos 
 * 
 */
public class FactoryEdificacion {
    
   public static Edificacion getEdificaciones(TipoEdificaion tipo){
       switch(tipo){
           case MINA:
               return new Edificacion(0);
           case TORRE:
               return new Edificacion(1);
           case LABORATORIO:
               return new Edificacion(2);
       }
       return null;
   }
    
}
