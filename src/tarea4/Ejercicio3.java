package tarea4;

import java.util.Arrays;
import utilidades.ES;

/**
 * Esta clase muestra un array de 10 enteros por pantalla y va colocando los números
 * que introduce el usuario en su posición correspondiente en orden ascendente 
 * hasta que se introduce el número -100.
 * @author Adrián Romero
 */
public class Ejercicio3 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Código de la aplicación
        
        int[] arrayInicial = {10, 20,30, 40, 50, 60, 70, 80, 90, 100};
        int ent;
        
        // Se muestra el array inicial por pantalla
        
        System.out.println("El array inicalmente es:"+Arrays.toString(arrayInicial));
        
        /*
         * El bucle do/while iterará hasta que no se introduzca el -100.
         * El bucle for recorre todos los arrays comprobando con if si es menor,
         * mayor o esta entre medias de los arrays, para intercambiar los valores.
         * El bucle for no llega al 0, porque en el caso de intentar cambiar la 
         * posición 0 por la 0-1 me daría error.
         */
        do{
            ent = ES.leeEntero("Escribe un entero a insertar en el array. El -100 para acabar.");
            if(ent!=-100){
                for (int i=9; i>0; i--){
                    if (ent<arrayInicial[i] && ent>arrayInicial[i-1])
                        arrayInicial[i]=ent;
                    if (ent<arrayInicial[i])
                        arrayInicial[i]=arrayInicial[i-1];
                    if (i==1){
                        if (ent<arrayInicial[0])
                        arrayInicial[0]=ent;
                    } 
                }
                System.out.println("El array actual:"+Arrays.toString(arrayInicial));
            }    
        }while(ent!=-100);
        
        // Imprimo un mensaje de fin de programa.
        
        System.out.println("Programa Finalizado.");
    }
}
