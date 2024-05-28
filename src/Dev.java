import java.util.LinkedHashSet;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();
    private Set<Bootcamp> bootcampsInscritos = new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public Set<Bootcamp> getBootcampsInscritos() {
        return bootcampsInscritos;
    }

    public void inscreverConteudo(Conteudo conteudo) {
        if (!conteudosInscritos.contains(conteudo)) {
            conteudosInscritos.add(conteudo);
        }
    }

    public void concluirConteudo(Conteudo conteudo) {
        if (conteudosInscritos.contains(conteudo)) {
            conteudosConcluidos.add(conteudo);
            conteudosInscritos.remove(conteudo);
        }
    }

    public boolean estaInscrito(Conteudo conteudo) {
        return conteudosInscritos.contains(conteudo);
    }

    public void inscreverBootcamp(Bootcamp bootcamp) {
        bootcampsInscritos.add(bootcamp);
        bootcamp.inscreverDev(this);
    }

    public void removerBootcamp(Bootcamp bootcamp) {
        bootcampsInscritos.remove(bootcamp);
        bootcamp.cancelarInscricaoDev(this);
    }

    public void progredir() {
        if (!conteudosInscritos.isEmpty()) {
            Conteudo conteudo = conteudosInscritos.iterator().next();
            concluirConteudo(conteudo);
        } else {
            System.err.println("Você não está inscrito em nenhum conteúdo!");
        }
    }

    public double calcularTotalXp() {
        return conteudosConcluidos
                .stream()
                .mapToDouble(this::calcularXpConteudo)
                .sum();
    }

    private double calcularXpConteudo(Conteudo conteudo) {
        if (conteudo instanceof Curso) {
            return ((Curso) conteudo).getCargaHoraria() * 10;
        } else if (conteudo instanceof Mentoria) {
            return 20;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Dev{" +
                "nome='" + nome + '\'' +
                ", conteudosInscritos=" + conteudosInscritos +
                ", conteudosConcluidos=" + conteudosConcluidos +
                '}';
    }
}
