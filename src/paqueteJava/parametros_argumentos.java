package paqueteJava;

import javax.swing.JOptionPane;

/**
 * @author joel_
 */
public class parametros_argumentos {

    float suma, resta, multiplicacion, division; //Declaramos las variables que utilizaremos mas adelante para guardar los resultados.

    /*
    Creamos los metodos, en los cuales les pondremos 
    parametros (Declaracion de variables que son necesatrias al mandar a llamar el metodo mas adelante)
     */
    public void suma(float numero1, float numero2) {
        suma = numero1 + numero2;
    }

    public void resta(float numero1, float numero2) {
        resta = numero1-numero2;
    }

    public void multiplicacion(float numero1, float numero2) {
        multiplicacion = numero1*numero2;
    }

    public void division(float numero1, float numero2) {
        division = numero1/numero2;
    }
    
    public void mostrarResultados(){
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicaacion es: "+multiplicacion);
        System.out.println("La division es: "+division);
    }

    //Creamos el metodo main para poder crear un objeto y poder mandar llamar los metodos!
    //Este metodo main (Principal) podria estar declarado en otra clase, pero nosotros lo declararemos en esta misma clase.
    
    public static void main(String args[]){
        parametros_argumentos obj = new parametros_argumentos(); //Creacion del objeto de la clase parametros_objetos
        
        //Pedimos ambos numeros los cuales los mandaremos a los metodos que lo solicitan como argumentos.
        float n1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el primer numero: "));
        float n2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el segundo numero: "));
        
        obj.suma(n1, n2);
        obj.resta(n1,n2);
        obj.multiplicacion(n1, n2);
        obj.division(n1, n2);
        
        obj.mostrarResultados();
    }
}
