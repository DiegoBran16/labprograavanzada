Listas enlazadas
-------------------
--------------------

public class SinglyLinkedList {

~~~
private static class Node{
    private String propiedad;
    private Node next;
    
    public Node(String e, Node n){
       this.propiedad= e; 
       this.next=n;
    }
    
    private String getPropiedad(){
        return this.propiedad;
    }
    private  void setPropiedad(String propiedad){
        this.propiedad = propiedad;
    }
    private void  setNext(Node next){
        this.next = next;
    }
    
    private Node getNext(){
        return next;
    }
    
}

private Node head = null;
private Node tail = null;
private int size = 0;

public int size(){return size;}
public boolean isEmpty(){return size==0;}

public String first(){
    if(isEmpty()) return null;
    return tail.getPropiedad();
    
}
public void addFirst(String e){
    head= new Node(e,null);;

    if(size==0){
        tail=head;
        size++;
    }
   
}
public void addLast(String e){
    
    Node newest = new Node(e,null);
    if(isEmpty())
    head= newest;
    else 
    tail.setNext(newest);
    tail= newest;
    size++;
}


public String last(){
    return this.tail.getPropiedad();
}
public String removeFirst(){
    if (isEmpty()) return null;
    String res = head.getPropiedad();
    head=head.getNext();
    size--;
    if (size==0)
    tail=null;
    return res;
}
}
~~~

~~~

public class HelloWorld {
    public static void main(String... argvs) {
        String a = "Che";
        System.out.println("Hello World " + a + "!");
        
        Node a = new NOde();
        a.setPropiedad("GUA");
        
        Node b = new Node();
        b.setPropiedad("MEX");
        b.setNext(b);
        Node c = new Node();
        c.setPropiedad("USA");
        a.getNext().setNext(c)
        
         Node d = new Node();
        d.setPropiedad("ESP");
        a.getNext().getNext.SetNext(d);
        
    System.out.println(a.getPropiedad());
     System.out.println(a.getNext().getPropiedad());
      System.out.println(a.getNext().getPropiedad());
      
      SinglyLinkedList lista = new SinglyLinkedList();
      lista.addFirst("guate");
      lista.addLast("USA");
      lista.addLast("ESP");
      lista.addLast("FRA");
      lista.addLast("RUS");
      lista.addLast("SUI");
      lista.addLast("CHI");
      lista.addLast("JAP");
      lista.addLast("COL");
      lista.addFirst("PAN");
      System.out.printLn(lista.first());
      System.out.Println(lista.last());
      string valor = lista.removefirst();
      while (valor != null){
          
          System.out.println(valor);
          valor = lista.removeFirst();
      }
      
    
        
        
    }
public  static class Node{
    private String propiedad;
    private Node next;
    
    private String getPropiedad(){
        return this.propiedad;
    }
    public  String setPropiedad(String propiedad){
        this.propiedad = propiedad;
    }
    public void  setNext(Node next){
        this.next = next;
    }
    
    public Node getNext(){
        return Next;
    }
    
}
}

~~~
