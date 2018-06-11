
package com.margarita.raza;

import com.margarita.raza.exceptions.MaximaCapacidadSuperada;

/**
 *
 * @author Margarita
 */
public class CentroMando extends Edificacion {
    
//ATRIBUTOS
    int[] capacidad;
    Recurso mr1, mr2, mr3;
    String nivel;
    
//CONSTRUCTOR

    public CentroMando(int vida) {
        super(vida);
        capacidad = new int[]{10000,5000,3000};
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

    public void setMr1(Edificacion laboratorio) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
    
}
