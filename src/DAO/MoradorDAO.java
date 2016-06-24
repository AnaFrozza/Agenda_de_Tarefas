/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import GUI.CadastrarMorador;
import Model.Morador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Ana
 */

//import agendadetarefas.Morador;

public class MoradorDAO {
    public void insert(Morador user){
        conexaoMysql con = new conexaoMysql();
        Connection conexao = con.conectar();
        
        try {
            String insert = "insert into morador (nome, idade) values(?,?)";
            PreparedStatement stm = conexao.prepareStatement(insert);
            
            stm.setString(1, user.getNome());
            stm.setInt(2, user.getIdade());
            
            stm.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            con.desconectar(conexao);
        }
        new CadastrarMorador().setVisible(true);
    }
    
    public void edit(Morador user, String nome){
        conexaoMysql con = new conexaoMysql();
        Connection conexao = con.conectar();
        try{
            String edit = "update morador set nome = ?, idade = ? where nome = ?";
            PreparedStatement stm = conexao.prepareStatement(edit);
            stm.setString(1, user.getNome());
            stm.setInt(2, user.getIdade());
            stm.setString(3, nome);
            System.out.println(user.getNome());
            stm.executeUpdate();
            
        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            con.desconectar(conexao);
        }
    }
    
    public void delet(String nome){
        conexaoMysql con = new conexaoMysql();
        Connection conexao = con.conectar();
        
        try {
            String delet = "delete from morador where nome = ?";
            PreparedStatement stm = conexao.prepareStatement(delet);
            
            stm.setString(1, nome);
            
            stm.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            con.desconectar(conexao);
        }
        new CadastrarMorador().setVisible(true);
    }
}
