import java.util.Scanner;
public class Excercise {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);

        // Se lee un array bidimensional de elementos de tipo int
        int[] vec = Internal.loadIntArray(input);
        System.out.print("Número de columnas: ");
        int lon = input.nextInt();
        // array que almacena el la matriz resultado
        int[][] res;
        
        res = rellenaMat(vec, lon);

        // Se muestra el resultado
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] auxRellena(int valor, int lon) {
        // Método auxiliar
        int[] res = new int[lon];
        res[0] = valor;
        for (int i = 1; i < lon; i++ ){
            res[i] = res[i-1] + 1;
        }
        return res;
    }
    public static int[][] rellenaMat(int[] valores, int lon) {
        //-->> Poner aquí su código <<--//
        int[][] array = new int[valores.length][lon];
        for (int i = 0; i < valores.length; i++){
                array[i] = auxRellena(valores[i], lon);
        }
        
        return array;
    }    
}