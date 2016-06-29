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
    public void gerar(Divisao star){
        conexaoMysql con = new conexaoMysql();
        Connection conexao = con.conectar();
        
        try {
            String gerar = "";
            PreparedStatement stm = conexao.prepareStatement(gerar);
            
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            con.desconectar(conexao);
        }
    }
}
