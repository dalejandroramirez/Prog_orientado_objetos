Que es UML?

Unified Modeling Language el cual es un lenguaje estándar de modelado de sistemas orientados a objetos.

 cada objeto tiene estas etiquetas 

- private
+ public
# protected
~ default

Atributos : son todas las propiedades que tiene un objeto

Modularidad :  Dividir un sitema y así crear módulos independientes, lo que permite evitar un colapso masivo en nuestro código y mejorar la legibilidad.

en javascript:

class Person{
	constructor(){
	this.name="Alejo";	
	}
	walk(){----}
}

para agregar un metodo se pede usar Person.prototype.volar = function(){}

python:

class Persona():
	name="Alejo"
	def walk():

PHP:
class Person{
$name="alejo";
function walk(){}
}


Herencia : Crea nuevas clases a partir de otras clases.

Cuando muchas clases tiene muchas propiedades repetidas se genera una clase que tenga estos atributos y asi de estos se
puede herada.


¿Como declarar objetos?

java :
Peson person= new Person();

Python:
persona= Person()

Js:
var person = new Person();

php
$person = new Person();


 _________________________________________________________________________________________________

Metodos contructores son los que le dan un estado inicial al objeto

python:
def __init__(self,name):
	self.name=name


js:
function Person(name){
	this.name =name
}


php:
public function_construct($name){
	$this->name =name;
}

------------------------------------------------------------------

Herencia : esto extiende una clase a una subclase

java:

class Student extendes Person

la palabra reservada super, hace referencia a la clase padre

js :

student.prototype=new Person();


Python:

class Student(Person):

PHP

class Student extendes Person



__________________________________________________________
                     Encapsulamiento
__________________________________________________________
 Es una forma de guardar datos de tal manera que no sea posible modificarlo posteriormente


Para esto se utiliza en java	 
Public
protected
default
private

el orden en gerarquia es public (todas las clases) < protected (Clases y paquetes) < private (Solo accedido a nivel de clases)

Metodos para agregar datos son Getters y setters


_______________________________________________________________
                POLIMORFISMO
_______________________________________________________________

Un polimorfismo en esencia es crear metodos con el mismo nombre
pero con diferentes comportamientos y se puede ir agregando variaciones de clase en clase para que se herede la de los anteriores


Polimorfismo es dada una funcion se extiende otra funcion a a otra clase de tal manera que tenga variaciones de la anteriore

__________________________________________________________
				RESUMEN
__________________________________________________________
En la POO hay 5 cosas fundamentales:

Clases: Son el molde más genérico y del cual podemos instanciar muchos objetos.

Objetos: Son creados de las clases y tienen datos y funcionalidad.

Atributos: Son las características especificas del objeto (Son las variables dentro del código)
Métodos: Son las funciones o acciones que puede hacer este objeto.
**Instaciar:**Es la creación de un objeto desde una clase a eso se le llama instancia o instancias.
Los pilares de la POO son:

Abstracción: Es separar cada uno de los datos de un objeto para poder crear su molde (clase)

Encapsulamiento: Es aislar un dato para que este sea privado y no pueda ser visto o modificado.
Herencia: Es crear una o más clases a partir de una clase que ya existe. Y se les llaman subclases.
**Polomorfismo:**Es construir métodos con el mismo nombre pero con comportamiento diferente.

















 




 





