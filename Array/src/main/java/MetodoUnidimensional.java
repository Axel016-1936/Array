import java.util.Scanner;
public class MetodoUnidimensional
{
    public static void main(String[] args)
    {
        Scanner  T=new Scanner(System.in);

        int[] numero = new int[7];
        for (int contador = 0; contador < numero.length; contador++) {
            System.out.println("Escriba el valor en la posición " + contador + ":");
            numero[contador] = T.nextInt();
        }
        System.out.println("=====Números invertidos======");
        for (int contador = numero.length - 1; contador >= 0; contador--) {
            System.out.println("Posición " + contador + " numero registrado: " + numero[contador]);
        }
        int[] resultado=sumar(numero);

        System.out.println("====Suma de los valores=====");
        System.out.println("Valor de las sumas de los números: " + resultado[2] );
        System.out.println("Numero mayor: " + resultado[1] );
        System.out.println("Numero menor: " + resultado[0]);
    }

    public static int[] sumar(int[] numero)
    {
        int mayor = numero[0];
        int menor = numero[0];
        int suma = 0;
        for (int acumulador = 0; acumulador < numero.length; acumulador++) {
            suma = suma + numero[acumulador];
            if (numero[acumulador] > mayor) {
                mayor = numero[acumulador];
            }
            if (numero[acumulador] < menor) {
                menor = numero[acumulador];
            }
        }
        return new int[]{menor,mayor,suma};
    }

}
