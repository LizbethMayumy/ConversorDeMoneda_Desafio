import java.util.Scanner;

public class Conversor {

    public static void main(String[] args) {
        int opcion = 0;
        String menu = """
                 ********************************************************
                 1) Dólar =>> Peso argentino
                 2) Peso argentino =>> Dólar
                 3) Dólar =>> Real brasileño
                 4) Real brasileño =>> Dólar
                 5) Dólar =>> Peso colombiano
                 6) Peso Colombiano =>> Dólar
                 7) Salir
                 
                 Elija una opcion valida:
                 *********************************************************
                 """;
        Scanner teclado = new Scanner(System.in);
        ConsultaTasaDeCambio cliente = new ConsultaTasaDeCambio();

        while(opcion != 7){
            System.out.println(menu);
            opcion = teclado.nextInt();


            switch (opcion){

                case 1:
                    System.out.println("Ingrese el valor que deseas convertir:");
                    double valor1=teclado.nextDouble();
                    double convertido = cliente.convertir(valor1, "USD", "ARS");
                    System.out.printf("El valor  %.2f [USD] corresponde al valor final de =>>>  %.2f [ARS]%n", valor1, convertido);
                    break;
                case 2:
                    System.out.println("Ingrese el valor que deseas convertir:");
                    double valor2=teclado.nextDouble();
                    double convertido2 = cliente.convertir(valor2, "ARS", "USD");
                    System.out.printf("El valor  %.2f [ARS] corresponde al valor final de =>>>  %.2f [USD]%n", valor2, convertido2);
                    break;
                case 3:
                    System.out.println("Ingrese el valor que deseas convertir:");
                    double valor3=teclado.nextDouble();
                    double convertido3 = cliente.convertir(valor3, "USD", "BRL");
                    System.out.printf("El valor  %.2f [USD] corresponde al valor final de =>>>  %.2f [BRL]%n", valor3, convertido3);
                    break;
                case 4:
                    System.out.println("Ingrese el valor que deseas convertir:");
                    double valor4=teclado.nextDouble();
                    double convertido4 = cliente.convertir(valor4, "BRL", "USD");
                    System.out.printf("El valor  %.2f [BRL] corresponde al valor final de =>>>  %.2f [USD]%n", valor4, convertido4);
                    break;
                case 5:
                    System.out.println("Ingrese el valor que deseas convertir:");
                    double valor5=teclado.nextDouble();
                    double convertido5 = cliente.convertir(valor5, "USD", "COP");
                    System.out.printf("El valor  %.2f [USD] corresponde al valor final de =>>>  %.2f [COP]%n", valor5, convertido5);
                    break;
                case 6:
                    System.out.println("Ingrese el valor que deseas convertir:");
                    double valor6=teclado.nextDouble();
                    double convertido6 = cliente.convertir(valor6, "COP", "USD");
                    System.out.printf("El valor  %.2f [COP] corresponde al valor final de =>>>  %.2f [USD]%n", valor6, convertido6);
                    break;
                case 7:
                    System.out.println("Saliendo del programa.");
                    break;

                default:
                    System.out.println("Opcion no valida.\n");
            }
        }
    }



}
