public class Principal {
    public static void main(String[] args) {

        // Criando aluno
        Aluno a = new Aluno();
        a.nome = "Pedro";
        a.RA = 123;

        // Criando livro
        Livro l = new Livro();
        l.ISBN = "1111";
        l.status = "Disponivel";

        // Biblioteca
        Biblioteca b = new Biblioteca();

        // Antes
        System.out.println("ANTES:");
        System.out.println("Livro: " + l.ISBN + " - " + l.status);

        // Emprestar
        b.emprestar(l, a.RA);

        // Depois
        System.out.println("\nDEPOIS:");
        System.out.println("Livro: " + l.ISBN + " - " + l.status);
        System.out.println("Emprestado para RA: " + l.raAluno);
    }
}