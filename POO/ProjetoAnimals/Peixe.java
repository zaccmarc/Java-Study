public class Peixe extends Animal {

    private String corEscama;

    public Peixe(String nome, float peso, int idade, int membros, String corEscama){
         super(nome, peso, idade, membros);
         this.corEscama = corEscama;
    }

    public String getCorEscama(){
        return this.corEscama;
    }

    public void setCorEscama(String corEscama){
        this.corEscama = corEscama;
    }

    @Override
    public void locomover(){
        System.out.println("Nadando");
    }

    @Override
    public void alimentar(){
        System.out.println("Comendo substancias");
    }

    @Override
    public void emitirSom(){
        System.out.println("Peixe não faz som");
    }

    public void soltarBolha(){
        System.out.println("Soltando bolha");
    }
}