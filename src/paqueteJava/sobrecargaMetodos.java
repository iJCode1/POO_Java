package paqueteJava;

/**
 * @author ijcode011
 */
public class sobrecargaMetodos {

    //Atributos: Son variables globales que le pertenecen a esta clase
    String nombre;
    int edad;
    String dni;

    /*
    En esta clase veremos que hay casos en los que podemos tener varios metodos constructores, o metodos normales con el mismo nombre.
    Lo que va a diferenciar a los metodos con el mismo nombre no es el valor de retorno, mas bien lo que los diferenciara es
    el tipo de valor que tengan como parametro (dentro de los Parentesis) o la cantidad de parametros que cada metodo reciba.
     */
    //Procedamos a crear 2 metodos constructores...
    //Tenemos 2 metodos constructores de la misma clase, lo que los hace diferentes es que reciben diferentes valores como argumentos al ser invocados.
    public sobrecargaMetodos(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /*
    El this.nombre = nombre se refiere a que "este nombre" (el de color verde) es el que le pertenece a la clase (variable global)
    y se iguala al valor que se recibe en el metodo constructor.
     */
    public sobrecargaMetodos(String dni) {
        this.dni = dni;
    }

    /*
    Ahora creare 2 metodos normales con el mismo nombre de igual forma, recuerden que lo que los hara diferentes sera
    el tipo de dato o la cantidad de datos que reciban como argumento.
     */
    public void Mensaje(String estadoEmocional) {
        System.out.println("Hola soy: " + nombre + " tengo " + edad + " años y me encuentro " + estadoEmocional);
    }

    public void Mensaje(int nHermanos) {
        System.out.println("Hola yo tengo " + nHermanos + " hermanos");
    }

    //Una ves tenemos listos los metodos, es momento de crear el metodo main para llamar a dichos metodos creados anteriormente.
    
    public static void main(String args[]){
        //Creamos los objetos que necesitemos de esta clase.
        sobrecargaMetodos obj1 = new sobrecargaMetodos("Joel", 20);
        obj1.Mensaje("Feliz");
        
        sobrecargaMetodos obj2 = new sobrecargaMetodos("632718618");
        obj2.Mensaje(2);
    }
}
