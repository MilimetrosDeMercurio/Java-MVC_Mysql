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
 * Es una de mis edificaciones que me permite 
 * recolectar recursos para poder seguir en el juego y
 * utilizarla en modo de ataque para poder defenderse
 */
public class Torre implements EdificacionCentral {

    private int vida;
    private int ataque;
    private String nombre;


    @Override
    public int getVida() {
        return vida;
    }

    @Override
    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public int getAtaque() {
        return ataque;
    }

    @Override
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
