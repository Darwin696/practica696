package ejercicios_while_;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;
public class T_while {
    public void Repe(){
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> numerosVistos = new HashSet<>();
        System.out.println("Ingresa números (se detendrá "
                + "cuando repitas uno):");
        while (true) {
            int num = scanner.nextInt();
            if (numerosVistos.contains(num)) {
                System.out.println("Número repetido encontrado: " + num);
                break;
            }
            numerosVistos.add(num);
        }       
    }
    public void Contra(){
        Scanner scanner = new Scanner(System.in);
        String contrasenaCorrecta = "1234";/*Caracteres*/
        int intentos = 0;/*enteros*/
        boolean acceso = false;/*tru of falso*/
        System.out.println("Introduce la contrasena (Tienes 3 vidas):");
        while (intentos < 3) {
            System.out.print("Intento " + (intentos + 1) + ": ");
            String contrasenaIngresada = scanner.nextLine();
            if (contrasenaIngresada.equals(contrasenaCorrecta)) {
                acceso = true;
                break;
            } else {
                System.out.println("Contrasena incorecta acuerdate.");
                intentos++;
            }
        }
        if (acceso) {
            System.out.println("Bienvenido, si le atinaste. JAJAJAJA");
        } else {
            System.out.println("Has agotado los intentos. Como se te puede olviar XD");
        }
    }
    public void Primo(){
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        System.out.println("Ingrese un numero y Presione Enter para ver el siguiente numero es primo o escribe 'XD' para terminar.");
        while (true) {
            if (esPrimo(numero)) {
                System.out.println("Primo encontrado: " + numero);
            }
            numero++;
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("XD")) {
                break;
            }
        }
        scanner.close();
        System.out.println("Proceso finalizado.");
    }
    public static boolean esPrimo(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public void Dupli(){
         Scanner sc = new Scanner(System.in);
        TreeSet<Integer> numeros = new TreeSet<>();
        System.out.println("Ingresa números (escribe '0' para terminar):");
        while (true) {
            int num = sc.nextInt();
            if (num == 0) break;
            numeros.add(num);
        }
        sc.close();
        System.out.println("Lista ordenada sin duplicados: " + numeros);
    }
}
