import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CsvFileReader {

    public static void main(String[] args) {
        //Path filePath = Paths.get("funcionarios.csv");
        Path filePath = Paths.get("C:\\Projetos\\Holberton Upskilling\\File_Handling\\src\\funcionarios.csv");

        try (BufferedReader br = new BufferedReader(new FileReader(filePath.toString()))) {

            String line = br.readLine();


        } catch (IOException e) {
//        System.out.println("Erro: " + e.getMessage());
        }

    }
}


