package paqueteJava;

import javax.swing.JOptionPane;

/**
 * @author ijcode011
 */
public class operacionesBasicas_metodos {

    //Atributos:
    float numero1, numero2;
    float suma, resta, multiplicacion, division;

    public void pedirNumeros() { //Primer metodo de tipo VOID: Lo cual significa que es vacio y no nos retornara (devolvera) nada
        numero1 = Float.parseFloat(JOptionPane.showInputDialog("Ingresa el numero 1")); //Se hace el Parseo con Float debido a que JOptionPane trabaja con un tipo de dato String.
        numero2 = Float.parseFloat(JOptionPane.showInputDialog("Ingresa el numero 2"));
    }
    
    //Creacion de los metodos con las operaciones...
    public void suma(){
        suma = numero1+numero2;
    }
    
    public void resta(){
        resta = numero1-numero2;
    }
    
    public void multiplicacion(){
        multiplicacion = numero1*numero2;
    }
    
    public void division(){
        division = numero1/numero2;
    }
    
    public void mostrarResultados(){
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicacion es: "+multiplicacion);
        System.out.println("La division es: "+division);
    }
    
    /*
    Despues de crear los metodos los cuales son acciones que pueden hacer los objetos sera el momento de crear dichos objetos
    Para crear los objetos necesitamos hacer uso de la clase main (principal) la cual crearemos en esta misma clase
    pero bien podriamos crearla en una clase diferente sin ningun problema.
    */
    
    //Creamos la clase principal
    public static void main(String args[]){
        /*
        Creamos el objeto o los objetos necesarios para invocar a los metodos.
        Podemos crear la cantidad de objetos que queramos.
        los objetos pertenecientes a esa clase nos permiten acceder a los atrubutos y metodos de la misma clase.
        */
        
        operacionesBasicas_metodos obj = new operacionesBasicas_metodos();
        
        //Invocamos los metodos... el orden en el que los mandemos llamar sera el orden en el cual se ejecutaran.
        
        obj.pedirNumeros();
        obj.suma();
        obj.resta();
        obj.division();
        obj.multiplicacion();
        obj.mostrarResultados();
    }
}
