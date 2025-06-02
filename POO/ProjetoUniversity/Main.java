package POO.ProjetoUniversity;

public class Main {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("João", 20, "M");
        Aluno p2 = new Aluno("Maria", 18, "F", 12345, "Informática");
        Professor p3 = new Professor("Carlos", 45, "M", "Matemática", 5000.00f);
        Funcionario p4 = new Funcionario("Ana", 30, "F", "Administração", true);

        p2.setCurso("Informática");

        p4.setSetor("Estoque");

        System.out.println("Pessoa 1: " + p1.getNome());

        System.out.println("Aluno 2: " + p2.getNome() + ", Curso: " + p2.getCurso()); 

        System.out.println("Professor 3: " + p3.getNome() + ", Salário: " + p3.getSalario());
                                                                                              

        System.out.println("Funcionário 4: " + p4.getNome() + ", Setor: " + p4.getSetor()); 
                                                                                        
    }
}