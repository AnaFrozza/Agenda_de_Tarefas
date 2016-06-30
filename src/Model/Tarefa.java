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
    String tarefa;
    int vezesSemana;


    public Tarefa(String tarefa, int vezesSemana) {
        this.tarefa = tarefa;
        this.vezesSemana = vezesSemana;
    
    }
    
    public Object[] obterDados(){
        return new Object[]{tarefa, vezesSemana};
    }
    
    public String getTarefa() {
        return tarefa;
    }

    public void setTarefa(String tarefa) {
        this.tarefa = tarefa;
    }

    public int getVezesSemana() {
        return vezesSemana;
    }

    public void setVezesSemana(int vezesSemana) {
        this.vezesSemana = vezesSemana;
    }
    
}
