package POO.ProjetoUniversity;

public class Visitante extends Pessoa {

    public Visitante(String nome, int idade, String sexo) {
        super(nome, idade, sexo);
    }

    @Override
    public String toString() {
        return "Visitante{" +
                "nome='" + getNome() + '\'' +
                ", idade=" + getIdade() +
                ", sexo='" + getSexo() + '\'' +
                '}';
    }
}
