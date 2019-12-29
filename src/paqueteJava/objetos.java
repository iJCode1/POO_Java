package paqueteJava;
/**
   @author ijcode011
 */

public class objetos {//Esta es la Clase clasesObjetos con la cual se trabajara.
    
    //Atributos: Son las caracteristicas que tienen los objetos de las clases.
    
    //Atributos de un Cubo Rubik.
    
    String nombre;
    String marca;
    int tamaño;
    float precio;
    
    public static void main(String args[]){ //Creacion de un Método
        objetos cubo1 = new objetos(); //Creacion de un Objeto
        
        //Asignamos valores a los atributos del objeto creado.
        cubo1.nombre = "Cubo Rubik 3x3";
        cubo1.marca = "GAN";
        cubo1.tamaño = 10;
        cubo1.precio = 530.90f;
        
        //Impresión de los valores del objeto en concreto
        System.out.println("El nombre del cubo 1 es: "+cubo1.nombre);
        System.out.println("La marca del cubo 1 es: "+cubo1.marca);
        System.out.println("El tamaño del cubo 1 es de : "+cubo1.tamaño+" cm");
        System.out.println("El precio del cubo 1 es: "+cubo1.precio+" pesos mexicanos");
        
        System.out.println("");//Salto de linea en la ultima Impresión por pantalla
        
        objetos cubo2 = new objetos();//Creacion de un nuevo Objeto
        
        cubo2.nombre = "Cubo Rubik 4x4";
        cubo2.marca = "Mo-Fan-Ge";
        cubo2.tamaño = 20;
        cubo2.precio = 790.50f;
        
        System.out.println("El nombre del cubo 2 es: "+cubo1.nombre);
        System.out.println("La marca del cubo 2 es: "+cubo1.marca);
        System.out.println("El tamaño del cubo 2 es de : "+cubo1.tamaño+" cm");
        System.out.println("El precio del cubo 2 es: "+cubo1.precio+" pesos mexicanos");
    }
    
}
