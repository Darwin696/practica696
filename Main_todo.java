package main;

import controller.Utilidades;
import ejercicios_do_while_.T_do_while;
import ejercicios_for_.T_fors;
import ejercicios_switch_.T_switch;
import ejercicios_while_.T_while;
import java.util.Scanner;
import ejercicios_practica.T_pratica;

public class Main_todo {

    private static final Scanner sc = new Scanner(System.in);
    private static int num;

    public static void main(String[] args) {
        T_do_while dw = new T_do_while();
        T_fors f = new T_fors();
        T_switch s = new T_switch();
        T_while w = new T_while();
        T_pratica tp = new T_pratica();
        Utilidades u = new Utilidades();
        System.out.println("1: Collatz");
        System.out.println("2: Divisibles");
        System.out.println("3: Divisor");
        System.out.println("4: Reloj");
        System.out.println("5: Aleatorio");
        System.out.println("6: Booleanos");
        System.out.println("7: Menu");
        System.out.println("8: Potencia");
        System.out.println("9: Dias");
        System.out.println("10: Estacion");
        System.out.println("11: IMC");
        System.out.println("12: USD");
        System.out.println("13: Intento de Contrasena");
        System.out.println("14: Duplicados");
        System.out.println("15: Primos");
        System.out.println("16: Repeticiones");
        System.out.println("17: Climatico");
        System.out.println("18: Prestamo");
        System.out.println("19: Riego");
        System.out.println("20: Simulacion Bancaria");
        System.out.println("21: Fibonacci");
        System.out.println("0: ");
        int option = sc.nextInt();
        do {
            switch (option) {
                case 1: {
                    System.out.println("Ingrese el número 1:");
                    int num = sc.nextInt();
                    f.Collatz();
                    break;
                }
                case 2: {
                    System.out.println("Ingrese el número 2:");
                    int num = sc.nextInt();
                    f.Divisible();
                    break;
                }
                case 3: {
                    System.out.println("Ingrese el número 3:");
                    int num = sc.nextInt();
                    f.Divisor_c();
                    break;
                }
                case 4: {
                    System.out.println("Ingrese el número 4:");
                    int num = sc.nextInt();
                    f.Reloj();
                    break;
                }
                case 5: {
                    System.out.println("Ingrese el número 5:");
                    int num = sc.nextInt();
                    dw.Aleatorio();
                    break;
                }
                case 6: {
                    System.out.println("Ingrese el número 6:");
                    int num = sc.nextInt();
                    dw.Booleanoss();
                    break;
                }
                case 7: {
                    System.out.println("Ingrese el número 7");
                    int num = sc.nextInt();
                    dw.Menu();
                    break;
                }
                case 8: {
                    System.out.println("Ingrese el número 8:");
                    int num = sc.nextInt();
                    dw.Potencia();
                    break;
                }
                case 9: {
                    System.out.println("Ingrese el número 9:");
                    int num = sc.nextInt();
                    s.Dias();
                    break;
                }
                case 10: {
                    System.out.println("Ingrese el número 10:");
                    int num = sc.nextInt();
                    s.Esstacion();
                    break;
                }
                case 11: {
                    System.out.println("Ingrese el número 11:");
                    int num = sc.nextInt();
                    s.Imc();
                    break;
                }
                case 12: {
                    System.out.println("Ingrese el número 12:");
                    int num = sc.nextInt();
                    s.Usd();
                    break;
                }
                case 13: {
                    System.out.println("Ingrese el número 13:");
                    int num = sc.nextInt();
                    w.Contra();
                    break;
                }
                case 14: {
                    System.out.println("Ingrese el número 14:");
                    int num = sc.nextInt();
                    w.Dupli();
                    break;
                }
                case 15: {
                    System.out.println("Ingrese el número 15:");
                    int num = sc.nextInt();
                    w.Primo();
                    break;
                }
                case 16: {
                    System.out.println("Ingrese el número 16:");
                    int num = sc.nextInt();
                    w.Repe();
                    break;
                }
                case 17: {
                    System.out.println("Ingrese el número 17:");
                    int num = sc.nextInt();
                    tp.Climatico();
                    break;
                }
                case 18: {
                    System.out.println("Ingrese el número 18:");
                    int num = sc.nextInt();
                    tp.Prestamo();
                    break;
                }
                case 19: {
                    System.out.println("Ingrese el número 19:");
                    int num = sc.nextInt();
                    tp.Riego();
                    break;
                }
                case 20: {
                    System.out.println("Ingrese el número 20:");
                    int num = sc.nextInt();
                    tp.Sbancaria();
                    break;
                }
                case 21: {
                    System.out.println("Ingrese el número 21:");
                    int num = sc.nextInt();
                    tp.Fibonacci();
                    break;
                }
            }
            System.out.println("Desea salir precione 0 caso contrario cualquier numero del menu");
            option = sc.nextInt();
        } while (option != 0);
    }
}