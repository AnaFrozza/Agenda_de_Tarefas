/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.DividirTarefa;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Ana
 */
public class DividirDAO {
    public void insert(DividirTarefa user){
        conexaoMysql con = new conexaoMysql();
        Connection conexao = con.conectar();
        
        try {
            String sql = "insert into divisao (nome, tarefa) values(?, ?)";
            PreparedStatement stm = conexao.prepareStatement(sql);
            
            stm.setString(1, user.getNome());
            stm.setString(2, user.getTarefa());
            
            stm.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            con.desconectar(conexao);
        }
    }
}
