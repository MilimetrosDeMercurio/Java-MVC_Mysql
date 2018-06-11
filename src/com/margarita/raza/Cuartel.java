/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.margarita.raza;

import java.util.ArrayList;

/**
 *
 * @author Margarita
 */
class Cuartel extends Edificacion {
    
//ATRIBUTOS
    
    int capacidadmaxima;
    ArrayList<Soldado> soldados;
    
//CONSTRUCTOR
    
    public Cuartel(int vida) {
        super(vida);
    }
    
//GET & SETTER
    
    public int getCapacidadmaxima() {
        return capacidadmaxima;
    }

    public void setCapacidadmaxima(int capacidadmaxima) {
        this.capacidadmaxima = capacidadmaxima;
    }

    public ArrayList<Soldado> getSoldados() {
        return soldados;
    }

    public void setSoldados(ArrayList<Soldado> soldados) {
        this.soldados = soldados;
    }
    
//METODOS
    
    public void Reclutar(){
        
        
    }
    
    public void Entrenar(){
        
    }
    
    
}
