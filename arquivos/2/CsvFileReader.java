import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CsvFileReader {

    public static void main(String[] args) {

        Path filePath = Paths.get("funcionarios.csv");
        //Path filePath = Paths.get("C:\\Projetos\\Holberton Upskilling\\File_Handling\\src\\funcionarios.csv");

        try (BufferedReader br = new BufferedReader(new FileReader(filePath.toString()))){
            String line = br.readLine();

            while (line != null) {
                String[] vect = line.split(",");
                String nome = vect[0];
                String idade = vect[1];
                String departamento = vect[2];
                String salarial = vect[3];

                imprimeLinha(nome, idade, departamento, salarial);

                line = br.readLine();
            }
            System.out.println("Leitura do arquivo concluída.");
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public static void imprimeLinha(String nome, String idade, String departamento, String salarial) {
        System.out.println("Funcionário: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Departamento: " + departamento);
        System.out.println("Salarial: " + salarial);
        System.out.println("------------------------");
    }
}


