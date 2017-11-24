
package proyecto1.pkg0.pkg1;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Grade extends javax.swing.JInternalFrame {
    conexion cone,cone2,cone3,cone4,cone5,cone6,cone7;
    DefaultTableModel modelo;
    int idUser = 2;
    /**
     * Creates new form asd
     */
    public Grade() {
        initComponents();
        cone = new conexion();
        cone2 = new conexion();
        cone3 = new conexion();
        cone4 = new conexion();
        cone5 = new conexion();
        cone6 = new conexion();
        cone7 = new conexion();
        cargarCursos();
        cbm_act_mat.setVisible(false);
        lbl_des_act.setVisible(false);
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
        cbm_id_cur = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cbm_id_mat = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cbm_act_mat = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        cbm_mat_log = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cbm_per = new javax.swing.JComboBox<>();
        lbl_mat_2 = new javax.swing.JLabel();
        lbl_mat_1 = new javax.swing.JLabel();
        lbl_des_act = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

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
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 87, 30));

        jLabel3.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 210, 30));

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
        getContentPane().add(cbm_id_cur, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 210, 30));

        jLabel5.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 153));
        jLabel5.setText("Actividades:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 110, 30));

        cbm_id_mat.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbm_id_matItemStateChanged(evt);
            }
        });
        cbm_id_mat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cbm_id_matMouseEntered(evt);
            }
        });
        getContentPane().add(cbm_id_mat, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 50, 30));

        jLabel6.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 153));
        jLabel6.setText("Periodo:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 87, 30));

        cbm_act_mat.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbm_act_matItemStateChanged(evt);
            }
        });
        cbm_act_mat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbm_act_matActionPerformed(evt);
            }
        });
        getContentPane().add(cbm_act_mat, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 60, 30));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 430, 130));

        cbm_mat_log.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbm_mat_logItemStateChanged(evt);
            }
        });
        cbm_mat_log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbm_mat_logActionPerformed(evt);
            }
        });
        getContentPane().add(cbm_mat_log, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 50, 30));

        jLabel8.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 153));
        jLabel8.setText("Logro:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 80, 30));

        jLabel9.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 153));
        jLabel9.setText("Materias:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 87, 30));

        cbm_per.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbm_perItemStateChanged(evt);
            }
        });
        getContentPane().add(cbm_per, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 210, 30));

        lbl_mat_2.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        getContentPane().add(lbl_mat_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 160, 30));

        lbl_mat_1.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        getContentPane().add(lbl_mat_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 150, 30));

        lbl_des_act.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        getContentPane().add(lbl_des_act, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 180, 30));

        jLabel10.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 153));
        jLabel10.setText("Curso:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 87, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void cbm_id_curItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbm_id_curItemStateChanged
 
       cbm_id_mat.removeAllItems();
        try {  
            ResultSet rs = cone.consultar("SELECT tsc.ID_SUBJECT FROM teachersxsubjectsxcourses as tsc "
                    + "INNER JOIN COURSES c ON c.ID_COURSES = tsc.ID_COURSES WHERE tsc.ID_COURSES ="+cbm_id_cur.getSelectedItem() + "");
            while (rs.next()) {
                cbm_id_mat.addItem(rs.getString("tsc.ID_SUBJECT"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Grade.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cbm_id_curItemStateChanged

    private void cbm_id_curActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbm_id_curActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbm_id_curActionPerformed

    private void cbm_perItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbm_perItemStateChanged
        cbm_mat_log.removeAllItems();
        try {  
            ResultSet rs = cone2.consultar("SELECT ach.ID_SUBJECT FROM achievement as ach "
                    + "INNER JOIN period p ON p.ID_PERIOD = ach.ID_PERIOD WHERE ach.ID_PERIOD ="+cbm_per.getSelectedItem() + ""
                    + " AND ach.TYPE_ACHIEVEMENTS = 'academico'");
            while (rs.next()) {
                cbm_mat_log.addItem(rs.getString("ach.ID_SUBJECT"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Grade.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cbm_perItemStateChanged

    private void cbm_mat_logItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbm_mat_logItemStateChanged
       cbm_act_mat.removeAllItems(); 
        try{    
            ResultSet rs2 = cone4.consultar("SELECT act.ID_ACTIVITIES, act.PORCENTAGE FROM activities as act "
                    + "INNER JOIN achievement a ON a.ID_ACHIEVEMENT = act.ID_ACHIEVEMENT "
                    + "INNER JOIN courses c ON c.ID_COURSES = act.ID_COURSES "
                    + "WHERE act.ID_ACHIEVEMENT = "+ cbm_mat_log.getSelectedItem() + ""
                    + " AND act.ID_COURSES = " + cbm_id_cur.getSelectedItem() + "");
                while (rs2.next()) {
                    cbm_act_mat.addItem(rs2.getString("act.ID_ACTIVITIES"));
                }
            } catch (SQLException ex) {
                Logger.getLogger(Grade.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        String cod = cbm_mat_log.getSelectedItem() + "";
         ResultSet rs = cone3.consultar("SELECT NAME_SUBJECT FROM subject WHERE ID_SUBJECT = " + cod);
         
         try{
             if(rs.next()){
                 lbl_mat_2.setText(rs.getString("NAME_SUBJECT"));
             }
         } catch (SQLException ex) {
            System.out.println("Error" + ex);
         }
    }//GEN-LAST:event_cbm_mat_logItemStateChanged

    private void cbm_act_matActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbm_act_matActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbm_act_matActionPerformed

    private void cbm_id_matItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbm_id_matItemStateChanged

        String cod = cbm_id_mat.getSelectedItem() + "";
         ResultSet rs = cone4.consultar("SELECT NAME_SUBJECT FROM subject WHERE ID_SUBJECT = " + cod);
         
         try{
             if(rs.next()){
                 lbl_mat_1.setText(rs.getString("NAME_SUBJECT"));
             }
             cargarPeriodo();
         } catch (SQLException ex) {
            System.out.println("Error" + ex);
         }
         
        cbm_per.removeAllItems(); 
        try{    
            ResultSet rs2 = cone4.consultar("SELECT act.ID_ACTIVITIES, act.PORCENTAGE FROM activities as act "
                    + "INNER JOIN achievement a ON a.ID_ACHIEVEMENT = act.ID_ACHIEVEMENT "
                    + "INNER JOIN courses c ON c.ID_COURSES = act.ID_COURSES "
                    + "WHERE act.ID_ACHIEVEMENT = "+ cbm_mat_log.getSelectedItem() + ""
                    + " AND act.ID_COURSES = " + cbm_id_cur.getSelectedItem() + "");
            
                while (rs2.next()) {
                    cbm_per.addItem(rs2.getString("act.ID_ACTIVITIES"));
                }
            } catch (SQLException ex) {
                Logger.getLogger(Grade.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }//GEN-LAST:event_cbm_id_matItemStateChanged

    private void cbm_id_matMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbm_id_matMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_cbm_id_matMouseEntered

    private void cbm_act_matItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbm_act_matItemStateChanged
        String cod = cbm_act_mat.getSelectedItem() + "";
         ResultSet rs = cone7.consultar("SELECT DESCRIPTION FROM activities WHERE ID_ACTIVITIES = " + cod);
         
         try{
             if(rs.next()){
                 lbl_des_act.setText(rs.getString("DESCRIPTION"));
             }
             
         } catch (SQLException ex) {
            System.out.println("Error" + ex);
         }
    }//GEN-LAST:event_cbm_act_matItemStateChanged

    private void cbm_mat_logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbm_mat_logActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbm_mat_logActionPerformed


    public void cargarCursos() {
        cbm_id_cur.removeAllItems();
        try {
            
            ResultSet rs = cone5.consultar("SELECT tsc.ID_COURSES FROM  teachersxsubjectsxcourses as tsc "
                    + "INNER JOIN COURSES c ON c.ID_COURSES = tsc.ID_COURSES GROUP BY tsc.ID_COURSES");

            while (rs.next()) {
                cbm_id_cur.addItem(rs.getString("tsc.ID_COURSES"));
                          
            }  
        } catch (SQLException ex) {
            Logger.getLogger(Grade.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void cargarPeriodo() {
        cbm_per.removeAllItems();
        try {
            
            ResultSet rs = cone6.consultar("SELECT * FROM period");

            while (rs.next()) {
                cbm_per.addItem(rs.getString("ID_PERIOD"));
                          
            }  
        } catch (SQLException ex) {
            Logger.getLogger(Grade.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     public void cargarEstudiante() {
        cbm_per.removeAllItems();
        try {
            
            ResultSet rs = cone6.consultar("SELECT * FROM student");

            while (rs.next()) {
                cbm_per.addItem(rs.getString("ID_STUDENT"));
                          
            }  
        } catch (SQLException ex) {
            Logger.getLogger(Grade.class.getName()).log(Level.SEVERE, null, ex);
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
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbl_des_act;
    private javax.swing.JLabel lbl_mat_1;
    private javax.swing.JLabel lbl_mat_2;
    private javax.swing.JLabel lbl_tit;
    // End of variables declaration//GEN-END:variables
}
