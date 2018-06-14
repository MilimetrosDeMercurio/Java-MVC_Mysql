/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.margarita.parcial2poo;

import com.margarita.raza.Raza;
import java.util.Scanner;

/**
 *
 * @author Margarita
 */
public class Jugador {
    
    private String nombre;
    
    private Raza Raza;
    
    public Jugador(){};

    public Jugador(String nombre, Raza Raza) {
        this.nombre = nombre;
        this.Raza = Raza;
    }

    
    
    public void opcionesVehiculos() {

        System.out.println("********* Escoge que vehiculo quieres utilizar **********");
        System.out.println("1. Vehiculo 1");
        System.out.println("1. Vehiculo ");
    }

    
    public void menujugador(){
        System.out.println("******** Opciones para que puedas jugar ***********");
        System.out.println("1");
        System.out.println("2");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        switch(a){
            case 1:
                opcionesVehiculos();
            case 2:
                opcionesVehiculos();
                
        }
               
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Raza getRaza() {
        return Raza;
    }

    public void setRaza(Raza Raza) {
        this.Raza = Raza;
    }
    
    
      
  
    
}
