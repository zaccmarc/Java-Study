public class Ave extends Animal {
    private String corPena;

    public Ave(String nome, float peso, int idade, String corPena) {
        super(nome, peso, idade);
        this.corPena = corPena;
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Ave");
    }

    public void fazerNinho() {
        System.out.println("Construindo um ninho");
    }
}