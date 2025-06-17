package ejercicios_for_;
import java.util.Scanner;
public class T_fors {
    public void Reloj(){
        for (int horas = 0; horas <= 23; horas++) {
            for (int minutos = 0; minutos <= 59; minutos++) {
                for (int segundos = 0; segundos <= 59; segundos++) {
                    try {
                        Thread.sleep(1000);
                        System.out.printf("%02d:%02d:%02d:\n", horas, minutos, segundos);
                    } catch (Exception e) {
                    }
                }
            }
        }
    }
    public void Collatz(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un número:");
        int n = sc.nextInt();
        System.out.println("Secuencia de Collatz para" + n +" :");
        for ( ; n != 1; ){
            System.out.print(n + " ");
            n = (n % 2 == 0) ? n / 2 : 3 * n + 1;
        }
        System.out.println(n); // Imprime el último número (1)
    }
    public void Divisor_c(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el primer número:");
        int num1 = sc.nextInt();
        System.out.print("Ingresa el segundo número:");
        int num2 = sc.nextInt();
        System.out.println("Divisores comunes de "  + num1 + " y " + num2 + ":");
        for (int i = 1; i <= Math.min(num1, num2); i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
    public void Divisible(){
        System.out.println("Números de 1 a 100 que no son"
                + " divisibles por 3 ni por 5:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 != 0 && i % 5 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}