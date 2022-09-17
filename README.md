# **README** parcial primer corte

### Integrantes
*David* *Narvaez*\
*Cristian* *Rodriguez*

### Equipo
*Los GatiHub*

## Paso a paso

- Lo primero que hicimos fue buscar un repositorio en GitHub que sirviera para cumplir nuestro objetivo.
- Una vez escogímos el proyecto hacemos un "Fork" para empezar a trabajar.
- Al clonar y tener el proyecto en nuestra maquina empezamos a analizar su composición y funcionamiento.
- Identificamos las malas practicas aplicadas y planteamos una solución.
- En este proyecto se identificaron varias malas practicas como: El incumplimiento del principio *SOLID* **Single responsability* ya que en una sola clase estaban todos los métodos e implementaciones, teniamos mala denominación en las clases y en las variables, no teniamos ningun tipo de comentario descriptivo y un mal uso de la identación.
- En base a lo mencionado en el numeral anterior reestructuramos el código usando los patrones de diseño, en este caso "Structural Patterns".
- Refactorizamos el código puesto que se estaba violando uno de los principios *SOLID* mas importantes, entonces rediseñamos los paquetes y creamos una clase aparte (Tablero) donde creamos diferentes métodos para la creación, actualización e impresión del "juego del gato".
- Cambiamos el nombre de las variables que no eran demasiado claras.
- Documentamos cada uno de los metodos.
- Optimizamos la ejecución del metodo "Draw" ya que previamente se hacia la ejecución de este de forma duplicada tanto para el jugador como para la máquina.    
- En el repositorio tampoco se ven pruebas, así que a continuación mostraremos imagenes adjuntas que reflejan el error:

### Capturas:
1. Caso donde se leen 2 números fuera de rango: 
![Imagen](https://github.com/Art2416/Cat-Game-P-1-CVDS/blob/master/Capturas/Caso%201.jpg)

2. Caso donde se lee un carácter: 
![Imagen](https://github.com/Art2416/Cat-Game-P-1-CVDS/blob/master/Capturas/Caso%202.jpg)

3. Caso donde se lee un espacio: 
![Imagen](https://github.com/Art2416/Cat-Game-P-1-CVDS/blob/master/Capturas/Caso%203.jpg)

   
   



