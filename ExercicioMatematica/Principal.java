public class Principal {
    public static void main(String[] args) {

        Matematica m = new Matematica();

        System.out.println("Resultado int: " + m.somar(2, 3));
        System.out.println("Resultado double: " + m.somar(2.5, 3.5));
        System.out.println("Resultado float: " + m.somar(1.5f, 2.5f));
    }
}