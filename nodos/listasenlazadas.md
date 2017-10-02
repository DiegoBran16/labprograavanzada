Tarea de Laboratorio:listas enlazadas c++
--------------------
--------------------
+ Clase Nodo
------------
~~~
class Node{
private:
	string propiedad;
	Node *next;

public:
	Node(string prop,Node *sig= NULL){

		this ->propiedad=prop;
		this->next=sig;
	}
	void setNext(Node *ne){
		*next=*ne;
	}
	Node getNext(){
		return *next;
	}
	void setPropiedad(string p){
		propiedad=p;
	}
	string getPropiedad(){
		return propiedad;
	}
};
~~~

+ insertar al inicio
----------------------
~~~
void addFirst(string prop){
	Node *newnode=new Node(prop);
	this-> head->setNext(newnode);
	if(size==0){
		this->tail->setNext(newnode);
	}
	size++;

	}
~~~

+ insertar al final
--------------------
~~~
void addLast(string prop){
		Node *newnode=new Node(prop);
			this->tail->getNext()->setNext(newnode);
			if(size==0){
				this-> head->setNext(newnode);
			}
			this-> tail->setNext(newnode);
			size++;

	}
~~~

+ mostrar elementos
-------------------
~~~
void mostrar(){
		if (size==0){
			cout << "esta vacio"<< endl;

		}
		Node *tmp= this-> head;
		while(tmp!=NULL){
			cout << tmp->getPropiedad() << endl;
			tmp= tmp->getNext();
		}
	}
	void first(){
		if (size==0){
					cout << "esta vacio"<< endl;

				}

		Node *tmp= this-> head;
		cout << tmp->getPropiedad() << endl;

	}
	void  last(){
		if (size==0){
					cout << "esta vacio"<< endl;

				}

		Node *tmp= this-> head;
				cout << tmp->getPropiedad() << endl;

	}
~~~

+ tamaño de la lista 
------------------------
~~~
int listSize(){
		return size;
	}
~~~

+ eliminar un elemento al principio
---------------------------------------
~~~
void eliminarPrimero(){
		if (size==0){
							cout << "esta vacio"<< endl;

				}
		string res= head->getPropiedad();
		head=head->getNext();
		size--;

	}

~~~
