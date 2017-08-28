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
![Get Started](https://photos-3.dropbox.com/t/2/AAAwFoXFNQrg-0higNxm9alGEi8RjcYivWaEQbOPDirHjw/12/596449354/png/32x32/1/_/1/2/eclipse%20che%201.png/EM6FuOcEGJwwIAIoAg/jAx5pvi8iQl4X_ZJpDioNPkiIf_4RZX9DjvVPMUToJg?size=1600x1200&size_mode=3)
+ hacer click en Saas Cloud
![Saas Cloud](https://photos-1.dropbox.com/t/2/AAA3a-i0ow9UmtqtZKwR_bfWA3Hc67N6sqUtJhrQmQ_GEg/12/596449354/png/32x32/1/_/1/2/eclipse%20che%202.png/EM6FuOcEGJ0wIAIoAg/8QtJALQMcgMNNjLQmzZb5KGnQWxpFOZVEYzhrbCJKBg?size=1600x1200&size_mode=3)
+ posteriormente hacer click en create a free account 
[Create a free account](https://photos-6.dropbox.com/t/2/AACFf2tHkSSGEIf7eZ00dvItarr_SOWq4bxBGCPch-h7FA/12/596449354/png/32x32/1/_/1/2/eclipse%20che%203.png/EM6FuOcEGJ4wIAIoAg/Tv9MMoqfd0oMgUfr0Epcstz6Se3ffsIfvg5GnEzCvTM?size=1600x1200&size_mode=3)
+ hacer click en el icono de github
[icono de git](https://photos-4.dropbox.com/t/2/AAC9kXwEQUaZQbX-k25v7NgzEekw1npUdk4b-KeemeLfpw/12/596449354/png/32x32/1/_/1/2/eclipse%20che%204.png/EM6FuOcEGJ8wIAIoAg/FxDS38fHdGu2X_KsKM8GJx04mjYxjuX9Q5RMyMFLKuA?size=1600x1200&size_mode=3)
llenamos los datos correspondientes y tendremmos acceso 
[IDE](https://photos-2.dropbox.com/t/2/AABeKnMRudDOmjasPRvVrxTlTqjgFcKKWw9TAinJW63TbQ/12/596449354/png/32x32/1/_/1/2/eclipse%20che%205.png/EM6FuOcEGKAwIAIoAg/FZwyW4WSPUuwDgvGXf_QmlSOMYbAmIgwLmo75nnJfAk?size=1600x1200&size_mode=3)


Agregacion EclipseChe
-----------------------
+ Clase Point, con sus respectivos getters y setters 
[Clase](https://photos-1.dropbox.com/t/2/AAATh-UnQ4JICJi5pvZTuCuorfBvB42_ih2b39aRxfQkbQ/12/596449354/png/32x32/1/_/1/2/punto%20java%201.png/EM6FuOcEGKQwIAIoAg/4GEABcZJyqmzJhq92WbJTvsN4HEWyaK1VAPLhhWpsWs?size=1600x1200&size_mode=3)
[Point](https://photos-6.dropbox.com/t/2/AAD-cJ7Ov4Px-Sx83gf8ZpzEw8ELiRBYi6asdKn8FOh9rg/12/596449354/png/32x32/1/_/1/2/punto%20java%202.png/EM6FuOcEGKQwIAIoAg/tzB5FL3x3TWyS-3w5ibN_hm9fxe-FNb4qjN5FX51gE4?size=1600x1200&size_mode=3)

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
[Clase](https://photos-1.dropbox.com/t/2/AAA4hqi4oWxcoazKlG5Z3ZJM7ds-b18Sd6INH8YgdQhTrg/12/596449354/png/32x32/1/_/1/2/linea%20java%201.png/EM6FuOcEGKQwIAIoAg/XLN1uxqwSA2Pjlg0eQFjQb9uTW8X57jgZ2Vx903e9Eo?size=1600x1200&size_mode=3)
[Line](https://photos-5.dropbox.com/t/2/AADZCGgy7FIr6edbK2tOXLHs95sU61V-l2o_Dbuqj75NXw/12/596449354/png/32x32/1/_/1/2/linea%20java%202.png/EM6FuOcEGKQwIAIoAg/xeM7O8Zkg8dzrxNRTzy0mI8VzBMnlarpufdoxoLlrbI?size=1600x1200&size_mode=3)



   
     






