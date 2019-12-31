package paqueteJava;

/**
 * @author joel_
 */
public class Encapsulamiento_set_get {

    /*
    El encapsulamiento trata de que no cualquier persona tenga acceso a las variables globales
    en esta clase tenemos 2 las cuales son nombre y edad, seria un fallo tenerlas publicas al alcance de cualquiera.
    Es por ello que se creo el termino encapsulamiento para que unicamente sean accesibles en otra clase a traves de metodos accesores
    como lo son los metodos Setters y Getters.
    */
    
    //Lo primero es declarar nuestras variables globales de forma privada (Encapsulamiento)
    private String nombre;
    private int edad;

    /*
    Lo que tenemos que hacer ahora es crear dichos metodos para poder acceder a las variables desde otra clase diferente a esta
    el metodo Setter es para establecer mientras que el Getter es para obtener el valor
    Con el set le establecemos el valor que le mandemos como argumento al metodo,
    mientras que con el get obtenemos el valor cuando lo queramos mostrar en una impresion o queramos hacer algo con la variable en concreto.
    */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }
    
    /*
    Una ves tenemos dichos metodos es momento de mandarlos llamar en nuestro metodo main (principal) el cual esta alojado en otra clase
    aparte que se llama Encapsulamiento_set_get_main
    */
    

}
