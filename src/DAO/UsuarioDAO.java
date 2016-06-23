/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Ana
 */

//import agendadetarefas.Usuario;

public class UsuarioDAO {
    public void insert(Usuario user){
        conexaoMysql con = new conexaoMysql();
        Connection conexao = con.conectar();
        
        try {
            String sql = "insert into morador (nome, idade) values(?, ?)";
            PreparedStatement stm = conexao.prepareStatement(sql);
            
            stm.setString(1, user.getNome());
            stm.setInt(2, user.getIdade());
            
            stm.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            con.desconectar(conexao);
        }
    }
}
