/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio5;

/**
 *
 * @author t203
 */
public class Laboratorio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PositionalList<String> lista = new LinkedPositionalList<>();
        Position<String> p0, p1, p2, p3;
        
        p0=lista.addFirst("g");
        p1=lista.addAfter(p0,"f");
        p2=lista.addAfter(p1, "b");
        p2=lista.addAfter(p2, "c");
        p2=lista.addAfter(p2, "d");
        p3=lista.addAfter(p2, "e");
        p3=p2;
        
                    System.out.println("valores de punteros");
                    System.out.println(p0);
                    System.out.println(p1);
                    System.out.println(p2);
                   System.out.println(p3);
                   String p= null;
        do {
            try{
            Position<String>posTemp=lista.first();
            p=lista.remove(posTemp);
            System.out.println(p);
            }
            catch(Exception e){
                System.out.println("fin de la lista");
                p=null;
                break;
            }
          
        }while(p!=null);
        
        
        
        
    }
    
}
