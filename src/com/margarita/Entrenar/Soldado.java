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
 * Esta clase me define la estructura o elementos que 
 * llevara cada soldado utilizado en el juego
 * 
 */
public class Soldado {
    
    String nombre;
    int vida;

    public Soldado(String nombre, int vida) {
        this.nombre = nombre;
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    
    
    
}
