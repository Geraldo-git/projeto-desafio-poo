import br.com.dio.desafio.Bootcamp;
import br.com.dio.desafio.Curso;
import br.com.dio.desafio.Dev;
import br.com.dio.desafio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        Curso curso2 = new Curso();

        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        curso2.setTitulo("curso javascript");
        curso2.setDescricao("descricao curso javascript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descricao mentoria de Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos: " + devMaria.getConteudosInscritos());
        devMaria.progredir();
        devMaria.progredir();
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("Conteudos Inscritos: " + devMaria.getConteudosInscritos());
        System.out.println("Conteudos  Concluidos: " + devMaria.getConteudosConcluidos());
        System.out.println("+++++++++++++++");
        System.out.println("XP: "+ devMaria.calcularXp());
        System.out.println("====================================================================================");
        Dev devMario = new Dev();
        devMario.setNome("Mario");
        devMario.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos: " + devMario.getConteudosInscritos());
        devMario.progredir();
        devMario.progredir();
        devMario.progredir();
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("Conteudos Inscritos: " + devMario.getConteudosInscritos());
        System.out.println("Conteudos Concluidos: " + devMario.getConteudosConcluidos());
        System.out.println("+++++++++++++++");
        System.out.println("XP: "+ devMario.calcularXp());

    }
}
