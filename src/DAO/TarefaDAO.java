/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Tarefa;
import Model.Morador;
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
            String sql = "insert into tarefa (tarefa, dificuldade, vezesSemana, vezesDias) values(?, ?, ?, ?)";
            PreparedStatement stm = conexao.prepareStatement(sql);
            
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
    
    public void edit(Tarefa homework){
        conexaoMysql con = new conexaoMysql();
        Connection conexao = con.conectar();
        try{
            String atualizar = "update tarefa set tarefa = ? where tarefa = ?";
            PreparedStatement stm = conexao.prepareStatement(atualizar);
            stm.setString(1, homework.getTarefa());
            stm.setString(2, homework.getTarefa());
            stm.executeUpdate(); //executeUpdate devolve inteiro pra saber qtas linhas foram alteradas o execute nao devolve.
        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            con.desconectar(conexao);
        }
    }
    
    
    public void excluir(Tarefa homework){
        conexaoMysql con = new conexaoMysql();
        Connection conexao = con.conectar();
        
        try {
            String sql = "delete from tarefa where tarefa = ?";
            PreparedStatement stm = conexao.prepareStatement(sql);
            
            stm.setString(1, homework.getTarefa());
            
            stm.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            con.desconectar(conexao);
        }
    }  
    
}