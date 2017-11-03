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
public class Manager extends SalariedEmployee{
    
    public double annualPay(){
        return (this.monthlyPay()*12)*1.20;
    }
}
