import java.time.LocalDate;

/**
 * Desafio: Aprenda na Prática Programação Orientada a Objetos
 * Autora: Bruna Araujo
 * Data: 2024-05-28
 */
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Java Básico", "Aprenda os conceitos básicos de Java", 20);

        Curso curso2 = new Curso("Java Avançado", "Aprenda os conceitos avançados de Java", 40);

        Mentoria mentoria1 = new Mentoria("Mentoria de Java", "Mentoria sobre práticas em Java", LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.adicionarConteudo(curso1);
        bootcamp.adicionarConteudo(curso2);
        bootcamp.adicionarConteudo(mentoria1);

        Dev dev1 = new Dev();
        dev1.setNome("Fulano");
        bootcamp.inscreverDev(dev1);
        System.out.println("Conteúdos Inscritos Fulano:" + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Fulano:" + dev1.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Fulano:" + dev1.getConteudosConcluidos());
        System.out.println("XP:" + dev1.calcularTotalXp());

        Dev dev2 = new Dev();
        dev2.setNome("Ciclano");
        bootcamp.inscreverDev(dev2);
        System.out.println("Conteúdos Inscritos Ciclano:" + dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Ciclano:" + dev2.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Ciclano:" + dev2.getConteudosConcluidos());
        System.out.println("XP:" + dev2.calcularTotalXp());
    }
}


