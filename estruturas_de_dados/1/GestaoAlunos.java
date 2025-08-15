import java.util.ArrayList;
import java.util.List;

public class GestaoAlunos {

    private List<Aluno> alunos = new ArrayList<Aluno>();

    public void adicionarAluno(String nome, int idade) {
        Aluno aluno = new Aluno(nome, idade);
        this.alunos.add(aluno);
    }

    public void excluirAluno(String nome) {
        for (Aluno aluno : this.alunos) {
           if (aluno.getNome().equalsIgnoreCase(nome)) {
               this.alunos.remove(aluno);
           }
        }
    }

    public void buscarAluno(String nome) {
        for (Aluno aluno : this.alunos) {
            if (aluno.getNome().equalsIgnoreCase(nome)) {
                System.out.println(aluno);
            }
        }
    }

    public void listarAlunos() {
        for (Aluno aluno : this.alunos) {
            System.out.println(aluno);
        }
    }

}

