/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package menu_Inicial;

import menu_Administracao.login_Administracao;

/**
 *
 * @author PEDRO
 */
public class tela_Acesso extends javax.swing.JFrame {

    /**
     * Creates new form tela_Acesso
     */
    public tela_Acesso() {
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
        ButtonFrequencia = new javax.swing.JButton();
        TelaAzulEscuraMenor = new javax.swing.JPanel();
        TelaAzulClaraMaior = new javax.swing.JPanel();
        ButtonAdmin = new javax.swing.JButton();
        TelaAzulClaraMenor = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TelaAzulEscuraMaior.setBackground(new java.awt.Color(0, 0, 51));
        TelaAzulEscuraMaior.setPreferredSize(new java.awt.Dimension(198, 273));

        ButtonFrequencia.setBackground(new java.awt.Color(51, 153, 255));
        ButtonFrequencia.setForeground(new java.awt.Color(255, 255, 255));
        ButtonFrequencia.setText("Frequência");
        ButtonFrequencia.setBorder(null);
        ButtonFrequencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonFrequenciaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TelaAzulEscuraMaiorLayout = new javax.swing.GroupLayout(TelaAzulEscuraMaior);
        TelaAzulEscuraMaior.setLayout(TelaAzulEscuraMaiorLayout);
        TelaAzulEscuraMaiorLayout.setHorizontalGroup(
            TelaAzulEscuraMaiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaAzulEscuraMaiorLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(ButtonFrequencia, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                .addGap(51, 51, 51))
        );
        TelaAzulEscuraMaiorLayout.setVerticalGroup(
            TelaAzulEscuraMaiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TelaAzulEscuraMaiorLayout.createSequentialGroup()
                .addContainerGap(230, Short.MAX_VALUE)
                .addComponent(ButtonFrequencia, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        TelaAzulEscuraMenor.setBackground(new java.awt.Color(0, 0, 51));

        javax.swing.GroupLayout TelaAzulEscuraMenorLayout = new javax.swing.GroupLayout(TelaAzulEscuraMenor);
        TelaAzulEscuraMenor.setLayout(TelaAzulEscuraMenorLayout);
        TelaAzulEscuraMenorLayout.setHorizontalGroup(
            TelaAzulEscuraMenorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        TelaAzulEscuraMenorLayout.setVerticalGroup(
            TelaAzulEscuraMenorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        TelaAzulClaraMaior.setBackground(new java.awt.Color(51, 153, 255));
        TelaAzulClaraMaior.setPreferredSize(new java.awt.Dimension(215, 279));

        ButtonAdmin.setBackground(new java.awt.Color(51, 153, 255));
        ButtonAdmin.setForeground(new java.awt.Color(255, 255, 255));
        ButtonAdmin.setText("Administração");
        ButtonAdmin.setBorder(null);
        ButtonAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TelaAzulClaraMaiorLayout = new javax.swing.GroupLayout(TelaAzulClaraMaior);
        TelaAzulClaraMaior.setLayout(TelaAzulClaraMaiorLayout);
        TelaAzulClaraMaiorLayout.setHorizontalGroup(
            TelaAzulClaraMaiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TelaAzulClaraMaiorLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(ButtonAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                .addGap(55, 55, 55))
        );
        TelaAzulClaraMaiorLayout.setVerticalGroup(
            TelaAzulClaraMaiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaAzulClaraMaiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ButtonAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TelaAzulClaraMenor.setBackground(new java.awt.Color(51, 153, 255));

        javax.swing.GroupLayout TelaAzulClaraMenorLayout = new javax.swing.GroupLayout(TelaAzulClaraMenor);
        TelaAzulClaraMenor.setLayout(TelaAzulClaraMenorLayout);
        TelaAzulClaraMenorLayout.setHorizontalGroup(
            TelaAzulClaraMenorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        TelaAzulClaraMenorLayout.setVerticalGroup(
            TelaAzulClaraMenorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TelaAzulEscuraMaior, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                    .addComponent(TelaAzulEscuraMenor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TelaAzulClaraMaior, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                    .addComponent(TelaAzulClaraMenor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TelaAzulEscuraMenor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TelaAzulEscuraMaior, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(TelaAzulClaraMaior, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TelaAzulClaraMenor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setSize(new java.awt.Dimension(429, 338));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAdminActionPerformed
        // TODO add your handling code here:
        login_Administracao acesso = new login_Administracao(); 
        acesso.setVisible(true);
        
        dispose(); //Fecha a tela de acesso
        
    }//GEN-LAST:event_ButtonAdminActionPerformed

    private void ButtonFrequenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonFrequenciaActionPerformed
        // TODO add your handling code here:
        
        menu_Frequencia.frequencia_Alunos acesso = new menu_Frequencia.frequencia_Alunos();
        acesso.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_ButtonFrequenciaActionPerformed

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
            java.util.logging.Logger.getLogger(tela_Acesso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela_Acesso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela_Acesso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela_Acesso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela_Acesso().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAdmin;
    private javax.swing.JButton ButtonFrequencia;
    private javax.swing.JPanel TelaAzulClaraMaior;
    private javax.swing.JPanel TelaAzulClaraMenor;
    private javax.swing.JPanel TelaAzulEscuraMaior;
    private javax.swing.JPanel TelaAzulEscuraMenor;
    // End of variables declaration//GEN-END:variables
}