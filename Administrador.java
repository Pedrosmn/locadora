import java.util.ArrayList;

class Administrador extends Usuario {

    public Administrador(String nome, String login, String senha) {
        super(nome, login, senha);
    }

    public ArrayList<Pedido> visualizarPedidos(Locadora locadora) {
        return locadora.getPedidos();
    }

    public ArrayList<Cliente> visualizarClientes(Locadora locadora) {
        return locadora.getClientes();
    }

    public ArrayList<Filme> visualizarFilmes(Catalogo catalogo) {
        return catalogo.getListaGeral();
    }

    public void adicionarFilme(Catalogo catalogo, Filme filme) {
        catalogo.adicionarFilme(filme);
    }

    public void removerFilme(Catalogo catalogo, Filme filme) {
        catalogo.removerFilme(filme);
    }
}
