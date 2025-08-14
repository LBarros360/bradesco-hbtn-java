
import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;

public class Estoque {

    private List<Produto> produtos = new ArrayList<>();
    private String arquivo = "estoque.csv";
    //Uso local
    //private Path filePath = Paths.get("C:/Projetos/Holberton Upskilling/File_Handling/src");


    public Estoque(String arquivo) {
        this.arquivo = arquivo;
    }

    /**
     * Adiciona um produto no estoque
     *
     * @param nome
     * @param quantidade
     * @param preco
     */

    public void adicionarProduto(String nome, int quantidade, double preco) {

        List<Produto> produtos = new ArrayList<>();
        int idDisponivel;
        produtos = lerArquivo(this.arquivo);
        //Local
        //produtos = lerArquivo(this.filePath + "/estoque.csv");

        idDisponivel = produtos.size() + 1;
        Produto produto = new Produto(idDisponivel, nome, quantidade, preco);
        produtos.add(produto);

        gravarArquivo(produtos);

    }

    /**
     * Verifica se o produto existe no arquivo atraves do id passado, se existir remove o produto do arquivo
     * @param idExcluir
     */
    public void excluirProduto(int idExcluir) {

        if (verificaId(idExcluir)) {
            List<Produto> produtosLista = new ArrayList<>();
            //Local
            //produtosLista = lerArquivo(this.filePath + "/" + arquivo);
            produtosLista = lerArquivo(arquivo);

            Iterator<Produto> iterator = produtosLista.iterator();
            while (iterator.hasNext()) {
                if (iterator.next().getId() == idExcluir) {
                    iterator.remove();
                    System.out.println("###Linha Removida: ");
                    break;
                }
            }


            gravarArquivo(produtosLista);
            exibirEstoque();


            //System.out.println("Produto de id: " + idExcluir + "excluido com sucesso");
        } else {
            System.out.println("Item inexistente");
        }
    }


    /**
     * Imprime o conteudo do arquivo
     *      */
    public void exibirEstoque() {
        List<Produto> produtosLista = new ArrayList<>();
        //Local
        //produtosLista = lerArquivo(this.filePath + "/" + arquivo);
        produtosLista = lerArquivo(arquivo);

        if (produtosLista.isEmpty()) {
            System.out.println("Sem registros para listagem, arquivo sem contúdo!");
        } else {
            for (Produto p : produtosLista) {
                System.out.println(p);
            }
        }
    }


    public void atualizarQuantidade(int idAtualizar, int novaQuantidade) {

        if (verificaId(idAtualizar)) {
            List<Produto> produtosLista = new ArrayList<>();
            //Local
            //produtosLista = lerArquivo(this.filePath + "/" + arquivo);
            produtosLista = lerArquivo(this.arquivo);

            for (Produto p : produtosLista ) {
                if (p.getId() == idAtualizar) {
                    p.setQuantidade(novaQuantidade);
                    System.out.println("###Quantidade atualizada: ");
                    break;
                }
            }

            gravarArquivo(produtosLista);
            exibirEstoque();
        }
    }

    /**
     * Lê o arquivo de estoque e retorna o conteudo das linhas em forma de Lista
     * @param path
     * @return Lista de produtos no estoque
     */
    private List<Produto> lerArquivo(String path) {

        List<Produto> produtosLista = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String line;
            line = br.readLine();
            while (line != null && !line.isEmpty()) {
                String[] vet = line.split(",");
                int id = Integer.parseInt(vet[0]);
                String nome = vet[1];
                int quantidade = Integer.parseInt(vet[2]);
                double preco = Double.parseDouble(vet[3]);

                Produto prod = new Produto(id, nome, quantidade, preco);
                produtosLista.add(prod);

                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (InputMismatchException e2) {
            System.out.println("Erro de entrada, tente novamente");
        }

        return produtosLista;
    }

    /**
     * Sobreescreve o arquivo estoque com a lista recebida.
     * @param lista
     */
    private  void gravarArquivo (List<Produto> lista) {

        //Local
        //String path = this.filePath  + "/estoque.csv";
        String path = this.arquivo;

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            for (Produto p : lista ) {
                bw.write(p.toCsv());
                bw.write("\n");
            }

            System.out.println("O arquivo foi salvo com sucesso!");

        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    /**
     * Verifica se o id informado existe na lista
     * @param id
     * @return true se o id existe na lista, false caso contrario
     */
    public boolean verificaId(int id) {

        boolean idEncontrado = false;
        List<Produto> produtosLista = new ArrayList<>();
        //Local
        //produtosLista = lerArquivo(this.filePath + "/" + arquivo);
        produtosLista = lerArquivo(this.arquivo);

        for (Produto p : produtosLista) {
            if (p.getId() == id) {
                idEncontrado = true;
                return idEncontrado;
            }
        }

        return idEncontrado;

    }

    public void imprimeListaDeProdutos(List<Produto> lista) {
        for (Produto p : lista ) {
            System.out.println(p);
        }
    }

    public String getArquivo() {
        return arquivo;
    }

    public void setArquivo(String arquivo) {
        this.arquivo = arquivo;
    }
}

