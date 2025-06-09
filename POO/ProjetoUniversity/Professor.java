package POO.ProjetoUniversity;

public class Professor extends Pessoa {
    private String especialidade;
    private float salario;

    public Professor(String nome, int idade, String sexo, String especialidade, float salario) {
        super(nome, idade, sexo);
        this.especialidade = especialidade;
        this.salario = salario;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public final void receberAumento(float aumento) {
        this.salario += aumento;
        System.out.println("Salário aumentado para: " + this.salario);
    }
}