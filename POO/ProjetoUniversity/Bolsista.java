package POO.ProjetoUniversity;

public class Bolsista extends Aluno {
    private float bolsa;

    public Bolsista(String nome, int idade, String sexo, int matr, String curso, float bolsa) {
        super(nome, idade, sexo, matr, curso);
        this.bolsa = bolsa;
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

    public void renovarBolsa() {
        System.out.println("Renovando bolsa de " + getNome() + " com " + bolsa + "%");
    }
    
    @Override
    public void pagarMensalidade() {
        System.out.println("Pagando mensalidade do bolsista " + getNome() + " com bolsa de " + getBolsa() + "%");
    }

    @Override
    public String toString() {
        return "Bolsista{" +
                "nome='" + getNome() + '\'' +
                ", idade=" + getIdade() +
                ", sexo='" + getSexo() + '\'' +
                ", matr=" + getMatr() +
                ", curso='" + getCurso() + '\'' +
                ", bolsa=" + bolsa +
                '}';
    } 

}
