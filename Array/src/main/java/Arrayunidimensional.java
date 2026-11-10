import java.util.Scanner;
public class Arrayunidimensional {
    public static void main(String[] args) {
        Scanner T = new Scanner(System.in);
        int[] numero = new int[7];
        for (int contador = 0; contador < numero.length; contador++) {
            System.out.println("Escriba el valor en la posición " + contador + ":");
            numero[contador] = T.nextInt();
        }
        System.out.println("=====Números invertidos======");
        for (int contador = numero.length - 1; contador >= 0; contador--) {
            System.out.println("Posición " + contador + " numero registrado: " + numero[contador]);
        }

        /*Acumuladores, lo cuales ayudan a guardar el dato en "for" cuando el ciclo a concluido y vuelve a entrar,
        actualizando su valor con base a la obtención del valor anterior en el ciclo que precede.
        */
        int mayor=numero[0];
        int menor=numero[0];
        int suma = 0;
        for (int acumulador = 0; acumulador < numero.length; acumulador++)
        {
            suma = suma + numero[acumulador];

            /*
            Se considera el valor mayor de la posición 0,0 como el número mayor que se evaluara, despues
            del pimres ciclo, si sigue siendo mayor, se mantiene su valor inicial, de no ser el caso, se toma como
            nuevo valor mayor el encontrado en la variable numero[acumulador]
             */

            if (numero[acumulador]>mayor)
            {
                mayor=numero[acumulador];
            }
            /* Sigue la misma lógica que en la variable "mayor", solo que ahora el valor de la variable
            numero[acumulador] debe ser menor a la de la variable "menor".
             */
            if(numero[acumulador]<menor)
            {
                menor=numero[acumulador];
            }
        }
        System.out.println("====Suma de los valores=====");
        System.out.println("Valor de las sumas de los números: " + suma);
        System.out.println("Numero mayor: " + mayor);
        System.out.println("Numero menor: " + menor);

    }
}
