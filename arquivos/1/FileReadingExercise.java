import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class FileReadingExercise {
    public static void main(String[] args) {
        String fileName = "exemplo.txt"; // Nome do arquivo fixo para leitura
        //String fileName = "src/exemplo.txt";


        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String texto;
            texto = reader.readLine();

            System.out.println("Conteúdo do arquivo 'exemplo.txt':\n");

            while (texto != null) {
                System.out.println(texto);
                texto = reader.readLine();
            }

            System.out.println("\nLeitura do arquivo concluída.");


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
