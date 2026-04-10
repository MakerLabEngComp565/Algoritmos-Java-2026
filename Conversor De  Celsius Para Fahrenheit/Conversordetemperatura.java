import java.util.Scanner;

public class Conversordetemperatura {
    
    static double celsiusToFahrenheit(double C) {
        return 9 * C / 5 + 32;
    }

    public static void main(String[] args) {
       Scanner leitor = new Scanner(System.in);
       System.out.println("Digite a temperatura em Celsius: ");
       double celsius = leitor.nextDouble();
       System.out.println(" O numero convertido para Fahrenheit é: ");
       System.out.println(celsiusToFahrenheit(celsius));
       leitor.close();
    }
}
