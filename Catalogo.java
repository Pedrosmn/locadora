import java.util.ArrayList;

class Catalogo {
    private ArrayList<Filme> listaGeral;
    private ArrayList<Filme> listaAtual;

    public Catalogo() {
        this.listaGeral = new ArrayList<>();
        this.listaAtual = new ArrayList<>();
    }

    public ArrayList<Filme> getListaGeral() {
        return listaGeral;
    }

    public void adicionarFilme(Filme filme) {
        listaGeral.add(filme);
        listaAtual.add(filme);
    }

    public void removerFilme(Filme filme) {
        listaGeral.remove(filme);
        listaAtual.remove(filme);
    }

    public void rankingAvaliacao() {
        // Implementar lógica de ranking por avaliação
    }
}
