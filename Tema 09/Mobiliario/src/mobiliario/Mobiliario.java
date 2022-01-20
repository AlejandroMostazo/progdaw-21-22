/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobiliario;

/**
 *
 * @author usuario
 */
public class Mobiliario {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    //Mueble miMueble = new Mueble ("madera",12,"marron");
    Mesa miMesa = new Mesa ("plastico",5,"verde",12);
    Armario miArmario = new Armario ("PVC",100,"blanco",3);
    
    //System.out.println(miMueble);
    System.out.println(miMesa);
    System.out.println(miArmario);
    miArmario.pintar("verde");
    System.out.println(miArmario);
  
  }
  
}
