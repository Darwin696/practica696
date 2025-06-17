package ejercicios_practica;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;
import controller.Utilidades;
public class T_pratica {
    public void Climatico(){
        Random rand = new Random();
        int diasOlaCalor = 0, diasOlaFrio = 0;
        double sumaTemperaturas = 0;
        int diasTotales = 365;
        System.out.println("Día | Temperatura (°C) | Estado");
        /*Simulación de temperaturas*/ 
        for (int dia = 1; dia <= diasTotales; dia++) {
            double temperatura = -5 + (rand.nextDouble() * 45); /*Genera temperatura entre -5°C y 40°C*/
            sumaTemperaturas += temperatura;
            /*Evaluar condiciones climáticas*/
            String estado;
            if (temperatura > 35) {
                estado = "Ola de calor";
                diasOlaCalor++;
            } else if (temperatura < 0) {
                estado = "Ola de frío";
                diasOlaFrio++;
            } else {
                estado = "Normal";
            }
            System.out.printf("%3d | %6.2f °C | %s\n", dia, temperatura, estado);
        }
        /**promedio anual*/
        double promedioAnual = sumaTemperaturas / diasTotales;
        /*resultado final*/
        System.out.println("\n Resumen del año:");
        System.out.println("Total días de ola de calor (> 35°C): " + diasOlaCalor);
        System.out.println("Total días de ola de frío (< 0°C): " + diasOlaFrio);
        System.out.printf("Temperatura promedio anual: %.2f °C\n", promedioAnual);
    }
    public void Prestamo(){
        Scanner scanner = new Scanner(System.in);
        /*datos del usuario*/
        System.out.println("Ingrese el monto del préstamo:");
        double monto = scanner.nextDouble();
        System.out.println("Ingrese la cantidad de años:");
        int anios = scanner.nextInt();
        System.out.println("Seleccione el tipo de préstamo: PERSONAL, HIPOTECARIO, COFIDIS");
        String tipoPrestamo = scanner.next().toUpperCase();
        /*taza de interes de cada tipo de prestamo*/
        double tasaInteresAnual;
        if (tipoPrestamo.equals("PERSONAL")) {
            tasaInteresAnual = 0.10;
        } else if (tipoPrestamo.equals("HIPOTECARIO")) {
            tasaInteresAnual = 0.05;
        } else if (tipoPrestamo.equals("COFIDIS")) {
            tasaInteresAnual = 0.15;
        } else {
            System.out.println("Tipo de préstamo inválido.");
            return;
        }
        /*calculo de cuota mensual*/
        double tasaMensual = tasaInteresAnual / 12;
        int meses = anios * 12;
        double cuotaMensual = (monto * tasaMensual) / (1 - Math.pow(1 + tasaMensual, -meses));
        System.out.printf("Cuota mensual: %.2f\n", cuotaMensual);
        System.out.println("Amortización anual:");
        for (int i = 1; i <= anios; i++) {
            double saldoPendiente = monto * Math.pow(1 + tasaMensual, i * 12) - 
                                    cuotaMensual * (Math.pow(1 + tasaMensual, i * 12) - 1) / tasaMensual;
            System.out.printf("Año %d: Saldo restante %.2f\n", i, saldoPendiente);
        }
        scanner.close();
    }
    public void Riego(){
        Random rand = new Random();
        int tiempoRiegoTotal = 0;
        int horasPorDia = 24;
        int intervalo = 2;
        System.out.println("Hora | Humedad (%) | Estado del riego");
        /*lectura y riego cada 2 horas*/
        for (int hora = 0; hora < horasPorDia; hora += intervalo) {
            int humedad = rand.nextInt(101);
            /*condicion de riego*/
            if (humedad < 30) {
                System.out.printf("%2d:00 | %3d%% | Encendido (%d min)\n", hora, humedad, intervalo * 60);
                tiempoRiegoTotal += intervalo * 60; /*tiempo de riego*/
            } else if (humedad >= 30 && humedad <= 60) {
                System.out.printf("%2d:00 | %3d%% | Mantener\n", hora, humedad);
            } else {
                System.out.printf("%2d:00 | %3d%% | Apagado\n", hora, humedad);
            }
        } 
        /*resultado final*/
        System.out.println("\nTiempo total de riego en el día: " + tiempoRiegoTotal + " minutos");
    }
    public void Sbancaria(){
class Cliente {
    String servicio;
    public Cliente(String servicio) {
        this.servicio = servicio;
    }
}
        Queue<Cliente> filaBanco = new LinkedList<>();
        Random rand = new Random();
        int tiempoTotal = 120; /*120min*/
        int clientesCajero = 0, clientesAsesor = 0;           /*UwU*/
        int tiempoTranscurrido = 0;
        /*clientes por minuto*/
        for (int minuto = 0; minuto < tiempoTotal; minuto++) {
            String servicio = rand.nextBoolean() ? "cajero" : "asesor";
            filaBanco.add(new Cliente(servicio));
            /* Procesar atención en la fila*/
            if (!filaBanco.isEmpty() && tiempoTranscurrido == 0) {
                Cliente cliente = filaBanco.poll();
                if (cliente.servicio.equals("cajero")) {
                    tiempoTranscurrido = 2; 
                    clientesCajero++;
                } else {
                    tiempoTranscurrido = 5; 
                    clientesAsesor++;
                }
            }
            if (tiempoTranscurrido > 0) {
                tiempoTranscurrido--;
            }
        }
        /*resultado*/
        System.out.println("Simulación completada:");
        System.out.println("Clientes atendidos en Cajero: " + clientesCajero);
        System.out.println("Clientes atendidos en Asesor: " + clientesAsesor);
    }
    public void Fibonacci(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de términos a calcular: ");
        int n = scanner.nextInt();
        double suma = 0;
        int num1 = 1, num2 = 1;  /*valores de Fibonacci*/
        int denom = 1;  /*Primer número impar*/
        int exp = 2;  /*Primer exponente*/
        for (int i = 0; i < n; i++) {
            double termino = Math.pow((double) num1 / denom, exp);
            suma += (i % 4 < 2) ? termino : -termino;/*signos alternados*/
            /*actualizar valores*/
            int temp = num1 + num2;
            num1 = num2;
            num2 = temp;
            denom += 2;
            exp += 2;
        }
        System.out.println("Resultado de la serie con " + n + " términos: " + suma);
    }
}