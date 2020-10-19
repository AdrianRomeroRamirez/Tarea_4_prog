package tarea4;

import java.util.Arrays;
import utilidades.ES;

/**
 * Esta clase genera una combinación aleatoria y comprueba si todos sus números
 * son distintos. Va generando combinaciones y mostrándola en pantallas hasta
 * que no genera una combinación con todos los números diferentes.
 *
 * @author Adrián Romero
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Código de la aplicación

        int numMax, numEscoger;
        boolean repetido;

        // Se pide al usuario que introducza el número maximo y la cantidad a mostrar
        numMax = ES.leeEntero("Introduce el número máximo (entre 10 y 100):", 10, 100);
        System.out.printf("Introduce la cantidad de números a escoger entre 2 y %d:\n", numMax - 2);
        numEscoger = ES.leeEntero(2, numMax - 2);

        // Se crea el array con la cantidad de números introducida por el usuario
        int[] array = new int[numEscoger];

        /*
         * Dentro de un bucle do/while, primero inicializo todas las posiciones 
         * del array con números aleatorios con un bucle for, y con otro bucle 
         * for anidado, compruebo si alguna posición tiene números repetidos, 
         * si es así, el boolean repetido pasa a true e imprime por pantalla 
         * la combinación descartada y vuelve a iniciar el bucle do/while hasta 
         * que no haya ningún número repetido en la combinación.
         */
        do {
            repetido = false;
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) Math.round(Math.random() * (numMax - 1) + 1);
            }
            for (int i = 0; i < array.length; i++) {
                for (int cont = 0; cont < array.length; cont++) {
                    if (i != cont) {
                        if (array[i] == array[cont]) {
                            repetido = true;
                        }
                    }
                }
            }
            if (repetido) {
                System.out.println("Descartado:" + Arrays.toString(array));
            }
        } while (repetido);
        System.out.println("Aceptado:" + Arrays.toString(array));
    }
}
