package paqueteJava;

import javax.swing.JOptionPane;

/**
 * @author ijcode011
 */
public class metodos_retornoValores {

    /*
    Lo primero que haremos sera crear los metodos que nos retornaran algun valor...
    Yo creare metodos float los cuales al llamarlos me devolveran un resultado con este tipo de dato...
     */

    public float Suma(float a, float b) { //Se crea el metodo y ya no es void... como retornara un valor se usa el tipo de dato que esperamos retornar.
        float suma = a + b; //En esta variable se guardara el resultado de los 2 valores que recibiremos como argumentos...
        return suma; //Siempre al tener un metodo con un tipo de datos, dicho metodo debe retornar una variable y en este caso retornara el valor que guarde la variable suma.
    }

    //Y asi sucesivamente creamos los metodos necesarios.
    public float Resta(float a, float b) {
        float resta = a - b;
        return resta;
    }

    public float Multiplicacion(float a, float b) {
        float mult = a * b;
        return mult;
    }

    public float Division(float a, float b) {
        float div = a / b;
        return div;
    }

    /*
    Ya creamos todos los metodos...
    Ahora crearemos nuestro metodo main (principal) el cual podemos crearlo en una nueva clase o en esta misma
    en el metodo main adentro crearemos nuestro objeto que tendra acceso a los metodos creados anteriormente
    como el objeto tiene acceso a la clase podra invocar dichos metodos
    Asi que procedemos a crear el metodo y el objeto!
     */
    public static void main(String args[]) {
        metodos_retornoValores obj = new metodos_retornoValores(); //Creacion de objeto de la clase metodos_retornoValores

        /*
        Mandamos a llamar a los metodos...
        Pero antes debemos tener 2 numeros los cuales le mandaremos como argumento a los metodos al invocarlos
        asi que primero pedimos dichos numeros.
         */
        float n1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el numero 1"));
        float n2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el numero 2"));

        //Una ves tenemos los numeros ya podemos llamar a los metodos y pasarles como argumento el valor de cada numero
        /*
        Como los metodos son con retorno... dichos metodos nos devolveran un valor
        ese valor que nos devuelven podemos guardarlos en una variable o imprimirlos luego luego.
        En este caso los imprimire de una ves al llamarlos.
         */
        //                                Aqui tenemos el llamado al metodo y le pasamos como argumento el valor de ambos numeros. 
        System.out.println("La suma es: " + obj.Suma(n1, n2));
        System.out.println("La resta es: " + obj.Resta(n1, n2));
        System.out.println("La multiplicacion es: " + obj.Multiplicacion(n1, n2));
        System.out.println("La division es: " + obj.Division(n1, n2));
    }
}
