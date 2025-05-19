# Gestion-de-Base-de-datos-con-Sakila
Este es un programa de consola en Java que gestiona una base de datos de peliculas donde uno puede listar, agregar, actualizar y eliminar peliculas.

/*
Cesar Maicol Leonardo Herrera 
100614752
UASD 2025-10
*/

El programa está estructurado en varios paquetes (packages), cada uno de los cuales agrupa las clases relacionadas según su responsabilidad dentro del proyecto. A continuación, se detallan las clases y el proceso de codificación llevado a cabo para el desarrollo del sistema:

---controllers---

*FilmController.java*
Esta clase implementa esta clase para manejar las operaciones relacionadas con las películas como agregarlas o eliminarlas.

Utiliza una interfaz genérica llamada 'iDatapost' para manejar operaciones CRUD que es muy util a la hora de hacer cambios mas adelante. Tambien utiliza unos metodos como listarPeliculas(), agregar(Film), entre otras. Ademas aqui conecté directamente lo que se muestra o se ejecuta con lo que está almacenado en la base de datos.

*JSONExporter*
Utilice la librería externa GSON de Google para convertir objetos Java a texto JSON cumpliendo con uno de los parametros del mandato. 
El resultado se guarda en un archivo especificado por el usuario.

El método principal exportToJSON(List<Film> films, String filePath) convierte la lista de películas a JSON y la escribe en un archivo de texto.

Durante el desarrollo me ayudó a entender cómo usar librerías externas en Java, manejar archivos y trabajar con estructuras de datos como listas.

---data---
*DataContext*
Esta es una clase abstracta y fue una de las bases del proyecto, ya que aquí se establece la conexión con la base de datos sakila en MySQL. Al extender de la interfaz iDatapost (que proximamente detallare), la clase define operaciones CRUD, y sirve como clase padre para las clases FilmDAO.

- En el constructor se abre la conexión con la base de datos.
- Hay métodos concretos (post, put, delete) que imprimen mensajes como prueba, pero en las subclases estos métodos pueden ser sobreescritos para tener funcionalidad real.
- El método `testConnection()` fue útil durante el desarrollo para comprobar que la conexión a la base de datos funcionaba correctamente.
- Los métodos `get(int id)` y `getAll()` se dejan como abstractos para que cada subclase los implemente dependiendo del tipo de datos que maneje.

*DBConnection*
Aqui hay pocas cosas mas no su falta de importancia ya que en este caso aqui se obtiene una conexión a la base de datos. Su objetivo principal es facilitar la conexión sin tener que escribir repetidamente los datos de acceso en cada clase que lo necesite.

*FilmDAO*
Esta clase implementa la interfaz "iDatapost<Film>" y simula el acceso a datos relacionados con películas. Aunque en un entorno real se usaría una base de datos, en este caso la información se maneja directamente desde una lista en memoria "ArrayList".

*iDatapost*
En este caso defino mis metodos para obtener los id de los objetos, actualizar almacenamiento o eliminar por su id, además, esta interfaz define los métodos básicos para un repositorio de datos generico para las pelicualas en cualquier tipo de almacenamiento. Los métodos que contiene son típicos de un patrón CRUD.

---models---

*Film*
La clase "Film" representa una película dentro del sistema. Contiene los atributos principales de una película, como su identificador, título, descripción y año de estreno. En esencia aqui se encuentra el modelado integro del programa.

---reports---

*CsvExporter*
Desde esta clase exportamos la lista de objetos genéricos a un archivo .csv donde esta recibe los parametro fileName que es donde guarda los datos y list que es practicamente la lista de objetos que se quieren exportar.

---utils---

*SakilaConsoleApp*
Esta es la clase principal del programa, donde se ejecuta todo el flujo de operaciones de la aplicación que funciona tal que asi; llamar a controller.listarpeliculas() para listar las peliculas, agregar una nueva pelicula con el objeto film en el que se muestra su ttítulo, descripcion, año, entre otros y que despues lo agraga a la base de datos. Despues sigue otras operaciones como actualizar o eliminar las pelicualas existentes, obtener las películas y exportarlas gracias a la implementación de clases anteriormente mencionadas. Tambien usa el try-catch para las excepciones.

*Validator*
En este caso se valida los formatos especificos de datos en la entrada. Debo aclarar que aunque estaba pensada en ser utilizada, no lo vi necesario ya que no era necesario validar esos formatos de datos en el momento de ingresar las películas porque no se requeria numero de celular o fechas en este contexto. De todas formas las escribí aunque este pendiente su implementación.

**Conclusión**

Este proyecto me ha introducido por primera vez en la conexion de bases de datos y la aplicación de la POO en una aplicacion que se asemeje a un programa realmente utilizado en la vida real. A lo largo de todo este desarrollo se ha podido poner en marcha un auntentico sistema de gestión de películas a traves de las operaciónes CRUD, integrandolo con funcionalidades como la exportación a los formatos JSON y CSV. Me parece que todos los puntos del mandato han sido abordados en este trabajo y esto se puede constatar rapidamente gracias a la modularidad del programa y con una legíbilidad mas que decente, por lo que dejando esto claro doy por concluído el proyecto final de INF-514.



