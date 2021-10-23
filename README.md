# ApiRest
Java y Spring

_____________________________

Podeis abrir le proyecto con visual code studio y hay algunos plugins para java que son interesantes para que rellene solo el codigo.
A mi me ha sacado un mensaje que me recomendaba instalar y le he dado ok.

Java Code Generators
Language Support for Java
Maven for Java
Project Manager for Java
Test Runner for Java
Debugger for Java
Extension Pack for Java

_____________________________

Para configurar la bd tenemos que ir a src/resources/application.properties
Podeis crear en mysql una bd llamada intranet y luego ejecutando el proyecto ya nos crea la bd.


Para ejecutar el proyecto, se abre la terminal del visual studio code y ponemos

para Windows:
mvnw.cmd spring-boot:run

para Mac:
./mvnw spring-boot:run

_____________________________

Para ver la api como devuelve los datos vamos al navegador y ponemos localhost:8080/empleados
Esto devuelve todos, si ponemos localhost:8080/empleados/X (donde x un numero del id), nos devuelve solo el empleado
Si ponemos 
localhost:8080/empleado/query?Nombre=XXXXXX Donde las x un nombre, nos da solo el nombre.

Para hacer un pull o delete, tenemos que instalar postman.

-------------------------------

Video explicativo como hacer la api y como funciona
https://www.youtube.com/watch?v=vTu2HQrXtyw


