
package test;

public class AutoboxingUnboxing {
    
    public static void main(String[] args) {
        
        //Autoboxing (Envolvemos tipos primitivos de clases wrapper)
        
        Integer enteroObj = 10;
        
        System.out.println("enteroObj = " + enteroObj);
        
        // Unboxing ( Extraemos el tipo primitivo del objeto envolvente)
        
        int entero = enteroObj;
        
        System.out.println("entero = " + entero);
        
        Float floatObj = 15.4F;
        System.out.println("floatObj = " + floatObj);
        float flotante = floatObj;
        System.out.println("flotante = " + flotante);
        System.out.println("flotante = " + floatObj.intValue());
    }
    
}
/*     
/* Las clases envolventes son un complemento de los tipos primitivos.
/* Cada tipo primitivo tiene su correspondiente clase envolvente en el paquete java.lang:
/* byte → Byte
/*        short → Short
/*               int → Integer 
/*                          long → Long
/*                                float → Float
/*                                       double → Double
/*                                                boolean → Boolean 
/*                                                        char → Character */