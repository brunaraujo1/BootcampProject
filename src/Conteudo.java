public abstract class Conteudo {
    private String titulo;
    private String descricao;

    // Construtor
    public Conteudo(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

    // Métodos de acesso para o título
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo != null && !titulo.isEmpty()) {
            this.titulo = titulo;
        } else {
            throw new IllegalArgumentException("O título do conteúdo não pode ser nulo ou vazio");
        }
    }

    // Métodos de acesso para a descrição
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if (descricao != null && !descricao.isEmpty()) {
            this.descricao = descricao;
        } else {
            throw new IllegalArgumentException("A descrição do conteúdo não pode ser nula ou vazia");
        }
    }
}
