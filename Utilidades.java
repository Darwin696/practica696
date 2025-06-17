package controller;
public class Utilidades {
    public int factorial(int numero) {
        int resp = 1;
        for (int i = 1; i <= numero; i++) {
            resp = resp * i;
        }
        return resp;
    }
     public void verifyPrimo(int num) {
        int cont = 0;
            for(int i = 2; i < num; i++) {
                if (num % i == 0) {
                    cont++;
                    break;
                }
            }
    }
     /*
     UwU
     */
     public int fibonacci(int num) {
         int a = 1;
         int b = 0;
         int fibo = 0;
         for (int i = 0; i < num; i++ ){
             fibo = a + b;
             a = b;
             b = fibo;
         }
         return fibo;
     }
      public double moneda(double num){
        System.out.print("Ingresa la cantidad en USD: ");
        System.out.println("Elige la moneda destino:");
        System.out.println("1. EUR (Euro)");
        System.out.println("2. MXN (Peso Mexicano)");
        System.out.println("3. JPY (Yen Japonés)");
        System.out.println("4. GBP (Libra Esterlina)");
        System.out.print("Opción: ");
        return 0;
      }
}
