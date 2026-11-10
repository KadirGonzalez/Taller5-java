package taller5;

import javax.swing.JOptionPane;

/**
 * Ejercicio 1 - Calculadora de propina (JOptionPane)
 *
 * El autograde invoca por reflexión:
 *   calcularPropina(double monto, double porcentaje)
 *   calcularTotal(double monto, double porcentaje)
 *
 * El main debe usar JOptionPane para interactuar con el usuario.
 */
public class Ejercicio1 {

    public static double calcularPropina(double monto, double porcentaje) {
        // TODO: retornar la propina = monto * porcentaje / 100
        return monto * porcentaje / 100;
    }

    public static double calcularTotal(double monto, double porcentaje) {
        // TODO: retornar monto + propina
        return monto + calcularPropina(monto, porcentaje);
    }

    public static void main(String[] args) {
        // TODO:
        // 1. Pedir monto con JOptionPane.showInputDialog
        String entradaMonto = JOptionPane.showInputDialog(
        "Ingrese el monto de la cuenta:"   
        );
        double monto = Double.parseDouble(entradaMonto);
        String entradaPorcentaje = JOptionPane.showInputDialog(
        "Ingrese el porcentaje de propina:"
        );

        double porcentaje = Double.parseDouble(entradaPorcentaje);
        double propina = calcularPropina(monto, porcentaje);
        double total = calcularTotal(monto, porcentaje);

        String resultado = String.format(
        java.util.Locale.US,
        "Propina: $%.2f%nTotal: $%.2f",
        propina,
        total
        );
        JOptionPane.showMessageDialog(null, resultado);
    }
}
