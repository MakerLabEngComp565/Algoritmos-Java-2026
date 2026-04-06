import java.util.Scanner;

public class MenuCalculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Exibir menu
        System.out.println("=== CALCULADORA ===");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("5 - Sair");
        System.out.print("Escolha uma opÃ§Ã£o: ");
        
        int opcao = sc.nextInt();
        
        // Switch para as opÃ§Ãµes
        // Switch para as opÃ§Ãµes
        switch (opcao) {
            case 1:
                System.out.println("\n--- SOMA ---");
                System.out.print("Digite o primeiro nÃºmero: ");
                double num1 = sc.nextDouble();
                System.out.print("Digite o segundo nÃºmero: ");
                double num2 = sc.nextDouble();
                double soma = num1 + num2;
                System.out.printf("Resultado: %.2f + %.2f = %.2f\n", num1, num2, soma);
                break;
                
            case 2:
                System.out.println("\n--- SUBTRAÃ‡ÃƒO ---");
                System.out.print("Digite o primeiro nÃºmero: ");
                num1 = sc.nextDouble();
                System.out.print("Digite o segundo nÃºmero: ");
                num2 = sc.nextDouble();
                double subtracao = num1 - num2;
                System.out.printf("Resultado: %.2f - %.2f = %.2f\n", num1, num2, subtracao);
                break;
                
            case 3:
                System.out.println("\n--- MULTIPLICAÃ‡ÃƒO ---");
                System.out.print("Digite o primeiro nÃºmero: ");
                num1 = sc.nextDouble();
                System.out.print("Digite o segundo nÃºmero: ");
                num2 = sc.nextDouble();
                double multiplicacao = num1 * num2;
                System.out.printf("Resultado: %.2f x %.2f = %.2f\n", num1, num2, multiplicacao);
                break;
                
            case 4:
                System.out.println("\n--- DIVISÃƒO ---");
                System.out.print("Digite o numerador: ");
                num1 = sc.nextDouble();
                System.out.print("Digite o denominador: ");
                num2 = sc.nextDouble();
                
                // VerificaÃ§Ã£o de divisÃ£o por zero
                if (num2 == 0) {
                    System.out.println("Erro: NÃ£o Ã© possÃ­vel dividir por zero!");
                } else {
                    double divisao = num1 / num2;
                    System.out.printf("Resultado: %.2f / %.2f = %.2f\n", num1, num2, divisao);
                }
                break;
                
            case 5:
                System.out.println("\nEncerrando programa...");
                break;
                
            default:
                System.out.println("\nOpÃ§Ã£o invÃ¡lida!");
        }
        sc.close();
    }
}