/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Casas;

import AbstractFactory.AbstractFactory;
import Lannister.Lannister;

/**
 *
 * @author Margarita
 */
public class casasFactory implements AbstractFactory{
      
    @Override
    public Casa casa(String tipo){
          switch(tipo){
              case "Lanister":
                  return  new Lanister();
              
              
          }
          return null;
      }
      @Override
    public Lannister Lannister(String tipo){
          return null;
      }
      @Override
    public AbstractFactory Stark(String tipo){
        return null;
    }
      @Override
    public AbstractFactory Targaryen(String tipo){
        return null;
    }
}
