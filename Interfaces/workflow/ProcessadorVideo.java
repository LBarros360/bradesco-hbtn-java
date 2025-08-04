import java.util.ArrayList;
import java.util.Iterator;

public class ProcessadorVideo {

    ArrayList<CanalNotificacao> canais = new ArrayList<>();

    public void registrarCanal(CanalNotificacao canal) {
        if (canal != null) {
            canais.add(canal);
        } else {
            throw new IllegalArgumentException("Canal nao pode ser nullo");
        }
    }

    public void processar(Video video) {
        int i = 0;
        for (CanalNotificacao canal: canais) {
            Mensagem m = new Mensagem(video.getArquivo() + " - " + video.getFormato(), TipoMensagem.LOG);
            canais.get(i).notificar(m);
            i++;
        }
    }

}


