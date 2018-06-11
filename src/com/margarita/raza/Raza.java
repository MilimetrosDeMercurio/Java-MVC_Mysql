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
public class Raza {

    private CentroMando CentroMando;
    private ArrayList<Edificacion> edificaciones;
    private ArrayList<Vehiculo> vehiculos;

    String nombre;

    
    private String nombre() {
        return null;
    }

    public Raza(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public CentroMando getCentroMando() {
        return CentroMando;
    }

    public void setCentroMando(CentroMando CentroMando) {
        this.CentroMando = CentroMando;
    }

    public ArrayList<Edificacion> getEdificaciones() {
        return edificaciones;
    }

    public void setEdificaciones(ArrayList<Edificacion> edificaciones) {
        this.edificaciones = edificaciones;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

}
