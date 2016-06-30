/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Divisao;
import GUI.DivisaoInterface;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.sound.midi.Soundbank;

/**
 *
 * @author Ana
 */

public class DivisaoDAO {
    
    public void insertNome(String name){
        conexaoMysql con = new conexaoMysql();
        Connection conexao = con.conectar();
        String tarefa = "qualquer";
        try {
            String insert = "insert into divisao (nome, tarefa) values(?, ?)";
            PreparedStatement stm = conexao.prepareStatement(insert);
            
            stm.setString(1, name);
            stm.setString(2, tarefa);
            
            stm.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            con.desconectar(conexao);
        }
        
    }
    
    public void insertTarefa(String task){
        conexaoMysql con = new conexaoMysql();
        Connection conexao = con.conectar();
        
        try {
            
            //String nome = query.FildByName(nome)values;
            //PreparedStatement vmt = conexao.prepareStatement(nome);
            
            //vmt.execute();
                    
            String insert = "update divisao set tarefa = ? where tarefa='qualquer'";
            PreparedStatement stm = conexao.prepareStatement(insert);
            
            stm.setString(1, task);
            
            stm.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            con.desconectar(conexao);
        }
    }
    
    public void insertSab(){
        conexaoMysql con = new conexaoMysql();
        Connection conexao = con.conectar();
        
    
        try {
            String insert = "select d.nome, d.tarefa "
                            + "from morador m, divisao d, tarefa t"
                            + "where d.nome=m.nome and d.tarefa=t.tarefa and t.vezesSemana=7";
            PreparedStatement stm = conexao.prepareStatement(insert);
    
            ResultSet rs = stm.executeQuery();
            
            System.out.println("Entrou aqui");
            
            stm.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            con.desconectar(conexao);
        }
        
    }
    
    public void divisao(){
        conexaoMysql con = new conexaoMysql();
        Connection conexao = con.conectar();
        
        try {
            String gerar = "select M.nome, T.tarefa from morador M, tarefa T";
            PreparedStatement stm = conexao.prepareStatement(gerar);
            
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            con.desconectar(conexao);
        }
    }

}
