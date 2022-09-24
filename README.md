# **README** parcial primer corte

### Integrantes
*David* *Narvaez*\
*Cristian* *Rodriguez*

### Equipo
*Los GatiHub*

## Descripción del proyecto

El juego del gato es un proyecto tomado del repositorio de GustavoAlv1998, en cuál, se quiere simular el clásico juego de tres en línea o también conocido como "triqui"

![Imagen](https://github.com/Art2416/Cat-Game-P-1-CVDS/blob/master/images/tresenlinea.jpg)

## Paso a paso

- Lo primero que hicimos fue buscar un repositorio en GitHub que sirviera para cumplir nuestro objetivo.
- Una vez escogímos el proyecto hacemos un "Fork" para empezar a trabajar.

![Imagen](https://github.com/Art2416/Cat-Game-P-1-CVDS/blob/master/images/fork.jpg)

- Al clonar y tener el proyecto en nuestra máquina empezamos a analizar su composición y funcionamiento.
- Identificamos las malas prácticas aplicadas y planteamos una solución.
- En este proyecto se identificaron varias malas prácticas como: El incumplimiento del principio *SOLID* *Single responsability,* ya que en una sola clase estaban todos los métodos e implementaciones, teníamos mal nombramiento en las clases y en las variables, no teniamos ningun tipo de comentario descriptivo y un mal uso de la identación.
- Con base en lo mencionado en el numeral anterior reestructuramos el código usando el patron **Singleton** correspondiente a los patrones creacionales.

![Imagen](https://github.com/Art2416/Cat-Game-P-1-CVDS/blob/master/images/main.jpg)

![Imagen](https://github.com/Art2416/Cat-Game-P-1-CVDS/blob/master/images/getI.jpg)

- Refactorizamos el código, puesto que se estaba violando uno de los principios *SOLID* más importantes, entonces rediseñamos los paquetes y creamos una clase aparte (Tablero) donde creamos diferentes métodos para la creación, actualización e impresión del "juego del gato".

Estructura antes:

![Imagen](https://github.com/Art2416/Cat-Game-P-1-CVDS/blob/master/images/capA.jpg)

Estructura después:

![Imagen](https://github.com/Art2416/Cat-Game-P-1-CVDS/blob/master/images/capD.jpg)

- Cambiamos el nombre de las variables que no eran demasiado claras.
- Documentamos cada uno de los métodos.

Ejemplo de la documentación en el método Draw:

![Imagen](https://github.com/Art2416/Cat-Game-P-1-CVDS/blob/master/images/draw.jpg)

- Optimizamos la ejecución del método "Draw", ya que previamente se hacía la ejecución de este de forma duplicada tanto para el jugador como para la máquina.    
- En el repositorio tampoco se ven pruebas, así que a continuación mostraremos imágenes adjuntas:


### Capturas pruebas de unidad:

![Imagen](https://github.com/Art2416/Cat-Game-P-1-CVDS/blob/master/images/UnitTests.jpg)

![Imagen](https://github.com/Art2416/Cat-Game-P-1-CVDS/blob/master/images/UnitTests1.jpg)

![Imagen](https://github.com/Art2416/Cat-Game-P-1-CVDS/blob/master/images/UnitTests2.jpg)


Como podemos ver en la captura anterior creamos las pruebas de unidad, pero para ello se tuvo que implementar métodos y validaciones en la nueva clase Tablero. Implementamos la estructura de nombramiento para pruebas (given_when_then) y el patron AAA.

### Capturas pruebas de aceptación:
1. Caso donde se leen 2 números fuera de rango: 
![Imagen](https://github.com/Art2416/Cat-Game-P-1-CVDS/blob/master/images/C1.jpg)

2. Caso donde se lee un carácter: 
![Imagen](https://github.com/Art2416/Cat-Game-P-1-CVDS/blob/master/images/C2.jpg)

3. Caso donde se lee un espacio: 
![Imagen](https://github.com/Art2416/Cat-Game-P-1-CVDS/blob/master/images/C3.jpg)

   
   



