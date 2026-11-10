
package taller5;

import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * Ejercicio 5 - Clase Estudiante + JOptionPane + BufferedReader
 *
 * El main usa la clase Estudiante:
 *  - nombre y edad con JOptionPane
 *  - notas con BufferedReader
 */
public class Ejercicio5 {

    public static void main(String[] args) throws IOException {

        String nombre = JOptionPane.showInputDialog(
            "Ingrese el nombre del estudiante:"
        );

        String entradaEdad = JOptionPane.showInputDialog(
            "Ingrese la edad del estudiante:"
        );

        int edad = Integer.parseInt(entradaEdad);

        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        System.out.print("Ingrese la primera nota: ");
        double nota1 = Double.parseDouble(br.readLine());

        System.out.print("Ingrese la segunda nota: ");
        double nota2 = Double.parseDouble(br.readLine());

        System.out.print("Ingrese la tercera nota: ");
        double nota3 = Double.parseDouble(br.readLine());

        Estudiante estudiante = new Estudiante(
            nombre,
            edad,
            nota1,
            nota2,
            nota3
        );

        String resultado = String.format(
            java.util.Locale.US,
            "Nombre: %s%nEdad: %d%nPromedio: %.2f",
            estudiante.getNombre(),
            estudiante.getEdad(),
            estudiante.getPromedio()
        );

        JOptionPane.showMessageDialog(null, resultado);
    }
}
