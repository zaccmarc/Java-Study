package POO;

public class Main {
    public static void main(String[] args) {
        // Instanciando objetos
        ControleRemoto controle = new ControleRemoto();
        // Testando o controle remoto
        controle.ligar();
        controle.abrirMenu();
        controle.maisVolume();
        controle.menosVolume();
    }
}
