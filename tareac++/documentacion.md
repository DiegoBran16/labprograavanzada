Tarea C++
--------------
-----------------

Tabla de multiplicar
--------------------
+ metodo que recibe un numero como paramerto y genera su tabla de multiplicar del 0-10
![](https://i.imgur.com/L9YfAHZ.png)

Arreglos
----------
+ se crea un arreglo con n numeros y posterior mente se ingresan dichos numeros

~~~
cout << " ingrese la cantidad de numero enteros que desa almacenar "<< endl;
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
  ~~~
 + metodo para mostrar los datos que tiene el arreglo
  
  ~~~
  void mostrarNumIngresados(int num, int arreglo[]){
	cout<< "numeos ingresados"<< endl;
	for(int i=0; i<(num);i++){
		cout<< arreglo[i]<< endl;
	}
}
~~~

+ metodo para mostrar la cantidad de posiciones de un arreglo
~~~
int longarreglo(int arreglo[], int num){
	int longarreglo=0;
		for(int i =0; i<= (num-1); i++){
			if(arreglo[i]!=0){
				longarreglo+=1;
			}
		}
		return longarreglo;

}
~~~

+ metodo para mostrar la suma de los elementos del arreglo
~~~
int sumaArreglo(int arreglo[], int num){
	int sumaarreglo=0;
	for(int i =0; i< (num); i++){
			int numero = arreglo[i];
			sumaarreglo= sumaarreglo+numero;
	}
	return sumaarreglo;
}
~~~

+ metodo para buscar un elemento en el arreglo
~~~
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
~~~

+ metodos para obtener la suma de las posiciones pares o impares 
~~~
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
~~~
+ metodo para mostrar los datos de manera ascendente
~~~
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
~~~
