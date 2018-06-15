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
 * es la que me permite obtener la vida, poder realiar el metodo de ataque
 * y el nombre de la edificacion central del jugador
 */
public interface EdificacionCentral {
    
    public int getVida() ;
    public void setVida(int vida);
    
    public int getAtaque();

    public void setAtaque(int ataque);

    public String getNombre();

    public void setNombre(String nombre);
    
    
}
