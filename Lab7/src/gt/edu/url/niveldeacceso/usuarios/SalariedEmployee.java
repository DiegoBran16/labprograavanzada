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
public abstract class SalariedEmployee extends Employee{
     int annualSalaty;
     SalariedEmployee(){
         name="victor";
         setHireYear(1999);
         country="Guatemala";
         
     }
     @Override
    public double monthlyPay(){
         return 10000;
     }
     @Override
    public abstract double annualPay();
     
}
