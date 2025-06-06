package POO.ProjetoUniversity;

public class Aluno extends Pessoa { // Assuming 'Pessoa' is the correct class name
    private int matr;
    private String curso;

    public Aluno(String nome, int idade, String sexo, int matr, String curso) {
        super(nome, idade, sexo);
        this.matr = matr;
        this.curso = curso;
    }

    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void cancelarMatr() {
        System.out.println("Matrícula será cancelada");
        this.matr = 0;
        System.out.println("Matrícula cancelada com sucesso!");
        this.curso = null;
    }
}
