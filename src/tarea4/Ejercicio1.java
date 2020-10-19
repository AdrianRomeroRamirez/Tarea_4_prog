package tarea4;

import utilidades.ES;

/**
 * Esta clase muestra por pantalla una cadena leída por teclado de al
 * menos 5 caracteres, para que a continuación vaya ocultando dos caracteres, 
 * una posición a la derecha cada vez, hasta que llegue al final y haga lo
 * mismo hacia la izquierda.
 * 
 * @author Adrián Romero
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Código de la aplicación
        
        String cad, princ, fin;
        StringBuilder cadB = new StringBuilder();
        /*
        * Le pido al usuario que introduzca una cadena de al menos 5 caracteres
        * usando un if dentro de un while para que le muestre un mensaje de error
        * e intente otra vez la entrada de la cadena.
        */
        do{
            cad = ES.leeCadena("Introduce la cadena:");
            if (cad.length()<5)
                System.out.println("Error. Introduce una cadena de al menos 5 caracteres");
        }while(cad.length()<5);
        
        System.out.printf("Cadena inicial: %s ", cad);
        
        /*
        * Con un bucle for voy recorriendo la cadena de izquierda a derecha para
        * ir formando la cadena final concatenando el StringBuilder con append.
        */
        
        for (int i=0; i<cad.length()-1; i++){
            cadB.append("\n|");
            princ = cad.substring(0, i);
            cadB.append(princ).append("  ");
            fin = cad.substring(i+2, cad.length());
            cadB.append(fin).append("|");
        }
        
        
        // Lo mismo pero de derecha a izquierda
        
        for (int i=cad.length(); i>1; i--){
            cadB.append("\n|");
            princ = cad.substring(0, i-2);
            cadB.append(princ).append("  ");
            fin = cad.substring(i, cad.length());
            cadB.append(fin).append("|");
        }
        
        System.out.print(cadB);
    }
    
}
