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
public class JTable extends javax.swing.JFrame {
    
    Conexion con= new Conexion();
    Connection conec;
    DefaultTableModel modelo;
    Statement st;
    ResultSet rs;
    int idc;
    
    public JTable() {
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
        datos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtIdGen = new javax.swing.JTextField();
        txtDesc = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Generos");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Id_genero:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Descripcion:");

        txtIdGen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdGenActionPerformed(evt);
            }
        });

        txtDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout datosLayout = new javax.swing.GroupLayout(datos);
        datos.setLayout(datosLayout);
        datosLayout.setHorizontalGroup(
            datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datosLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdGen, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(128, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, datosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(184, 184, 184))
        );
        datosLayout.setVerticalGroup(
            datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datosLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(txtIdGen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jButton1.setText("Agregar");
        jButton1.setBorder(null);
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

        Tabla.setForeground(new java.awt.Color(0, 0, 102));
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID_GENERO", "DESCRIPCION"
            }
        ));
        Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Tabla);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jButton2)
                        .addGap(42, 42, 42)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButton4.setText("Salir ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(datos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(datos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(37, 37, 37)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdGenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdGenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdGenActionPerformed

    private void txtDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // BOTON AGREGAR
        agregar();
        consultar();
        limpiarCampos();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
        // TODO add your handling code here:
        int fila = Tabla.getSelectedRow();
        if(fila == -1){
            JOptionPane.showMessageDialog(null, "No se selecciona ninguna fila ");
        }else{
            //idc = Integer.parseInt((String) Tabla.getValueAt(fila,0).toString());
            int id_gen = Integer.parseInt((String) Tabla.getValueAt(fila,0).toString());
            String desc = (String) Tabla.getValueAt(fila,1);
            
          
            
            txtIdGen.setText(""+id_gen);
            txtDesc.setText(desc);
        }
        
        
    }//GEN-LAST:event_TablaMouseClicked

    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // BOTON DE MODIFICAR
        Modificar();
        consultar();
        limpiarCampos();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // BOTON PAR ELIMINAR
        Eliminar();
        consultar();
        limpiarCampos();

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // BOTON SALIR D LA TABLA GENERO 
        this.setVisible(false); 
                Menu salir = new Menu();
                salir.setVisible(true);
                setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    void Modificar(){
        String id_gen = txtIdGen.getText();
        String desc = txtDesc.getText();
        
        try{
            if (id_gen.equals("") || desc.equals("")) {
            JOptionPane.showMessageDialog(null, "Faltan ingresar Datos");
            limpiarTabla();
            }else{
                //Verificr si el ID que se dese modificar existe 
                String checkIDQuery = "SELECT COUNT(*) FROM genero WHERE ID_GENERO=" + id_gen;
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
                    String updateQuery = "UPDATE genero SET DESCRIPCION = '" + desc +"' WHERE ID_GENERO = " + id_gen;
                    st.executeUpdate(updateQuery);
                    JOptionPane.showMessageDialog(null, "Datos de la tabla genero modificados");
                    limpiarTabla();
                }
            }
        }catch(Exception e){
        
        }
    }
    
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
            java.util.logging.Logger.getLogger(JTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JTable().setVisible(true);
            }
        });
    }

    
    void consultar(){
        limpiarTabla();
        String sql = "select * from genero";
        
        try{
            conec = con.getConnection();
            st = conec.createStatement();
            rs = st.executeQuery(sql);
            Object[] genero = new Object[2];
            modelo =(DefaultTableModel)Tabla.getModel();
            while(rs.next()){
                genero[0]= rs.getInt("ID_GENERO");
                genero[1]=rs.getString("DESCRIPCION");
                
                modelo.addRow(genero);
            }
            
            
        }catch(Exception e){
        }
    }
    
    
    void agregar() {
    String id_gen = txtIdGen.getText();
    String desc = txtDesc.getText();

    try {
        if (id_gen.isEmpty() || desc.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Faltan ingresar Datos");
        } else {
            // Verificar si el ID ya existe
            String checkIDQuery = "SELECT COUNT(*) FROM genero WHERE ID_GENERO=?";
            conec = con.getConnection();
            PreparedStatement checkIDStatement = conec.prepareStatement(checkIDQuery);
            checkIDStatement.setString(1, id_gen);
            ResultSet rs = checkIDStatement.executeQuery();
            rs.next();
            int rowCount = rs.getInt(1);

            // Verificar que otra carrera no se llame igual
            String checkGenero = "SELECT COUNT(*) FROM genero WHERE DESCRIPCION=?";
            PreparedStatement checkGeneroStatement = conec.prepareStatement(checkGenero);
            checkGeneroStatement.setString(1, desc);
            ResultSet rp = checkGeneroStatement.executeQuery();
            rp.next();
            int rowCount2 = rp.getInt(1);

            if (rowCount > 0) {
                JOptionPane.showMessageDialog(null, "El ID de este genero ya existe. Por favor, elige otro ID.");
                limpiarTabla();
            } else if (rowCount2 > 0) {
                JOptionPane.showMessageDialog(null, "El nombre de este genero  ya existe. Por favor, elige otro nombre.");
                limpiarTabla();
            }else if(desc.length() > 30 || id_gen.length() > 1){
                JOptionPane.showMessageDialog(null, "El nombre no puede exceder de 30 caracteres o el ID sobre pasar mas de 1 caracter");
                limpiarTabla();
            }
            else {
                // Si el ID no existe y el nombre no está duplicado, insertar el nuevo registro
                String insertQuery = "INSERT INTO genero (ID_GENERO, DESCRIPCION) VALUES (?, ?)";
                PreparedStatement insertStatement = conec.prepareStatement(insertQuery);
                insertStatement.setString(1, id_gen);
                insertStatement.setString(2, desc);
                insertStatement.executeUpdate();
                JOptionPane.showMessageDialog(null, "Nuevo genero registrado");
                limpiarTabla();
            }
        }
    } catch (Exception e) {
        e.printStackTrace(); // Manejar excepciones adecuadamente, por ejemplo, mostrar un mensaje de error
    }
}

    
    
    void limpiarCampos() {
    txtIdGen.setText("");
    txtDesc.setText("");
    } 
    
    
    void limpiarTabla(){
        DefaultTableModel modelo = (DefaultTableModel) Tabla.getModel();
    modelo.setRowCount(0); // Esto elimina todas las filas de la tabla
    }
    
    
     void Eliminar() {
    int fila = Tabla.getSelectedRow();

    try {
        if (fila < 0) {
            JOptionPane.showMessageDialog(null, "Fila no seleccionada para eliminar");
        } else {
            int id_gen = Integer.parseInt(Tabla.getValueAt(fila, 0).toString());

            // Verificar si existen registros relacionados en la tabla "alumnos"
            String checkAlumnosQuery = "SELECT COUNT(*) FROM alumnos WHERE ID_GENERO = " + id_gen;
            conec = con.getConnection();
            st = conec.createStatement();
            ResultSet rs = st.executeQuery(checkAlumnosQuery);
            rs.next();
            int rowCount = rs.getInt(1);

            if (rowCount > 0) {
                JOptionPane.showMessageDialog(null, "No se puede eliminar el genero, hay registros de alumnos relacionados.");
            } else {
                // No hay registros relacionados, proceder con la eliminación
                String deleteQuery = "DELETE FROM genero WHERE ID_GENERO=" + id_gen;
                st.executeUpdate(deleteQuery);
                JOptionPane.showMessageDialog(null, "Genero eliminado con exito");
                limpiarTabla();
            }
        }
    } catch (Exception e) {
        // Manejar excepciones
    }
}
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JPanel datos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtDesc;
    private javax.swing.JTextField txtIdGen;
    // End of variables declaration//GEN-END:variables
}