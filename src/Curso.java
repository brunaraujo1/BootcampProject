public class Curso extends Conteudo {
    private int cargaHoraria;

    // Construtor
    public Curso(String titulo, String descricao, int cargaHoraria) {
        super(titulo, descricao);
        this.setCargaHoraria(cargaHoraria);
    }

    // Métodos de acesso para a carga horária
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        if (cargaHoraria >= 0) {
            this.cargaHoraria = cargaHoraria;
        } else {
            throw new IllegalArgumentException("A carga horária do curso não pode ser negativa");
        }
    }

    // Sobrescrevendo o método toString
    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }

    // Sobrescrevendo o método equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Curso curso = (Curso) o;
        return cargaHoraria == curso.cargaHoraria;
    }
}

