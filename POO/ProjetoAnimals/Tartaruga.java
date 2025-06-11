public class Tartaruga extends Reptil {

    private int velocidade;

    public Tartaruga(String nome, int idade, double peso, String corEscama, int velocidade) {
        super(nome, idade, peso, corEscama);
        this.velocidade = velocidade;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public void locomover() {
        System.out.println("Tartaruga " + this.getNome() + " se movendo lentamente...");
    }

    @Override
    public void alimentar() {
        System.out.println("Tartaruga " + this.getNome() + " comendo algas e vegetais...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Tartaruga " + this.getNome() + " emitindo som (som de tartaruga)...");
    }

    @Override
    public String toString() {
        return "Tartaruga{" +
                "nome='" + this.getNome() + '\'' +
                ", idade=" + this.getIdade() +
                ", peso=" + this.getPeso() +
                ", corEscama='" + this.getCorEscama() + '\'' +
                ", velocidade=" + velocidade +
                '}';
    }
}