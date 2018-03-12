# JavaFinal
Ejercicio Final de Java

Crear una clase Figura, del tipo abstracta, la cual tenga los siguientes atributos:

•	Enteros, coordenada_x, coordenada_y, ancho, alto
•	Dobles, perímetro y área.

Todos los atributos deben de ser de tipo protected (utilizar getters y setters), además de la definición de un método abstracto para el cálculo del área.
Generar un constructor para la clase, que reciba los valores del ancho y alto.

Heredando de la clase Figura, crear las clases Triangulo, Rectangulo, Cuadrado y Circulo e implementar el método área en cada uno de ellos (hacer sobrescritura del método) para el cálculo respectivo del área dependiendo de la figura.

Crear un constructor para cada una de las clases, en donde se utilice el objeto super para asignar los valores leídos a la clase padre.


Todos los datos deben de llamarse desde otra clase (llamarla Prueba) y crear dentro un método (presentar()) que reciba como parámetro un objeto de la clase Figura e imprimir los datos de ingreso (ancho y alto) y el cálculo del área.


Finalmente añadir una nueva clase llamada Rectangulo2, al que se le añadirá el método dibujar(), que dibujará el rectángulo con el número de asteriscos que se indiquen (colocar una restricción de que sea menor que 20) y crear la clase Cuadrado2 que herede de Rectangulo2 e indicar dentro del método presentar() de la clase Prueba cuando sea posible dibujar el rectángulo (cosa que solo se puede hacer cuando el objeto herede de Rectangulo2, revisando con la instrucción instanceof).

Agregar la clase Poligono, la cual además de tener los atributos de la clase padre de ancho (asignar a longitud de lado) y alto (asignar a apotema), tendrá el atributo nlados que representa el número de lados.
Recordar que para calcular el perímetro y área se hace con:

Perímetro = numero_lados x longitud_lados
Área = (Perimetro x apotema)/2


Agregar el método para el cálculo del perímetro, de la misma forma que el método para el área.

Agregar los métodos o código necesario para que los usuarios ingresen los datos por el teclado. Tener cuidado de que no se agreguen longitudes que sean 0 o que no sean dígitos (validación de solo recibir dígitos).

Agregar a su vez un menú para que el usuario seleccione que tipo de figura quiere hacer el cálculo de su área o perímetro, tomando en consideración de que puede ingresar o la figura por número o por su nombre. El menú puede ser de la siguiente forma:

-- Cálculo de áreas y perímetros de figuras en Java
1.-Cuadrado
2.-Rectángulo
3.-Triángulo
4.-Círculo
5.-Polígono
Selección >> 


Finalmente, agregar un manejo de excepciones para que, cuando se intente obtener los valores de los perímetros y áreas de las figuras, se capturen las excepciones para errores aritméticos (ArithmeticException) y el uso de referencias nulas (NullPointerException), mostrando un mensaje que indique que hubo un error y cuál de ellos fue.
