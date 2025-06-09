package POO.ProjetoUniversity;

public class Tecnico extends Aluno {
    private int registroProfissional;

    public Tecnico(String nome, int idade, String sexo, int matr, String curso, int registroProfissional) {
        super(nome, idade, sexo, matr, curso);
        this.registroProfissional = registroProfissional;
    }

    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }

    public final void praticar() {
        System.out.println("Técnico " + getNome() + " está praticando suas habilidades.");
    }

    @Override
    public void pagarMensalidade() {
        System.out.println("Pagando mensalidade do técnico " + getNome());
    }

    @Override
    public String toString() {
        return "Tecnico{" +
                "registroProfissional=" + registroProfissional +
                ", nome='" + getNome() + '\'' +
                ", idade=" + getIdade() +
                ", sexo='" + getSexo() + '\'' +
                '}';
    }
}
