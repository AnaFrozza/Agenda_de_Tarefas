/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Ana
 */

public class conexaoMysql {
    public Connection conectar (){
        Connection myConn = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/agendadetarefas","root","7524901");
        }catch(Exception exc){
            exc.printStackTrace();
        }
        return myConn;
    }
    
    public void desconectar (Connection conn){
        try {
           if (conn != null) {
               conn.close();
           }
        } catch (Exception exc) {
            exc.printStackTrace();
        }
        
    }
}
