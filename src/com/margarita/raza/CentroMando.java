
package com.margarita.Entrenar;

import com.margarita.Entrenar.CentroMando.buildercentro;
import com.margarita.edificacion.Edificacion;
import com.margarita.edificacion.Recurso;
import com.margarita.raza.exceptions.MaximaCapacidadSuperada;
import com.margarita.vehiculo.Vehiculo;

/**
 *
 * @author Margarita
 */
public class CentroMando extends Edificacion {
    
//ATRIBUTOS
    int[] capacidad;
    Recurso mr1, mr2, mr3;
    Vehiculo v1 , v2;
    String nivel;
    
//CONSTRUCTOR

    public CentroMando(int vida) {
        super(vida);
        capacidad = new int[]{10000,5000,3000};
    }

    public Vehiculo getV1() {
        return v1;
    }

    public void setV1(Vehiculo v1) {
        this.v1 = v1;
    }

    public Vehiculo getV2() {
        return v2;
    }

    public void setV2(Vehiculo v2) {
        this.v2 = v2;
    }
    
 
//GET & SET

    public Recurso getMr1() {
        return mr1;
    }

    public void setMr1(Recurso mr1) throws MaximaCapacidadSuperada{
        if(mr1.getCant() > capacidad[0])
           throw new MaximaCapacidadSuperada(mr1,capacidad[0]);
        this.mr1 = mr1;
    }

    public Recurso getMr2() {
        return mr2;
    }

    public void setMr2(Recurso mr2) throws MaximaCapacidadSuperada{
        if(mr2.getCant() > capacidad[1])
            throw new MaximaCapacidadSuperada(mr2,capacidad[1]);
        this.mr2 = mr2;
    }

    public Recurso getMr3() {
        return mr3;
    }

    public void setMr3(Recurso mr3) throws MaximaCapacidadSuperada{
        if(mr3.getCant()>capacidad[2])
            throw new MaximaCapacidadSuperada(mr3, capacidad[2]);
        this.mr3 = mr3;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        
        this.nivel = nivel;
    }

   
    //PATRON BUILDER

    public static class buildercentro{
        private int vida;
        
        public buildercentro vida(int vida){
            this.vida = vida;
            return this;
        }
        
        
    public CentroMando builder(){
        return new CentroMando(vida);
    }
    
    
   
    }

    
    
}
