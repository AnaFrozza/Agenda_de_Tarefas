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
    
    public void insert(Tarefa task){
        conexaoMysql con = new conexaoMysql();
        Connection conexao = con.conectar();
        
        try {
            String insert = "insert into tarefa (tarefa, vezesSemana) values(?, ?)";
            PreparedStatement stm = conexao.prepareStatement(insert);
            
            stm.setString(1, task.getTarefa());
            stm.setInt(2, task.getVezesSemana());
            
            
            stm.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            con.desconectar(conexao);
        }
        
    }
    
    public void edit(Tarefa task, String tarefa){
        conexaoMysql con = new conexaoMysql();
        Connection conexao = con.conectar();
        try{
            String edit = "update tarefa set tarefa = ?, vezesSemana = ? where tarefa = ?";
            PreparedStatement stm = conexao.prepareStatement(edit);
            stm.setString(1, task.getTarefa());
            stm.setInt(2, task.getVezesSemana());
            stm.setString(3, tarefa);
            
            stm.executeUpdate(); 
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