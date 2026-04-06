public class Gerente {

    public String nome;

    public void atualizar(Funcionario f, String cargo) {
        f.cargo = cargo;
    }

    public void atualizar(Funcionario f, double salario) {
        f.salario = salario;
    }
}