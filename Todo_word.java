package ejercicios_word;

import java.util.Scanner;

public class Todo_word {

    public void uno() {
        int contador = 1;
        while (contador <= 10) {
            /* XD */
            System.out.println("Número: " + contador);
            contador++;
        }
    }

    public void dos() {
        Scanner scanner = new Scanner(System.in);
        boolean bandera = false;
        int numero;
        do {
            System.out.print("Ingresa un número mayor que 10: ");
            numero = scanner.nextInt();
            if (numero > 10) {
                bandera = true;
            }
        } while (!bandera);

        System.out.println("¡Número válido ingresado!");
    }

    public static void siete(int num) {
        /*Método que intenta modificar el número*/
        num = num + 10;
        /*Se modifica la copia, no el valor original*/
        System.out.println("Dentro del método: " + num);
        /* se hce lo que se puede :v */
    }

    public static void main(String[] args) {
        int numero = 5;
        System.out.println("Antes de llamar al método: " + numero);
        siete(numero);
        System.out.println("Después de llamar al método: " + numero);
    }

    public void ocho() {
        class XD {

            String nombre;

            /* Método que puede  modificar el nombre de una persona*/
            public void rnombre(String nuevoName) {
                this.nombre = nuevoName;
            }
        }
        /* pa los q no les gusta su mombre*/
        XD p = new XD();
        p.nombre = "Carlos";
        System.out.println("Nombre antes del cambio: " + p.nombre);
        /* se llama al metodo*/
        p.rnombre("Luis");
        System.out.println("su nuevo nombre: " + p.nombre);
    }
}
