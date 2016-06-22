/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Ana
 */

//import agendadetarefas.Usuario;

public class UsuarioDAO {
    public void insert(){
        conexaoMysql con = new conexaoMysql();
        Connection conexao = con.conectar();
        
        try {
            String sql = "Select * from morador";
            PreparedStatement stm = conexao.prepareStatement(sql);
            
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {                
                System.out.println(rs.getString("nome"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            con.desconectar(conexao);
        }
    }
    
    
}
