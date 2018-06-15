/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.margarita.vehiculo;

/**
 *
 * @author Margarita
 */
public class Vehiculo {
    
    String Nombre;
    int cant;
    String vehiculo1;
    String vehiculo2;
    private String nombre;
    private int cantidad;

    public Vehiculo(String vehiculo1, String vehiculo2) {
        this.vehiculo1 = vehiculo1;
        this.vehiculo2 = vehiculo2;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    
    public Vehiculo() {
        
    }

    public Vehiculo(String unacadena) {
    }
    
    
    public void vehiculotipo1(String nombre, int cantidad){
        String vehiculotipo1 = null;
        
        this.nombre = nombre;
        this.cantidad = cantidad;
    
    }
    
    public void vehiculotipo2(String nombre, int cantidad){
        String vehiculotipo2 = null;
        this.nombre = nombre;
        this.cantidad = cantidad;
        
    }    

    public void vehiculotipo1() {
        
    }

    public void vehiculotipo2() {
        
    }

    
    
}
