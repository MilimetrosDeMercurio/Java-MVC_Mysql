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
import com.margarita.Entrenar.Campamento;
import com.margarita.Entrenar.CentroMando;
import com.margarita.edificacion.Cuartel;
import com.margarita.raza.Raza;
import com.margarita.raza.exceptions.MaximaCapacidadSuperada;
import com.margarita.raza.Raza;
import com.margarita.edificacion.Recurso;
import com.margarita.vehiculo.Vehiculo;
import java.util.Scanner;

/**
 *
 * @author Margarita
 * 
 * Main, quien ejecutara todo para poder jugar
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
        System.out.println("\n *********** JUGADOR 1 ************");
        System.out.println("Escriba el nombre del primer jugador: ");
        //String jugador1 = in.nextLine();
        user1.setNombre(in.nextLine()); 
        System.out.println("!!!Ahora " + user1.getNombre() + "  puedes escoger que raza utilizaras en el juego!!! :D");
        abrirMenu.getraza();
        
//        System.out.println("Para continuar, " + user1.getNombre() + " Debes escoger con que iniciar tu juego");
//        abrirMenu.opcionesParaJugar();
//        System.out.println("!!! JUGADOR 1 LISTO PARA EMPEZAR !!!");
//        
        System.out.println("\n *********** JUGADOR 2 ***********");
        System.out.println("Escriba el nombre del segundo juagador: ");
        user2.setNombre(in.nextLine());
        System.out.println("!!!Ahora " + user2.getNombre() + "  puedes escoger que raza utilizaras en el juego!!! :D");
        abrirMenu.getraza();
        //abrirMenu.opcionesRazas();
        
        Menu.getInstance();
        
     
    }
    
