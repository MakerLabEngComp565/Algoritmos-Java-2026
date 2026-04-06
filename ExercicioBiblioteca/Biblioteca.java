public class Biblioteca {

    public void emprestar(Livro livro, int RA) {
        livro.raAluno = RA;
        livro.status = "Emprestado";
    }
}
