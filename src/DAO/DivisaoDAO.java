/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Divisao;
import GUI.DivisaoInterface;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.sound.midi.Soundbank;

/**
 *
 * @author Ana
 */

public class DivisaoDAO {
    
    String nome;
    String tarefa;
   
    
    public void insertNome(String name){
        nome = name;
        
    }
    
    public void insertTarefa(String task){
        tarefa = task;    
    }
    
    public void insert(){
        conexaoMysql con = new conexaoMysql();
        Connection conexao = con.conectar();
        
        System.out.println(nome);
        try {
            String insert = "insert into divisao (nome, tarefa) values(?,?)";
            PreparedStatement stm = conexao.prepareStatement(insert);
            
            stm.setString(1, nome);
            stm.setString(2, tarefa);
            
            stm.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            con.desconectar(conexao);
        }
        
    }
    
    public void divisao(){
        conexaoMysql con = new conexaoMysql();
        Connection conexao = con.conectar();
        
        try {
            String gerar = "select M.nome, T.tarefa from morador M, tarefa T";
            PreparedStatement stm = conexao.prepareStatement(gerar);
            
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            con.desconectar(conexao);
        }
    }

}
