package paqueteJava;

/**
 * @author joel_
 */
public class Encapsulamiento_set_get_main {

    public static void main(String args[]) {
        /*
        Una ves dentro de esta clase tocara crear el objeto para poder tener acceso a los metodos anteriormente creados.
        */
        Encapsulamiento_set_get obj = new Encapsulamiento_set_get(); //Objeto de la clase Encapsulamiento_set_get

        /*
        Con el objeto podemos mandar llamar el metodo set para asignarle un valor a la variable
        Cuando queramos mostrar el valor de una variable podemos hacerlo con el metodo get.
        */
        
        obj.setNombre("Joel");
        System.out.println("El nombre es: "+obj.getNombre());
        
        obj.setEdad(20);
        System.out.println("La edad es: "+obj.getEdad());
        
        System.out.println("El usuarios: "+obj.getNombre()+" tiene "+obj.getEdad()+" años de edad.");
    }
}
