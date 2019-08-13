
package entradadatosscanner;

import java.util.*;
public class EntradaDatosScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String captura = null;
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce el Dato:");
        captura = scan.nextLine();
        while (captura!= null) {
            System.out.println("Dato Introducido es :" +captura);
            captura = scan.nextLine();
            
        }
    }
    
}
