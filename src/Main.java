import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import java.time.LocalDate;
import java.util.Scanner;

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

        boolean continuar = true;
        Scanner scan = new Scanner(System.in);

        while (continuar){
            System.out.println("=== Bootcamp Java Developer ===");
            System.out.println("Bem vindo Italo");
            System.out.println("Selecione uma opção abaixo");
            System.out.println("1. Mostrar lista de atividades pendentes");
            System.out.println("2. Mostrar lista de atividades concluidas");
            System.out.println("3. Concluir a proxima atividade");
            System.out.println("4. Mostrar a quantidade de XP total");
            System.out.println("0. Encerrar");
            int resposta = scan.nextInt();

            switch (resposta){
                case 1:
                    System.out.println("Conteudos Pendentes: "+devItalo.getConteudosInscritos());
                    System.out.println("Aperte enter para prosseguir");
                    scan.nextLine();
                    scan.nextLine();
                    break;
                case 2:
                    System.out.println("Conteudos Concluidos: "+devItalo.getConteudosConcluidos());
                    System.out.println("Aperte enter para prosseguir");
                    scan.nextLine();
                    scan.nextLine();
                    break;
                case 3:
                    devItalo.progredir();
                    System.out.println("Progressao Realizada!!");
                    System.out.println("Aperte enter para prosseguir");
                    scan.nextLine();
                    scan.nextLine();
                    break;
                case 4:
                    System.out.println("XP= "+devItalo.calcularXp());
                    System.out.println("Aperte enter para prosseguir");
                    scan.nextLine();
                    scan.nextLine();
                    break;
                case 0:
                    continuar = false;
                    break;
                default:
                    System.out.println("ERRO: Insira uma opção valida!!");
                    System.out.println("Aperte enter para prosseguir");
                    scan.nextLine();
                    scan.nextLine();
                    break;
            }
        }
        scan.close();
    }
}