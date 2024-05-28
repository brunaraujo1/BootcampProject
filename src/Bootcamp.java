import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Bootcamp {
    private String nome;
    private String descricao;
    private final List<Conteudo> conteudos = new ArrayList<>();
    private final Set<Dev> devsInscritos = new HashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        } else {
            throw new IllegalArgumentException("O nome do bootcamp não pode ser nulo ou vazio");
        }
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if (descricao != null && !descricao.isEmpty()) {
            this.descricao = descricao;
        } else {
            throw new IllegalArgumentException("A descrição do bootcamp não pode ser nula ou vazia");
        }
    }

    public void adicionarConteudo(Conteudo conteudo) {
        conteudos.add(conteudo);
    }

    public void removerConteudo(Conteudo conteudo) {
        conteudos.remove(conteudo);
    }

    public void inscreverDev(Dev dev) {
        devsInscritos.add(dev);
    }

    public void cancelarInscricaoDev(Dev dev) {
        devsInscritos.remove(dev);
    }

    public List<Conteudo> listarConteudos() {
        return new ArrayList<>(conteudos);
    }

    public List<Dev> listarDevsInscritos() {
        return new ArrayList<>(devsInscritos);
    }

    public int calcularCargaHorariaTotal() {
        int cargaHorariaTotal = 0;
        for (Conteudo conteudo : conteudos) {
            if (conteudo instanceof Curso) {
                cargaHorariaTotal += ((Curso) conteudo).getCargaHoraria();
            }
        }
        return cargaHorariaTotal;
    }
}
