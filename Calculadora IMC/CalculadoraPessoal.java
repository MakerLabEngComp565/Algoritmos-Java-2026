import java.util.Scanner;

public class CalculadoraPessoal {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int anoAtual = 2026;
        
        System.out.println("=== CALCULADORA DE IDADE E IMC ===\n");
        
        // Entrada de dados
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        
        System.out.print("Digite seu peso (kg): ");
        double peso = sc.nextDouble();
        
        System.out.print("Digite sua altura (m): ");
        double altura = sc.nextDouble();
        
        int anoNascimento = anoAtual - idade;
        double imc = peso / (altura * altura);
        
        
        double pesoIdeal = 22 * (altura * altura);
        
        // Exibição dos resultados
        System.out.println("\n=== DADOS DE " + nome.toUpperCase() + " ===");
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Ano de nascimento aproximado: " + anoNascimento);
        System.out.printf("Peso: %.1f kg%n", peso);
        System.out.printf("Altura: %.2f m%n", altura);
        System.out.printf("Seu IMC é: %.2f%n", imc);
        
        //  SAÍDA
        System.out.printf("Seu peso ideal (IMC 22) é: %.2f kg%n", pesoIdeal);
      
        sc.close();
    }
}