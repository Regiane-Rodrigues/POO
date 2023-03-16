/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class Time {

    public String nomeTime;
    public int idadeTime;
    public String sedeJogos;
    public String tipo;
    Jogador jogador_1;
    Jogador jogador_2;
    Jogador jogador_3;
    Jogador jogador_4;
    Jogador jogador_5;
    
     
      public Time(String aNome, int aIdade,String SedeJogos,String Tipo){

        nomeTime = aNome;
        idadeTime = aIdade;
        sedeJogos = SedeJogos;
        tipo = Tipo;
        
    }

   

    public String getNome() {
        
        return "Time: " +nomeTime;

    }
    
     public String getIdade() {
        
        return "Idade do time: " +idadeTime;

    }
     
     public String getSede() {
        
        return "Sede dos Jogos: " +sedeJogos;

    }
     
     
      public String getTipo() {
        
        return "Genero do jogador: " +tipo;

    }
      
   
    public void CadastrarJogador(Jogador aJogador){
         jogador_1 = aJogador;
         jogador_2 = aJogador;
         jogador_3 = aJogador;
         jogador_4 = aJogador;
         jogador_5 = aJogador;
     }
      
      
      
      
}
