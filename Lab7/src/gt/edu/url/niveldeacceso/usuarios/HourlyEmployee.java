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
public abstract class HourlyEmployee extends Employee {
    
   int hoursPerWeek;
   double hourlyWage;
    
   @Override
    protected  double monthlyPay(){
        double pay;
        return((double)hoursPerWeek)*4*hourlyWage;          

    }
    
   protected abstract double annualPay();
   
   
    
}
