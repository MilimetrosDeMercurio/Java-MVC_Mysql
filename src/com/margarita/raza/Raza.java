/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.margarita.raza;

import com.margarita.edificacion.Edificacion;
import com.margarita.Entrenar.CentroMando;
import com.margarita.vehiculo.Vehiculo;
import java.util.ArrayList;

/**
 *
 * @author Margarita
 */
public class Raza {

    private CentroMando CentroMando;
    private ArrayList<Edificacion> edificaciones = new ArrayList();
    private ArrayList<Vehiculo> vehiculos = new ArrayList();

    public Raza() {
//        edificaciones = new ArrayList();
//        vehiculos = new ArrayList();
    }

    
    String nombre;

    
    public void agregarEdificacion(Edificacion edificio){
        edificaciones.add(edificio);
    }
    
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
