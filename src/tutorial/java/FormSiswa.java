/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial.java;
import java.awt.HeadlessException;
    import java.sql.Connection;
import java.sql.PreparedStatement;
    import java.sql.ResultSet;
import java.sql.SQLException;
    import java.sql.Statement;
import javax.swing.JOptionPane;
    import javax.swing.table.DefaultTableModel;
import static koneksi.Koneksi.Koneksi;


public class FormSiswa extends javax.swing.JFrame {
    public Statement st;
    public ResultSet rs;
    public DefaultTableModel tabModel;
    Connection cn = koneksi.Koneksi.Koneksi();
    
    public FormSiswa() {
        initComponents();
        judul();
        tampilData("");
        reset();
  
        buttonHapus.setEnabled(false);
        buttonUpdate.setEnabled(false);
        buttonReset.setEnabled(false);
    }
    
    public void judul() {
        Object[] judul = {
            "NIS", "Nama", "Jurusan", "JK", "Alamat"
        };
        tabModel = new DefaultTableModel(null, judul);
        tableSiswa.setModel(tabModel);
    } 
    
    public void reset() {
        inputNis.setText("");
        inputNama.setText("");
        inputJurusan.setSelectedItem("");
        inputJK.setSelectedItem("");
        inputAlamat.setText("");
    }
    
    public void tampilData(String where) {
        try {
            st = cn.createStatement();
            tabModel.getDataVector().removeAllElements();
            tabModel.fireTableDataChanged();
            rs = st.executeQuery("SELECT * FROM students" + where);
            while (rs.next()) {
                Object[] data = {
                    rs.getString("nis"),
                    rs.getString("nama"),
                    rs.getString("jurusan"),
                    rs.getString("jk"),
                    rs.getString("alamat"),
                };
        
                    tabModel.addRow(data);
            }
        } catch(SQLException e) {
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableSiswa = new javax.swing.JTable();
        inputJurusan = new javax.swing.JComboBox<>();
        inputJK = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        inputAlamat = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        inputNama = new javax.swing.JTextField();
        inputNis = new javax.swing.JTextField();
        buttonSimpan = new javax.swing.JButton();
        buttonUpdate = new javax.swing.JButton();
        buttonReset = new javax.swing.JButton();
        buttonHapus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setText("JK");

        jLabel6.setText("Alamat");

        tableSiswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableSiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableSiswaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableSiswa);

        inputJurusan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rekayasa Perangkat Lunak", "Multimedia", "Teknik Komputer Jaringan" }));

        inputJK.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki-laki", "Perempuan" }));
        inputJK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputJKActionPerformed(evt);
            }
        });

        inputAlamat.setColumns(20);
        inputAlamat.setRows(5);
        jScrollPane1.setViewportView(inputAlamat);

        jLabel1.setText("NIS");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Form Siswa");

        jLabel3.setText("Nama");

        jLabel4.setText("Jurusan");

        buttonSimpan.setText("Simpan");
        buttonSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSimpanActionPerformed(evt);
            }
        });

        buttonUpdate.setText("Update");
        buttonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUpdateActionPerformed(evt);
            }
        });

        buttonReset.setText("Reset");
        buttonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonResetActionPerformed(evt);
            }
        });

        buttonHapus.setText("Hapus");
        buttonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addComponent(jLabel2))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(buttonHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(buttonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(inputJK, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(inputJurusan, javax.swing.GroupLayout.Alignment.LEADING, 0, 166, Short.MAX_VALUE)
                        .addComponent(inputNama, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(inputNis, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jScrollPane1))
                .addGap(57, 57, 57)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel2)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(inputNis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(inputNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(inputJK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(inputJurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonSimpan)
                            .addComponent(buttonHapus))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonUpdate)
                            .addComponent(buttonReset))))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSimpanActionPerformed
        // TODO add your handling code here:
        try {
            st = cn.createStatement();
            st.executeUpdate("INSERT INTO students VALUES('" 
                + inputNis.getText() + "','"
                + inputNama.getText() + "','"
                + inputJurusan.getSelectedItem() + "','"
                + inputJK.getSelectedItem() + "','"
                + inputAlamat.getText() + "')");
            tampilData("");
            JOptionPane.showMessageDialog(null, "Simpan Berhasil");
            inputNis.setText("");
            inputNama.setText("");
            inputAlamat.setText("");
            inputJurusan.setSelectedItem("");
            
        } catch (HeadlessException | SQLException e) {
        }
    }//GEN-LAST:event_buttonSimpanActionPerformed

    private void buttonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHapusActionPerformed
        // TODO add your handling code here:
        try {
            int jawab;
            
            if ((jawab = JOptionPane.showConfirmDialog(null,"Ingin menghapus data?", "konfirmasi", JOptionPane.YES_NO_OPTION)) == 0){
                st = cn.createStatement();
                st.executeUpdate("DELETE FROM students WHERE nis='"
                        + tabModel.getValueAt(tableSiswa.getSelectedRow(),0) + "'");
                tampilData("");
                reset();
            }
            
        } catch (HeadlessException | SQLException e) {
        }
 
    }//GEN-LAST:event_buttonHapusActionPerformed

    private void inputJKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputJKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputJKActionPerformed

    private void tableSiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSiswaMouseClicked
        // TODO add your handling code here:
        inputNis.setText(tableSiswa.getValueAt(tableSiswa.getSelectedRow(), 0).toString());
        inputNama.setText(tableSiswa.getValueAt(tableSiswa.getSelectedRow(), 1).toString());
        inputJurusan.setSelectedItem(tableSiswa.getValueAt(tableSiswa.getSelectedRow(), 2).toString());
        inputJK.setSelectedItem(tableSiswa.getValueAt(tableSiswa.getSelectedRow(), 3).toString());
        inputAlamat.setText(tableSiswa.getValueAt(tableSiswa.getSelectedRow(), 4).toString());
        buttonSimpan.setEnabled(false);
        buttonUpdate.setEnabled(true);
        buttonHapus.setEnabled(true);
    }//GEN-LAST:event_tableSiswaMouseClicked

    private void buttonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonResetActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_buttonResetActionPerformed

    private void buttonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUpdateActionPerformed
        // TODO add your handling code here:
   
        try {
            st = cn.createStatement();
            String sql = "UPDATE students set nis='"
                + inputNis.getText()
                + "',nama='" + inputNama.getText()
                + "',jurusan='" + inputJurusan.getSelectedItem()
                + "',jk='" + inputJK.getSelectedItem()
                + "',alamat='" + inputAlamat.getText() 
                + "'WHERE nis='" + inputNis.getText() + "'";
            
            Connection con = (Connection) Koneksi();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Update Berhasil");
            reset();
            
        } catch (HeadlessException | SQLException e) {
        }
    }//GEN-LAST:event_buttonUpdateActionPerformed

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
            java.util.logging.Logger.getLogger(FormSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormSiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonHapus;
    private javax.swing.JButton buttonReset;
    private javax.swing.JButton buttonSimpan;
    private javax.swing.JButton buttonUpdate;
    private javax.swing.JTextArea inputAlamat;
    private javax.swing.JComboBox<String> inputJK;
    private javax.swing.JComboBox<String> inputJurusan;
    private javax.swing.JTextField inputNama;
    private javax.swing.JTextField inputNis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableSiswa;
    // End of variables declaration//GEN-END:variables


    
}
