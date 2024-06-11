import java.util.ArrayList;

class Filme {
    private String titulo;
    private String diretor;
    private int anoDeLancamento;
    private int duracao;
    private String genero;
    private String classificacaoIndicativa;
    private int disponibilidade;
    private double precoAlocacao;

    public Filme(String titulo, String diretor, int anoDeLancamento, int duracao, String genero, String classificacaoIndicativa, int disponibilidade, double precoAlocacao) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.anoDeLancamento = anoDeLancamento;
        this.duracao = duracao;
        this.genero = genero;
        this.classificacaoIndicativa = classificacaoIndicativa;
        this.disponibilidade = disponibilidade;
        this.precoAlocacao = precoAlocacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public int getDuracao() {
        return duracao;
    }

    public String getGenero() {
        return genero;
    }

    public String getClassificacaoIndicativa() {
        return classificacaoIndicativa;
    }

    public int getDisponibilidade() {
        return disponibilidade;
    }

    public double getPrecoAlocacao() {
        return precoAlocacao;
    }

    public boolean verificarDisponibilidade() {
        return disponibilidade > 0;
    }

    public void atualizarDisponibilidade(int quantidade) {
        this.disponibilidade += quantidade;
    }

    @Override
    public String toString() {
        return "Título: " + titulo +
                ", Diretor: " + diretor +
                ", Ano de Lançamento: " + anoDeLancamento +
                ", Duração: " + duracao + " minutos" +
                ", Gênero: " + genero +
                ", Classificação: " + classificacaoIndicativa +
                ", Disponibilidade: " + disponibilidade +
                ", Preço de Alocação: R$ " + precoAlocacao;
    }
}
