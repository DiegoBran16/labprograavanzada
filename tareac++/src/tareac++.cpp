//============================================================================
// Name        : tareac++.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;


void mostrarNumIngresados(int num, int arreglo[]){
	cout<< "numeos ingresados"<< endl;
	for(int i=0; i<(num);i++){
		cout<< arreglo[i]<< endl;
	}
}

int sumaArreglo(int arreglo[], int num){
	int sumaarreglo=0;
	for(int i =0; i< (num); i++){
			int numero = arreglo[i];
			sumaarreglo= sumaarreglo+numero;
	}
	return sumaarreglo;
}

int longarreglo(int arreglo[], int num){
	int longarreglo=0;
		for(int i =0; i<= (num-1); i++){
			if(arreglo[i]!=0){
				longarreglo+=1;
			}
		}
		return longarreglo;

}

int encontrarMostrar(int arreglo[],int num,int ingresado){
	try{


	if ((ingresado -1) < longarreglo(arreglo,num)){
		return arreglo[ingresado-1];
	}else{
		return 0;
	}

	}catch(int e){
		 cout << "NO ingreso un valor correcto " << e << '\n';

	}
	return 0;
}

int sumaPosPares(int arreglo[], int num){
	int sumapares=0;
	for(int i=0; i< (num-1); i++){
		if((i+1)% 2==0){
			sumapares+=arreglo[i];
		}
	} return sumapares;
}
int sumaPosImpares(int arreglo[], int num){
	int sumaimpares=0;
	for(int i=0; i< (num-1); i++){
		if((i +1)% 2!=0){
			sumaimpares+=arreglo[i];
		}
	} return sumaimpares;
}
void motrarAscendentemente(int num, int arreglo[]){
	   int Temp;
	         for(int i=0;i<num;i++){
	                for(int j=0;j<num-1;j++){
	                    if(arreglo[j]>arreglo[j+1]){
	                        Temp=arreglo[j];
	                        arreglo[j]=arreglo[j+1];
	                        arreglo[j+1]=Temp;}
	                }
	         }


	                 for(int i=0;i<num;i++){
	                    cout<<arreglo[i]<<endl;
	                 }
}






int main() {
	cout << " ingrese la cantidad de numero enteros que desa almacenar "<< endl; // prints !!!Hello World!!
	int num;
	cin >> num;
	cout<< num << endl;

	int arreglo[num];


	for(int i=0; i<(num);i++){
				cout << " ingrese un numero " << endl;
				int numero;
				cin >> numero;
				arreglo[i]=numero;
	}

	mostrarNumIngresados(num,arreglo);
	cout << "suma de arreglo "<<sumaArreglo(arreglo,num) << endl;
	cout<< " longitud del arreglo "<< longarreglo(arreglo,num)<< endl;

	cout<< "ingrese la posicion que desea ver" << endl;
	int ingreso;
	cin>> ingreso;
	cout<< "numero encontrado" <<" "<< encontrarMostrar(arreglo,num,ingreso) << endl;
	cout<< "suma de posiciones pares" << " "<<sumaPosPares(arreglo,num) << endl;
	cout<< "suma de posiciones impares" << " "<<sumaPosImpares(arreglo,num) << endl;
	 motrarAscendentemente(num,arreglo);




	return 0;


}
