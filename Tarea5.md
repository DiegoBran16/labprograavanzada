Tarea numero 5
==============================
Clase PositionalLinkedList
----------------------------------
~~~
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea5;


/**
 *
 * @author diego
 * @param <E>
 */
public class LinkedPositionalList<E> implements PositionalList<E>{
    
   private static class Node<E> implements Position<E> {
		private E element;
		private Node<E> prev;// Anterior
		private Node<E> next;// Siguiente

		public Node(E e, Node<E> p, Node<E> n) {
			element = e;
			prev = p;
			next = n;
		}

		public E getElement() throws IllegalStateException {
			if (next == null) // Nodo no valido
				throw new IllegalStateException("Posicion invalida");
			return element;
		}
		
		public void setElement(E e) {
			element = e;
		}

		public Node<E> getPrev() {
			return prev;
		}

		public void setPrev(Node<E> prev) {
			this.prev = prev;
		}

		public Node<E> getNext() {
			return next;
		}

		public void setNext(Node<E> next) {
			this.next = next;
		}

	}

	private Node<E> header = null;// Referencia
	private Node<E> trailer = header;
	private int size = 0;

	public LinkedPositionalList() {
		header = new Node<>(null, null, null);
		trailer = new Node<>(null, header, null);
		header.setNext(trailer);
	}

	// Metodos internos
	/**
	 * Valida si una posicion contiene un nodo y el nodo existe
	 */
	private Node<E> validate(Position<E> p) throws IllegalArgumentException {
		if (!(p instanceof Node))
			throw new IllegalArgumentException("P invalido");
		Node<E> node = (Node<E>) p; // safe cast
		if (node.getNext() == null)
			throw new IllegalArgumentException("p ya no se encuentra en la lista");
		return node;
	}
	
	/**
	 * "Empaca" un nodo como posicion a menos que sea header o trailer
	 */
	private Position<E> position(Node<E> node) {
		if (node == header || node == trailer)
			return null; // do not expose user to the sentinels
		return node;
	}

	// ---

	public int size() {return size;}

	public boolean isEmpty() {return size == 0;}

	public Position<E> first( ) {
		return position(header.getNext());
	}

	public Position<E> last( ) {
		return position(trailer.getPrev());
	}
	
	public Position<E> before(Position<E> p) throws IllegalArgumentException {
		Node<E> node = validate(p);
		return position(node.getPrev());
	}

	public Position<E> after(Position<E> p) throws IllegalArgumentException {
		Node<E> node = validate(p);
		return position(node.getNext());
	}
	
	
	private Position<E> addBetween(E e, Node<E> pred, Node<E> succ) {

		Node<E> newest = new Node<>(e, pred, succ);
		succ.setPrev(newest);
                pred.setNext(newest);
		size++;
		return newest;
            
	}
	
	public Position<E> addFirst(E e) {
		return addBetween(e, header, trailer);
	}

	public Position<E> addLast(E e) {
		return addBetween(e, trailer.getPrev(), trailer);
	}
	
	public Position<E> addBefore(Position<E> p, E e) throws IllegalArgumentException{
		Node<E> node = validate(p);
		return addBetween(e, node.getPrev(), node);
	}
	
	public Position<E> addAfter(Position<E> p, E e) throws IllegalArgumentException{ 
		Node<E> node = validate(p);
		return addBetween(e, node, node.getNext());
	}

	public E set(Position<E> p, E e) throws IllegalArgumentException {
		Node<E> node = validate(p);
		E answer = node.getElement();
		node.setElement(e);
		return answer;
	}
	
   @Override
	public E remove(Position<E> p) throws IllegalArgumentException {
		Node<E> node = validate(p);
		Node<E> predecessor = node.getPrev();
		Node<E> successor = node.getNext();
		predecessor.setNext(successor);
		successor.setPrev(predecessor);
		size--;
		E answer = node.getElement();
		node.setElement(null);
		node.setNext(null);
		node.setPrev(null);
		return answer;
	}
         public Position<E> search(E value){
                    Node<E> temp= header;
             do {
                if(temp.getElement()==value){
                    return (Position<E>) value;
                }
                
                   temp= temp.getNext();
                   return null;
                 
             }
             while(temp!=null);
             
             
         }
          public Position<E> addBefore(Position<E> p, PositionalList<E> sublist){
              return sublist.addBefore(p, p.getElement());
          }
           public Position<E> addAfter(Position<E> p, PositionalList<E> sublist){
                return sublist.addAfter(p, p.getElement());
           }
           public  Position<E> addFirst(Position<E> p, PositionalList<E> sublist){
                return sublist.addFirst(p.getElement());
            }
        public Position<E> addLast(Position<E> p, PositionalList<E> sublist){
            return sublist.addLast(p.getElement());
        }
       public  int distance(Position<E> a, Position<E> b){
           int posiciones=0;
           Node<E> tmp= header;
           while(tmp!=b){
               if(tmp.getElement()==a){
                   posiciones=0;
               }
               tmp=tmp.getNext();
               posiciones++;
               
           }
           return posiciones;
       }
}
~~~
Interfaz Posicion 
-------------------
~~~
package tarea5;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author diego
 * @param <E>
 */

    public interface Position<E> {
    E getElement() throws IllegalStateException;
}
~~~

Clase Main
-------------------------
~~~
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea5;

/**
 *
 * @author diego
 */
public class Tarea5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
          PositionalList<String> lista = new LinkedPositionalList<>();
        Position<String> p0, p1, p2, p3;
            PositionalList<String> lista2 = new LinkedPositionalList<>();
        
        p0=lista.addFirst("g");
        p1=lista.addAfter(p0,"f");
        p2=lista.addAfter(p1, "b");
        p2=lista.addAfter(p2, "c");
        p2=lista.addAfter(p2, "d");
        p3=lista.addAfter(p2, "e");
        p3=p2;
        
        p0=lista2.addFirst("g");
        p1=lista2.addAfter(p0,"f");
        p2=lista2.addAfter(p1, "b");
        p2=lista2.addAfter(p2, "c");
        p2=lista2.addAfter(p2, "d");
        p3=lista2.addAfter(p2, "e");
        
                    System.out.println("valores de punteros");
                    System.out.println(p0.getElement());
                    System.out.println(p1.getElement());
                    System.out.println(p2.getElement());
                   System.out.println(p3.getElement());
                   String p=null;
                   
                   System.out.println("lista completa-----");
                    do {
                        try{
                        Position<String>posTemp=lista.first();
                        p= lista.remove(posTemp);
                        System.out.println(p);
                        }
                        catch(Exception e){
                            System.out.println("fin de la lista");
                            p=null;
                            break;
                        }

                    }while(p!=null);
                    
                      p0=lista.addFirst("g");
                    p1=lista.addAfter(p0,"f");
                    p2=lista.addAfter(p1, "b");
                    p2=lista.addAfter(p2, "c");
                    p2=lista.addAfter(p2, "d");
                    p3=lista.addAfter(p2, "e");
                    p3=p2;

                    p0=lista2.addFirst("g");
                    p1=lista2.addAfter(p0,"f");
                    p2=lista2.addAfter(p1, "b");
                    p2=lista2.addAfter(p2, "c");
                    p2=lista2.addAfter(p2, "d");
                    p3=lista2.addAfter(p2, "e");
                    lista.addAfter(p3, lista2);
                    lista.addBefore(p3, lista2);
                    lista.addFirst(p2, lista2);
                    lista.addLast(p2, lista2);
                    
                    System.out.println("lista completa-----");
                    do {
                        try{
                        Position<String>posTemp=lista2.first();
                        p= lista2.remove(posTemp);
                        System.out.println(p);
                        }
                        catch(Exception e){
                            System.out.println("fin de la lista");
                            p=null;
                            break;
                        }

                    }while(p!=null);
                    
                    
                      p0=lista.addFirst("g");
                      p1=lista.addAfter(p0,"f");
                      p2=lista.addAfter(p1, "b");
                      p2=lista.addAfter(p2, "c");
                      p2=lista.addAfter(p2, "d");
                      p3=lista.addAfter(p2, "e");
                      p3=p2;
                      ~~~

