
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
        jComboBox3.setVisible(false);
        jLabel5.setVisible(false);
        jComboBox4.setVisible(false);
        jTable1.setVisible(false);
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
        jComboBox3 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox4 = new javax.swing.JComboBox<>();

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
        jPanel1.add(lbl_tit, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 100, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 731, 50));

        jLabel2.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 153));
        jLabel2.setText("Docente:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 87, 30));

        jLabel3.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 210, 20));

        jLabel4.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 153));
        jLabel4.setText("Curso:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 87, 30));

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
        getContentPane().add(cbm_id_cur, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 210, 30));

        jLabel5.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 153));
        jLabel5.setText("Actividades:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 110, 30));

        getContentPane().add(cbm_id_mat, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 210, 30));

        jLabel6.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 153));
        jLabel6.setText("Materias:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 87, 30));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("INSTITUCIONALES");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, -1, 30));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("ACADEMICOS");
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, -1, 30));

        jLabel7.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 153));
        jLabel7.setText("Logro:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 80, 30));

        getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 210, 30));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, 130));

        getContentPane().add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 210, 30));

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
    

    
         


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbm_id_cur;
    private javax.swing.JComboBox<String> cbm_id_mat;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbl_tit;
    // End of variables declaration//GEN-END:variables
}
