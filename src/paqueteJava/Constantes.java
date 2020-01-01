package paqueteJava;
/**
   @author ijcode011
 */
public class Constantes {
    
    /*
    Vamos a hablar de las constantes en java.
    Las constantes como el nombre lo dice son valores que no pueden variar como en las variables
    Son valores que deben ser constantes a lo largo de la vida de nuestro programa
    Para hacer una constante ocuparemos la palabra magica "final"
    al ser una constante y no poderse cambiar en ningun momento...
    se debe inicializar en un principio o crear un metodo constructor debido a que no podemos tener set o get. 
    */
    
    //Atributos de la clase.
    private final String nombre = "joel"; //Constante
    private int edad = 20; //Variable 
    
    //Creamos el metodo main para trabajar con los atributos de nuestra clase.
    public static void main(String[] args) {
        //Creamos un objeto para entrar a dicha clase.
        
        Constantes obj = new Constantes();
        
        //obj.nombre = "Peco"; <--- Esto marca error debido a que al ser una variable no podemos modificar su valor
        
        /*
        Sin encambio en una variable si podemos cambiar su valor, de ahi su nombre de variable pues puede cambiar 
        de valor a lo largo de la vida de nuestro programa.
        */
        
        obj.edad = 21;
        
        //Para mostrar los resultados es exactamente lo mismo.
        
        System.out.println("El nombre es: "+obj.nombre);
        System.out.println("La edad es: "+obj.edad);
    }
}
