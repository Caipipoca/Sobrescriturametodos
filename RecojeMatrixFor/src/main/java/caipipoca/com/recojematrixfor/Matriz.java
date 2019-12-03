package caipipoca.com.recojematrixfor;

public class Matriz {

    public static void main(String[] args) {

        // Matrix del tipo String Notacion Simplificada.
        String nombres[][] = {{"Teresa", "Cesar", "William"}, {"Yesenia", "Esteban", "Maria"}};

        // Largo de elementos de la matriz
        System.out.println("Largo de renglones " + nombres.length);
        System.out.println("Largo columnas de la Matriz " + nombres[0].length);

        for (int i = 0; i < nombres.length; i++) {
            for (int j = 0; j < nombres[i].length; j++) {

                System.out.println("Matriz String Indice: " + i + "-" + j + ":" + nombres[i][j]);
            }

        }
    }
}