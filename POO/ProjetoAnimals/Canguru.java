package POO.ProjetoAnimals;

public class Canguru extends Mamifero {

    public Canguru(float peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros, corPelo);
    }

    public void usarBolsa() {
        System.out.println("Usando a bolsa para carregar o filhote.");
    }

    @Override
    public void locomover() {
        System.out.println("Saltando");
    }

    @Override
    public void alimentar(){
        System.out.println("Comendo folhas");
    }

    @Override
    public void emitirSom(){
        System.out.println("Som de Canguru");
    }
}