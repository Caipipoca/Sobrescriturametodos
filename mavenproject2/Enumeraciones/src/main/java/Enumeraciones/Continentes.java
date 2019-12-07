
package Enumeraciones;


public enum Continentes {
    
    AFRICA(53),
    EUROPA(46),
    ASIA(44),
    AMERICA(34),
    OCEANIA(14);
    // Definimos atributos de Paises;
    
    
    private final int pasises;
    
    // constructor de cada elemeto de la enumeracion
    
    Continentes (int paises){
    
    this.pasises = paises;
    }

    public int getPasises() {
        return this.pasises;
    }
    
    
}
