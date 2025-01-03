José Luis Juárez Rivera
UVEG
Fecha: 17/12/2024

Contenido 

Introducción 
Metodología 
Desarrollo
Resultados 
Conclusión 
Bibliografía

Introducción 

El presente proyecto se centra en el desarrollo de una aplicación de escritorio la cual nos servirá para representar el sistema de préstamo de libros para una biblioteca. Con ello, se pretende poner en práctica y entender los conceptos fundamentales de la programación orientada a objetos. 
El lenguaje de programación utilizado es Java.

Metodología 

Se utilizó el enfoque del modelo de capas. Las capas que fueron identificadas para nuestro proyecto son las siguientes: 
Interfaz gráfica (GUI): contiene todas las vistas donde los usuarios y administradores pueden hacer uso de las funcionalidades del sistema. 
Vista de inicio de sesión. 
Vista de panel general.
Lógica: contiene las clases con las cuales se modela al sistema.
Membresía: representa a los usuarios que tomarán prestados libros. 
Administrador: representa  a los administradores y reguladores del sistema. 
Libro: representa a la unidad de nuestro sistema. 
Controladora: representa el flujo de las operaciones. 

Persistencia: contiene el mapeo y relación entre clases y la base de datos para el sistema. 


Desarrollo

Desarrollo de la interfaz de usuario. 

La interfaz de usuario fue desarrollada a través de la API llamada ‘Swing’. Swing es una herramienta que forma parte de Java y es utilizada para el diseño de interfaces gráficas (GUI).

Comencemos a analizar la primera vista/pantalla de la aplicación de escritorio: la pantalla de inicio de sesión. Una primera iteración se muestra a continuación: 

Figura 1. Prototipo de diseño para la vista de inicio de sesión.

Conceptos fundamentales desde una perspectiva del desarrollo front end.

Puede observarse que se optó por un diseño “simple”; es decir, como la gran mayoría de vistas de inicio de sesión, podemos centrar nuestra atención en dos elementos de relevancia: 
Dos elementos de vital importancia al momento de estar creando un diseño, son los conceptos de descubrimiento y entendimiento [1].
El concepto del descubrimiento se basa en el hecho de que los componentes principales que forman a un diseño deben estar expuestos, de tal manera que podamos descubrir su funcionamiento y propósito dentro del diseño en general. El entendimiento, por otra parte, se basa en el hecho de utilizar el diseño en sí.
En el caso de las vistas de inicio de sesión, podemos encontrar dos elementos de vital importancia:

Sección de credenciales de acceso. 
Botón para enviar credenciales de acceso y verificar acceso al sistema. 
 [discutir temas de diseño a mayor profundidad: pendiente].

Interactividad en la interfaz gráfica.

Botón de “ingresar al sistema”:
Este botón tiene asociada la función de buscar un “match” con la tabla tanto de administradores como de usuarios. 

Desarrollo del módulo lógico

Tenemos tres clases principales que modelan a nuestro sistema: 
Clase “Membresía”: con esta clase se modela al usuario de la librería.
1) Atributos: 
Nombre. 
Apellidos. 
Correo electrónico.
Edad.
Tipo de membresía: regular, estudiante y especializado.
Cantidad de libros actuales en posesión.
 - 	Clase “Libro”: con esta clase se modela al usuario de la librería.
1) Atributos: 
Título.
Autor. 
Año de lanzamiento..
Género.
Editorial..
Código ISBN.
Cantidad en “stock”.
-	2) Métodos: 
	    - 
Desarrollo del módulo de persistencia 

Esquema preliminar del modelo de base de datos: 


Bibliografía

1. Norman, D. A. (2013). The design of everyday things. MIT Press.
