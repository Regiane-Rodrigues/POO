/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class ConstrutorJogador {

    public static void main(String[] args) {

        Jogador jogador_1 = new Jogador("Cleber", 24, "Cascavel, Paraná", 'M', 189);
        System.out.println(jogador_1.getNome());
        System.out.println(jogador_1.getIdade());
        System.out.println(jogador_1.getCidade());
        System.out.println(jogador_1.getSexo());
        System.out.println(jogador_1.getAltura());
        
        Time time_1 = new Time("Flamengo", 110, "Rio de Janeiro", "Profissional");
        time_1.CadastrarJogador(jogador_1);
        System.out.println(time_1.getNome());
        System.out.println(time_1.getIdade());
        System.out.println(time_1.getSede());
        System.out.println(time_1.getTipo());
        
        Jogador jogador_2 = new Jogador("Rodrigp", 24, "Cascavel, Paraná", 'M', 177);
        System.out.println(jogador_2.getNome());
        System.out.println(jogador_2.getIdade());
        System.out.println(jogador_2.getCidade());
        System.out.println(jogador_2.getSexo());
        System.out.println(jogador_2.getAltura());
        
        Time time_2 = new Time("São Paulo", 35, "São Paulo", "Reserva");
        time_2.CadastrarJogador(jogador_2);
        System.out.println(time_2.getNome());
        System.out.println(time_2.getIdade());
        System.out.println(time_2.getSede());
        System.out.println(time_2.getTipo());
        
        Jogador jogador_3 = new Jogador("Robson", 22, "Toledo, Paraná", 'M', 185);
        System.out.println(jogador_3.getNome());
        System.out.println(jogador_3.getIdade());
        System.out.println(jogador_3.getCidade());
        System.out.println(jogador_3.getSexo());
        System.out.println(jogador_3.getAltura());
        
        Time time_3 = new Time("Palmeiras", 85, "Minas Gerais", "Profissional");
        time_3.CadastrarJogador(jogador_3);
        System.out.println(time_3.getNome());
        System.out.println(time_3.getIdade());
        System.out.println(time_3.getSede());
        System.out.println(time_3.getTipo());
        
        Jogador jogador_4 = new Jogador("Luiz", 26, "Medianeira, Paraná", 'M', 192);
        System.out.println(jogador_4.getNome());
        System.out.println(jogador_4.getIdade());
        System.out.println(jogador_4.getCidade());
        System.out.println(jogador_4.getSexo());
        System.out.println(jogador_4.getAltura());
        
        Time time_4 = new Time("Atlético Mineiro", 92, "Belo Horizonte","Reservas");
        time_4.CadastrarJogador(jogador_3);
        System.out.println(time_4.getNome());
        System.out.println(time_4.getIdade());
        System.out.println(time_4.getSede());
        System.out.println(time_4.getTipo());
        
        Jogador jogador_5 = new Jogador("Fernando", 21, "Laranjeiras, Paraná", 'M', 178);
        System.out.println(jogador_5.getNome());
        System.out.println(jogador_5.getIdade());
        System.out.println(jogador_5.getCidade());
        System.out.println(jogador_5.getSexo());
        
        Time time_5 = new Time("Corintias", 73, "Sao Paulo", "Profissional");
        time_5.CadastrarJogador(jogador_5);
        System.out.println(time_5.getNome());
        System.out.println(time_5.getIdade());
        System.out.println(time_5.getSede());
        System.out.println(time_5.getTipo());
        
        
       System.out.println("\nOs jogos de hoje serão:");
       System.out.println(time_5.getNome()+" x "+time_3.getNome());
      /* System.out.println("Os jogos de hoje serão:");
       System.out.println("Os jogos de hoje serão:");
       System.out.println("Os jogos de hoje serão:");
       System.out.println("Os jogos de hoje serão:");*/
        

    }

}
