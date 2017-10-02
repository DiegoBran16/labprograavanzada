//============================================================================
// Name        : nodos.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;
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

class lista{


public:
		Node *head= lista=NULL;
		Node *tail=NULL;
		int size=0;
	bool isEmpty(){
		if (size==0){
			return true;

		}
		else{
			return false;
		}
	}
	void addFirst(string prop){
	Node *newnode=new Node(prop);
	this-> head->setNext(newnode);
	if(size==0){
		this->tail->setNext(newnode);
	}
	size++;

	}

	void addLast(string prop){
		Node *newnode=new Node(prop);
			this->tail->getNext()->setNext(newnode);
			if(size==0){
				this-> head->setNext(newnode);
			}
			this-> tail->setNext(newnode);
			size++;

	}

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
	int listSize(){
		return size;
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
	void eliminarPrimero(){
		if (size==0){
							cout << "esta vacio"<< endl;

				}
		string res= head->getPropiedad();
		head=head->getNext();
		size--;

	}

};

int main() {
	cout << "!!!Hello World!!!" << endl; // prints !!!Hello World!!!
	return 0;
	lista listas = new lista();
	listas.addFirst("g");
	listas.addLast("a");
	listas.mostrar();


}
