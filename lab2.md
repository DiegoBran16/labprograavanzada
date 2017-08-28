Laboratorio 1
======================
1)¿Que es github?
---------------
+ gitub es una pagina en l cual se puede guardar almacenar codigo, en cuentas publicas todos los usuarios podran ver o modificar el alchivo aunque es decicion del dueño del archivo aceptar la modificacion 

2)¿Que es eclipse che?
-----------------------
+ eclipse che es un entorno de desarrollo en linea, lo cual facilita a los usurios al no necesariamente descargar el programa

3)¿Que diferencia hay entre agregacion y herencia?
--------------------------------------------------
+ En que agregacion consiste en instancear una clase dentro de otra debido a que el objeto que representa la clase sera utilizado dentro del plano de creacion del otro objeto,
mientras que la herencia consiste en que una clase herede todos los metododos y atributos a una subclase.

4)¿Que relacion existe entre herencia y pilimorfismo?  
-----------------------------------------------------
+ En que en ambas existe interaccion entre 2 o mas clases

5)Comprovar version de Java y Javac
-------------------------------------------

![version de Java y Javac (imagen)](<a href="http://imgur.com/QA08hLV"><img src="http://i.imgur.com/QA08hLV.png" title="source: imgur.com" /></a>
)

6)Crear una cuenta en github y utilizarla en EclipseChe
-------------------------------------------------------
+ nos dirigimos a la pagina de github, le damos a sign up y posteriormente llenamos los datos y le damos a continuar
![hoja de datos github](<a href="http://imgur.com/mURAyHE"><img src="http://i.imgur.com/mURAyHE.png" title="source: imgur.com" /></a>)
+ posteriormente se habra creado la cuenta y veremos en pantalla lo siguiente:
![cuenta creada](<a href="http://imgur.com/fJeXlGG"><img src="http://i.imgur.com/fJeXlGG.png" title="source: imgur.com" /></a>)

+ y por ultimo verificamos el email
![verificacion de email](ht<a href="http://imgur.com/fvj43wM"><img src="http://i.imgur.com/fvj43wM.png" title="source: imgur.com" /></a>)

+ dirigirse a eclipse che y hacer clic get started
![Get Started](<a href="http://imgur.com/pMvRfIj"><img src="http://i.imgur.com/pMvRfIj.png" title="source: imgur.com" /></a>)
+ hacer click en Saas Cloud
![Saas Cloud](<a href="http://imgur.com/JXn7xgo"><img src="http://i.imgur.com/JXn7xgo.png" title="source: imgur.com" /></a>)
+ posteriormente hacer click en create a free account 
![Create a free account](<a href="http://imgur.com/ohySRsE"><img src="http://i.imgur.com/ohySRsE.png" title="source: imgur.com" /></a>)
+ hacer click en el icono de github
![icono de git](<a href="http://imgur.com/gIJTRoZ"><img src="http://i.imgur.com/gIJTRoZ.png" title="source: imgur.com" /></a>)
llenamos los datos correspondientes y tendremmos acceso 
![IDE](<a href="http://imgur.com/k587wcY"><img src="http://i.imgur.com/k587wcY.png" title="source: imgur.com" /></a>)


Agregacion EclipseChe
-----------------------
+ Clase Point, con sus respectivos getters y setters 
![Clase Point](<a href="http://imgur.com/Y5UNIeG"><img src="http://i.imgur.com/Y5UNIeG.png" title="source: imgur.com" /></a>)
![](<a href="http://imgur.com/zXyLKN4"><img src="http://i.imgur.com/zXyLKN4.png" title="source: imgur.com" /></a>)

Esta Clase contiene metodos para obtener distancia entre 2 puntos y la distancia hacia el punto (0,0)

distancia entre 2 puntos:

         public double distance (double x2, double y2){
         double distance =(double)Math.sqrt((Math.pow((x2-x),2)+ Math.pow((y2-y),2)));
         return distance;
     }

Distancia entre un punto y (0,0)
 
     public double distance3(){
         double distance = (double)Math.sqrt((Math.pow((x),2)+ Math.pow((y),2)));
         return distance;
     }
     
+Clase Line con sus respectivos getters y setters a diferencia de la Clase point esta tiene getters y setters directamente de tipo punto y getters y setters de tipo int para preferencia del usuario
![Clase Line](<a href="http://imgur.com/6hJtE2z"><img src="http://i.imgur.com/6hJtE2z.png" title="source: imgur.com" /></a>)
![](<a href="http://imgur.com/HdS8usF"><img src="http://i.imgur.com/HdS8usF.png" title="source: imgur.com" /></a>)



   
     






