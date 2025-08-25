import java.util.ArrayList;
import java.util.List;

public class ManipularArrayNumeros {

    public static int buscarPosicaoNumero(List<Integer> lista, int busca) {

        int controle = -1;
        for (int i = 0; i<lista.size(); i++) {
            if (lista.get(i) == busca) {
                controle = i;
                break;
            }
        }
        return controle;
    }

    public static void adicionarNumero(List<Integer> lista, int num) throws Exception {

        if (buscarPosicaoNumero(lista, num) == -1) {
            lista.add(num);
        } else {
            throw new Exception("Numero jah contido na lista");
        }
    }

    public static void removerNumero(List<Integer> lista, int num) throws Exception {

        int index = buscarPosicaoNumero(lista, num);
        if (index != -1) {
            lista.remove(index);
        } else {
            throw new Exception("Numero nao encontrado na lista");
        }
    }


    public static void substituirNumero(List<Integer> lista, int num1, int num2) {
        int index = buscarPosicaoNumero(lista, num1);

        if (index != -1) {
            lista.set(index, num2);
        } else {
            lista.add(num2);
        }
    }
}

