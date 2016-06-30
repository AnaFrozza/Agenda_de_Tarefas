/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import GUI.CadastrarMorador;
import Model.Morador;
import java.awt.List;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
        
    }
    
    /**
     *
     * @return
     *//*
    public List<Morador> consultarTodos() {
        List<Morador> user = new ArrayList();
        conexaoMysql con = new conexaoMysql();
        Connection conexao = con.conectar();
        
        try{
            String consult = "select * from valet order by entrada";
            PreparedStatement stm = conexao.prepareStatement(consult);
            
            ResultSet rs = stm.executeQuery();
            
            while (rs.next()){    
                Morador morador;
                morador = new Morador(
                        rs.getString("nome"),
                        rs.getInt("idade")
                );
                
                user.add(morador);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            con.desconectar(conexao);
        }
        return user;
    }*/
}
