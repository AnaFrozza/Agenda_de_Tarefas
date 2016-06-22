/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendadetarefas;

/**
 *
 * @author Ana
 */

//import agendadetarefas.Usuario;
import java.sql.*;

public class UsuarioDAO {
    public Connection conectar (){
        Connection myConn = null;
        try{
            Class.forName("com.mysql.jbdc.Driver");
            myConn = DriverManager.getConnection("");
            System.out.printf("Conectou!");
        }catch(Exception exc){
            exc.printStackTrace();
        }
        return myConn;
    }
}
