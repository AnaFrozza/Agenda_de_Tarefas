/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Divisao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ana
 */

public class DivisaoDAO {
    
    
     public List<Divisao> consultarTodos() {
        List<Divisao> dividir = new ArrayList();
        
        conexaoMysql con = new conexaoMysql();
        Connection conexao = con.conectar();
        
        try{
            
            String consult = "select * from divisao order by entrada";
        
            PreparedStatement stm = conexao.prepareStatement(consult);
            ResultSet rs = stm.executeQuery();
            while (rs.next()){
                Divisao div = new Divisao(rs.getString("nome"), rs.getString("tarefa"));
                
                dividir.add(div);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            con.desconectar(conexao);
        }
        return dividir;
    }
}
