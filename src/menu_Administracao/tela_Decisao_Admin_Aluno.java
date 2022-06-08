/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package menu_Administracao;

import javax.swing.JOptionPane;
import menu_Administracao.login_Administracao;

/**
 *
 * @author PEDRO
 */
public class tela_Decisao_Admin_Aluno extends javax.swing.JFrame {

    /**
     * Creates new form tela_Acesso
     */
    public tela_Decisao_Admin_Aluno() {
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

        TelaAzulEscuraMaior = new javax.swing.JPanel();
        Button_Admin = new javax.swing.JButton();
        Button_Alunos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        Button_Alunos1 = new javax.swing.JButton();
        Button_Alunos2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TelaAzulEscuraMaior.setBackground(new java.awt.Color(0, 0, 51));
        TelaAzulEscuraMaior.setPreferredSize(new java.awt.Dimension(198, 273));

        Button_Admin.setBackground(new java.awt.Color(51, 153, 255));
        Button_Admin.setForeground(new java.awt.Color(255, 255, 255));
        Button_Admin.setText("Permissões administrativa / Criar administradores");
        Button_Admin.setBorder(null);
        Button_Admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_AdminActionPerformed(evt);
            }
        });

        Button_Alunos.setBackground(new java.awt.Color(51, 153, 255));
        Button_Alunos.setForeground(new java.awt.Color(255, 255, 255));
        Button_Alunos.setText("Criar e alterar dados cadastrais de alunos - 1°");
        Button_Alunos.setBorder(null);
        Button_Alunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_AlunosActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Selecione a opção que deseja administrar:");

        back.setIcon(new javax.swing.ImageIcon("C:\\Users\\PEDRO\\Documents\\NetBeansProjects\\crud\\src\\ICONS\\BACK-ARROW.png")); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });

        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setIcon(new javax.swing.ImageIcon("C:\\Users\\PEDRO\\Documents\\NetBeansProjects\\crud\\src\\ICONS\\CLOSE.png")); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });

        Button_Alunos1.setBackground(new java.awt.Color(51, 153, 255));
        Button_Alunos1.setForeground(new java.awt.Color(255, 255, 255));
        Button_Alunos1.setText("Alterar dados de alunos - 2°");
        Button_Alunos1.setBorder(null);
        Button_Alunos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Alunos1ActionPerformed(evt);
            }
        });

        Button_Alunos2.setBackground(new java.awt.Color(51, 153, 255));
        Button_Alunos2.setForeground(new java.awt.Color(255, 255, 255));
        Button_Alunos2.setText("Alterar dados de alunos - 3°");
        Button_Alunos2.setBorder(null);
        Button_Alunos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Alunos2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TelaAzulEscuraMaiorLayout = new javax.swing.GroupLayout(TelaAzulEscuraMaior);
        TelaAzulEscuraMaior.setLayout(TelaAzulEscuraMaiorLayout);
        TelaAzulEscuraMaiorLayout.setHorizontalGroup(
            TelaAzulEscuraMaiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TelaAzulEscuraMaiorLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(TelaAzulEscuraMaiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Button_Alunos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Button_Admin, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                    .addComponent(Button_Alunos1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Button_Alunos2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TelaAzulEscuraMaiorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(back)
                .addGap(18, 18, 18)
                .addComponent(close)
                .addGap(14, 14, 14))
        );
        TelaAzulEscuraMaiorLayout.setVerticalGroup(
            TelaAzulEscuraMaiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TelaAzulEscuraMaiorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TelaAzulEscuraMaiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(close)
                    .addComponent(back))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addComponent(Button_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Button_Alunos, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Button_Alunos1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Button_Alunos2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TelaAzulEscuraMaior, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TelaAzulEscuraMaior, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(429, 403));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Button_AdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_AdminActionPerformed
        // TODO add your handling code here:
        
        cadastro_Admin acesso = new cadastro_Admin();
        acesso.setVisible(true);
        
        dispose();
        
    }//GEN-LAST:event_Button_AdminActionPerformed

    private void Button_AlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_AlunosActionPerformed
        // TODO add your handling code here:
        
        cadastro_Alunos acesso = new cadastro_Alunos();
        acesso.setVisible(true);
        
        dispose();
        
        
    }//GEN-LAST:event_Button_AlunosActionPerformed

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        // TODO add your handling code here:
        
        //FUNÇÃO DE CONFIRMAÇÃO
        String message = "<html><i>Ao sair, perdera a autenticação e será necessário um novo login!</i>"+"<br>"+"<i>Deseja realmente sair?</i></html>";
        String title = "Confirmação";
        //Exibe caixa de dialogo (veja figura) solicitando confirmação ou não. 
        //Se o usuário clicar em "Sim" retorna 0 pra variavel reply, se informado não retorna 1
        int reply = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);
          if (reply == JOptionPane.YES_OPTION)
          {
            login_Administracao acesso = new login_Administracao(); 
            acesso.setVisible(true);

            dispose(); //Fecha a tela de login
          }
        
    }//GEN-LAST:event_backMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        // TODO add your handling code here:
        
        //FUNÇÃO DE CONFIRMAÇÃO
        String message = "<html><i>Deseja fechar o programa?</i></html>";
        String title = "Confirmação";
        //Exibe caixa de dialogo (veja figura) solicitando confirmação ou não. 
        //Se o usuário clicar em "Sim" retorna 0 pra variavel reply, se informado não retorna 1
        int reply = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);
          if (reply == JOptionPane.YES_OPTION)
          {
            dispose(); //Fecha a tela de login
          }
        
    }//GEN-LAST:event_closeMouseClicked

    private void Button_Alunos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Alunos1ActionPerformed
        // TODO add your handling code here:
        
        editar_Alunos2 acesso = new editar_Alunos2();
        acesso.setVisible(true);
        
        dispose();
        
    }//GEN-LAST:event_Button_Alunos1ActionPerformed

    private void Button_Alunos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Alunos2ActionPerformed
        // TODO add your handling code here:
        
        editar_Alunos3 acesso = new editar_Alunos3();
        acesso.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_Button_Alunos2ActionPerformed

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
            java.util.logging.Logger.getLogger(tela_Decisao_Admin_Aluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela_Decisao_Admin_Aluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela_Decisao_Admin_Aluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela_Decisao_Admin_Aluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela_Decisao_Admin_Aluno().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Admin;
    private javax.swing.JButton Button_Alunos;
    private javax.swing.JButton Button_Alunos1;
    private javax.swing.JButton Button_Alunos2;
    private javax.swing.JPanel TelaAzulEscuraMaior;
    private javax.swing.JLabel back;
    private javax.swing.JLabel close;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}