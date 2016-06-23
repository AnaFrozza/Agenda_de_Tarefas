/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Tarefa;
import java.sql.Connection;
import java.sql.PreparedStatement;

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
}
