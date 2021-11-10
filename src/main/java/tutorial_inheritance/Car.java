/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inherit;

import inherit.Vehicle;

/**
 *
 * @author ed
 */


class Car extends Vehicle {
  //String //modelName = "Mustang";    // Car attribute
 
  public static void main(String[] args) {

    // Create a myCar object
    Vehicle myCar = new Vehicle();

    // call the engine type
    myCar.engine1();
    

    // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
    System.out.println(myCar.brand + " " + myCar.modelName);
    System.out.println(myCar.brand + " " + myCar.modelName2);
    
  }


}
