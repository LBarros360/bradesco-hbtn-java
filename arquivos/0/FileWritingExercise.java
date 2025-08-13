import java.io.*;
import java.util.Scanner;


public class FileWritingExercise {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Solicita o nome do arquivo
        System.out.print("Digite o nome do arquivo (com extensão .txt): ");
        String fileName = scanner.nextLine();
        String path = "C:\\Projetos\\Holberton Upskilling\\File_Handling\\" + fileName;
        String texto;

        //File file = new File(path);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            do {
                texto = scanner.nextLine();
                if (!texto.equalsIgnoreCase("sair")) {
                    bw.write(texto);
                    bw.write("\n");
                }

            } while (!texto.equalsIgnoreCase("sair"));

            System.out.printf("O arquivo \s foi salvo com sucesso!", fileName);
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
