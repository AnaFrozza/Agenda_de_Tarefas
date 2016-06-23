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
public class DividirTarefa {
    private String nome;
    private String tarefa;
    private Integer vezesSemana;
    private Integer vezesDia;

    public DividirTarefa(String nome, String tarefa, Integer vezesSemana, Integer vezesDia) {
        this.nome = nome;
        this.tarefa = tarefa;
        this.vezesSemana = vezesSemana;
        this.vezesDia = vezesDia;
    }

    public Integer getVezesSemana() {
        return vezesSemana;
    }

    public void setVezesSemana(Integer vezesSemana) {
        this.vezesSemana = vezesSemana;
    }

    public Integer getVezesDia() {
        return vezesDia;
    }

    public void setVezesDia(Integer vezesDia) {
        this.vezesDia = vezesDia;
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
