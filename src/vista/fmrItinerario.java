/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

/**
 *
 * @author User
 */
public class fmrItinerario extends javax.swing.JFrame {

    /**
     * Creates new form fmrItinerario
     */
    public fmrItinerario() {
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaItinerario = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        txtFieldDescripcionItinerario = new javax.swing.JTextField();
        txtFieldHoraItinerario = new javax.swing.JTextField();
        txtFieldCodigoItinerario = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btn_AgregarItinerario = new javax.swing.JButton();
        btn_EliminarItinerario = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaItinerario.setBackground(new java.awt.Color(102, 255, 204));
        tablaItinerario.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tablaItinerario.setForeground(new java.awt.Color(0, 0, 0));
        tablaItinerario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane1.setViewportView(tablaItinerario);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 450, 230));

        jLabel16.setBackground(new java.awt.Color(255, 255, 0));
        jLabel16.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 0));
        jLabel16.setText("ITINERARIO");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        jSeparator3.setBackground(new java.awt.Color(255, 255, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 350, 10));
        jPanel1.add(txtFieldDescripcionItinerario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 210, -1));
        jPanel1.add(txtFieldHoraItinerario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 210, -1));
        jPanel1.add(txtFieldCodigoItinerario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 210, -1));

        jLabel10.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 0));
        jLabel10.setText("Descripción");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel19.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(204, 204, 0));
        jLabel19.setText("Hora");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel11.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 0));
        jLabel11.setText("Código");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        btn_AgregarItinerario.setBackground(new java.awt.Color(51, 0, 0));
        btn_AgregarItinerario.setFont(new java.awt.Font("Engravers MT", 0, 14)); // NOI18N
        btn_AgregarItinerario.setForeground(new java.awt.Color(204, 204, 0));
        btn_AgregarItinerario.setText("Agregar");
        jPanel1.add(btn_AgregarItinerario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));

        btn_EliminarItinerario.setBackground(new java.awt.Color(51, 0, 0));
        btn_EliminarItinerario.setFont(new java.awt.Font("Engravers MT", 0, 14)); // NOI18N
        btn_EliminarItinerario.setForeground(new java.awt.Color(204, 204, 0));
        btn_EliminarItinerario.setText("Eliminar");
        btn_EliminarItinerario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarItinerarioActionPerformed(evt);
            }
        });
        jPanel1.add(btn_EliminarItinerario, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/itinerario.png"))); // NOI18N
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 70, 70));

        btnVolver.setBackground(new java.awt.Color(51, 0, 0));
        btnVolver.setFont(new java.awt.Font("Engravers MT", 1, 12)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(204, 204, 0));
        btnVolver.setText("Regresar");
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_EliminarItinerarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarItinerarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_EliminarItinerarioActionPerformed

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
            java.util.logging.Logger.getLogger(fmrItinerario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fmrItinerario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fmrItinerario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fmrItinerario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fmrItinerario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnVolver;
    public javax.swing.JButton btn_AgregarItinerario;
    public javax.swing.JButton btn_EliminarItinerario;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    public javax.swing.JTable tablaItinerario;
    public javax.swing.JTextField txtFieldCodigoItinerario;
    public javax.swing.JTextField txtFieldDescripcionItinerario;
    public javax.swing.JTextField txtFieldHoraItinerario;
    // End of variables declaration//GEN-END:variables
}
