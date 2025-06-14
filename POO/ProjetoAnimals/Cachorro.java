package POO.ProjetoAnimals;

public class Cachorro extends Lobo {

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

    
    public void reagir(String frase){
        if(frase.equals("Toma comida") || frase.equals("Olá")){
            System.out.println("Abanar e latir");
        } else {
            System.out.println("Rosnar");
        }
    }

    public void reagir(int hora, int min){
        if(hora < 12){
            System.out.println("Abanar");
        } else if(hora >= 18){
            System.out.println("Ignorar");
        } else {
            System.out.println("Abanar e latir");
        }
    }

    public void reagir(boolean dono){
        if(dono){
            System.out.println("Abanar");
        } else {
            System.out.println("Rosnar e latir");
        }
    }

    public void enterrarOsso() {
        System.out.println(this.nome + " enterrou um osso.");
    }

    public void abanarRabo() {
        System.out.println(this.nome + " está abanando o rabo.");
    }
}