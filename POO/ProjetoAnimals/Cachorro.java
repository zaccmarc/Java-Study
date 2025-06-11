package POO.ProjetoAnimals;

public class Cachorro extends Mamifero {

    public Cachorro(String nome, int idade, Sring corPelo) {
        super(nome, idade, corPelo);
    }

    @Override
    public void locomover(){
        System.out.println(this.nome + " está correndo.");
    }

    @Override
    public void alimentar(){
        System.out.println(this.nome + " está comendo.");
    }

    @Override
    public void emitirSom() {
        System.out.println("Au au!");
    }

    public void enterrarOsso() {
        System.out.println(this.nome + " enterrou um osso.");
    }

    public void abanarRabo() {
        System.out.println(this.nome + " está abanando o rabo.");
    }
}