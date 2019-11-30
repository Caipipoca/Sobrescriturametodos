
package palabrafinal;

/**
 *
 * @author caipipoca
 */
public class EjemploPalabraFinal {
   
    public static void main(String[] args) {
        
       // ClaseFinal.VAR_PRIMITIVO =10;
       // No se puede modificar la referencia del objeto. pero el estado si
       //  ClaseFinal.VAR_PERSONA = new Persona(); 
        
       ClaseFinal.VAR_PERSONA.setNombre("Juan Carlos");
        System.out.println(ClaseFinal.VAR_PERSONA.getNombre());
    }
    
    
}
