import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Random;

public class ProcessamentoDePagamentos {

    // Logger SLF4j
    private static final Logger logger = LoggerFactory.getLogger(ProcessamentoDePagamentos.class);

    public static void main(String[] args) {

        Random r = new Random();
        for (int i = 1; i < 6; i++) {
            processa(i, r.nextInt(3));
        }

        logger.info("Processamento de pagamentos concluído.");

    }

    static void processa(int id, int status) {

        logger.info("Iniciando o processamento do pagamento " + id);

        try {
            Thread.sleep(1000);

            switch (status) {
                case 0:
                    logger.info("Pagamento " + id + " processado com sucesso."); ;
                    break;
                case 1:
                    logger.error("Erro ao processar o pagamento " + id + ": Falha na transação.");
                    break;
                case 2:
                    logger.warn("Pagamento " + id + " está pendente. Aguardando confirmação.");
                    break;

                default:
                    logger.error("Falha critica!");
                    break;
            }
        } catch (InterruptedException e) {
            logger.error("Falha: " + e);
        }
    }
}
