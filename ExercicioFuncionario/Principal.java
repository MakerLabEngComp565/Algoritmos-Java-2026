public class Principal {
    public static void main(String[] args) {

        Funcionario f = new Funcionario();
        f.nome = "João";
        f.cargo = "Auxiliar";
        f.salario = 1500;

        Gerente g = new Gerente();

        System.out.println("Antes:");
        System.out.println(f);

        g.atualizar(f, "Supervisor");
        g.atualizar(f, 3000);

        System.out.println("Depois:");
        System.out.println(f);
    }
}