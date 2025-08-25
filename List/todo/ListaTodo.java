import java.util.ArrayList;

public class ListaTodo {

    private ArrayList<Tarefa> tarefas;

    public ListaTodo() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa (Tarefa tarefa) {
        if (tarefaExistente(tarefa)) {
            String msg = "Tarefa com identificador " + tarefa.getIdentificador() + " ja existente na lista";
            throw new IllegalArgumentException(msg);
        } else if (tarefa.getDescricao().equals("") || tarefa.getDescricao().isEmpty() || tarefa.getDescricao().isBlank() || tarefa.getDescricao() == null) {
            throw new IllegalArgumentException("Descricao de tarefa invalida");
        }else {
            this.tarefas.add(tarefa);
        }

    }

    private boolean tarefaExistente(Tarefa tarefa) {

        for (int i = 0; i < this.tarefas.size(); i++) {
            if (this.tarefas.get(i).getIdentificador() == tarefa.getIdentificador()) {
                return true;
            }
        }

        return false;
    }

    public boolean marcarTarefaFeita(int identificador) {
        for (int i = 0; i < this.tarefas.size(); i++) {
            if (this.tarefas.get(i).getIdentificador() == identificador) {
                this.tarefas.get(i).setEstahFeita(true);
                return true;
            }
        }
        return false;
    }

    public boolean desfazerTarefa(int identificador) {
        for (int i = 0; i < this.tarefas.size(); i++) {
            if (this.tarefas.get(i).getIdentificador() == identificador) {
                this.tarefas.get(i).setEstahFeita(false);
                return true;
            }
        }
        return false;
    }

    public void desfazerTodas() {
        for (Tarefa f : this.tarefas) {
            f.setEstahFeita(false);
        }
    }

    public void fazerTodas() {
        for (Tarefa f : this.tarefas) {
            f.setEstahFeita(true);
        }
    }

    public void listarTarefas() {
        for (Tarefa f : this.tarefas) {
            String feita = " ";
            if(f.isEstahFeita()) {
                feita = "X";
            } else {
                feita = " ";
            }
            //System.out.printf("[%s" + "] Id: %n - Descricao: %s\n", feita, f.getIdentificador(), f.getDescricao());
            System.out.println("[" + feita + "]  Id: " + f.getIdentificador() + " - Descricao: " + f.getDescricao());
        }
    }
}

