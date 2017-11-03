/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.niveldeacceso.usuarios;

/**
 *
 * @author diego
 */
public abstract class Employee {
   public String name;//default solo en paquete 
   private int hireYear;// solo en la clase 
   protected String country; // solo permite usarse en sus herencias 
   /*
   orden de restriccion 
   public 
   protected
   default
   private
   */
   protected abstract double monthlyPay();
   protected abstract double annualPay();
  
   
   public void setHireYear(int hy){
       this.hireYear=hy;
   }
    public int getHireYear(){
        return hireYear;
    }  
    
   
    
}
