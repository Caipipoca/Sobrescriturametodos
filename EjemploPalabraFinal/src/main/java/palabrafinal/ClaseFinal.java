
package palabrafinal;

/**
 *
 * @author caipipoca
 */
// public final class ClaseFinal
public final class ClaseFinal {
    
    //variables marcadas como final:
    // variable varNumero not initialized in the default constructor
   // ahora no se puede modificar su valor
    public final int varNumero = 10;
    
    //Constatntes en Java
    // Constante en java se escribe todo en LETRA_MAYUSCULA:
    public static final int VAR_PRIMITIVO = 15;
     // constatntes Objetos:
    public static final Persona VAR_PERSONA = new Persona();
    
    // metodo final 
    public final void metodoFinal(){}
    
}

// class clasehija extends claseFinal{}

// no es posible crear clases hijas en una clase creado como Final.