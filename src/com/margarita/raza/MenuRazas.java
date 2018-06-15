/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.margarita.raza;

import com.margarita.Entrenar.Campamento;
import com.margarita.edificacion.Cuartel;
import com.margarita.edificacion.Edificacion;
import com.margarita.edificacion.Recurso;
import com.margarita.raza.exceptions.MaximaCapacidadSuperada;
import com.margarita.vehiculo.Vehiculo;

/**
 *
 * @author Margarita
 * 
 * Donde se encuentran mis razas de cada una de las que existen 
 */
public class MenuRazas {
    
    public void EdificacionesLannister() throws MaximaCapacidadSuperada{
        Recurso oro = new Recurso();
        oro.setCant(10000);
        oro.setNombre("Oro");
        lannister.getCentroMando().setMr1(oro);
        
        
        Recurso plata = new Recurso();
        plata.setCant(5000);
        plata.setNombre("Plata");
        lannister.getCentroMando().setMr1(plata);
        
        Recurso bronce = new Recurso();
        bronce.setCant(3000);
        bronce.setNombre("Bronce");
        lannister.getCentroMando().setMr1(bronce);
       
        
    }
    public void EdificacionesStark(){
        Recurso oro = new Recurso();
        oro.setCant(10000);
        oro.setNombre("Oro");
        Lannister.getCentroMando();
        
        Recurso plata = new Recurso();
        plata.setCant(5000);
        plata.setNombre("Plata");
        Stark.getCentroMando().setMr3(oro);
        
        Recurso bronce = new Recurso();
        bronce.setCant(3000);
        bronce.setNombre("Bronce");
        Targaryen.getCentroMando().setMr3(bronce);
        
    }
    public void  EdificacionesTargaryen() throws MaximaCapacidadSuperada{
        Recurso fuego = new Recurso();
        fuego.setCant(10000);
        fuego.setNombre("Fuego");
        Stark.getCentroMando().setMr2(fuego);
        
        Recurso aire = new Recurso();
        aire.setCant(5000);
        aire.setNombre("Aire");
        Stark.getCentroMando().setMr2(aire);
        
        Recurso bronce2 = new Recurso();
        bronce2.setCant(3000);
        bronce2.setNombre("Bronce");
        Stark.getCentroMando().setMr2(bronce2);
        
    }
    
    public void CreacionCuartelLannister(){
        Cuartel cuartel = new Cuartel(200);
        cuartel.setCapacidadmaxima(10);
        lannister.agregarEdificacion(cuartel);
        
    }
    public void  CreacionCuartelStark(){
        Edificacion cuartel = null;
        
        Stark.agregarEdificacion(cuartel);
    }
    public void CreacionCuartelTargaryen(){
        Edificacion cuartel = null;
         Targaryen.agregarEdificacion(cuartel);
        
    }
    
    public void CreacionCampamentoLannister(){
         Campamento campamento = new Campamento(400);
        campamento.setCapacidadmaxima(20);
        lannister.agregarEdificacion(campamento);
        
    }
    public void CreacionCampamentoStark(){
         Campamento campamento = new Campamento(400);
        campamento.setCapacidadmaxima(20);
        lannister.agregarEdificacion(campamento);
        
    }
    public void CreacionCampamentoTargaryen(){
        
          Campamento campamento = new Campamento(400);
        campamento.setCapacidadmaxima(20);
        lannister.agregarEdificacion(campamento);
    }
    
    public void EdificacionEscuadrones() throws MaximaCapacidadSuperada{
        Recurso campamento2 = new Recurso();
        campamento2.setCant(3000);
        campamento2.setNombre("Campamento");
        
        lannister.getCentroMando().setMr1(campamento2);
    }
    public void EdificacionStark() throws MaximaCapacidadSuperada{
        Recurso campamento2 = new Recurso();
        campamento2.setCant(3000);
        campamento2.setNombre("Campamento");
        
        lannister.getCentroMando().setMr1(campamento2);
        
    }
    public void EdificacionTargaryen() throws MaximaCapacidadSuperada{
        Recurso campamento2 = new Recurso();
        campamento2.setCant(3000);
        campamento2.setNombre("Campamento");
        
        lannister.getCentroMando().setMr1(campamento2);
        
    }
    
    public void CreacionVehiculo1(){
        Vehiculo  vehiculo = new Vehiculo();
        vehiculo.setCant(1000);
        vehiculo.setNombre("Vehiculo");
        lannister.getCentroMando().setV1(vehiculo);
        
    }
    public void CreacionVehiculo2(){
        Vehiculo  vehiculo = new Vehiculo();
        vehiculo.setCant(1000);
        vehiculo.setNombre("Vehiculo");
        lannister.getCentroMando().setV2(vehiculo);
        
    }
    public void CentroMandoRazaLannister(){
        lannister.setCentroMando(new com.margarita.Entrenar.CentroMando(2000));
        
    }
    public void CentroMandoRazaStark(){
         Stark.setCentroMando(new com.margarita.Entrenar.CentroMando(4000));
    }
    public void CentroMandoRazaTargaryen(){
         Targaryen.setCentroMando(new com.margarita.Entrenar.CentroMando(3000));
    }

    //CREACION DE RAZAS
        Raza lannister = new Raza("Lanister");
        Raza Stark = new Raza("Stark");
        Raza Targaryen = new Raza("Targaryen");
        
        

        
       
       
        
        
       
  
       
       
       
        
        
    }
}
    
