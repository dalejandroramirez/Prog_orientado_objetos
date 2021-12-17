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




 




 





