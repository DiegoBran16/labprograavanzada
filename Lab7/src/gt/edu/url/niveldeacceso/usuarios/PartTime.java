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
public class PartTime extends HourlyEmployee{
     protected double annualPay(){
         return this.monthlyPay()*12;
     }
}
