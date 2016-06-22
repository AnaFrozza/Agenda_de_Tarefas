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
public class Tarefa {
    char tarefa;
    int dificuldade;
    int vezesSemana;
    int vezesDia;

    public Tarefa(char tarefa, int dificuldade, int vezesSemana, int vezesDia) {
        this.tarefa = tarefa;
        this.dificuldade = dificuldade;
        this.vezesSemana = vezesSemana;
        this.vezesDia = vezesDia;
    }

    public char getTarefa() {
        return tarefa;
    }

    public void setTarefa(char tarefa) {
        this.tarefa = tarefa;
    }

    public int getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }

    public int getVezesSemana() {
        return vezesSemana;
    }

    public void setVezesSemana(int vezesSemana) {
        this.vezesSemana = vezesSemana;
    }

    public int getVezesDia() {
        return vezesDia;
    }

    public void setVezesDia(int vezesDia) {
        this.vezesDia = vezesDia;
    }
    
    
}
