/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.margarita.parcial2poo;

//import AbstractFactory.AbstractFactory;
//import AbstractFactory.factoryproducer;
//import com.margarita.raza.Edificacion;
//import com.margarita.raza.Edificacion;
//import com.margarita.raza.Vehiculo2;
//import com.margarita.raza.Caballo;
import com.margarita.raza.Campamento;
import com.margarita.raza.CentroMando;
import com.margarita.raza.Cuartel;
import com.margarita.raza.Raza;
import com.margarita.raza.exceptions.MaximaCapacidadSuperada;
import com.margarita.raza.Raza;
import com.margarita.raza.Recurso;
import com.margarita.vehiculo.Vehiculo;
import java.util.Scanner;

/**
 *
 * @author Margarita
 */
public class Parcial2Poo {

    /**
     * @param args the command line arguments
     * @throws com.margarita.raza.exceptions.MaximaCapacidadSuperada
     */
    public static void main(String[] args) throws MaximaCapacidadSuperada {
        
        
        Jugador user1 = new Jugador();
        Jugador user2 = new Jugador();
        
        Scanner in = new Scanner(System.in);
        Menu abrirMenu = Menu.getInstance();
        System.out.println("********** MargaritaBarahona'sWorld**********");
        
                
        System.out.println("Escriba el nombre del primer jugador: ");
        //String jugador1 = in.nextLine();
        user1.setNombre(in.nextLine()); 
        System.out.println("!!!Ahora " + user1.getNombre() + "  puedes escoger que raza utilizaras en el juego!!! :D");
        abrirMenu.getraza();
        
//        System.out.println("Para continuar, " + user1.getNombre() + " Debes escoger con que iniciar tu juego");
//        abrirMenu.opcionesParaJugar();
//        System.out.println("!!! JUGADOR 1 LISTO PARA EMPEZAR !!!");
//        
        System.out.println("Escriba el nombre del segundo juagador: ");
        user2.setNombre(in.nextLine());
        System.out.println("!!!Ahora " + user1.getNombre() + "  puedes escoger que raza utilizaras en el juego!!! :D");
        abrirMenu.getraza();
        //abrirMenu.opcionesRazas();
//        
        
        /*
        Jugador Jugador1 = new Jugador("Escriba el nombre del primer jugador: ");
        Jugador Jugador2 = new Jugador("Escriba el nombre del segundo jugador: ");
        AbrirMenu.addMenu(Jugador1);
        AbrirMenu.addMenu(Jugador2);
        Jugador exitJugador = new Jugador("Salir del menu");
        */
          
        
       //CREANDO LAS RAZAS
        Raza lannister = new Raza("Lanister");
        Raza Stark = new Raza("Stark");
        Raza Targaryen = new Raza("Targaryen");
        
        
        //CENTRO DE MANDO DE LAS RAZAS
        lannister.setCentroMando(new CentroMando(2000));
        Stark.setCentroMando(new CentroMando(4000));
        Targaryen.setCentroMando(new CentroMando(3000));

       /* 
        //EDIFICACIONES: "RECURSO DE LA RAZA LANNISTER" 
                
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
*/       
/*
        //EDIFICACIONES: "RECURSO DE LA RAZA TARGARYEN"
        
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
*/   
        //EDIFICACIONES: "RECURSO DE LA RAZA STARK"
        
//        Recurso oro = new Recurso();
//        oro.setCant(10000);
//        oro.setNombre("Oro");
//        Recurso.getCentroMando().setMr3(oro);
//        
//        Recurso plata = new Recurso();
//        plata.setCant(5000);
//        plata.setNombre("Plata");
//        Stark.getCentroMando().setMr3(oro);
//        
//        Recurso bronce = new Recurso();
//        bronce.setCant(3000);
//        bronce.setNombre("Bronce");
//        Targaryen.getCentroMando().setMr3(bronce);

        
        
        // Creacion de cuartel (Lannister), builder  
        
        Cuartel cuartel = new Cuartel(200);
        cuartel.setCapacidadmaxima(10);
        lannister.agregarEdificacion(cuartel);
        //PARA LOS STARK
        Stark.agregarEdificacion(cuartel);
        //PARA LOS TARGARYEN
        Targaryen.agregarEdificacion(cuartel);
        
        //CREACION DE CAMPAMNETO 
        Campamento campamento = new Campamento(400);
        campamento.setCapacidadmaxima(20);
        lannister.agregarEdificacion(campamento);
        
        
        
        
     
        
        //PARA OBTENER EDIFICACIONES DE ESCUADRONES
        
        Recurso campamento2 = new Recurso();
        campamento2.setCant(3000);
        campamento2.setNombre("Campamento");
        
        lannister.getCentroMando().setMr1(campamento2);
     
  
        //EDIFICACIONES DE VEHICULO TIPO 1 Y 2
        
        /*Vehiculo  vehiculo = new Vehiculo(100);
        vehiculo.setCant(1000);
        vehiculo.setNombre("Vehiculo");
        lannister.getCentroMando().setMr1(vehiculo);
        
        Vehiculo2 dragones = new Vehiculo2();
        dragones.setCant(1000);
        dragones.setNombre("Dragones");
        lannister.getCentroMando().set(dragones);
        */  
           
        
                
        
    }
    
}
