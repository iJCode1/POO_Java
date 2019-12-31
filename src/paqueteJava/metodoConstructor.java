package paqueteJava;

/**
 * @author ijcode011
 */
public class metodoConstructor {

    //Atributos: Son variables globales que le pertenecen a esta clase
    String nombre;

    /*
    En esta clase veremos como es el proceso de crear un metodo constructor...
    El metodo constructor nos ayudara al momento de crear un objeto nuevo de la clase debido a que 
    podemos mandarle como argumentos algunos valores que sean necesario en la clase en concreto
     */
 /*
    Procederemos a crear el metodo constructor, este metodo se crea de una manera muy facil, solo necesitamos el nombre de 
    la clase y declararlo de forma publica y sin ningun retorno de valor.
    De la siguiente manera:
     */
    //Crearemos nuestro metodo Constructor con un parametro dentro de el... Podemos pedir la cantidad de parametros que queramos
    public metodoConstructor(String nombre) { //<----- El metodo constructor solo de declara con public + el nombre de la clase.
        this.nombre = nombre; //El this.nombre = nombre se refiere a que "este nombre" (el de color verde) es el que le pertenece a la clase (variable global) y se iguala al valor que se recibe en el metodo constructor.
    }

    //Creare otro metodo donde mostrare un mensaje utilizando la variable global llamada nombre (la de color verde)
    public void Mensaje() {
        System.out.println("El nombre ingresado es: " + nombre + " y esta aprendiendo POO en Java");
    }

    //Una ves tenemos todo listo es el momento de crear el metodo main, ya sea en esta clase o en una aparte.
    public static void main(String args[]) {
        //Creamos la cantidad de objetos que queramos.

        metodoConstructor persona1 = new metodoConstructor("Joel"); //Como se daran cuenta ya exige que le mandemos un argumento que pide el metodo constructor
        persona1.Mensaje();
        
        //Podemos crear mas objetos si asi lo quremos y mandarle diferentes argumentos al metodo constructor.
        
        metodoConstructor persona2 = new metodoConstructor("Julieta");
        persona2.Mensaje();
    }
}
