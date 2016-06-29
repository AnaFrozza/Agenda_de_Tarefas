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

import Model.Tarefa;
import Model.Morador;

public class Divisao {

    private String nome;
    private String tarefa;
    
    public Divisao(String nome, String tarefa) {
        this.nome = nome;
        this.tarefa = tarefa;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTarefa() {
        return tarefa;
    }

    public void setTarefa(String tarefa) {
        this.tarefa = tarefa;
    }
    
    
}
