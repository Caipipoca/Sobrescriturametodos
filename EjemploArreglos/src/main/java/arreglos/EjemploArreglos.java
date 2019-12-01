//
package arreglos;

public class EjemploArreglos {
    
    public static void main(String[] args) {
        
    // 1. Declaramos una variable del tipo arreglo, un arreglo de int.
    
    int edades []; // = new int [3];
    
    
    // 2. instanciamos el arreglo del timpo int 
    
     edades = new int [3];
    
    // 3. Inicializamos los valores de los elementos del arreglo
    
    edades[0] = 30;
    edades[1] = 15;
    edades[2] = 20;
     
    // 4. imprimimos los valores
    
        System.out.println("arreglo enteros indice 0:" +edades[0]);
        System.out.println("arreglo enteros indice 1:" +edades[1]);
        System.out.println("arreglo enteros indice 2:" +edades[2]);

        //arreglo tipo Objet
       Persona personas [] = new Persona [4];
       
       personas [0] = new Persona ("Juan Pedro");
       personas [2] = new Persona ("Calor henrrique");
       //inicializamos valos de los indices
        System.out.println("Arreglo Personas indece 0 " + personas[0]);
        System.out.println("Arreglo Personas indece 1 " + personas[1]);
        System.out.println("Arreglo Personas indece 2 " + personas[2]);
        System.out.println("Arreglo Personas indece 3 " + personas[3]);
        
         // System.out.println("Arreglo Personas indece 4 " + personas[4]); array indice 4 fora de rango
        //  Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
        
        // arreglo Notacion Simplificada
        
        String nombres [] = {"Sara","Laura","Carlos","Carmen"};
        
        //Imprimir elementos arreglo Ciclo For
         
         for (int i = 0; i < nombres.length; i++){
             
             System.out.println("Arreglos personas indice: " + i + ":"+ nombres[i]);
         
         }
         
        
         
   }
}