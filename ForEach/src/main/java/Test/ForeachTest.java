
package Test;

import entidad.Persona;

public class ForeachTest {
    
    public static void main(String[] args) {
        
        int edades [] = {20, 32, 41, 37, 01};
        // Ejemplo ForEach
        for (int edade : edades){
        
            System.out.println("edade = " + edade);
            
        
        }
         Persona personas [] = {new Persona("Juan Carlos"), new Persona ("Fernando Silva")};
        System.out.println("");
        
        for (Persona p : personas){
        
            System.out.println("p = " + p);
        }
        
    }
    

}

