/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.margarita.parcial2poo;

import com.margarita.raza.Edificacion;
import com.margarita.raza.Raza;
import java.util.Scanner;
import com.margarita.factorys.RazasFactory;
import com.margarita.raza.Recurso;

/**
 *
 * @author Margarita
 */
import com.margarita.raza.TipoRaza;
import com.margarita.vehiculo.TipoVehiculo;
import com.margarita.vehiculo.Vehiculo;
import com.margarita.factorys.VehiculoFactory;
import com.margarita.raza.exceptions.MaximaCapacidadSuperada;
import java.io.InputStream;
import java.util.InputMismatchException;

public class Menu {

    Vehiculo vehiculo = new Vehiculo();
    Scanner read = new Scanner(System.in);

    private static Menu motor;

    private Menu() {
    }

    //PATRON SINGLENTON
    public static Menu getInstance() {

        if (motor == null) {
            motor = new Menu();

        }
        return motor;
    }

    

    

    public void opcionesVehiculos() {

        System.out.println("********* Escoge que vehiculo quieres utilizar **********");
        System.out.println("1. Vehiculo 1");
        System.out.println("1. Vehiculo ");
    }

    public Vehiculo getVehiculo() {
        int vehiculo = 2;
        Scanner read = new Scanner(System.in);

        while (vehiculo != 1) {
            opcionesVehiculos();

            try{
                System.out.println(" Escoge tu vehiculo: ");
                vehiculo = read.nextInt();
                switch (vehiculo) {
                    case 1:
                        return VehiculoFactory.getVehiculo(TipoVehiculo.VEHICULO1);    

                    case 2:
                        return VehiculoFactory.getVehiculo(TipoVehiculo.VEHICULO2);

                    default:
                        System.out.println(" !!! Vehiculo Listo !!! ");
                }
            }catch (InputMismatchException e){
                System.err.println("Escoge un numero por favor");
                read.nextLine();
            }
        }
        return null;
    }
    public void opcionesParaJugar() {

        System.out.println("********* Opciones  ***********");
        System.out.println(" 1. construir Edificaciones ");
        System.out.println(" 2. Crear Milicias ");
        System.out.println(" 3. Entrenar Milicias ");
        System.out.println(" 4. Remendar Milicias ");
        System.out.println(" 5. Crear Vehiculos ");
        System.out.println(" 6. Mostrar Recursos Disponibles ");
        System.out.println(" 7. Pasar de de Turno ");
        System.out.println(" 8. SALIR ");

    }
    
    public void opcionesRazas() {
        System.out.println("********* Razas ***********");
        System.out.println(" 1. Lannister ");
        System.out.println(" 2. Stark ");
        System.out.println(" 3. Targaryen ");
        System.out.println(" 4. Salir ");
    }

    public Raza getraza() {
        int Raza = 4;
        Scanner read = new Scanner(System.in);

        while (Raza != 3) {
            opcionesRazas();

            try {
                System.out.println(" Escoja una opcion: ");
                Raza = read.nextInt();
                switch (Raza) {
                    case 1:
                        return RazasFactory.getRaza(TipoRaza.LANNISTER);

                    case 2:
                        return RazasFactory.getRaza(TipoRaza.STARK);

                    case 3:
                        return RazasFactory.getRaza(TipoRaza.TARGARYEN);

                    default:
                        System.out.println(" TERMINADO ");
                        break;
                }

            }catch (InputMismatchException e) {
                System.err.println(" Elija un numero, por favor");
                read.nextLine();
            }
        }
        return null;
    }

    public void getopcionesParaJugar() throws MaximaCapacidadSuperada {

        int opcion = 8;
        Scanner read = new Scanner(System.in);

        while (opcion != 7) {
            opcionesParaJugar();

            try {
                System.out.println("Escoja una opcion");
                opcion = read.nextInt();
                switch (opcion) {
                    case 1:
                        //construir edificacion
                        

                    case 2:
                    //crear milicia

                    case 3:
                    //entrenar milicia

                    case 4:
                    //remendar milicia

                    case 5:
                    //crear vehiculo
                    
                    case 6:
                    //mostrar recursos disponibles

                    case 7:
                    //cambiar de turno

                    case 8:
                    //salir

                }
                

            }

        }

    }

    
}
