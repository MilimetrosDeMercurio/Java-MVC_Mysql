package com.margarita.Entrenar;

import com.margarita.Entrenar.Escuadrones;
import com.margarita.edificacion.Edificacion;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Margarita
 */
public class Campamento extends Edificacion{
    
//ATRIBUTOS
    
    int capacidadmaxima;
    ArrayList<Escuadrones> escuadrones;
    
//CONSTRUCTOR
    
    public Campamento (int vida) {
        super(vida);
    }
    
//GET & SETTER

    public int getCapacidadmaxima() {
        return capacidadmaxima;
    }

    public void setCapacidadmaxima(int capacidadmaxima) {
        this.capacidadmaxima = capacidadmaxima;
    }

    public ArrayList<Escuadrones> getEscuadrones() {
        return escuadrones;
    }

    public void setEscuadrones(ArrayList<Escuadrones> escuadrones) {
        this.escuadrones = escuadrones;
    }
    
   
//METODOS
    
    public void Reclutar(){
        
        
    }
    
    public void Entrenar(){
        
    }
    
}
