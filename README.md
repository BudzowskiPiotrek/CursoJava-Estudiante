# CursoJava-Estudiante
Crea una clase Estudiante que tendrá como atributos nombre, edad, notaMedia cada uno con su
modificador de acceso correspondiente y su tipo de dato. Entre los parámetros debe también de estar un
totalEstudiantes que será un atributo static y que llevará la cuenta de alumnos registrados.

Implementa un constructor que acepte nombre, edad y notaMedia y que incremente el contador de
totalEstudiantes cada vez que se cree un nuevo objeto. En el constructor debemos validar también que la
edad debe ser mayor que 5 y la nota media debe estar entre 0 y 10. Establece un valor por defecto en el
caso de que no se introduzca un valor aceptado

Crearemos los settes y getteres de todos los atributos menos de nuestro atributo estático, no tiene sentido
que este último pueda ser modificado y al ser static es accesible sin necesidad de getters. Los setters de
edad y notaMedia deben igualmente implementar las mismas validaciones que en el constructor. Crea
tambien el toString en la clase.

Crea una clase principal con método main donde podremos dar de alta estudiantes o informar de el número
de estudiantes registrados. Cuando demos de alta debemos de pedir los datos de los estudiantes y
nuevamente volver al menú. El menú deberá de tener una tercera opción que sea salir para que no repita
más veces el menú.
