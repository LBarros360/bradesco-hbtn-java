import atividades.Atividade;

import java.util.ArrayList;
import java.util.List;

public class Workflow {

    List<Atividade> listaAtividade = new ArrayList<>();

    public void registrarAtividade(Atividade atividade) {
        this.listaAtividade.add(atividade);
    }

    public List<Atividade> getListaAtividade() {
        return listaAtividade;
    }

    public void setListaAtividade(List<Atividade> listaAtividade) {
        this.listaAtividade = listaAtividade;
    }
}

