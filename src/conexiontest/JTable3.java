/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package conexiontest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author joyce
 */
public class JTable3 extends javax.swing.JFrame {

    Conexion con= new Conexion();
    Connection conec;
    DefaultTableModel modelo;
    Statement st;
    ResultSet rs;
    int idc;
    
    public JTable3() {
        initComponents();
        setLocationRelativeTo(null);
        consultar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtIdEstado = new javax.swing.JTextField();
        txtEstado = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla3 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Estado");

        jLabel2.setText("Id_Estado:");

        jLabel4.setText("Estado:");

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Modificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        Tabla3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID_ESTADO", "ESTADO_QUEJA"
            }
        ));
        Tabla3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabla3MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Tabla3);

        jButton4.setText("Salir");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtIdEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton2))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(jLabel4)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(95, 95, 95)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(29, 29, 29)
                                                .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(43, 43, 43)
                                .addComponent(jButton3)))))
                .addContainerGap(85, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton2))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //BOTON AGREGAR
        agregar();
        consultar();
        limpiarCampos();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Tabla3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla3MouseClicked
        int fila = Tabla3.getSelectedRow();
         if(fila== -1){
             JOptionPane.showMessageDialog(null,"No se selcecciona ninguna fila");
             
            }else{
                int id_estado = Integer.parseInt((String)Tabla3.getValueAt(fila,0).toString());
                String estado_queja = (String) Tabla3.getValueAt(fila,1);
                
                txtIdEstado.setText(""+id_estado);
                txtEstado.setText(estado_queja);
         }
    }//GEN-LAST:event_Tabla3MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //BOTON PARA MODIFICAR
        Modificar();
        consultar();
        limpiarCampos();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // BOTON ELIMINAR
        Eliminar();
        consultar();
        limpiarCampos();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //BOTON SALIR DE LA TABLA DE ESTADO 
          this.setVisible(false); 
                Menu salir = new Menu();
                salir.setVisible(true);
                setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(JTable3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JTable3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JTable3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JTable3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JTable3().setVisible(true);
            }
        });
    }

    void Modificar(){
        String id_estado = txtIdEstado.getText();
        String estado_queja = txtEstado.getText();
        
        try{
            if (id_estado.equals("") || estado_queja.equals("")) {
            JOptionPane.showMessageDialog(null, "Faltan ingresar Datos");
            limpiarTabla();
            }else{
                //Verificr si el ID que se dese modificar existe 
                String checkIDQuery = "SELECT COUNT(*) FROM estado WHERE ID_ESTADO=" + id_estado;
                conec = con.getConnection();
                st = conec.createStatement();
                ResultSet rs = st.executeQuery(checkIDQuery);
                rs.next();
                int rowCount = rs.getInt(1);
                
                if(rowCount == 0){
                    JOptionPane.showMessageDialog(null, "El ID que deseas modificar no existe.");
                    limpiarTabla();
                }else{
                    //si el ID existe, ahora se pueden realizar actualizaciones
                    String updateQuery = "UPDATE estado SET ESTADO_QUEJA = '" + estado_queja +"' WHERE ID_ESTADO = " + id_estado;
                    st.executeUpdate(updateQuery);
                    JOptionPane.showMessageDialog(null, "Datos de la tabla estado modificados");
                    limpiarTabla();
                }
            }
        }catch(Exception e){
        
        }
    }
    
    void consultar(){
        limpiarTabla();
        String sql = "select * from estado";
        
        try{
            conec = con.getConnection();
            st = conec.createStatement();
            rs = st.executeQuery(sql);
            Object[] estado = new Object[2];
            modelo = (DefaultTableModel)Tabla3.getModel();
            while(rs.next()){
                estado[0]= rs.getInt("ID_ESTADO");
                estado[1]=rs.getString("ESTADO_QUEJA");
                
                modelo.addRow(estado);
            }
        }catch(Exception e){
        
        }
    }
    
     void limpiarTabla() {
    DefaultTableModel modelo = (DefaultTableModel) Tabla3.getModel();
    modelo.setRowCount(0); // Esto elimina todas las filas de la tabla
    }
     
    void limpiarCampos() {
    txtIdEstado.setText("");
    txtEstado.setText("");
    }
    
    
    void agregar() {
    String id_estado = txtIdEstado.getText();
    String estado_queja = txtEstado.getText();

    try {
        if (id_estado.isEmpty() || estado_queja.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Faltan ingresar Datos");
        } else {
            // Verificar si el ID ya existe
            String checkIDQuery = "SELECT COUNT(*) FROM estado WHERE ID_ESTADO=?";
            conec = con.getConnection();
            PreparedStatement checkIDStatement = conec.prepareStatement(checkIDQuery);
            checkIDStatement.setString(1, id_estado);
            ResultSet rs = checkIDStatement.executeQuery();
            rs.next();
            int rowCount = rs.getInt(1);

            // Verificar que otro estado  no se llame igual
            String checkEstado = "SELECT COUNT(*) FROM estado WHERE ESTADO_QUEJA=?";
            PreparedStatement checkEstadoStatement = conec.prepareStatement(checkEstado);
            checkEstadoStatement.setString(1, estado_queja);
            ResultSet rp = checkEstadoStatement.executeQuery();
            rp.next();
            int rowCount2 = rp.getInt(1);

            if (rowCount > 0) {
                JOptionPane.showMessageDialog(null, "El ID del estado ya existe. Por favor, elige otro ID.");
                limpiarTabla();
            } else if (rowCount2 > 0) {
                JOptionPane.showMessageDialog(null, "El nombre del estado ya existe. Por favor, elige otro nombre.");
                limpiarTabla();
            }else if(estado_queja.length() > 30 || id_estado.length() > 2){
                JOptionPane.showMessageDialog(null, "El nombre no puede exceder de 30 caracteres o el ID sobre pasa mas de 1 caracter");
                limpiarTabla();
            }
            else {
                // Si el ID no existe y el nombre no está duplicado, insertar el nuevo registro
                String insertQuery = "INSERT INTO estado (ID_ESTADO, ESTADO_QUEJA) VALUES (?, ?)";
                PreparedStatement insertStatement = conec.prepareStatement(insertQuery);
                insertStatement.setString(1, id_estado);
                insertStatement.setString(2, estado_queja);
                insertStatement.executeUpdate();
                JOptionPane.showMessageDialog(null, "Nuevo estado registrado");
                limpiarTabla();
            }
        }
    } catch (Exception e) {
        e.printStackTrace(); // Manejar excepciones adecuadamente, por ejemplo, mostrar un mensaje de error
    }
}

    
     void Eliminar() {
    int fila = Tabla3.getSelectedRow();

    try {
        if (fila < 0) {
            JOptionPane.showMessageDialog(null, "Fila no seleccionada para eliminar");
        } else {
            int id_estado = Integer.parseInt(Tabla3.getValueAt(fila, 0).toString());

            // Verificar si existen registros relacionados en la tabla "quejas"
            String checkQuejasQuery = "SELECT COUNT(*) FROM quejas WHERE ID_ESTADO = " + id_estado;
            conec = con.getConnection();
            st = conec.createStatement();
            ResultSet rs = st.executeQuery(checkQuejasQuery);
            rs.next();
            int rowCount = rs.getInt(1);

            if (rowCount > 0) {
                JOptionPane.showMessageDialog(null, "No se puede eliminar el estado ya que , hay registros de quejas relacionados.");
            } else {
                // No hay registros relacionados, proceder con la eliminación
                String deleteQuery = "DELETE FROM estado WHERE ID_ESTADO=" + id_estado;
                st.executeUpdate(deleteQuery);
                JOptionPane.showMessageDialog(null, "Estado eliminado con exito");
                limpiarTabla();
            }
        }
    } catch (Exception e) {
        // Manejar excepciones
    }
}
     
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtIdEstado;
    // End of variables declaration//GEN-END:variables
}
