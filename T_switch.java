package ejercicios_switch_;
import java.util.Scanner;
public class T_switch {
    public void Usd() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa la cantidad en USD: ");
        double cantidad = sc.nextDouble();
        System.out.println("Elige la moneda destino:");
        System.out.println("1. EUR (Euro)");
        System.out.println("2. MXN (Peso Mexicano)");
        System.out.println("3. JPY (Yen Japonés)");
        System.out.println("4. GBP (Libra Esterlina)");
        System.out.print("Opción: ");
        int opcion = sc.nextInt();
        double resultado = 0;
        String moneda = "";
        switch (opcion) {
            case 1:
                resultado = cantidad * 0.92; // USD a EUR
                moneda = "EUR";
                break;
            case 2:
                resultado = cantidad * 16.90; // USD a MXN
                moneda = "MXN";
                break;
            case 3:
                resultado = cantidad * 155.00; // USD a JPY
                moneda = "JPY";
                break;
            case 4:
                resultado = cantidad * 0.78; // USD a GBP
                moneda = "GBP";
                break;
            default:
                System.out.println("Opción no válida.");
                return;
        }
        System.out.println("Cantidad convertida: " + resultado + " " + moneda);
    }    
    public void Esstacion(){
        /*Determinar la estación del año según el número del mes.*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número del mes (1-12): ");
        int mes = scanner.nextInt();
        String estacion;
        switch (mes) {
            case 12: case 1: case 2:
                estacion = "Invierno";
                break;
            case 3: case 4: case 5:
                estacion = "Primavera";
                break;
            case 6: case 7: case 8:
                estacion = "Verano";
                break;
            case 9: case 10: case 11:
                estacion = "Otoño";
                break;
            default:
                estacion = "Mes inválido";
                break;
        }
        System.out.println("La estación correspondiente es: " + estacion);
    }
    public void Imc(){
        /*Clasificación de IMC según valor ingresado.*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su IMC: ");
        double imc = scanner.nextDouble();
        String clasificacion;
        int categoria = (imc < 18.5) ? 1 :
                        (imc < 24.9) ? 2 :
                        (imc < 29.9) ? 3 :
                        (imc < 34.9) ? 4 :
                        (imc < 39.9) ? 5 : 6;
        switch (categoria) {
            case 1 -> clasificacion = "Bajo peso";
            case 2 -> clasificacion = "Peso normal";
            case 3 -> clasificacion = "Sobrepeso";
            case 4 -> clasificacion = "Obesidad grado 1";
            case 5 -> clasificacion = "Obesidad grado 2";
            case 6 -> clasificacion = "Obesidad grado 3";
            default -> clasificacion = "Valor fuera de rango, XD ";
        }
        System.out.println("Clasificación de IMC: " + clasificacion);
    }
    public void Dias(){
        /*Determinar número de días del mes ingresado.*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número del mes (1-12): ");
        int mes = scanner.nextInt();
        int dias;
        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12 -> dias = 31;
            case 4, 6, 9, 11 -> dias = 30;
            case 2 -> dias = 28;
            default -> {
                System.out.println("Número de mes inválido.");
                return;
            }
        }
        System.out.println("El mes " + mes + " tiene " + dias + " días.");
    }
}