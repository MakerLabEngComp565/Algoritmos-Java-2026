import java.util.Scanner;

public class SistemaSeguro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		//VariÃ¡veis
        
        // Parte 1: ValidaÃ§Ã£o de senha
        
        // Parte 2: Tabuada interativa
        	//VariÃ¡veis 
        final int SENHA_CORRETA = 1234;
        int tentativas = 3;
        boolean acessoPermitido = false;
        
        System.out.println("=== SISTEMA SEGURO ===\n");
        // PARTE 1: VALIDAÃ‡ÃƒO DE SENHA (while)
        while (tentativas > 0 && !acessoPermitido) {
            System.out.print("Digite a senha: ");
            int senhaDigitada = sc.nextInt();
            
            if (senhaDigitada == SENHA_CORRETA) {
                acessoPermitido = true;
                System.out.println("\nSenha correta! Acesso permitido.\n");
            } else {
                tentativas--;
                if (tentativas > 0) {
                    System.out.println("Senha incorreta! Tentativas restantes: " + tentativas);
                } else {
                    System.out.println("Acesso bloqueado! NÃºmero mÃ¡ximo de tentativas excedido.");
                }
            }
        }
        
        // PARTE 2: TABUADA INTERATIVA (for + while)
        if (acessoPermitido) {
            System.out.println("=== TABUADA INTERATIVA ===\n");
            
            char continuar = 's';
            
            while (continuar == 's' || continuar == 'S') {
                
                int numero = 0;
                boolean numeroValido = false;
                
                // ValidaÃ§Ã£o de nÃºmero (Desafio extra)
                while (!numeroValido) {
                    System.out.print("Digite um nÃºmero para ver a tabuada: ");
                    numero = sc.nextInt();
                    
                    if (numero < 0) {
                        System.out.println("NÃºmero invÃ¡lido! Digite um nÃºmero positivo.");
                    } else {
                        numeroValido = true;
                    }
                }
                
                // Exibe a tabuada com for
                System.out.println("\n--- Tabuada do " + numero + " ---");
                for (int i = 1; i <= 10; i++) {
                    int resultado = numero * i;
                    System.out.printf("%d x %2d = %3d\n", numero, i, resultado);
                }
                
                // Pergunta se quer continuar
                System.out.print("\nDeseja ver outra tabuada? (s/n): ");
                continuar = sc.next().charAt(0);
                System.out.println();
            }
            
            System.out.println("Programa encerrado. Volte sempre!");
        }
        
        sc.close();
    }
}