import java.util.*;

public class Blog {

    private ArrayList<Post> posts = new ArrayList<>();

    public void adicionarPostagem(Post post) {
        this.posts.add(post);
    }

    public Set<String> obterTodosAutores() {
        Set<String> autores = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        for (Post p : this.posts) {
            if (!autores.contains(p.getAutor())) {
                autores.add(p.getAutor());
            }
        }

        return autores;
    }

    public Map<String, Integer> obterContagemPorCategoria() {
        Map<String, Integer> unsortedMap  = new HashMap<>();
        for (Post p : this.posts) {
            if (!unsortedMap .containsKey(p.getCategoria())) {
                unsortedMap .put(p.getCategoria(), 1);
            } else {
                int novaKey = unsortedMap .get(p.getCategoria()) + 1;
                unsortedMap .put(p.getCategoria(), novaKey);
            }
        }

        Map<String, Integer> sortedMap = new TreeMap<>(unsortedMap);

        return sortedMap ;
    }
}

