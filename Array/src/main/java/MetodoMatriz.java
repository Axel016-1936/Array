import java.util.Scanner;
public class MetodoMatriz
{
    public static void main(String[] args)
    {
        System.out.println("==========Cuadro de Matrices==========");
        Scanner T = new Scanner(System.in);
        int columna;
        int fila;
        System.out.println("Ingrese un número de filas para la matriz:");
        fila = T.nextInt();
        System.out.println("Ingrese un número de columnas para la matriz:");
        columna = T.nextInt();
        int[][] matriz = new int[fila][columna];

        System.out.println("Ingrese los valores de las matrices: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Posición " + "[" + i + "]" + "[" + j + "]");
                matriz[i][j] = T.nextInt();

            }
        }
        System.out.println("Matriz: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "");
            }
            System.out.println();
        }
        int[][] suma=valormatriz(matriz);
        System.out.println("El numero mayor de la matriz es: " +suma[1][0] );
        System.out.println("El numero menor de la matriz es: " + suma[0][0]);
        System.out.println("=======Suma de filas y Columnas======");
        sumafilcol(fila,columna,matriz);
    }

    public static int[][] valormatriz(int[][] matriz) {
        int mayor = matriz[0][0];
        int menor = matriz[0][0];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                }
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }
        return new int[][]{new int[]{menor}, new int[]{mayor}};
    }

    public static void sumafilcol(int fila, int columna , int[][] matriz)
    {
        for(int i=0; i<fila;i++)
        {
            int sumafil=0;
            for(int j=0;j<columna;j++)
            {
                sumafil+=matriz[i][j];
            }
            System.out.println("La suma de la fila " +  "[" + i + "]" + " es de: " + sumafil);
        }
        System.out.println();
        for(int j=0; j<columna; j++)
        {
            int sumacol=0;
            for (int i=0;i<fila;i++)
            {
                sumacol+=matriz[i][j];
            }
            System.out.println("La suma de la columna " +  "[" + j + "]" + " es de: " + sumacol);
        }
    }
}
