/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

/**
 *
 * @author User
 */
public class fmrReportePlanilla extends javax.swing.JFrame {

    /**
     * Creates new form fmrReportePlanilla
     */
    public fmrReportePlanilla() {
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

        jLabel18 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        btnRegresar1 = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaReportePlanilla = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        labelNeto = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        labelTrabajadores = new javax.swing.JLabel();
        labelBruto = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        labelCantVentas = new javax.swing.JLabel();

        jLabel18.setBackground(new java.awt.Color(255, 255, 0));
        jLabel18.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 0));
        jLabel18.setText("REPORTE");

        btnRegresar.setText("Regresar");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setBackground(new java.awt.Color(255, 255, 0));
        jLabel19.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 0));
        jLabel19.setText("REPORTE PLANILLA");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        jSeparator3.setBackground(new java.awt.Color(255, 255, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 350, 10));

        btnRegresar1.setText("Regresar");
        jPanel1.add(btnRegresar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, -1, -1));

        btnImprimir.setText("Imprimir Reporte");
        jPanel1.add(btnImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 700, -1, -1));

        tablaReportePlanilla.setBackground(new java.awt.Color(102, 255, 204));
        tablaReportePlanilla.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tablaReportePlanilla.setForeground(new java.awt.Color(0, 0, 0));
        tablaReportePlanilla.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaReportePlanilla);

        jScrollPane2.setViewportView(jScrollPane1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 610, 320));

        jLabel20.setBackground(new java.awt.Color(255, 255, 0));
        jLabel20.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 0));
        jLabel20.setText("TOTAL DE SUELDO NETO");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 670, -1, -1));

        labelNeto.setBackground(new java.awt.Color(255, 255, 0));
        labelNeto.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        labelNeto.setForeground(new java.awt.Color(255, 255, 0));
        labelNeto.setText("TOTAL DE VENTAS");
        jPanel1.add(labelNeto, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 670, -1, -1));

        jLabel23.setBackground(new java.awt.Color(255, 255, 0));
        jLabel23.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 0));
        jLabel23.setText("TOTAL DE SUELDO BRUTO");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, -1, -1));

        jLabel25.setBackground(new java.awt.Color(255, 255, 0));
        jLabel25.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 0));
        jLabel25.setText("TOTAL DE TRABAJADORES");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, -1, -1));

        labelTrabajadores.setBackground(new java.awt.Color(255, 255, 0));
        labelTrabajadores.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        labelTrabajadores.setForeground(new java.awt.Color(255, 255, 0));
        labelTrabajadores.setText("TOTAL DE VENTAS");
        jPanel1.add(labelTrabajadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 510, -1, -1));

        labelBruto.setBackground(new java.awt.Color(255, 255, 0));
        labelBruto.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        labelBruto.setForeground(new java.awt.Color(255, 255, 0));
        labelBruto.setText("TOTAL DE VENTAS");
        jPanel1.add(labelBruto, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 610, -1, -1));

        jLabel28.setBackground(new java.awt.Color(255, 255, 0));
        jLabel28.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 0));
        jLabel28.setText("TOTAL DE VENTAS");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, -1, -1));

        labelCantVentas.setBackground(new java.awt.Color(255, 255, 0));
        labelCantVentas.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        labelCantVentas.setForeground(new java.awt.Color(255, 255, 0));
        labelCantVentas.setText("TOTAL DE VENTAS");
        jPanel1.add(labelCantVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 560, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 734, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(fmrReportePlanilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fmrReportePlanilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fmrReportePlanilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fmrReportePlanilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fmrReportePlanilla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnImprimir;
    public javax.swing.JButton btnRegresar;
    public javax.swing.JButton btnRegresar1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator3;
    public javax.swing.JLabel labelBruto;
    public javax.swing.JLabel labelCantVentas;
    public javax.swing.JLabel labelNeto;
    public javax.swing.JLabel labelTrabajadores;
    public javax.swing.JTable tablaReportePlanilla;
    // End of variables declaration//GEN-END:variables
}
