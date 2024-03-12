package arrays;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class demonstrates how to manage a list of apprentices with their scores.
 *
 * @author manci
 */
public class Arrays {

    public static void main(String[] args) {

        // Create an ArrayList to store Aprendiz objects
        ArrayList<Aprendiz> listAprendiz = new ArrayList<>();

        // Create a Scanner object to get user input
        Scanner teclado = new Scanner(System.in);

        // Get information for 3 apprentices
        for (int i = 0; i < 3; i++) {
            Aprendiz miAprendiz = new Aprendiz();

            // Set the ID and get other details from the user
            miAprendiz.setId(i);
            System.out.println("Ingrese el nombre del Aprendiz");
            miAprendiz.setNombre(teclado.next());
            System.out.println("Ingrese la nota uno");
            miAprendiz.setNota1(teclado.nextInt());

            // Get the second and third notes only once, as intended
            System.out.println("Ingrese la nota dos");
            int nota2 = teclado.nextInt();
            System.out.println("Ingrese la nota tres");
            int nota3 = teclado.nextInt();

            // Set the notes for the apprentice
            miAprendiz.setNota2(nota2);
            miAprendiz.setNota3(nota3);

            // Add the apprentice to the list
            listAprendiz.add(miAprendiz);
        }

        // Print the information for each apprentice
        System.out.println("Imprime aprendices");
        for (Aprendiz var : listAprendiz) {
            System.out.println(var.getNombre() + " sus notas son: " + var.getNota1() + ", " + var.getNota2() + ", " + var.getNota3()
                    + " su promedio es: " + (var.getNota1() + var.getNota2() + var.getNota3()) / 3);
        }
    }
}
