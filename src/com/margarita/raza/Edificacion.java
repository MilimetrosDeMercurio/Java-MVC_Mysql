/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.margarita.raza;

/**
 *
 * @author Margarita
 */
public class Edificacion {

    int vida;
    int inicialFase, utlimaFase;

    public Edificacion(int vida, int inicialFase, int utlimaFase) {
        this.vida = vida;
        this.inicialFase = inicialFase;
        this.utlimaFase = utlimaFase;
    }
    
    

    public Edificacion(int vida) {
        this.vida = vida;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getInicialFase() {
        return inicialFase;
    }

    public void setInicialFase(int inicialFase) {
        this.inicialFase = inicialFase;
    }

    public int getUtlimaFase() {
        return utlimaFase;
    }

    public void setUtlimaFase(int utlimaFase) {
        this.utlimaFase = utlimaFase;
    }
    
    public void crearEdificacion(int vida, int initialFase, int ultimaFase){
        
         
         
    }
    
    
    
}
