/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

/**
 *
 * @author User
 */
public class fmrRegistroTransporte extends javax.swing.JFrame {

    /**
     * Creates new form fmrRegistroTransporte
     */
    public fmrRegistroTransporte() {
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
        btnAceptar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaTransporte = new javax.swing.JTable();
        txtCostoP = new javax.swing.JTextField();
        txtCodAuto = new javax.swing.JTextField();
        txtCapacidad = new javax.swing.JTextField();
        txtNombreDuenio = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAceptar.setText("Agregar");
        jPanel1.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, -1, -1));

        btnEliminar.setText("Eliminar");
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, -1, -1));

        tablaTransporte.setBackground(new java.awt.Color(102, 255, 204));
        tablaTransporte.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tablaTransporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane1.setViewportView(tablaTransporte);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 560, 230));
        jPanel1.add(txtCostoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 190, -1));
        jPanel1.add(txtCodAuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 190, -1));

        txtCapacidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCapacidadActionPerformed(evt);
            }
        });
        jPanel1.add(txtCapacidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 190, -1));
        jPanel1.add(txtNombreDuenio, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 190, -1));

        jLabel10.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 0));
        jLabel10.setText("Código de Transporte");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, -1, -1));

        btnRegresar.setText("Regresar");
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, -1, -1));

        jLabel16.setBackground(new java.awt.Color(255, 255, 0));
        jLabel16.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 0));
        jLabel16.setText("REGISTRO DE TRANSPORTE");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        jSeparator3.setBackground(new java.awt.Color(255, 255, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 350, 10));

        jLabel11.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 0));
        jLabel11.setText("Nombre del Dueño");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, -1, -1));

        jLabel12.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 0));
        jLabel12.setText("Costo por pasajero");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, -1, -1));

        jLabel13.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 0));
        jLabel13.setText("Capacidad");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCapacidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCapacidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCapacidadActionPerformed

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
            java.util.logging.Logger.getLogger(fmrRegistroTransporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fmrRegistroTransporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fmrRegistroTransporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fmrRegistroTransporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fmrRegistroTransporte().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAceptar;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    public javax.swing.JTable tablaTransporte;
    public javax.swing.JTextField txtCapacidad;
    public javax.swing.JTextField txtCodAuto;
    public javax.swing.JTextField txtCostoP;
    public javax.swing.JTextField txtNombreDuenio;
    // End of variables declaration//GEN-END:variables
}
