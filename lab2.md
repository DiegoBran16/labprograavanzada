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
     
+ La Clase Line con sus respectivos getters y setters a diferencia de la Clase point esta tiene getters y setters directamente de tipo punto aparte de los getters y setters de tipo int para preferencia del usuario
![Clase Line](<a href="http://imgur.com/6hJtE2z"><img src="http://i.imgur.com/6hJtE2z.png" title="source: imgur.com" /></a>)
![](<a href="http://imgur.com/HdS8usF"><img src="http://i.imgur.com/HdS8usF.png" title="source: imgur.com" /></a>)

la Clase line permite obtener la distancia de la linea a travez de la siguiente funcion

          public double getLenght(){
               double distance=(double)Math.sqrt((Math.pow((end.getX()-Begin.getX()),2)+ Math.pow((end.getX()-Begin.getY()),2)));
               return distance;
            }  
            

Herencia EclipseChe
-------------------

+ La clase persona contiene 2 atributos nombre y direccion con sus respectivos getters y setters
![](<a href="http://imgur.com/1rD40jd"><img src="http://i.imgur.com/1rD40jd.png" title="source: imgur.com" /></a>)

+ La clase estudiante hereda los metodos de la clase persona y se añades sus propiedades lasa cuales son cursos, notas y numero de cursos
![](<a href="http://imgur.com/z0Zm2l9"><img src="http://i.imgur.com/z0Zm2l9.png" title="source: imgur.com" /></a>)

en esta clase podremos encontrar metodos como: 


Agregar un curso

            public void addCourseGrade(String course, int grade){
              for(int i =0; i <= courses.length; i++){
              if(courses[i] != null){
                courses[i]= course;
            }
             for(int j =0; j<= grades.length; j++){
            if(grades[i] != 0){
                grades[i]= grade ; 
                
                
Imprimir notas

    public void printGrades(){
        for(int i=0; i<=grades.length; i++){
            if (grades[i]!= 0){
                System.out.println(grades[i]);
            }
            
Obtener el promedio

    public int getAverageGrades(){
     int total=0;
     int suma=0;
     int t1=0;
     for(int i=0; i<grades.length;i++){
         suma= grades[i];
         t1 = total;
         total = (t1+suma);    
     }
     return total;
     }
    
    
+ Tambien se encontrara la clase maestrro la cual hereda metodos de la clase persona y ademas tiene propiedades como numero de cursos y cursos
![](<a href="http://imgur.com/OqrTfAe"><img src="http://i.imgur.com/OqrTfAe.png" title="source: imgur.com" /></a>)

en esta se encuentran metodos como:

Agregar un curso:

    public boolean addCourse(String course){
        for (int i=0; i< courses.length;i++){
            if(courses[i]==null){
                courses[i]= course;
                return true;
            }  else if (courses[i]== course){
                return false;
            }
         } return false;

      }
      
Eliminar un curso:

          public boolean addCourse(String course){
        for (int i=0; i< courses.length;i++){
            if(courses[i]==null){
                courses[i]= course;
                return true;
            }  else if (courses[i]== course){
                return false;
            }
         } return false;

      }
      
      
Tarea
======

Instalae Eclipse Oxygen
-------------------------

+ Ir a la pagina de Eclipse y hacer click en descargar
![](<a href="http://imgur.com/mroUbSh"><img src="http://i.imgur.com/mroUbSh.png" title="source: imgur.com" /></a>)

+ Correr el intalador y hacer click en Eclipse for Java Developers
![](<a href="http://imgur.com/ODRaN5d"><img src="http://i.imgur.com/ODRaN5d.png" title="source: imgur.com" /></a>)

+ Hacer click en instalar y al finalizar aparecera el acceso directo en su escritorio 
![](<a href="http://imgur.com/yfiFrMK"><img src="http://i.imgur.com/yfiFrMK.png" title="source: imgur.com" /></a>)
      
      



     







   
     






