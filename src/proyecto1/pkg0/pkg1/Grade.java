
package proyecto1.pkg0.pkg1;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Grade extends javax.swing.JInternalFrame {
    conexion cone,cone2,cone3;
    DefaultTableModel modelo;
    int idUser = 2;
    /**
     * Creates new form asd
     */
    public Grade() {
        initComponents();
        cone = new conexion();
        cone3 = new conexion();
        cargarCursos();
        cbm_act_mat.setVisible(false);
        jLabel5.setVisible(false);
        cbm_mat_log.setVisible(false);
        jTable1.setVisible(false);
        cbm_per.setVisible(false);
        jLabel6.setVisible(false);
        jLabel7.setVisible(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbl_tit = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbm_id_cur = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cbm_id_mat = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        cbm_act_mat = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        cbm_mat_log = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cbm_per = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(544, 37, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_tit.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 20)); // NOI18N
        lbl_tit.setForeground(new java.awt.Color(255, 255, 255));
        lbl_tit.setText("Grades");
        lbl_tit.setToolTipText("");
        jPanel1.add(lbl_tit, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 100, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 450, 50));

        jLabel2.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 153));
        jLabel2.setText("Docente:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 87, 30));

        jLabel3.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 210, 20));

        jLabel4.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 153));
        jLabel4.setText("Curso:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 87, 30));

        cbm_id_cur.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbm_id_curItemStateChanged(evt);
            }
        });
        cbm_id_cur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbm_id_curActionPerformed(evt);
            }
        });
        getContentPane().add(cbm_id_cur, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 210, 30));

        jLabel5.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 153));
        jLabel5.setText("Actividades:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 110, 30));

        getContentPane().add(cbm_id_mat, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 210, 30));

        jLabel6.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 153));
        jLabel6.setText("Periodo:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 87, 30));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("INSTITUCIONALES");
        jRadioButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jRadioButton1MousePressed(evt);
            }
        });
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, -1, 30));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("ACADEMICOS");
        jRadioButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton2MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jRadioButton2MousePressed(evt);
            }
        });
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, -1, 30));

        jLabel7.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 153));
        jLabel7.setText("Materias x Logro");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 150, 30));

        getContentPane().add(cbm_act_mat, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 210, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 430, 130));

        getContentPane().add(cbm_mat_log, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 210, 30));

        jLabel8.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 153));
        jLabel8.setText("Logro:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 80, 30));

        jLabel9.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 153));
        jLabel9.setText("Materias:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 87, 30));

        getContentPane().add(cbm_per, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 210, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void cbm_id_curItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbm_id_curItemStateChanged
 
       cbm_id_mat.removeAllItems();
        try {  
            ResultSet rs = cone3.consultar("SELECT tsc.ID_SUBJECT, NAME_SUBJECT FROM  teachersxsubjectsxcourses as tsc "
                    + "INNER JOIN subject s ON s.ID_SUBJECT = tsc.ID_SUBJECT "
                    + "INNER JOIN COURSES c ON c.ID_COURSES = tsc.ID_COURSES WHERE tsc.ID_COURSES ="+cbm_id_cur.getSelectedItem() + "");
            while (rs.next()) {
                cbm_id_mat.addItem(rs.getString("ID_SUBJECT") + " - " + rs.getString("NAME_SUBJECT"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(activity.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cbm_id_curItemStateChanged

    private void cbm_id_curActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbm_id_curActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbm_id_curActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
       
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2MouseClicked

    private void jRadioButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton2MousePressed
         if (jRadioButton1.isSelected()) {
            cbm_act_mat.setVisible(true);
            jLabel5.setVisible(true);
            cbm_mat_log.setVisible(true);
            jTable1.setVisible(true);
            cbm_per.setVisible(true);
            jLabel6.setVisible(true);
            jLabel7.setVisible(true);
        }
    }//GEN-LAST:event_jRadioButton2MousePressed

    private void jRadioButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton1MousePressed
        if (jRadioButton2.isSelected()) {
            cbm_act_mat.setVisible(false);
            jLabel5.setVisible(false);
            cbm_mat_log.setVisible(false);
            jTable1.setVisible(false);
            cbm_per.setVisible(false);
            jLabel6.setVisible(false);
            jLabel7.setVisible(false);
            
            cargarPeriodo();
        }
    }//GEN-LAST:event_jRadioButton1MousePressed


    public void cargarCursos() {
        cbm_id_cur.removeAllItems();
        try {
            
            ResultSet rs = cone.consultar("SELECT tsc.ID_COURSES, NAME_COURSES FROM  teachersxsubjectsxcourses as tsc "
                    + "INNER JOIN COURSES c ON c.ID_COURSES = tsc.ID_COURSES GROUP BY tsc.ID_COURSES");

            while (rs.next()) {
                cbm_id_cur.addItem(rs.getString("tsc.ID_COURSES"));
                          
            }  
        } catch (SQLException ex) {
            Logger.getLogger(activity.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void cargarPeriodo() {
        cbm_per.removeAllItems();
        try {
            
            ResultSet rs = cone.consultar("SELECT * FROM period");

            while (rs.next()) {
                cbm_per.addItem(rs.getString("ID_PERIOD"));
                          
            }  
        } catch (SQLException ex) {
            Logger.getLogger(activity.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbm_act_mat;
    private javax.swing.JComboBox<String> cbm_id_cur;
    private javax.swing.JComboBox<String> cbm_id_mat;
    private javax.swing.JComboBox<String> cbm_mat_log;
    private javax.swing.JComboBox<String> cbm_per;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbl_tit;
    // End of variables declaration//GEN-END:variables
}
