/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.margarita.vehiculo;

import com.margarita.edificacion.Edificacion;
import java.util.ArrayList;

/**
 *
 * @author Margarita
 * Donde se crean los autos 
 */
//Donde se crean los autos
public class Consencionario extends Edificacion{
    
    ArrayList<Vehiculo> vehiculos = new ArrayList<>();
    int CapacidadMaxima;

    public Consencionario(int vida) {
        super(vida);
    }
    
//ATRIBUTOS 
    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public int getCapacidadMaxima() {
        return CapacidadMaxima;
    }

    public void setCapacidadMaxima(int CapacidadMaxima) {
        this.CapacidadMaxima = CapacidadMaxima;
    }
    
    //METODOS 
    
    public void Construir(){
        
        
    }
    
    public void ObtenerVehiculo(){
        
    }
    
    
    
    
    
}
