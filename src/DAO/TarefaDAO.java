/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import GUI.CadastrarTarefa;
import Model.Tarefa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Ana
 */
public class TarefaDAO {
    
    public void insert(Tarefa homework){
        conexaoMysql con = new conexaoMysql();
        Connection conexao = con.conectar();
        
        try {
            String insert = "insert into tarefa (tarefa, dificuldade, vezesSemana, vezesDia) values(?, ?, ?, ?)";
            PreparedStatement stm = conexao.prepareStatement(insert);
            
            stm.setString(1, homework.getTarefa());
            stm.setInt(2, homework.getDificuldade());
            stm.setInt(3, homework.getVezesSemana());
            stm.setInt(4, homework.getVezesDia());
            
            stm.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            con.desconectar(conexao);
        }
        
    }
    
    public void edit(Tarefa homework, String tarefa){
        conexaoMysql con = new conexaoMysql();
        Connection conexao = con.conectar();
        try{
            String edit = "update tarefa set tarefa = ?, dificuldade = ?, vezesSemana = ?, vezesDia = ? where tarefa = ?";
            PreparedStatement stm = conexao.prepareStatement(edit);
            stm.setString(1, homework.getTarefa());
            stm.setInt(2, homework.getDificuldade());
            stm.setInt(3, homework.getVezesSemana());
            stm.setInt(4, homework.getVezesDia());
            stm.setString(5, tarefa);
            
            stm.executeUpdate(); //executeUpdate devolve inteiro pra saber qtas linhas foram alteradas o execute nao devolve.
        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            con.desconectar(conexao);
        }
    }
    
    
    public void delet(String tarefa){
        conexaoMysql con = new conexaoMysql();
        Connection conexao = con.conectar();
        
        try {
            String delet = "delete from tarefa where tarefa = ?";
            PreparedStatement stm = conexao.prepareStatement(delet);
            
            stm.setString(1, tarefa);
            
            stm.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            con.desconectar(conexao);
        }
        
    }  
    
}