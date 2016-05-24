/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import main.AgendaDeTarefas;
import agendadetarefas.Usuario;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observer;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JFrame;

/**
 *
 * @author Ana
 */
public class CadastrarUsuario extends JFrame {
    Container cp;
    JPanel pnCabecalho = new JPanel();
    JPanel pnCadastro = new JPanel();
    JPanel pnSul = new JPanel();
    
    JLabel lbCabecalho = new JLabel("Cadastro de Usuário");
    
    
    JLabel lbNome = new JLabel("Nome:");
    JTextField tfNome = new JTextField(10);
    
    
    JButton btSalvar = new JButton("Salvar");
    JButton btCancel = new JButton("Cancelar");
    JButton btProx = new JButton("Proximo");
    
    public CadastrarUsuario() { //throws SQLException, ClassNotFoundException
        setSize(300,200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setTitle("Agenda De Tarefas");
        
        cp = getContentPane();
        cp.setLayout(new BorderLayout());
        
        //colocando os paineis no painel principal
        cp.add(pnCabecalho, BorderLayout.NORTH);
        cp.add(pnCadastro, BorderLayout.CENTER);
        cp.add(pnSul, BorderLayout.SOUTH);
        
        //no painel norte
        pnCabecalho.add(lbCabecalho);
        
        //no painel central
        pnCadastro.add(lbNome);
        pnCadastro.add(tfNome);
        
        //no painel Sul
        pnSul.add(btSalvar);
        pnSul.add(btCancel);
        pnSul.add(btProx);
        
        btProx.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        CadastrarTarefa CadTarefa = new CadastrarTarefa();
                    }
                }
        );
         
        setVisible(true);    
    } 
}
