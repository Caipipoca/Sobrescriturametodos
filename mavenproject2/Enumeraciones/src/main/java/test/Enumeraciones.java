
package test;

import Enumeraciones.Continentes;
import Enumeraciones.Dias;

public class Enumeraciones {
    
    public static void main(String[] args) {
        
        // Desplegamos los valores de la Enumeraciones:
        
        System.out.println("Valor Dias"   +Dias.LUNES);
        System.out.println("Valor Dia 2 = " + Dias.MARTES);
        
        // Ultilizamos la enumeracion de paises:
        
        System.out.println("Continentes num.  4: "  +Continentes.AMERICA);
        System.out.println("Accedemos ao numero de Paises del continente 4: "   +Continentes.AMERICA.getPasises());
        
        indicarDias(Dias.LUNES);
    }

    private static void indicarDias(Dias dias) {
        
        switch  (dias){
            
            case LUNES :
                System.out.println("Hoy es " + dias +" que tengas un bello dia!");
                
        }
        
        
    }
    
    
}
