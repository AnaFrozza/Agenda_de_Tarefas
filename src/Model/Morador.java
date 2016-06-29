/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Ana
 */
public class Morador {
    
    public String nome;
    public Integer idade;

    public Morador(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Object[] obterDados(){
        return new Object[]{nome, idade};
    }
    
    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}

