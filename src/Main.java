import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Conversor De Temperatura");
        System.out.println(" ");
        System.out.println("1 - Celsius para Fahrenheit");
        System.out.println("2 - Fahrenheit para Celsius");
        System.out.println("3 - sair");
        System.out.println(" ");
        System.out.println("Escolha uma opção:");

        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();

        if(numero == 1){
            System.out.print("Informe a temperatura em Celsius:");
            int c = sc.nextInt();
            System.out.println(celciusParaFahrenheit(c));
        } else if (numero == 2) {
            System.out.print("Informe a temperatura em Fahrenheit:");
            int f = sc.nextInt();
            System.out.println(fahrenheitParaCelsius(f));
        }else3 {
            System.out.println("Encerrando programa!");
        }
        sc.close();
    }
    public static String celciusParaFahrenheit(int c){
        return String.format("%.2f", c * 1.8 + 32);
    }
     public static String fahrenheitParaCelsius(int f){
         return String.format("%.2f", (f - 32) / 1.8);
     }
}
