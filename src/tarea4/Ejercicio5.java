package tarea4;

import utilidades.ES;
import java.util.regex.*;

/**
 * Esta clase recoge matriculas introducidas por teclado y las clasifica según 
 * al formato que pertenecen.
 * @author Adrián Romero
 */
public class Ejercicio5 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Código de la aplicación
        
        String matricula;
        String[] europeo = new String[5];
        String[] antiguo = new String[5];
        String[] muyAntiguo = new String[5];
        Pattern patronEuropeo = Pattern.compile("E[0-9]{4}[A-Z]{3}");
        Pattern patronAntiguo = Pattern.compile("[A-Z]{1,2}[0-9]{4}[A-Z]{2}");
        Pattern patronMuyAntiguo = Pattern.compile("[A-Z]{1,2}[0-9]{6}");
        int iEu=0, iAn=0, iMuyAn=0;
        
        /*
         * En un bucle do, introducimos las matrículas y las clasificamos hasta 
         * conseguir 5 matrículas de uno de los formatos.
         */
        do{
            matricula = ES.leeCadena("Escribe la matrícula:");
            
            // Comparamos la matriculas con los patrones compilados anteriormente
            
            Matcher mEuropeo = patronEuropeo.matcher(matricula);
            Matcher mAntiguo = patronAntiguo.matcher(matricula);
            Matcher mMuyAntiguo = patronMuyAntiguo.matcher(matricula);
            
            // Si el patrón coincide, lo guardamos en su posición correspondiente
            
            if (mEuropeo.matches()){
                System.out.println("La matrícula tiene el formato europeo");
                europeo[iEu]=matricula;
                iEu++;
            }else
                if (mAntiguo.matches()){
                    System.out.println("La matrícula tiene el formato antiguo");
                    antiguo[iAn]=matricula;
                    iAn++;
                }else
                    if (mMuyAntiguo.matches()){
                        System.out.println("La matrícula tiene el formato muy antiguo");
                        muyAntiguo[iMuyAn]=matricula;
                        iMuyAn++;
                    }else
                        System.out.println("Matrícula incorrecta");

        }while(iEu!=5 && iAn!=5 && iMuyAn!=5);
        
        /*
         * Por último imprimimos los resultados guardados, uso un condicional if 
         * dentro de un bucle for para que solo se impriman las posiciones del 
         * array donde haya una matrícula guardada.
         * Es usado una forma nueva de recorrer los arrays con for que me ha 
         * sugerido NetBeans.
         */
        System.out.print("\nMatrículas con formato muy antiguo:");
        for (String muyAntiguo1 : muyAntiguo) {
            if (muyAntiguo1 != null) {
                System.out.print(muyAntiguo1 + " ");
            }
        }
        System.out.print("\nMatrículas con formato antiguo:");
        for (String antiguo1 : antiguo) {
            if (antiguo1 != null) {
                System.out.print(antiguo1 + " ");
            }
        }
        System.out.print("\nMatrículas con formato europeo:");
        for (String europeo1 : europeo) {
            if (europeo1 != null) {
                System.out.print(europeo1 + " ");
            }
        }
    }
}
