/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package menu_Frequencia;

import menu_Administracao.*;
import conexao_Mysql.*;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import UTIL.ManipularImagem;
import java.awt.image.BufferedImage;
import java.sql.Connection;
import java.sql.PreparedStatement;



/**
 *
 * 
 */
public class frequencia_Alunos extends javax.swing.JFrame {

    private static byte[] Digital; //VARIAVEL QUE IRA CHAMAR A DIGITAL
    
    /**
     * Creates new form gerenciamento_Admin
     */
    BufferedImage imagem;
    public frequencia_Alunos() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel_Fundo = new javax.swing.JPanel();
        painel_Azul = new javax.swing.JPanel();
        icon_Cracha = new javax.swing.JLabel();
        label_Matricula = new javax.swing.JLabel();
        label_Digital1 = new javax.swing.JLabel();
        id_Aluno = new javax.swing.JFormattedTextField();
        validar_Aluno = new javax.swing.JButton();
        lblImagem = new javax.swing.JLabel();
        label_CadastroAlunos1 = new javax.swing.JLabel();
        ano_Aluno = new javax.swing.JFormattedTextField();
        campo_Matricula2 = new javax.swing.JFormattedTextField();
        nome_Aluno1 = new javax.swing.JFormattedTextField();
        turma_Aluno1 = new javax.swing.JFormattedTextField();
        painel_Branco = new javax.swing.JPanel();
        icon_Edit = new javax.swing.JLabel();
        Close = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        button_Buscar = new javax.swing.JButton();
        turma_Box = new javax.swing.JComboBox<>();
        label_Turma = new javax.swing.JLabel();
        label_Turma1 = new javax.swing.JLabel();
        serie_Box = new javax.swing.JComboBox<>();
        label_CadastroAlunos = new javax.swing.JLabel();
        button_Atualizar1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_Alunos1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painel_Fundo.setLayout(null);

        painel_Azul.setBackground(new java.awt.Color(0, 0, 51));
        painel_Azul.setLayout(null);

        icon_Cracha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_Cracha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu_Administracao/CRACHA.png"))); // NOI18N
        painel_Azul.add(icon_Cracha);
        icon_Cracha.setBounds(160, 50, 50, 40);

        label_Matricula.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        label_Matricula.setForeground(new java.awt.Color(255, 255, 255));
        label_Matricula.setText("Matr??cula:");
        painel_Azul.add(label_Matricula);
        label_Matricula.setBounds(30, 90, 70, 16);

        label_Digital1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        label_Digital1.setForeground(new java.awt.Color(255, 255, 255));
        label_Digital1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_Digital1.setText("Digital:");
        painel_Azul.add(label_Digital1);
        label_Digital1.setBounds(190, 180, 110, 16);

        try {
            id_Aluno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        id_Aluno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        id_Aluno.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        id_Aluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_AlunoActionPerformed(evt);
            }
        });
        painel_Azul.add(id_Aluno);
        id_Aluno.setBounds(30, 180, 30, 20);

        validar_Aluno.setText("Marcar presen??a");
        painel_Azul.add(validar_Aluno);
        validar_Aluno.setBounds(30, 380, 270, 20);

        lblImagem.setForeground(new java.awt.Color(255, 255, 255));
        lblImagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagem.setText("CARREGAR DIGITAL");
        lblImagem.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblImagem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImagemMouseClicked(evt);
            }
        });
        lblImagem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lblImagemKeyPressed(evt);
            }
        });
        painel_Azul.add(lblImagem);
        lblImagem.setBounds(198, 210, 102, 150);

        label_CadastroAlunos1.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        label_CadastroAlunos1.setForeground(new java.awt.Color(255, 255, 255));
        label_CadastroAlunos1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_CadastroAlunos1.setText("Frequ??ncia Alunos");
        label_CadastroAlunos1.setToolTipText("");
        label_CadastroAlunos1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        painel_Azul.add(label_CadastroAlunos1);
        label_CadastroAlunos1.setBounds(10, 10, 320, 50);

        try {
            ano_Aluno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ano_Aluno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ano_Aluno.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        ano_Aluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ano_AlunoActionPerformed(evt);
            }
        });
        painel_Azul.add(ano_Aluno);
        ano_Aluno.setBounds(30, 270, 150, 20);

        try {
            campo_Matricula2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campo_Matricula2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campo_Matricula2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        campo_Matricula2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_Matricula2ActionPerformed(evt);
            }
        });
        painel_Azul.add(campo_Matricula2);
        campo_Matricula2.setBounds(30, 110, 270, 20);

        try {
            nome_Aluno1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        nome_Aluno1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nome_Aluno1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        nome_Aluno1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nome_Aluno1ActionPerformed(evt);
            }
        });
        painel_Azul.add(nome_Aluno1);
        nome_Aluno1.setBounds(30, 210, 150, 20);

        try {
            turma_Aluno1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        turma_Aluno1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        turma_Aluno1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        turma_Aluno1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                turma_Aluno1ActionPerformed(evt);
            }
        });
        painel_Azul.add(turma_Aluno1);
        turma_Aluno1.setBounds(30, 240, 150, 20);

        painel_Fundo.add(painel_Azul);
        painel_Azul.setBounds(0, 0, 340, 510);

        painel_Branco.setBackground(new java.awt.Color(51, 153, 255));
        painel_Branco.setLayout(null);

        icon_Edit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_Edit.setIcon(new javax.swing.ImageIcon("C:\\Users\\PEDRO\\Documents\\NetBeansProjects\\crud\\src\\ICONS\\EDITICON.png")); // NOI18N
        painel_Branco.add(icon_Edit);
        icon_Edit.setBounds(10, 10, 50, 50);

        Close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Close.setIcon(new javax.swing.ImageIcon("C:\\Users\\PEDRO\\Documents\\NetBeansProjects\\crud\\src\\ICONS\\CLOSE.png")); // NOI18N
        Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseMouseClicked(evt);
            }
        });
        painel_Branco.add(Close);
        Close.setBounds(640, 10, 50, 40);

        back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back.setIcon(new javax.swing.ImageIcon("C:\\Users\\PEDRO\\Documents\\NetBeansProjects\\crud\\src\\ICONS\\BACK-ARROW.png")); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        painel_Branco.add(back);
        back.setBounds(600, 10, 32, 40);

        button_Buscar.setText("Buscar turma/aluno");
        button_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_BuscarActionPerformed(evt);
            }
        });
        painel_Branco.add(button_Buscar);
        button_Buscar.setBounds(320, 90, 350, 23);

        turma_Box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione uma das op????es abaixo", "Administra????o", "Enfermagem", "Inform??tica" }));
        turma_Box.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        turma_Box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                turma_BoxActionPerformed(evt);
            }
        });
        painel_Branco.add(turma_Box);
        turma_Box.setBounds(80, 120, 200, 22);

        label_Turma.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        label_Turma.setForeground(new java.awt.Color(255, 255, 255));
        label_Turma.setText("Turma:");
        painel_Branco.add(label_Turma);
        label_Turma.setBounds(20, 120, 50, 16);

        label_Turma1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        label_Turma1.setForeground(new java.awt.Color(255, 255, 255));
        label_Turma1.setText("Serie:");
        painel_Branco.add(label_Turma1);
        label_Turma1.setBounds(20, 90, 50, 16);

        serie_Box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o ano que ingressou", "2022", "2021", "2020" }));
        serie_Box.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        serie_Box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serie_BoxActionPerformed(evt);
            }
        });
        painel_Branco.add(serie_Box);
        serie_Box.setBounds(80, 90, 200, 22);

        label_CadastroAlunos.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        label_CadastroAlunos.setForeground(new java.awt.Color(255, 255, 255));
        label_CadastroAlunos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_CadastroAlunos.setText("Selecione as op????es abaixo");
        label_CadastroAlunos.setToolTipText("");
        label_CadastroAlunos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        painel_Branco.add(label_CadastroAlunos);
        label_CadastroAlunos.setBounds(160, 10, 320, 50);

        button_Atualizar1.setText("Atualizar p??gina");
        button_Atualizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_Atualizar1ActionPerformed(evt);
            }
        });
        painel_Branco.add(button_Atualizar1);
        button_Atualizar1.setBounds(320, 120, 350, 23);

        table_Alunos1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Matricula", "Turma", "Admiss??o"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table_Alunos1);

        jScrollPane3.setViewportView(jScrollPane1);

        painel_Branco.add(jScrollPane3);
        jScrollPane3.setBounds(20, 160, 650, 320);

        painel_Fundo.add(painel_Branco);
        painel_Branco.setBounds(340, 0, 700, 510);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painel_Fundo, javax.swing.GroupLayout.PREFERRED_SIZE, 1038, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel_Fundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1046, 538));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        // TODO add your handling code here:

        //Object[] options = { "Confirmar", "Cancelar" };
        //JOptionPane.showOptionDialog(null, "<html><i>Voc?? ira perder a autentica????o se confirmar!</i>"+"<br>"+"<i> Deseja realmente sair?</i></html>", "Informa????o", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);    
        menu_Inicial.tela_Acesso acesso = new menu_Inicial.tela_Acesso();
        acesso.setVisible(true);

        dispose(); //Fecha a tela de login


    }//GEN-LAST:event_backMouseClicked

    private void CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseClicked
        // TODO add your handling code here:

        //FUN????O DE CONFIRMA????O
        String message = "<html><i>Deseja fechar o programa?</i></html>";
        String title = "Confirma????o";
        //Exibe caixa de dialogo (veja figura) solicitando confirma????o ou n??o. 
        //Se o usu??rio clicar em "Sim" retorna 0 pra variavel reply, se informado n??o retorna 1
        int reply = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            dispose(); //Fecha a tela de login
        }
    }//GEN-LAST:event_CloseMouseClicked

    private void turma_BoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_turma_BoxActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_turma_BoxActionPerformed

    private void button_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_BuscarActionPerformed
        // TODO add your handling code here:
        listarAlunos();
        
        
    }//GEN-LAST:event_button_BuscarActionPerformed

    private void lblImagemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblImagemKeyPressed
       
        
    }//GEN-LAST:event_lblImagemKeyPressed

    private void lblImagemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImagemMouseClicked
         String url = null;
        url = "test\\BioMini\\bin\\Biomini_DemoCS.exe\n";
        
        try {
            Process processo = Runtime.getRuntime().exec(url);

        } catch (IOException ex) {
            Logger.getLogger(menu_Frequencia.frmTestando.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_lblImagemMouseClicked

    private void serie_BoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serie_BoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_serie_BoxActionPerformed

    private void button_Atualizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_Atualizar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_Atualizar1ActionPerformed

    private void id_AlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_AlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_AlunoActionPerformed

    private void ano_AlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ano_AlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ano_AlunoActionPerformed

    private void campo_Matricula2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_Matricula2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_Matricula2ActionPerformed

    private void nome_Aluno1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nome_Aluno1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nome_Aluno1ActionPerformed

    private void turma_Aluno1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_turma_Aluno1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_turma_Aluno1ActionPerformed

    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frequencia_Alunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frequencia_Alunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frequencia_Alunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frequencia_Alunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frequencia_Alunos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Close;
    private javax.swing.JFormattedTextField ano_Aluno;
    private javax.swing.JLabel back;
    private javax.swing.JButton button_Atualizar1;
    private javax.swing.JButton button_Buscar;
    private javax.swing.JFormattedTextField campo_Matricula2;
    private javax.swing.JLabel icon_Cracha;
    private javax.swing.JLabel icon_Edit;
    private javax.swing.JFormattedTextField id_Aluno;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel label_CadastroAlunos;
    private javax.swing.JLabel label_CadastroAlunos1;
    private javax.swing.JLabel label_Digital1;
    private javax.swing.JLabel label_Matricula;
    private javax.swing.JLabel label_Turma;
    private javax.swing.JLabel label_Turma1;
    private javax.swing.JLabel lblImagem;
    private javax.swing.JFormattedTextField nome_Aluno1;
    private javax.swing.JPanel painel_Azul;
    private javax.swing.JPanel painel_Branco;
    private javax.swing.JPanel painel_Fundo;
    private javax.swing.JComboBox<String> serie_Box;
    private javax.swing.JTable table_Alunos1;
    private javax.swing.JFormattedTextField turma_Aluno1;
    private javax.swing.JComboBox<String> turma_Box;
    private javax.swing.JButton validar_Aluno;
    // End of variables declaration//GEN-END:variables

    
    private void listarAlunos(){
        try{
            alunosInsertB objAlunos = new alunosInsertB();
            
            DefaultTableModel model = (DefaultTableModel) table_Alunos1.getModel();
            model.setNumRows(0);
            
            ArrayList<alunosGetSet> lista = objAlunos.frequencia();
            
            
            for (int num = 0; num < lista.size(); num++) {
                model.addRow(new Object[]{
                    lista.get(num).getNome_aluno(),
                    lista.get(num).getMatricula(),
                    lista.get(num).getTurma(),
                    lista.get(num).getAno()                       
                });
            }
            
        }catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "editar_Admin - M??todo listarAdmin():" + erro);
        }
    }
    
    
    
    
    private void CarregarCampos(){
        int setar = table_Alunos1.getSelectedRow();
        
       
        id_Aluno.setText(table_Alunos1.getModel().getValueAt(setar, 0).toString());
        nome_Aluno1.setText(table_Alunos1.getModel().getValueAt(setar, 1).toString());
        campo_Matricula2.setText(table_Alunos1.getModel().getValueAt(setar, 2).toString());
        turma_Aluno1.setText(table_Alunos1.getModel().getValueAt(setar, 3).toString());
        ano_Aluno.setText(table_Alunos1.getModel().getValueAt(setar, 4).toString());   
    }
    
}
    
             
