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
public class CadastrarTarefa extends JFrame{
    Container cp;
    JPanel pnCabecalho = new JPanel();
    JPanel pnCadastro = new JPanel();
    JPanel pnSul = new JPanel();
    
    JLabel lbCabecalho = new JLabel("Cadastro de Tarefa");
    
    
    JLabel lbTarefa = new JLabel("Tarefa:");
    JTextField tfTarefa = new JTextField(10);
    JLabel lbNivel = new JLabel("Dificuldade:");
    JTextField tfNivel = new JTextField(5);
    JLabel lbSemana = new JLabel("Vezes por Semana:");
    JTextField tfSemana = new JTextField(5);
    JLabel lbDia = new JLabel("Vezes por Dia:");
    JTextField tfDia = new JTextField(5);
    
    
    JButton btSalvar = new JButton("Salvar");
    JButton btCancel = new JButton("Cancelar");
    JButton btProx = new JButton("Proximo");
    
    public CadastrarTarefa() { //throws SQLException, ClassNotFoundException
        setSize(400,200);
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
        pnCadastro.add(lbTarefa);
        pnCadastro.add(tfTarefa);
        pnCadastro.add(lbNivel);
        pnCadastro.add(tfNivel);
        pnCadastro.add(lbSemana);
        pnCadastro.add(tfSemana);
        pnCadastro.add(lbDia);
        pnCadastro.add(tfDia);
        
        //no painel Sul
        pnSul.add(btSalvar);
        pnSul.add(btCancel);
        pnSul.add(btProx);
        
        btProx.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        InterfaceTarefas interfaceTarefa = new InterfaceTarefas();
                        dispose();
                    }
                }
        );
         
        setVisible(true);
    }
}
