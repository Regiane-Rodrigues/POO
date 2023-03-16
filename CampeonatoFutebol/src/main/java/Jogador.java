/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class Jogador {

    private String nome;
    private int idade;
    private String cidade;
    private char sexo;
    private int altura;

    public Jogador(String aNome, int aIdade, String aCidade,char aSexo, int Altura){

        nome = aNome;
        idade = aIdade;
        cidade = aCidade;
        sexo = aSexo;
        altura = Altura;
    }

   

    public String getNome() {
        
        return "\nNome do jogador: " +nome;

    }
    
     public String getIdade() {
        
        return "Idade do jogador: " +idade;

    }
     
     public String getCidade() {
        
        return "Cidade do jogador: " +cidade;

    }
     
     
      public String getSexo() {
        
        return "Genero do jogador: " +sexo;

    }
      
      public String getAltura() {
        
        return "Altura do jogador: " +altura;

    }
     

      
}

    
    

