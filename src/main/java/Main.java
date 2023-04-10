import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso SQL");
        curso2.setDescricao("descrição curso SQL");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devWesley = new Dev();
        devWesley.setNome("Camila");
        devWesley.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devWesley.getConteudosInscritos());
        devWesley.progredir();
        devWesley.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devWesley.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devWesley.getConteudosConcluidos());
        System.out.println("XP:" + devWesley.calcularTotalXp());

        System.out.println("-------");

        Dev devHerison = new Dev();
        devHerison.setNome("Joao");
        devHerison.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devHerison.getConteudosInscritos());
        devHerison.progredir();
        devHerison.progredir();
        devHerison.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devHerison.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devHerison.getConteudosConcluidos());
        System.out.println("XP:" + devHerison.calcularTotalXp());

    }

}
