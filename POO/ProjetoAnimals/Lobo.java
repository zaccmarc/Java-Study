public class Lobo extends Mamifero {

    public Lobo(String nome, float peso, int idade, int membros, String corPelo) {
        super(nome, peso, idade, membros, corPelo);
    }

    @Override
    public void locomover(){
        sout.println("Correndo");
    }

    @Override
    public void alimentar(){
        sout.println("Mamando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Auuuuuuuuuuuu!");
    }

}