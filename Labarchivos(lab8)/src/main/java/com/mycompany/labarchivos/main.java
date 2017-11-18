/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.labarchivos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author diego
 */
public class main {
    public static void main(String[] args) throws IOException{
        FileLoader carga= new FileLoader();
        String doc=" ";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ingrese la ruta del archivo");
        String ruta = br.readLine();
         doc=carga.loadFileWithJava7x(ruta);
         
        
        
        
        
    }
}
