/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_do_while_;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Usuario iTC
 */
public class T_do_while {
    public void Menu(){
        /*Generar un menú que se repita hasta que se elija "salir".*/
        Scanner sc = new Scanner(System.in);
        String opcion;
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Ver mensaje");
            System.out.println("2. Realizar cálculo");
            System.out.println("3. Mostrar fecha actual");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextLine();
            switch (opcion) {
                case "1":
                    System.out.println("¡Hola! Guapo UwU.");
                    break;
                case "2":
                    System.out.println("El resultado de 5 + 3 es: " + (5 + 3));
                    break;
                case "3":
                    System.out.println("Fecha actual: " + java.time.LocalDate.now());
                    break;
                case "4":
                    System.out.println("Finalizando...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (!opcion.equals("4"));
    }
    
    public void Potencia(){
        /*Mostrar tabla de potencia de 2 hasta que supere 1000.*/
        int potencia = 1;
        int exponente = 0;
        System.out.println("Tabla de potencias de 2 hasta superar 1000:");
        do {
            System.out.println("2^" + exponente + " = " + potencia);
            potencia *= 2; // Multiplicamos por 2 en cada iteración
            exponente++; // Incrementamos el exponente
        } while (potencia <= 1000); // La condición para detener el ciclo
    }
    /*Entrada:
    true
    false
    Salida:
    true
    False
    */
    public void Booleanoss(){
        /*Evaluar condiciones booleanas ingresadas por el usuario.*/
        Scanner scanner = new Scanner(System.in);
        boolean resultado = false;
        String entrada;
        do {
            System.out.print("Ingrese una condición booleana (true/false): ");
            entrada = scanner.nextLine().trim().toLowerCase();
            if (entrada.equals("verdadero")) {
                resultado = true;
            } else if (entrada.equals("falso")) {
                resultado = false;
            } else {
                System.out.println("Entrada no válida. Debe ser 'true' o 'falso'. Intente nuevamente.");
            }
        } while (!entrada.equals("true") && !entrada.equals("false"));
        System.out.println("La condición ingresada es: " + resultado);
        scanner.close();
    }
    /**/
    public void Aleatorio(){
        /*Sumar números aleatorios hasta alcanzar un total mínimo.*/
        Random random = new Random();
        int suma = 0;
        int minimo = 100; // Total mínimo deseado
        System.out.println("Generando números aleatorios hasta alcanzar " + minimo + "...\n");
        do {
            int numero = random.nextInt(20) + 1; // Números aleatorios entre 1 y 20
            suma += numero;
            System.out.println("Número generado: " + numero + " | Suma acumulada: " + suma );
        } while (suma < minimo);
        System.out.println("\n¡Total mínimo alcanzado! Suma final: " + suma);
    }
}

