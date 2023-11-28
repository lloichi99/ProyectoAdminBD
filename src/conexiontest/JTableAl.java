/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package conexiontest;


import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author joyce
 */

public class JTableAl extends javax.swing.JFrame {

    Conexion con= new Conexion();
    Connection conec;
    DefaultTableModel modelo;
    Statement st;
    ResultSet rs;
    int idc;
    private List<GeneroItem> listaGenero = new ArrayList<>();
    private List<CarreraItem> listaCarrera = new ArrayList<>();

    

   private void llenarComboBoxGenero() {
    String sql = "SELECT ID_GENERO, DESCRIPCION FROM genero";
    try {
        conec = con.getConnection();
        st = conec.createStatement();
        rs = st.executeQuery(sql);

        // Limpiar el ComboBox antes de agregar nuevos elementos
        cmbIdGenero.removeAllItems();

        // Limpiar la lista de la clase antes de llenarla
        this.listaGenero.clear();

        while (rs.next()) {
            int idGenero = rs.getInt("ID_GENERO");
            String descripcion = rs.getString("DESCRIPCION");

            // Crear un objeto GeneroItem y agregarlo a la lista de la clase
            GeneroItem generoItem = new GeneroItem(idGenero, descripcion);
            this.listaGenero.add(generoItem);

            // Agregar solo la descripción al ComboBox
            cmbIdGenero.addItem(descripcion);
        }

    } catch (Exception e) {
        e.printStackTrace();
    }
}

private void llenarComboBoxCarrera() {
    String sql = "SELECT ID_CARRERA, NOMBRE FROM carrera";
    try {
        conec = con.getConnection();
        st = conec.createStatement();
        rs = st.executeQuery(sql);

        // Limpiar el ComboBox antes de agregar nuevos elementos
        cmbIdCarrera.removeAllItems();

        // Limpiar la lista de la clase antes de llenarla
        this.listaCarrera.clear();

        while (rs.next()) {
            int idCarrera = rs.getInt("ID_CARRERA");
            String nombre = rs.getString("NOMBRE");

            // Crear un objeto CarreraItem y agregarlo a la lista de la clase
            CarreraItem carreraItem = new CarreraItem(idCarrera, nombre);
            this.listaCarrera.add(carreraItem);

            // Agregar solo la descripción al ComboBox
            cmbIdCarrera.addItem(nombre);
        }

    } catch (Exception e) {
        e.printStackTrace();
    }
}

    
   


    
    /**
     * Creates new form JTableAl
     */
    public JTableAl() {
        initComponents();
        setLocationRelativeTo(null);
        consultar();
        
        // Llenar JComboBox con datos de la tabla "genero"
        llenarComboBoxGenero();
        llenarComboBoxCarrera();
        
         // Agregar el escuchador de eventos a la tabla
    Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            TablaMouseClicked(evt);
        }
    });
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
        txtApMaterno = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtNoControl = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmbIdGenero = new javax.swing.JComboBox<>();
        cmbIdCarrera = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtApPaterno = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();

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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Alumnos ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Id_carrera:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Id_genero:");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtNoControl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoControlActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("No_control ");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Apellido Paterno:");

        cmbIdGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cmbIdGenero.setToolTipText("");
        cmbIdGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbIdGeneroActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Correo:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Apellido Materno:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Telefono:");

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

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NO_CONTROL", "ID_GENERO", "ID_CARRERA", "NOMBRE", "APELLIDO_PATERNO ", "APELLLIDO_MATERNO", "CORREO", "TELEFONO"
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(203, 203, 203)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtNoControl, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(13, 13, 13))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel7)
                                                .addComponent(jLabel4)
                                                .addComponent(jLabel3))
                                            .addGap(162, 162, 162)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cmbIdCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cmbIdGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(12, 12, 12)))
                                .addGap(5, 5, 5)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel2))))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtApPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(116, 116, 116)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 763, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNoControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cmbIdGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(txtApPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cmbIdCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(27, 27, 27))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Boton modificar
        Modificar();
        consultar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // BOTON DE AGREGAR
        agregar();
        consultar();
        //limpiarCampos();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cmbIdGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbIdGeneroActionPerformed
    
    }//GEN-LAST:event_cmbIdGeneroActionPerformed

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
    
        // Aquí puedes deshabilitar el campo de "ID Genero"
        txtNoControl.setEnabled(false);
    // Obtener el índice de la fila seleccionada
    int selectedRow = Tabla.getSelectedRow();
    
    // Verificar si hay una fila seleccionada
    if (selectedRow != -1) {
        // Obtener datos de la fila seleccionada
        String noControl = Tabla.getValueAt(selectedRow, 0).toString();
        String idGenero = Tabla.getValueAt(selectedRow, 1).toString();
        String idCarrera = Tabla.getValueAt(selectedRow, 2).toString();
        String nombre = Tabla.getValueAt(selectedRow, 3).toString();
        String apPaterno = Tabla.getValueAt(selectedRow, 4).toString();
        String apMaterno = Tabla.getValueAt(selectedRow, 5).toString();
        String correo = Tabla.getValueAt(selectedRow, 6).toString();
        String telefono = Tabla.getValueAt(selectedRow, 7).toString();

        
        // Actualizar los campos de texto y los combo boxes
        txtNoControl.setText(noControl);
        txtNombre.setText(nombre);
        txtApPaterno.setText(apPaterno);
        txtApMaterno.setText(apMaterno);
        txtCorreo.setText(correo);
        txtTelefono.setText(telefono);
        
        
         // Actualizar los combo boxes seleccionando el índice correspondiente
        int indexGenero = obtenerIndiceGenero(idGenero);
        int indexCarrera = obtenerIndiceCarrera(idCarrera);

        cmbIdGenero.setSelectedIndex(indexGenero);
        cmbIdCarrera.setSelectedIndex(indexCarrera);
            
    }
       
    }
// Método para obtener el índice de un elemento en la lista de carreras
private int obtenerIndiceCarrera(String idCarrera) {
    for (int i = 0; i < listaCarrera.size(); i++) {
        if (String.valueOf(listaCarrera.get(i).getIdCarrera()).equals(idCarrera)) {
            return i;
        }
    }
    return -1; // Si no se encuentra, devolver -1
    }//GEN-LAST:event_TablaMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Boton eliminar
        eliminar();
        consultar();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtNoControlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoControlActionPerformed
        // TODO add your handling code here:
         try {
        // Obtener el ID ingresado como texto
        String idNoControl = txtNoControl.getText();
        
        // Verificar si el texto es un número entero
        if (idNoControl.matches("\\d+")) {
            // Convertir el texto a un número entero
            int noControl = Integer.parseInt(idNoControl);
            
            // Llamar al método para consultar y cargar datos por ID
            consultarNoControl(noControl);
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese un número entero válido como ID de usuario.");
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Error al convertir el ID de usuario a número.");
    }
    }//GEN-LAST:event_txtNoControlActionPerformed

    
   private void consultarNoControl(int noControl) {
    try {
        String sql = "SELECT * FROM alumnos WHERE NO_CONTROL = ?";
        conec = con.getConnection();

        try (PreparedStatement pstmt = conec.prepareStatement(sql)) {
            pstmt.setInt(1, noControl);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                String nombre = rs.getString("NOMBRE");
                String apPaterno = rs.getString("APELLIDO_PATERNO");
                String apMaterno = rs.getString("APELLIDO_MATERNO");
                String correo = rs.getString("CORREO");
                String telefono = rs.getString("TELEFONO");
                String idGenero = rs.getString("ID_GENERO");
                String idCarrera = rs.getString("ID_CARRERA");

                // Actualizar los campos de texto y los combo boxes
                txtNoControl.setText(Integer.toString(noControl));
                txtNombre.setText(nombre);
                txtApPaterno.setText(apPaterno);
                txtApMaterno.setText(apMaterno);
                txtCorreo.setText(correo);
                txtTelefono.setText(telefono);

                // Actualizar los combo boxes seleccionando el índice correspondiente
                int indexGenero = obtenerIndiceGenero(idGenero);
                int indexCarrera = obtenerIndiceCarrera(idCarrera);

                cmbIdGenero.setSelectedIndex(indexGenero);
                cmbIdCarrera.setSelectedIndex(indexCarrera);
                
                
              
            } else {
                JOptionPane.showMessageDialog(null, "Alumno no encontrado");
            }
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
}

    
  // Método para obtener el índice de un elemento en la lista de géneros
private int obtenerIndiceGenero(String idGenero) {
    for (int i = 0; i < listaGenero.size(); i++) {
        if (String.valueOf(listaGenero.get(i).getIdGenero()).equals(idGenero)) {
            return i;
        }
    }
    return -1; // Si no se encuentra, devolver -1
}


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JTableAl().setVisible(true);
            }
        });
    }
    
    
    void consultar() {
    String sql = "SELECT * FROM alumnos";
    
    try {
        conec = con.getConnection();
        st = conec.createStatement();
        rs = st.executeQuery(sql);

        // Limpiar el modelo antes de agregar nuevas filas
        DefaultTableModel modelo = (DefaultTableModel) Tabla.getModel();
        modelo.setRowCount(0);

        while (rs.next()) {
            Object[] alumnos = {
                rs.getInt("NO_CONTROL"),
                rs.getInt("ID_GENERO"),
                rs.getInt("ID_CARRERA"),
                rs.getString("NOMBRE"),
                rs.getString("APELLIDO_PATERNO"),
                rs.getString("APELLLIDO_MATERNO"),
                rs.getString("CORREO"),
                rs.getString("TELEFONO")
            };

            // Agregar la fila al modelo
            modelo.addRow(alumnos);
        }

        // Establecer el modelo en la tabla
        Tabla.setModel(modelo);

    } catch (Exception e) {
        e.printStackTrace();
    }
}

 
    void agregar() {
        
    // Aquí puedes deshabilitar el campo de "ID Genero"
        txtNoControl.setEnabled(true);    
        
    String no_control = txtNoControl.getText();
    String descripcionGenero = cmbIdGenero.getSelectedItem().toString();
    int idGeneroSeleccionado = obtenerIdGenero(descripcionGenero);
    String nombreCarrera = cmbIdCarrera.getSelectedItem().toString();
    int idCarreraSeleccionada = obtenerIdCarrera(nombreCarrera);
    String nombre = txtNombre.getText();
    String ap_paterno = txtApPaterno.getText();
    String ap_materno = txtApMaterno.getText();
    String correo = txtCorreo.getText();
    String tel = txtTelefono.getText();

    try {
        if (no_control.equals("") || nombre.equals("") || ap_paterno.equals("") || ap_materno.equals("") || correo.equals("") || tel.equals("") || idGeneroSeleccionado == 0 || idCarreraSeleccionada == 0) {
            JOptionPane.showMessageDialog(null, "Faltan ingresar datos en la tabla");
        } else {
            // Verificar si el No de CONTROL ya existe
            String checkIDQuery = "SELECT COUNT(*) FROM alumnos WHERE NO_CONTROL=?";
            conec = con.getConnection();
            PreparedStatement checkIDStatement = conec.prepareStatement(checkIDQuery);
            checkIDStatement.setString(1, no_control);
            ResultSet rs = checkIDStatement.executeQuery();
            rs.next();
            int rowCount = rs.getInt(1);

            if (rowCount > 0) {
                JOptionPane.showMessageDialog(null, "Este numero de control ya existe");
                limpiarTabla();
            } else {
                String insertQuery = "INSERT INTO alumnos(NO_CONTROL, ID_GENERO, ID_CARRERA, NOMBRE, APELLIDO_PATERNO, APELLLIDO_MATERNO, CORREO, TELEFONO) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

                try (PreparedStatement insertStatement = conec.prepareStatement(insertQuery)) {
                    insertStatement.setString(1, no_control);
                    insertStatement.setInt(2, idGeneroSeleccionado);
                    insertStatement.setInt(3, idCarreraSeleccionada);
                    insertStatement.setString(4, nombre);
                    insertStatement.setString(5, ap_paterno);
                    insertStatement.setString(6, ap_materno);
                    insertStatement.setString(7, correo);
                    insertStatement.setString(8, tel);

                    int rowsAffected = insertStatement.executeUpdate();

                    if (rowsAffected > 0) {
                        JOptionPane.showMessageDialog(null, "Nuevo alumno registrado");
                        limpiarTabla();
                        limpiarCampos();
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al intentar agregar el alumno");
                    }
                }
            }
        }
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error al intentar agregar el alumno: " + e.getMessage());
    } finally {
        try {
           
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

        
    private int obtenerIdCarrera(String nombreCarrera) {
    for (CarreraItem carreraItem : listaCarrera) {
        if (carreraItem.getNombre().equals(nombreCarrera)) {
            return carreraItem.getIdCarrera();
        }
    }
    return 0;
}

private int obtenerIdGenero(String descripcionGenero) {
    for (GeneroItem generoItem : listaGenero) {
        if (generoItem.getDescripcion().equals(descripcionGenero)) {
            return generoItem.getIdGenero();
        }
    }
    return 0;
}

void Modificar() {
    String no_control = txtNoControl.getText();
    String descripcionGenero = cmbIdGenero.getSelectedItem().toString();
    int idGeneroSeleccionado = obtenerIdGenero(descripcionGenero);
    String nombreCarrera = cmbIdCarrera.getSelectedItem().toString();
    int idCarreraSeleccionada = obtenerIdCarrera(nombreCarrera);
    String nombre = txtNombre.getText();
    String ap_paterno = txtApPaterno.getText();
    String ap_materno = txtApMaterno.getText();
    String correo = txtCorreo.getText();
    String tel = txtTelefono.getText();

    try {
        if (no_control.equals("") || nombre.equals("") || ap_paterno.equals("") || ap_materno.equals("") || correo.equals("") || tel.equals("") || idGeneroSeleccionado == 0 || idCarreraSeleccionada == 0) {
            JOptionPane.showMessageDialog(null, "Faltan ingresar datos en la tabla");
            limpiarTabla();
        } else {
            String checkIDQuery = "SELECT COUNT(*) FROM alumnos WHERE NO_CONTROL=?";
            conec = con.getConnection();
            try (PreparedStatement checkIDStatement = conec.prepareStatement(checkIDQuery)) {
                checkIDStatement.setString(1, no_control);
                try (ResultSet rs = checkIDStatement.executeQuery()) {
                    rs.next();
                    int rowCount = rs.getInt(1);

                    if (rowCount == 0) {
                        JOptionPane.showMessageDialog(null, "El número de control que deseas modificar no existe");
                        limpiarTabla();
                    } else {
                        String updateQuery = "UPDATE alumnos SET ID_GENERO=?, ID_CARRERA=?, NOMBRE=?, APELLIDO_PATERNO=?, APELLLIDO_MATERNO=?, CORREO=?, TELEFONO=? WHERE NO_CONTROL=?";

                        try (PreparedStatement pstmt = conec.prepareStatement(updateQuery)) {
                            pstmt.setInt(1, idGeneroSeleccionado);
                            pstmt.setInt(2, idCarreraSeleccionada);
                            pstmt.setString(3, nombre);
                            pstmt.setString(4, ap_paterno);
                            pstmt.setString(5, ap_materno);
                            pstmt.setString(6, correo);
                            pstmt.setString(7, tel);
                            pstmt.setString(8, no_control);
                            pstmt.executeUpdate();

                            JOptionPane.showMessageDialog(null, "Datos del alumno modificados exitosamente");
                            limpiarCampos();
                            consultar();
                        }
                    }
                }
            }
        }
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error al intentar modificar el alumno: " + e.getMessage());
    } finally {
        try {
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

  
    void eliminar() {
    int fila = Tabla.getSelectedRow();

    try {
        if (fila < 0) {
            JOptionPane.showMessageDialog(null, "Fila no seleccionada para eliminar");
        } else {
            int noControl = Integer.parseInt(Tabla.getValueAt(fila, 0).toString()); // Utiliza la columna del No_Control

            // Verificar si existen registros relacionados en la tabla "genero"
            String checkControlQuery = "SELECT COUNT(*) FROM quejas WHERE NO_CONTROL = ?";
            conec = con.getConnection();

            try (PreparedStatement checkControlStatement = conec.prepareStatement(checkControlQuery)) {
                checkControlStatement.setInt(1, noControl);
                ResultSet rs = checkControlStatement.executeQuery();
                rs.next();
                int rowCountNo = rs.getInt(1);

                

                    if (rowCountNo > 0) {
                        JOptionPane.showMessageDialog(null, "No se puede eliminar el alumno, hay registros de la tabla genero relacionados.");
                    }else {
                        // No hay registros relacionados, proceder con la eliminación
                        String deleteQuery = "DELETE FROM alumnos WHERE NO_CONTROL = ?";
                        try (PreparedStatement deleteStatement = conec.prepareStatement(deleteQuery)) {
                            deleteStatement.setInt(1, noControl);
                            deleteStatement.executeUpdate();
                            JOptionPane.showMessageDialog(null, "Alumno eliminado con éxito");
                            limpiarTabla();
                        }
                    }
            }
        }
    } catch (Exception e) {
        // Manejar excepciones
        e.printStackTrace();
    }
}


   void limpiarTabla() {
    DefaultTableModel modelo = (DefaultTableModel) Tabla.getModel();
    modelo.setRowCount(0); // Esto elimina todas las filas de la tabla
    }
        
    void limpiarCampos() {
    txtNoControl.setText("");
    txtNombre.setText("");
    txtApPaterno.setText("");
    txtApMaterno.setText("");
    txtCorreo.setText("");
    txtTelefono.setText("");
    
    } 
    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JComboBox<String> cmbIdCarrera;
    private javax.swing.JComboBox<String> cmbIdGenero;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtApMaterno;
    private javax.swing.JTextField txtApPaterno;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNoControl;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
