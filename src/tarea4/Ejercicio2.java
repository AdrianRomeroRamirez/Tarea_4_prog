package tarea4;

import utilidades.ES;

/**
 * Esta clase hace que se intercambie una cadena de 2 a 7 caracteres introducidas 
 * por el usuario en una posición determinada dentro de una cadena base.
 * @author Adrián Romero
 */
public class Ejercicio2 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Código de la aplicación
        
        String cad, cadBase = "***#**#*****#****#******#*******";
        StringBuilder cadB = new StringBuilder();
        int posicion=0;
        
        System.out.printf("La cadena de partida es la siguiente:\n %s", cadBase);
        
        /*
        * Pido al usuario que introduzca una cadena de 2 a 7 caracteres usando 
        * un if dentro de un while para que en caso de introducir una cadena
        * errónea salga un mensaje y repita hasta que la cadena sea correcta.
        */
        
        do{
            cad = ES.leeCadena("\nIntroduce una cadena de 2 a 7 caracteres para colocarla en lugar de los asteriscos:");
            if (cad.length()<2 || cad.length()>7)
                System.out.println("Error. La cadena debe estar entre 2 y 7 caracteres.");
        }while(cad.length()<2 || cad.length()>7);
        
        // Separo la cadena base con el metodo .split
        
        String[] trozos=cadBase.split("#");
        
        /*
        * Un bucle for que recorra todos los arrays y compruebe si la longitud
        * del array y la cadena son iguales, si es así, en el StringBuilder se
        * concatena la cadena, y si no coincide se concatena el array.
        * Uso un if para que concatene al principio de cada cadena el 
        * carácter # a menos que sea en la primera cadena.
        * Para guardar la posición donde se cambia la cadena, dentro del if 
        * donde se compara la longitud de la cadena con el array, guardo la
        * posición del array+1 ya que los arrays empiezan por 0.
        */
        
        for (int i=0; i<trozos.length; i++){
            if (i>0)
                cadB.append("#");
            if (cad.length()==trozos[i].length()){
                cadB.append(cad);
                posicion=i+1;
            }else
                cadB.append(trozos[i]);
        }
        
        System.out.printf("La cadena '%s' fue emplazada en la posición '%d'.\n",cad,posicion);
        System.out.println(cadB);
        
    }
  
}
