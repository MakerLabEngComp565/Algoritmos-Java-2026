public class RoboSimples {

    char direcao;

    public RoboSimples(char d) {
        if (d == 'N' || d == 'S' || d == 'L' || d == 'O') {
            direcao = d;
        } else {
            direcao = 'N';
        }
    }

    public void mostrar() {
        System.out.println("Direção: " + direcao);
    }
}