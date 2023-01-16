import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso Java");
        curso1.setCargaHoraria(8);
//        System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição do curso JS");
        curso2.setCargaHoraria(4);
 //       System.out.println(curso2);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descricão de mentoria Java");
        mentoria1.setData(LocalDate.now());
  //      System.out.println(mentoria1);

        Conteudo conteudo1 = new Mentoria();
  //      System.out.println(conteudo1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("GFT - Quality Assurance");
        bootcamp.setDescricao("Descrição bootcamp GFT");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devMarcela = new Dev();
        devMarcela.setNome("Marcela");
        devMarcela.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + devMarcela.getConteudosInscritos());
        devMarcela.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos: " + devMarcela.getConteudosInscritos());
        System.out.println("Conteúdos concluídos: " + devMarcela.getConteudosConcluidos());
        System.out.println("XP: " + devMarcela.calcularTotalXP());

        System.out.println("-------------");
        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + devMaria.getConteudosInscritos());
        devMaria.progredir();
        devMaria.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos: " + devMaria.getConteudosInscritos());
        System.out.println("Conteúdos concluídos: " + devMaria.getConteudosConcluidos());
        System.out.println("XP: " + devMaria.calcularTotalXP());


    }
}