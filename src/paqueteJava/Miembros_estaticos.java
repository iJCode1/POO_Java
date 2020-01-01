package paqueteJava;

/**
 * @author ijcode011
 */
public class Miembros_estaticos {

    /*
    En esta ocasión hablaremos sobre los miembros estaticos de la clase... tanto atributos como métodos.
    Esto se refiere a que todo le va a pertenecer a la clase y no al objeto
    al pertenecerle a la clase... todo cambio que se haga en alguna invocacion en algun objeto se vera reflejado en todo el programa
    haciendo los cambios en todas las invocaciones posteriores de los objetos.
    Para hacer un atributo o metodo estatico... se utiliza la palabra magica "static"
     */
    //Creare 2 variables estaticas
    private static String nombre;
    private static String apellido;

    //Creare los metodos Setter y Getter para poderles asignar un valor y poder obtener dicho valor.
    public static void setNombre(String nombre) {
        Miembros_estaticos.nombre = nombre;
    }

    public static void setApellido(String apellido) {
        Miembros_estaticos.apellido = apellido;
    }

    public static String getNombre() {
        return nombre;
    }

    public static String getApellido() {
        return apellido;
    }

    //Tambien creare un metodo estatico.
    public static void mostrarMensaje() {
        System.out.println("El nombre es: " + nombre + " " + apellido);
    }

    //Crearemos el metodo principal para hacer la invocacion de los atributos y metodos
    public static void main(String[] args) {
        /*
        Como son variables y metodos estaticos...
        no es necesario crear objetos debido a que le pertenece a la clase y no al objeto
        entonces para poderlos llamar basta con mandarlos traer con el mismo nombre de la clase.
         */

        Miembros_estaticos.setNombre("Joel");
        Miembros_estaticos.setApellido("Dome");

        //Una ves qye asignamos los valores... podemos mandar llamar el metodo que muestra los valores estaticos.
        Miembros_estaticos.mostrarMensaje();
    }

    //Este es un ejemplo de los miembros estaticos....
    
    
    
    /*
    
                    !
                    !
                    !
                    !
                    v
    
    private static String msj = "Hola 1";

    public String getMsj() {
        return msj;
    }
    
    
    public static void main(String[] args) {
        prueba222 obj1 = new prueba222();
        prueba222 obj2 = new prueba222();
        prueba222 obj3 = new prueba222();
        
        obj2.msj = "Hola 2";
        
        System.out.println("Mensaje: "+obj1.getMsj());
        System.out.println("Mensaje: "+obj2.getMsj());
        System.out.println("Mensaje: "+obj3.getMsj());
    }
    
    
    Salida del Programa: 
    
    Mensaje: Hola 2
    Mensaje: Hola 2
    Mensaje: Hola 2
    BUILD SUCCESSFUL (total time: 0 seconds)
        ·····
    
    Al ser una variable estatica...
    como le pertenece a la clase todo cambio que se haga en algun punto, ese cambio afectara a todo.
    Ya no le pertenece al objeto que hizo dicho cambio, si no a la clase que a la que le pertenece con ello a todos los objetos
    
    ·····
    
     */
}
