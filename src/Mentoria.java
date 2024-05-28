import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private LocalDate data;

    // Construtor
    public Mentoria(String titulo, String descricao, LocalDate data) {
        super(titulo, descricao);
        this.setData(data);
    }

    // Métodos de acesso para a data
    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        if (data != null && !data.isAfter(LocalDate.now())) {
            this.data = data;
        } else {
            throw new IllegalArgumentException("A data da mentoria deve ser uma data válida e não futura");
        }
    }

    // Sobrescrevendo o método toString
    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}

