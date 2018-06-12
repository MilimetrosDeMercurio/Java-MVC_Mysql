/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2poo;



/**
 *
 * @author Margarita
 */
public class Menu {

    private static Menu motor;

    private Menu() {
    }
    
    //PATRON SINGLENTON
    
    public static Menu getInstance(){
        
        if( motor == null){
            motor = new Menu();
            
        }
        return motor;
    }
    
    public void opcionesParaJugar(){
        
        System.out.println("********* MargaritaBarahona 'sWorld**********");
        System.out.println(" 1. Para construir Edificaciones ");
        System.out.println(" 2. Crear Milicias ");
        System.out.println(" 3. Entrenar Milicias ");
        System.out.println(" 4. Remendar Milicias ");
        System.out.println(" 5. Crear Vehiculos ");
        System.out.println(" 6. Mostrar Recursos Disponibles ");
        System.out.println(" 7. Pasar de de Turno ");
        System.out.println(" 8. SALIR ");
        
        
        
        
        
        
        
        
        
    }
  
   
    
    
    
}
    


