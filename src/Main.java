import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descricao curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descricao curso JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descricao mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devItalo = new Dev();
        devItalo.setNome("Italo");
        devItalo.inscreverBootcamp(bootcamp);
        System.out.println("Italo Conteudos Intcritos:"+ devItalo.getConteudosInscritos());
        System.out.println("Progressao realizada!!");
        devItalo.progredir();
        System.out.println("Progressao realizada!!");
        devItalo.progredir();
        System.out.println("Italo Conteudos Intcritos:"+ devItalo.getConteudosInscritos());
        System.out.println("Italo Conteudos Concluidos:"+ devItalo.getConteudosConcluidos());
        System.out.println("XP: "+ devItalo.calcularXp());

        System.out.println("----------");

        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp);
        System.out.println("Progressao realizada!!");
        devMaria.progredir();
        System.out.println("Maria Conteudos Intcritos:"+ devMaria.getConteudosInscritos());
        System.out.println("Maria Conteudos Concluidos:"+ devMaria.getConteudosConcluidos());
        System.out.println("XP: "+ devMaria.calcularXp());

    }
}